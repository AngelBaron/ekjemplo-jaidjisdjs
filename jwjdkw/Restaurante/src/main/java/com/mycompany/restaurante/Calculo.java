/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restaurante;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Calculo {
    private static double total;
    private static String datos;
     private Restaurante restaurante;

    public Calculo(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    
    public void Suma(double x , String tipo){
        
        Scanner res = new Scanner(System.in);
        
        int n =1;
        String comida = tipo;
        total += x;
        
        
        datos += comida + "*******" + x +"$" + '\n';
        Restaurante reinicio = new Restaurante();
        while(n==1|n==2){
            System.out.println("Quieres agregar otro producto? \n 1 o 2= si \n 3= no");
            n=res.nextInt();
            if(n==2|n==1){
                restaurante.menu();
            }
            if(n==3){
        Ticket();
            }
        }
    }
       
        
        
    
    public void Ticket(){
        
        System.out.println("RESTAURANTE GARCIA");
        System.out.println("**********************");
        System.out.println("Lo que ha pedido es: \n" +datos);
        System.out.println();
        System.out.println("El total de la suma es: "+total);
        System.out.println("ORDEN NUM 947287");
        System.out.println("\tMUCHAS GRACIAS");
        System.exit(0);
        
    }
}
