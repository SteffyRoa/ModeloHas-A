/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohas.a;

import java.util.*;

/**
 *
 * @author sroa
 */
public class Almacen {
    
    String nombre;
    List <Cuenta> listaCuentas = new ArrayList<>();

    public Almacen(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombre=" + nombre + '}';
    }
    
    
    void setCuentas(Cuenta cuenta){
        listaCuentas.add(cuenta);
    }
    
    
    
    
    //atraves de este metodo voy a pasar la lista de cuentas
    
    
    
    
    
  /*  void setCuentas (List<Cuenta> listaCuentas){
        this.listaCuentas= listaCuentas;
    }
    */
    
    
    
    
}
