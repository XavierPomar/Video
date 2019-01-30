package repas;

import java.util.Scanner;

public class Exercici13 {
    public static void NumeroFavorit (int n, int k,int j){
        
        int suma,suma1,suma2,suma3,suma4,sort;
        
        if (k < 1){
            System.out.println( "Error! El mes del teu aniversari no pot ser inferior a dia 1 ... ");
            return;
        }

        if (k > 12){
            System.out.println("Error! El mes del teu aniversaari no pot ser superior que dia 12 ... ");
            return;
        }
        
        if (k == 1){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        } 
        if (k == 2){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (j%4==0 && j%400==0){
                if(n > 29)
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 29 ...");
                return;
            }
            if (n > 28)
            System.out.println("Error! El dia del teu aniversari no pot ser major que dia 28 ...");
                return;
        } 
        if (k == 3){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }
        if (k == 4){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 30){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 30 ...");
                return;
            }
        } 
        if (k == 5){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }
        if (k == 6){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 30){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 30 ...");
                return;
            }
        }
        if (k == 7){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }   
        if (k == 8){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }
        if (k == 9){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 30){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 30 ...");
                return;
            }
        }
        if (k == 10){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }
        if (k == 11){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 30){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 30 ...");
                return;
            }
        }
        if (k == 12){
            if(n < 1){
                System.out.println("Error! El dia del teu aniversari no pot ser menor que dia 1 ...");
                return;
            }
            if (n > 31){
                System.out.println("Error! El dia del teu aniversari no pot ser major que dia 31 ...");
                return;
            }
        }
        
        System.out.println("La data del teu aniversari es el : "+ n +"/" + k + "/" + j);
        System.out.println(n+k+j);
        suma = n+k+j;
        suma1 = suma/1000;
        suma2 = suma/100%10;
        suma3 = suma/10%10;
        suma4 = suma/1%10;
        sort = suma1 + suma2 + suma3 + suma4;
        System.out.println("El teu numero favorit segons la data del teu aniversari es el : " + sort);
    }
    public static void main (String[] args){
        
        int n;
        int k;
        int j;
        Scanner sc = new Scanner (System.in);
        System.out.println("El dia del teu aniversari : ");
        n = sc.nextInt();
        System.out.println("El mes del teu aniversari : ");
        k = sc.nextInt();
        System.out.println("L'any del teu aniversari : ");
        j = sc.nextInt();
       
        NumeroFavorit(n,k,j);
    }
}
