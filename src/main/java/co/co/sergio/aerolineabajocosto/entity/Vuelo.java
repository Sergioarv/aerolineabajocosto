package co.co.sergio.aerolineabajocosto.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @project bk-gestor-vuelos
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 4/11/2021 14:06
 **/
@Entity
@Table(name = "vuelos")
public class Vuelo implements Serializable {

    private static final long serialVersioUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvuelo;

    @DateTimeFormat(pattern = "%Y-%m-%d")
    private Date fechavuelo;

    @OneToOne
    @JoinColumn(name = "idruta")
    private Ruta idruta;



}
