package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Pasajero;
import co.co.sergio.aerolineabajocosto.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 10/12/2021 22:17
 **/
@RestController
@RequestMapping("/pasajero")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PasajeroController {

    @Autowired
    private PasajeroService pasajeroService;

    @GetMapping
    public ResponseEntity<Pasajero> getById(@RequestParam(value = "id") int id) {
        Pasajero data = null;
        HttpStatus status = null;

        data = pasajeroService.getByIdP(id);
        status = HttpStatus.OK;

        return new ResponseEntity<>(data, status);
    }

    @GetMapping("/concurrencia")
    public ResponseEntity<Integer> getConcurrencia(@RequestParam(value = "pasaporte") String pasaporte, @RequestParam(value = "fecha") @DateTimeFormat(pattern="yyyy-MM-dd") Date fecha){

        int data = 0;
        HttpStatus status = null;

        data = pasajeroService.getConcurrencia(pasaporte, fecha);
        status = HttpStatus.OK;

        return new ResponseEntity<>(data, status);

    }

    @PostMapping
    public ResponseEntity<Pasajero> save(@RequestBody Pasajero pasajero) {
        Pasajero data = null;
        HttpStatus status = null;

        data = pasajeroService.save(pasajero);

        if (data != null) {
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NOT_ACCEPTABLE;
        }

        return new ResponseEntity<>(data, status);
    }
}
