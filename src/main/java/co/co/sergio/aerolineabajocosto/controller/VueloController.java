package co.co.sergio.aerolineabajocosto.controller;

import co.co.sergio.aerolineabajocosto.entity.Ruta;
import co.co.sergio.aerolineabajocosto.entity.Vuelo;
import co.co.sergio.aerolineabajocosto.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 8/12/2021 16:00
 **/
@RestController
@RequestMapping("/vuelo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT, RequestMethod.DELETE})
public class VueloController {

    @Autowired
    private VueloService vueloService;

    @PostMapping
    public ResponseEntity<?> saveAll(@RequestBody Vuelo vuelo){
        Vuelo data = vueloService.save(vuelo);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @GetMapping("/buscarvuelos")
    public ResponseEntity<?> filterVuelos(@RequestParam(value = "fechaVuelo", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha,
                                          @RequestParam(value = "idRuta", required = false) String idRuta){
        List<Vuelo> data = null;
        HttpStatus status = null;

        data = vueloService.findByFechaAndRuta(fecha, idRuta);
        if(data != null){
            status = HttpStatus.OK;
        }else{
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<>(data, status);
    }
}
