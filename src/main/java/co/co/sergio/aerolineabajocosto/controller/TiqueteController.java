package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Reserva;
import co.co.sergio.aerolineabajocosto.entity.Tiquete;
import co.co.sergio.aerolineabajocosto.service.TiqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 11/12/2021 11:31
 **/
@RestController
@RequestMapping("/tiquete")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class TiqueteController {

    @Autowired
    private TiqueteService tiqueteService;

    @PostMapping
    public ResponseEntity<Tiquete> save(@RequestBody Tiquete tiquete) {
        Tiquete data = null;
        HttpStatus status = null;

        data = tiqueteService.save(tiquete);

        if (data != null) {
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_ACCEPTABLE;
        }

        return new ResponseEntity<>(data, status);
    }
}
