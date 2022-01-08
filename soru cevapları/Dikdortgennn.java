
package dikdortgennn;

import java.util.Scanner;

public class Dikdortgennn {

    public static void main(String[] args) {
        
        
           int i = 0;
           int j;
		Scanner k = new Scanner(System.in);
		
		System.out.print(" Boy : ");
		int boy= k.nextInt();
                System.out.println("En");
                int en=k.nextInt();
			
		while(i < boy)
		{
			j = 0;
			while(j < en)
			{
				System.out.print("*"); 
				j++;
			}
			i++;
			System.out.print("\n"); 
}         
    }
}
