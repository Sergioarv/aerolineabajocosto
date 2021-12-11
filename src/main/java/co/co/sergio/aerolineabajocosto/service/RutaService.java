package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Ciudad;
import co.co.sergio.aerolineabajocosto.entity.Ruta;

import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 10:44
 **/
public interface RutaService {

    public List<Ruta> findByIdCiudadOrigen(int idciudad);

    public Ruta save(Ruta ciudad);
}
