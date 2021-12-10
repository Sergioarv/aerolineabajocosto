package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Vuelo;

import java.util.Date;
import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 16:09
 **/
public interface VueloService {

    public List<Vuelo> findByFechaAndRuta(Date fecha, String idRuta);
}
