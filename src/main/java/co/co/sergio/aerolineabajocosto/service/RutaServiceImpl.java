package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Ruta;
import co.co.sergio.aerolineabajocosto.repository.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 10:46
 **/
@Service
public class RutaServiceImpl implements RutaService {

    @Autowired
    private RutaRepository rutaRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Ruta> findByIdCiudadOrigen(int idciudad) {
        return rutaRepository.findByIdCiudadOrigen(idciudad);
    }
}
