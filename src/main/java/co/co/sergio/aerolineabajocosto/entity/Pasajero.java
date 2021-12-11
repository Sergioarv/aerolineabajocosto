package co.co.sergio.aerolineabajocosto.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 15:14
 **/
@Entity
@Table(name = "pasajeros")
public class Pasajero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
@Column(unique = true)
    private int pasaporte;

    private String nombre;

    private String apellido;

    @Column(length = 10)
    private long telefono;

    private String email;

    @Column(length = 3)
    private int edad;

    private int millasacumuladas;

    @DateTimeFormat(pattern = "%Y-%m-%d")
    private Date fechaExpedicion;

    public int getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMillasacumuladas() {
        return millasacumuladas;
    }

    public void setMillasacumuladas(int millasacumuladas) {
        this.millasacumuladas = millasacumuladas;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }
}
