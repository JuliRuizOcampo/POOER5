package com.mycompany.pooer5;
/**
 *
 * @author JuliRuizOcampo
 */
public class POOER5 {

    public static void main(String[] args) {
        double suma=0, x=20, y=40;
        
        //Desarrollo del algoritmo
        suma = suma + x; //La variable suma incrementa x unidades (0 + 20 = 20)
        x=x + Math.pow(y,2); //La variable x incrementa y^2 unidades (20 + 1600 = 1620)
        suma = suma + x / y; // La variable suma incrementa x/y unidades (20 + 40. 5 = 60.5 )
        
        System.out.println("El valor de la suma es: " + suma);  
    }
}