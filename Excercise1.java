import java.util.Scanner;

public class Excercise1{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        int dia, mes, año; 

        System.out.println("digita el dia: ");
        dia = enter.nextInt(); 

        System.out.println("digita el mes: ");
        mes = enter.nextInt(); 

        System.out.println("digita el año: ");
        año = enter.nextInt();
        
        if((dia >= 1) && (dia <= 30 )){

            if ((mes>=1) && (mes<=12)){

                if (año != 0) {
                    System.out.print("fecha incorrecta");

                } else{
                       System.out.print("la fecha es incorrecta, año incorrecto:C "); 
                }             
            }
            else{
            System.out.print("la fecha es incorrecta, mes incorrecto :C ");
            }

        
        }else { 
          System.out.print("la fecha es incorrecta, DIA INCORRECTA :C ");
        }
    }   
    }

