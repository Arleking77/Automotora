/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotora1;

/**
 *
 * @author pmaca
 */
public class test {
    
  public static void main(String[] args) {
      
        Propietario pro1 = new Propietario( "15555555-2", "Juan", "Republica 102",12 );
        Propietario pro2 = new Propietario( "1", "Juan", "Republica 102",12 );
        Propietario pro3 = new Propietario( "15555555-2", "Juan", "Republica 102",12 );
        Propietario pro4 = new Propietario( "15555555-2", "Juan", "Republica 102",12 );
        
        
        Motocicleta mot1 = new Motocicleta( "MOT1", "HONDA","Deportiva",'N' , 2006,35000, pro1);
        Motocicleta mot2 = new Motocicleta( "MOT2", "HONDA","Deportiva",'U' , 2006,35000, pro2);
        Motocicleta mot3 = new Motocicleta( "MOT3", "HONDA","Deportiva",'U' , 2006,35000, pro3);
        Motocicleta mot4 = new Motocicleta( "MOT4", "HONDA","Deportiva",'N' , 2006,35000, pro4);
        //
        System.out.println("*********************** Mostrar de la objeto Motocicleta");
        mot1.mostrarMotocicleta();
        
        //*****************Arreglo Automotora
        Automotora1 automotora = new Automotora1();
        
        //Agregar al arreglo
        automotora.agregarMotocicleta( mot1);
        automotora.agregarMotocicleta( mot2);
        automotora.agregarMotocicleta( mot3);
        automotora.agregarMotocicleta( mot4);
        
        //Utilizar el metodo buscar motocicleta con la condición del Codigo
        System.out.println("\n"+"******************Se buscara el codigo MOT3");
        if ( automotora.buscarMotocicleta("MOT33") )
        {
            System.out.println("El codigo existe");
        }
        else
        {
            System.out.println("El codigo no Existe");
        }
         //buscar.
        System.out.println( "\n"+"*******Buscando Motocicletas Marca KTM y mayor o igual 2015");
        automotora.mostrarDatosMarca();
        
        //
        System.out.println("\n"+"********************Contando");
        System.out.println("Cantidad de Motoso Usadas: " +  automotora.cantidadMotoUsadas());
        
    }

    }
    
