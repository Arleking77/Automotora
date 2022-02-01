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
public class Propietario {
    
public String rut, nombre, domicilio;
    public int edad;
    
 public Propietario() {
        
    }
 
    public Propietario(String rut,String nombre,String domicilio,int edad) {
        this.rut=rut;
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.edad=edad;
        
    }
    
    
        public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
        
        if (rut.trim().length() == 10 )
        {
            this.rut = rut;
        }
        else
        {
            System.out.println("El RUT debe ser de largo 10");
        }  
        
        
        
        
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
        public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
         if (domicilio.trim().length() > 1  )
        {
            this.domicilio = domicilio;
        }
        else
        {
            System.out.println("El domicilio debe contener al menos 1 caracter");
        }
    }
    
        public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("LA EDAD DEBE SER MAYOR IGUAL A 18");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}

