package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Ciudad;
import co.co.sergio.aerolineabajocosto.entity.Ruta;
import co.co.sergio.aerolineabajocosto.service.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 10:41
 **/
@RestController
@RequestMapping("/ruta")
@CrossOrigin("*")
public class RutaController {

    @Autowired
    private RutaService rutaService;

    @GetMapping("/{ciudadOrigen}")
    public ResponseEntity<List<Ruta>> findByIdCiudadOrigen(@PathVariable (value = "ciudadOrigen") int ciudadOrigen){
        List<Ruta> data = null;
        HttpStatus status = null;

        data = rutaService.findByIdCiudadOrigen(ciudadOrigen);

        if(data != null){
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.NO_CONTENT;
        }

        return new ResponseEntity<>(data, status);

    }
}
