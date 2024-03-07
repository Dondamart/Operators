/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operators;

/**
 *
 * @author danim
 */
import java.util.Scanner;
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int add;
        int subs;
        int multip;
        int divission;
        int module;
        
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1= keyboard.nextInt();
        System.out.println("Enter second number: ");
        num2= keyboard.nextInt();
        
        add= num1+num2;
        subs= num1-num2;
        multip= num1*num2;
        divission=num1/num2;
        module=num1%num2;
        
        System.out.println("These are the results: ");
        System.out.println("Addition of " + num1 + " and "+ num2+ "is: " + add);
        System.out.println("Substracion of " + num2 + " from "+ num1+ "is: " + subs);
        System.out.println("Multiplication of " + num1 + " by "+ num2+ "is: " + multip);
        System.out.println("Divission of " + num1 + " by "+ num2+ "is: " + divission);
        System.out.println("Module of " + num1 + " and "+ num2+ "is: " + module);


        
    }
    
}
