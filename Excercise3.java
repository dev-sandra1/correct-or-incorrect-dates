import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
           Scanner enter = new Scanner(System.in);
           int  num1, num2, addition, subtraction, multiplication, division;
           char operation;

           System.out.println("write a number: ");
           num1 = enter.nextInt();

           System.out.println("write the second number: ");
           num2 = enter.nextInt();

           System.out.println("write the operation you want to perform: ");
            operation = enter.next().charAt(0);
            switch(operation){

              case 's' :
              case 'S' : addition = num1 + num2;
              System.out.println("the sum is: " + addition);
              break;

               case 'r' :
              case 'R' : subtraction = num1 - num2;
              System.out.println("the minus is: " + subtraction);
              break;

              case 'p' :
              case 'P' :
              case 'm' :
              case 'M' : multiplication = num1 * num2;
              System.out.println("the multiplication is: " + multiplication);
              break;

              case 'd' :
              case 'D' :division = num1 / num2;
              System.out.println("the division is: " + division);
              break;

              default: System.out.println("error wrong operation :<");
            }
            
      }
    }
