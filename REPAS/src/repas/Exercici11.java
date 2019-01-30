package repas;

import java.util.Scanner;

public class Exercici11 {
    public static void RetornarNumeros (int n, int j){
        
        if (n < 10000){
            System.out.println( "Error! El numero introduit te menys de 5 xifres... ");
        }
        
        if (n > 99999){
            System.out.println("Error! El numero introduit te més de 5 xifres... ");
        }
        
        System.out.println(n/10000);
        System.out.println(n/1000);
        System.out.println(n/100);
        System.out.println(n/10);
        System.out.println(n/1);
        
        System.out.println("-------------------------------------------------------------");
        
        System.out.println(j%10);
        System.out.printf("%02d %n",j%100);
        System.out.printf("%03d %n",j%1000);
        System.out.printf("%04d %n",j%10000);
        System.out.printf("%05d %n",j);
     
        System.out.println("-------------------------------------------------------------");
        
        System.out.println(n%10);
    }
    public static void main (String[] args){
        
        int n;
        int j;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introdueix un numero enter entre el 10000 i el 99999 : ");
        n = sc.nextInt();
        System.out.println("Introdueix un numero enter entre el 10000 i el 99999 : ");
        j = sc.nextInt();
        RetornarNumeros(n,j);
    }
}