/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohas.a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sroa
 */
public class Principal {

    public static void main(String[] args) {
      
        //creamos estancia almacen
       Almacen almacen1 = new Almacen("Centro");
       
       /*vamos a crear nuestras cuentas
       Cuenta cta1 = new Cuenta ("x001");
       Cuenta cta2 = new Cuenta ("x002");
       Cuenta cta3 = new Cuenta ("x003");
       Cuenta cta4 = new Cuenta ("x004");
       Cuenta cta5 = new Cuenta ("x005");
       
       //variable de referencia lista
       List <Cuenta> listaCtas = new ArrayList<>();*/
       
       
       //asignamos las variables de referencia que ya apuntas lista cuenta
      // listaCtas.add(cta1);//cuenta1
      // listaCtas.add(cta2);
      // listaCtas.add(cta3);*/
       
      
      //***Aqui estamos pasando lista de cuentas
      almacen1.setCuentas(new Cuenta("x001"));
       almacen1.setCuentas(new Cuenta("x002"));
        almacen1.setCuentas(new Cuenta("x031"));
      
      
      
      
       //imprimimos {a donde apunta el almacen}
        System.out.println(almacen1.listaCuentas);
       // almacen1.setCuentas(listaCtas);
        
        //le vuelvo a decir a mi alcan que me de la lista de cuentas
        System.out.println(almacen1.listaCuentas);
        
        //si yo elimino la estancia almacen debe de eliminar las cuentas
        //aun que yo elimine almacen1 aun tengo acceso a lista de cuentas
        //apesar de ponerlo null y garbage collector limpiara
        almacen1=null;
      //  System.out.println("de Principal");
      //  System.out.println(listaCtas);
    }
    
}
