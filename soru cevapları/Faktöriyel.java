
package faktöriyel;

import java.util.Scanner;

public class Faktöriyel {

    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        System.out.println("Faktöriyelinin hesaplanmasını istediğiniz sayıyı giriniz");
        int sayi=k.nextInt();
        int sonuc=1;
        
        for(int i=1; i<=sayi;i++) {
            sonuc=i*sonuc;
                    
        }
        System.out.println("Cevap: "+sonuc);
    }
    
}
