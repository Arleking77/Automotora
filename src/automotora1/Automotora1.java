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
public class Automotora1 {

     public Motocicleta[] aMotocicleta;
    public int indice=0;
    public int largo = 4;

    public Automotora1() 
    {
        
        this.aMotocicleta = new Motocicleta[largo];
         
    }

    //accesadores
    public Motocicleta[] getaMotocicleta() {
        return aMotocicleta;
    }
    
    public int getIndice() {
        return indice;
    }

    public int getLargo() {
        return largo;
    }
    
    //mutadores
    public void setaMotocicleta(Motocicleta[] aMotocicleta) {
        this.aMotocicleta = aMotocicleta;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
     
    public void agregarMotocicleta(Motocicleta motocicleta)
    {
       if ( this.indice < this.largo)
       {
           aMotocicleta[this.indice] = motocicleta;
           this.indice = this.indice + 1;
       }
       else
       {
           System.out.println("El arreglo esta definido de 4");
       }
    }
    
    public boolean buscarMotocicleta(String cod_moto)
    {
        boolean blnExiste = false;
        
        for ( Motocicleta tempMoto : aMotocicleta )
        {
            if (tempMoto.cod_moto.equals(cod_moto))
            {
               blnExiste= true;
               break;
            }
        }       
        return blnExiste;
    }
    
     
    public void mostrarDatosMarca( )
    {
       for ( Motocicleta tempMoto : aMotocicleta )
        {
            if ( (tempMoto.marca.equals("KTM")) && (tempMoto.año >= 2015) )
            {
               tempMoto.mostrarMotocicleta();
            }
        }      
       
    }
    
    public int cantidadMotoUsadas( )
    {
        int intCantiMotoU=0;
         
        for ( Motocicleta tempMoto : aMotocicleta )
        {
            if ( tempMoto.getEstado() == 'U'  )
                
            intCantiMotoU = intCantiMotoU + 1 ;
            
        }
         System.out.println("La cantidad es" + intCantiMotoU );
        return intCantiMotoU;
       
    }
    
    
}
