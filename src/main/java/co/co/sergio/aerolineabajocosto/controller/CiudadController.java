package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Ciudad;
import co.co.sergio.aerolineabajocosto.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 16:09
 **/
@RestController
@RequestMapping("/ciudad")
@CrossOrigin("*")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @PostMapping
    public ResponseEntity<?> saveAll(@RequestBody Ciudad ciudad){
        Ciudad data = ciudadService.save(ciudad);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Ciudad>> getCiudad() {
        List<Ciudad> data = null;
        HttpStatus status = null;

        data = ciudadService.findAll();

        if(data != null){
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NO_CONTENT;
        }

        return new ResponseEntity<>(data, status);
    }

}
