/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverterKilosLibras;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        //1 libra tem 450g
        //1000 gramas == 1 kg
        System.out.println(converterLibraEmKg(2));
        System.out.println(converterKgEmLibra(10));
        
    }
    
    public static double converterLibraEmKg(double valor){
        double libra = 0.450;
        
        //libra convertida em Kilograma
        double total = valor * libra;
    
        return total;
    }
    
    public static double converterKgEmLibra(double valor2){
        double libra = 0.450;
        
        double total = valor2 / libra;
        
        return total;
    }
    //terminado
}
