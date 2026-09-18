import java.util.Scanner;

 public class ConvertTime {
       public static void main(String[] args) {
       
       System.out.println("Enter Seconds:");
       
       Scanner in = new Scanner(System.in);
       int number = in.nextInt();
       
       int hour = number/3600;
       int remainSec = number%3600;
       int minute = remainSec/60;
       int seconds = remainSec%60;
       
       System.out.printf("%d = %d hours, %d minutes, %d seconds", number, hour, minute,seconds);
       
   }}
