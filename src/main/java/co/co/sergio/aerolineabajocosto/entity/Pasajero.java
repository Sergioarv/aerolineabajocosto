package co.co.sergio.aerolineabajocosto.entity;

import javax.persistence.*;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 7/12/2021 15:14
 **/
@Entity
@Table(name = "pasajeros")
public class Pasajero {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idpasajero;
  

}
