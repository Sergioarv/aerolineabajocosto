package co.co.sergio.aerolineabajocosto.repository;

import co.co.sergio.aerolineabajocosto.entity.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 10/12/2021 22:23
 **/
@Repository
public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {

    @Query(value = "select * from pasajeros where pasajeros.pasaporte = :id", nativeQuery = true)
    public Pasajero getByIdP(int id);

    @Query(value = "select count(t.idtiquete) as cant from (select * from vuelos as v where v.fechavuelo >= DATE_FORMAT(:fecha,\"%Y-%m-%d\")) vs inner join tiquetes as t on vs.idvuelo = t.vueloida and t.pasajero_pasaporte = :pasaporte", nativeQuery = true)
    public int getConcurrencia(String pasaporte, Date fecha);

}
