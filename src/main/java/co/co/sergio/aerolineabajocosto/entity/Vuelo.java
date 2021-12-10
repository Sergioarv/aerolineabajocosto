package co.co.sergio.aerolineabajocosto.entity;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
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

    private Time horavuelo;

    private double precio;

    @Column(length = 3)
    @ColumnDefault("250")
    private int capacidad;

    private int millas;

    @OneToOne
    @JoinColumn(name = "idruta")
    private Ruta idruta;

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public Date getFechavuelo() {
        return fechavuelo;
    }

    public void setFechavuelo(Date fechavuelo) {
        this.fechavuelo = fechavuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public Ruta getIdruta() {
        return idruta;
    }

    public void setIdruta(Ruta idruta) {
        this.idruta = idruta;
    }

    public Time getHoravuelo() {
        return horavuelo;
    }

    public void setHoravuelo(Time horavuelo) {
        this.horavuelo = horavuelo;
    }
}
