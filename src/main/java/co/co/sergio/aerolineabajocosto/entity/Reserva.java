package co.co.sergio.aerolineabajocosto.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 15:46
 **/
@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idreserva;

    @OneToMany
    @JoinColumn(name = "idreserva")
    private List<Tiquete> tiquete;

    private float valorreserva;

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public List<Tiquete> getTiquete() {
        return tiquete;
    }

    public void setTiquete(List<Tiquete> tiquete) {
        this.tiquete = tiquete;
    }

    public float getValorreserva() {
        return valorreserva;
    }

    public void setValorreserva(float valorreserva) {
        this.valorreserva = valorreserva;
    }
}
