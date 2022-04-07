import java.text.NumberFormat;
import java.util.Scanner;

public class Except1 {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    System.out.println("Enter the Elements in the array:");
    int arr[] = new int[n];
    
    for(int i = 0; i < n; i++) {
    	arr[i] = sc.nextInt();
    }
    int m1 = 0;
    try {
    	
    	System.out.println("Enter the index of array that which you want to access :");
        m1 = sc.nextInt();
        int val = arr[m1];
    }
    catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("Array Index out of Bounds Exeception  "+e);
    }
    catch(NumberFormatException m){
    	System.out.println("Array Index out of Bounds Exeception  "+m);
    }
    System.out.println("The element at indexing: "+arr[m1]);
 //   finally {
    	System.out.println("The element finally accessed");
    
   }
}
