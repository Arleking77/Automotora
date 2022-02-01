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
public class Motocicleta {
    
public String cod_moto, marca, modelo ;
    public char estado;
    public int año;
    public double precio;
    public Propietario dueño;
 
     public Motocicleta() {
        
    }
     
        public Motocicleta(String cod_moto,String marca,String modelo,char estado, int año, double precio, Propietario dueño ) {
        this.cod_moto=cod_moto;
        this.marca=marca;
        this.modelo=modelo;
        this.estado=estado;
        this.año=año;
        this.precio=precio;
        this.dueño=dueño;
            
               
    }


        
     public String getCod_moto() {
        return cod_moto;
    }

    public void setCod_moto(String cod_moto) {
       if ( cod_moto.trim().length() >1 )
        {
            this.cod_moto = cod_moto;
        }
        else
        {
            System.out.println("El codigo de moto debe contener al menos 2 caracteres");
        }
    }

       public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;        
    }
    
    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
         
        if ( ( estado == 'U') || (estado == 'N'))
        {
            this.estado = estado;
        }
        else
        {
            System.out.println("El estado debe ser U (usado) o N (nueva)");
        }        
    } 
    
        public String declaraestado()
    {
        String est="Sin Información";
        if (this.estado == 'N')
        {
            est = "Nuevo";
        }
        else
        {
            if (this.estado == 'U')
            {
                est = "Usado";
            }
        }
        return est;
    }
    
         public int identificaCMotoUsadas(   )
    {
        int inttotal =0;
        if (this.estado == 'U')
            {
                inttotal = 1;
            }
        
        return inttotal;
    }
     
     
    
    
    
    
        public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año; 
        
        } 
    
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio; 
        
        }    
    
    public Propietario getDueño() {
        return dueño;
    }

    public void setDueño(Propietario dueño) {
        this.dueño = dueño; 
        
        }    
    
        public void mostrarMotocicleta ()
    {
        System.out.println("Codigo Motocicleta  : " + this.cod_moto );
        System.out.println("Modelo              : " + this.modelo );
        System.out.println("Marca               : " + this.marca );
        System.out.println("Año                 : " + this.año );
        System.out.println("Precio              : " + this.precio );
        System.out.println("Estado              : " + declaraestado() );
        System.out.println("*Propietario*");
        System.out.println("Nombre              : " + this.getDueño().getNombre() );
        System.out.println("RUT                 : " + this.getDueño().getRut() );
         
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
