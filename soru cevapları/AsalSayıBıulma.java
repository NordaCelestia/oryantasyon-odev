
package asal.sayı.bıulma;
import java.util.Scanner;
public class AsalSayıBıulma {
    
    
    public static void main(String[] args) {
       
        Scanner k=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=k.nextInt();
        int a=2;
        while(sayi>a){
           if(sayi%a==0) {
               System.out.println("Asal değil");
               break;
           }
           else if((sayi-1)==a){
               System.out.println("Asal");
               break;
           }
           else
               a++;
        } 
        
        
    }
   
}
