import java.util.Scanner;  
public class Q1Array   {  
    public static void main(String[] args)   {  
        int n;  
        Scanner scn =new Scanner(System.in);  
        System.out.print("Enter the number of elements: ");    
        n=scn.nextInt();  
        int array[] = new int[n];  
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<n; i++)  {    
            array[i] =scn.nextInt();  
        }  
        System.out.println("Array elements are: ");   
        for (int i=0; i<n; i++)   {  
            array[i] = (array[i]/3 & array[i]/5); 
            System.out.println(array[i]);  
        }  
    }  
}  