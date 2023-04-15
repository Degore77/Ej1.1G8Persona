/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.pkg1guia08persona;

import ej1.pkg1guia08persona.Entidad.Persona;
import ej1.pkg1guia08persona.Servicios.PersonaServicio;

/**
 *
 * @author DemJava
 */
public class Ej11Guia08Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perVec[]=new Persona[4];
        PersonaServicio ps = new PersonaServicio();
        int mayorVec[] = new int[4];
        boolean mayor;
        int imcVec[] = new int[4];
        for (int i = 0; i < 4; i++) {
            mayor = ps.esMayor();
            if (mayor==false) {
                mayorVec[i] = 0;
                
            }else{
                mayorVec[i] = 1;
            }
            perVec[i] = ps.crearPersona();
        
            imcVec[i] = ps.calcularIMC(perVec[i].peso,perVec[i].altura);
               
        }
        System.out.println("");
        System.out.println("PROMEDIOS");
        promedio(mayorVec,imcVec);
        mostrarVectores(perVec,imcVec,mayorVec);
        
    }
    
    public static void mostrarVectores(Persona[] perVec,int[] imcVec, int[] mayorVec){
        System.out.println("");
        System.out.println("PERSONAS");
        for (int i = 0; i < 4; i++) {
            System.out.println(perVec[i].toString());
            
            
        }
        System.out.println("");
        System.out.println("IMC");
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+imcVec[i]+" ");
        }
        System.out.println("");    
        System.out.println("MAYOR");
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+mayorVec[i]+" ");
            
        }
        System.out.println("");
    }
    
    public static void promedio(int[] mayor,int[] imc){
        double contMay1=0;
        double contMay0=0;
        double contImcM1=0;
        double contImc1=0;
        double contImc0=0;
        for (int i = 0; i < 4; i++) {
            if ((mayor[i]==0)) {
                contMay0++;
                
            }else{
                contMay1++;
            }
            
            if (imc[i]==-1) {
                contImcM1++;
                
            }else if (imc[i]==0){
                contImc0++;
                
            }else{
                contImc1++;
            }
        }
        System.out.println("Personas mayores: "+((contMay1/4)*100+"%"));
        System.out.println("Personas menores: "+((contMay0/4)*100+"%"));
        System.out.println("Personas con bajo peso: "+((contImcM1/4)*100+"%"));
        System.out.println("Personas peso ideal: "+((contImc0/4)*100+"%"));
        System.out.println("Personas sobrepeso: "+((contImc1/4)*100+"%"));
    }
    
    
    
}
