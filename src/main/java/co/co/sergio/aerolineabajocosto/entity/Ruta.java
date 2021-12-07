package co.co.sergio.aerolineabajocosto.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @project bk-gestor-vuelos
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 4/11/2021 13:38
 **/
@Entity
@Table(name = "rutas")
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtuta;

    private boolean escala;

    @ManyToOne
    @JoinColumn(name="origen")
    private Ciudad origen;

    @ManyToOne
    @JoinColumn(name = "destino")
    private Ciudad destino;

    public int getIdtuta() {
        return idtuta;
    }

    public void setIdtuta(int idtuta) {
        this.idtuta = idtuta;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public boolean isEscala() {
        return escala;
    }

    public void setEscala(boolean escala) {
        this.escala = escala;
    }
}
