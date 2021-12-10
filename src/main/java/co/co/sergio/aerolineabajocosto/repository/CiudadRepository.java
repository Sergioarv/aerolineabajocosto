package co.co.sergio.aerolineabajocosto.repository;

import co.co.sergio.aerolineabajocosto.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 16:14
 **/
@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {
}
