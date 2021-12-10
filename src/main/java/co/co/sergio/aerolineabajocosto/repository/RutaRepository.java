package co.co.sergio.aerolineabajocosto.repository;

import co.co.sergio.aerolineabajocosto.entity.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 10:43
 **/
@Repository
public interface RutaRepository extends JpaRepository<Ruta, Integer> {

    @Query(value = "select * from rutas as r where r.origen = :idciudad", nativeQuery = true)
    public List<Ruta> findByIdCiudadOrigen(int idciudad);
}
