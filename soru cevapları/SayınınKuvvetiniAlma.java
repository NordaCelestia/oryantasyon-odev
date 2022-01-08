
package sayının.kuvvetini.alma;

import java.util.Scanner;

public class SayınınKuvvetiniAlma {

    public static void main(String[] args) {
       
        Scanner k=new Scanner(System.in);
        System.out.println("Taban sayı giriniz.");
        int ts=k.nextInt();
        System.out.println("Taban sayının kuvvetini giriniz.");
        int ks=k.nextInt();
        int sayac=0;
        int sonuc=1;
        
        while(sayac<ks){
            sonuc=sonuc*ts;
            sayac++;
            
        }
        System.out.println("Cevap: "+sonuc);
    }
    
}
