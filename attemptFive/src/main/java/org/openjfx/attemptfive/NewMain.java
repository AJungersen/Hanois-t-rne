/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.attemptfive;

/**
 *
 * @author Bruger
 */
public class NewMain {
    static int a = 3;//antal plader. Programmet fungerer dog kun på 3 plader
    /**
     * @param args the command line arguments
     */
    
    static void metode(int a, String sta, String p2, String maa){
    
    if(a == 1) {
        System.out.println("Flytter plade fra pæl " + sta + " til pæl " + maa);
    } else {
        metode(a-1, sta, maa, p2);
        metode(1, sta, p2, maa);
        metode(a-1, sta, maa, p2);
    }
    
    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Målet er at rykke pladerne fra pæl A til C");
        metode(a, "A", "B", "C");
        System.out.println("Pladerne har nu nået målet");
    }
}
