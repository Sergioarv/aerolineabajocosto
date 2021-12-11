package co.co.sergio.aerolineabajocosto.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 15:46
 **/
@Entity
@Table(name = "reservas")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;

    private float valorreserva;

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public float getValorreserva() {
        return valorreserva;
    }

    public void setValorreserva(float valorreserva) {
        this.valorreserva = valorreserva;
    }
}
