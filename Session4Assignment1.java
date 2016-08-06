
import java.util.Scanner;
public class Session4Assignment1
{
    public static void main(String [] args) 
    {
       Scanner sc = new Scanner(System.in);
       int i;

       //Declaring the arrvalue array of int data type
       int[] arrvalue = new int[5];

       System.out.println("PRINTING THE REVERSE OF AN ARAAY");
       System.out.println("*********************************"); 

       // Entering the values in arrvalue array using for loop
       for (i = 0; i < arrvalue.length; i++)
       {
           System.out.print("Enter the"+ " "+(i+1)+" element of the array :");
           arrvalue[i] = sc.nextInt();
       }   


      // print the values of the array in original order

       System.out.println("The entered array in original order is :");
       for (i = 0;i < arrvalue.length; i++)
       {
             System.out.print(arrvalue[i] + " ");
       } 

       System.out.println();

      // Printing the values of the array in reverse order

       System.out.println("The entered array in reverse order is :");
       for (i = arrvalue.length - 1;i >= 0; i--)
       {
             System.out.print(arrvalue[i] + " ");
       } 


    }
}