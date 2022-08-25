


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikero
 */
public class Arreglo {
    
    int numeroDeCuenta, longitud ;
    String nombre;

    public Arreglo() {
    }

    public Arreglo(int longitud) {
        
        this.longitud = longitud;
        

    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void limpiar() {
        
        for(int i=0;i>=getLongitud();i++){
            
            Arreglo[] alumnos = new Arreglo[getLongitud()];
            alumnos = null;
                this.nombre = null;
        
        }
       
    }
    
    public void setElemento(int indice,int valor){
        
    Arreglo[] alumnos = new Arreglo[getLongitud()];
    alumnos[indice] = null;
    alumnos[indice].setLongitud(longitud);
    alumnos[indice].setNombre(nombre);
    alumnos[indice].setNumeroDeCuenta(numeroDeCuenta);
        
    }

    @Override
    public String toString() {
        return "Arreglo{" + "numeroDeCuenta=" + numeroDeCuenta + ", longitud=" + longitud + ", nombre=" + nombre + '}';
    }
    
}


 