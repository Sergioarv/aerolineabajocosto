package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Tiquete;
import co.co.sergio.aerolineabajocosto.repository.TiqueteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 11/12/2021 11:37
 **/
@Service
public class TiqueteServiceImpl implements TiqueteService {

    @Autowired
    private TiqueteRepository tiqueteRepository;

    @Override
    @Transactional
    public Tiquete save(Tiquete tiquete) {
        return tiqueteRepository.save(tiquete);
    }
}
