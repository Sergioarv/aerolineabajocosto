package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Pasajero;
import co.co.sergio.aerolineabajocosto.entity.Reserva;
import co.co.sergio.aerolineabajocosto.service.ReservaService;
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
@RequestMapping("/reserva")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public ResponseEntity<Reserva> save(@RequestBody Reserva reserva) {
        Reserva data = null;
        HttpStatus status = null;

        data = reservaService.save(reserva);

        if (data != null) {
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_ACCEPTABLE;
        }

        return new ResponseEntity<>(data, status);
    }
}
