import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);

        int num;
        boolean close = false;
        
        do{
        System.out.println(" write a number from 0 to 99,999 : ");
        num = enter.nextInt();
        
        if (num >= 0 && num <= 9) {
            System.out.println("The number is 1 digit.");
        } else if (num >= 10 && num <= 99) {
            System.out.println("The number is 2 digits.");
        } else if (num >= 100 && num <= 999) {
            System.out.println("The number is 3 digits.");
        } else if (num >= 1000 && num <= 9999) {
            System.out.println("The number is 4 digits.");
        } else if (num >= 10000 && num <= 99999) {
            System.out.println("The number is 5 digits.");
        } else {
          
          System.out.println("Sorry, that number is out of our reach."); // lo siento ese numero esta fuera de nuestro alcance//
          close = true;
            }

        }while(!close);   
    }
    
}
