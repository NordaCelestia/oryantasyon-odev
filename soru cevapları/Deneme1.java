
package deneme1;

import java.util.Scanner;

public class Deneme1 {

    public static void main(String[] args) {                   
      
        Scanner k=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=k.nextLine();
        
      
      int karar=(int)Math.floor(Math.random()*101);
        
        System.out.println(isim+" kişisi yüzde "+karar+" güzel");

}
}  