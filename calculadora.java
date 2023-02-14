import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char ch;
        
        do{
        System.out.println("Which operation would you like to apply?");
        String input = in.nextLine();

            if(!input.equals("sum") && !input.equals("subtraction") && !input.equals("division") && !input.equals("multiply")){
            System.out.println("Not an operation, please insert one of the following: sum, subtraction, division or multiply");
            String input1 = in.nextLine();
            input.equals(input1);
            } /////clean it up
            
        System.out.println("Tell me two numbers to be operated");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        if(input.equals("sum")) {
            double sum = n1 + n2;
            System.out.println("The result is: " + sum);
        }
        else if(input.equals("subtraction")){
            double subtraction = n1 - n2;
            System.out.println("The result is: " + subtraction);
        }
        else if(input.equals("division")){
            double division = n1 / n2;
            System.out.println("The result is: " + division);
        }
        else if(input.equals("multiply")){
            double multiply = n1 * n2;
            System.out.println("The result is: " + multiply);
        }
            System.out.println("Do you want to continue? y/n");
            ch = in.next().charAt(0);
            ch = Character.toLowerCase(ch);
        }while(ch == 'y');
    }
    }