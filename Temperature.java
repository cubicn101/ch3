import java.util.Scanner;

public class Temperature {
	// name must align to the package name?
     
     public static void main (String [] args) {
		 
     //double C_PER_F = (fahrenheit* 9.0/5) + 32;
    
     Scanner in = new Scanner(System.in);

     System.out.println("Want to convert celsius to fahrenheit?");
     int c = in.nextInt();
     double f = c * 9.0/5.0 +32;
     
     System.out.printf("Equal to %.1f F", f );
     // placeholder: that let the following words in the same quotation mark?
   }
}
