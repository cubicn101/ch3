import java.util.Scanner;

public class ScannerPractice {

     public static void main (String[]args){
     
       Scanner scan = new Scanner(System.in);
       // declare what you type in
       System.out.println("What is your name?");
       String name = scan.next();
       // assign scan to be name  + the "scan.next.." simplily let computer wait for u?
       
       System.out.println("Your name is "+ name + ".");

       System.out.println("What is your age?");
       int age = scan.nextInt();
       // notice that i cant start a new line to assign the age seperately; i guess bcuz that computer dont know which scan is which?
       
      System.out.println("You are "+ age + " years old .");
      System.out.println("Nice to meet you here!");









}}
