package exercicisconjunts;

public class Fibonacci {
    
    public static void main (String[] args){
    int firstNumber = 0;
    int secondNumber = 1;
    int nextNumber;
    final int valorTerme = 150;
    
        System.out.println("El primer numero es : " + firstNumber + " ");
        
        System.out.println("El segon numero es : " + secondNumber + " ");
        
        nextNumber = secondNumber + firstNumber;
        
        while (nextNumber < valorTerme){
        System.out.println("El nou numero es : " + nextNumber + " ");
        firstNumber = secondNumber;
        secondNumber = nextNumber;
        nextNumber = secondNumber + firstNumber;
        System.out.println();
    }
    }
}
