package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Vuelo;
import co.co.sergio.aerolineabajocosto.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 16:10
 **/
@Service
public class VueloServiceImpl implements VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Vuelo> findByFechaAndRuta(Date fecha, String idRuta) {
        return vueloRepository.findByFechaAndRuta(fecha, idRuta);
    }
}
