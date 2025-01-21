/**
 * Simple in-class example using Scanner object
 * 
 * @author Luke Hindman
 */

 import java.util.Scanner;

public class HelloMyNameIs {
    public static void main(String[] args) 
    {
        Scanner kbd  = new Scanner(System.in);

        System.out.println("Please enter your name.");

        String userName = kbd.nextLine();

        System.out.println("Hello, my name is " + userName);
        kbd.close();
    }
}
