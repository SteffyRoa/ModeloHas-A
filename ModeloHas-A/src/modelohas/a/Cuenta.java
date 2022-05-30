/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohas.a;

/**
 *
 * @author sroa
 */
public class Cuenta {
    
    String clave;

    public Cuenta(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "clave=" + clave + '}';
    }
    
    
}
