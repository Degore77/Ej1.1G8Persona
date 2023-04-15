/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.pkg1guia08persona.Servicios;

import ej1.pkg1guia08persona.Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author DemJava
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public boolean esMayor(){
        boolean retorno;
        System.out.println("");
        System.out.println("La persona es mayor de edad? S/N");
        String mayor = leer.next();
        retorno = mayor.equalsIgnoreCase("s");
        return retorno;
    }
    
    public Persona crearPersona(){
        System.out.println("");
        System.out.println("Ingrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo, H, M o O");
        String sexo = leer.next();
        do {
            if (("h".equalsIgnoreCase(sexo))||("m".equalsIgnoreCase(sexo))||("o".equalsIgnoreCase(sexo))) {
                break;
                
                
            }else{
                System.out.println("Mal ingresado, ingrese nuevamente");
                sexo = leer.next();
            }
            
        } while (true);
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);
        
    }
    
    public int calcularIMC(double peso,double altura){
        System.out.println("");
        System.out.println("Calculando su Indice de Masa Corporal");
        double imc = peso/(Math.pow(altura,2));
        int funcion=0;
        System.out.println("");
        if (imc < 20) {
            System.out.println("Esta por debajo del peso ideal");
            funcion = -1;
            
        }else if ((imc >= 20 )&&(imc <= 25)) {
            System.out.println("Esta en el peso ideal");
            funcion = 0;
            
        }else if (imc > 25) {
            System.out.println("Esta con sobrepeso");
            funcion = 1;
        }
        return funcion;
        
    }
}
