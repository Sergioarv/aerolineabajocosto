package co.co.sergio.aerolineabajocosto.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 15:37
 **/
@Entity
@Table(name = "tiquetes")
public class Tiquete implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtiquete;

    @OneToOne
    @JoinColumn(name = "pasajero_pasaporte")
    private Pasajero pasajero;

    @OneToOne
    @JoinColumn(name = "vueloida")
    private Vuelo vueloida;

    @OneToOne
    @JoinColumn(name = "vueloregreso")
    private Vuelo vueloregreso;

    private float valortotal;

    @ManyToOne
    @JoinColumn(name = "idreserva")
    private Reserva idreserva;

    public int getIdtiquete() {
        return idtiquete;
    }

    public void setIdtiquete(int idtiquete) {
        this.idtiquete = idtiquete;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVueloida() {
        return vueloida;
    }

    public void setVueloida(Vuelo vueloida) {
        this.vueloida = vueloida;
    }

    public Vuelo getVueloregreso() {
        return vueloregreso;
    }

    public void setVueloregreso(Vuelo vueloregreso) {
        this.vueloregreso = vueloregreso;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public Reserva getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Reserva idreserva) {
        this.idreserva = idreserva;
    }
}
