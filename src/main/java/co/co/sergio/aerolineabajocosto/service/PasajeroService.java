package co.co.sergio.aerolineabajocosto.service;

import co.co.sergio.aerolineabajocosto.entity.Pasajero;

import java.util.Date;

/**
 * @project aerolineabajocosto
 * @Author Sergio Abelardo Rodríguez Vásquez
 * @Email ingsergiorodriguezv@gmail.com
 * @Date 10/12/2021 22:24
 **/
public interface PasajeroService {

  public Pasajero getByIdP(int id);

  public int getConcurrencia(String pasaporte, Date fecha);

  public Pasajero save(Pasajero pasajero);

}
