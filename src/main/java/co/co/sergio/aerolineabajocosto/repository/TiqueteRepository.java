package co.co.sergio.aerolineabajocosto.repository;

import co.co.sergio.aerolineabajocosto.entity.Tiquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 11/12/2021 11:34
 **/
@Repository
public interface TiqueteRepository extends JpaRepository<Tiquete, Integer> {
}
