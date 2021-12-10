package co.co.sergio.aerolineabajocosto.repository;

import co.co.sergio.aerolineabajocosto.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 16:02
 **/
@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

    @Query(value = "select t1.idvuelo, t1.capacidad, t1.fechavuelo, t1.millas, t1.precio, t1.idRuta, t1.horavuelo from (select * from Vuelos v where v.fechavuelo = DATE_FORMAT(:fecha,\"%Y-%m-%d\")) t1 inner join (select * from Vuelos v where v.idRuta = :idRuta) t2 on t1.idvuelo = t2.idvuelo", nativeQuery = true)
    public List<Vuelo> findByFechaAndRuta(Date fecha, String idRuta);
}
