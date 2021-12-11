package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Pasajero;
import co.co.sergio.aerolineabajocosto.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 10/12/2021 22:26
 **/
@Service
public class PasajeroServiceImpl implements PasajeroService {

    @Autowired
    private PasajeroRepository pasajeroRepository;

    @Override
    @Transactional(readOnly = true)
    public Pasajero getByIdP(int id) {
        return pasajeroRepository.getByIdP(id);
    }

    @Override
    @Transactional(readOnly = true)
    public int getConcurrencia(String pasaporte, Date fecha){
        return pasajeroRepository.getConcurrencia(pasaporte, fecha);
    }

    @Override
    @Transactional
    public Pasajero save(Pasajero pasajero) {
        return pasajeroRepository.save(pasajero);
    }
}
