
package java5;
import java.util.Scanner;
public class Java5 {

    public static void main(String[] args) {
       
      
      int pc=(int)Math.floor(Math.random()*2+1);
        
        System.out.println("Taş seçmek için 1");
        System.out.println("Kağıt seçmek için 2");
        System.out.println("Makas seçmek için 3");
        System.out.println("giriniz.");
        
        Scanner k=new Scanner(System.in);
        int secilen=k.nextInt();
        
        while(pc==1) {
            if(secilen==1) {
                System.out.println("PC: "+"Taş");
                System.out.println("Oyuncu: "+"Taş");
                System.out.println("Berabere");
                break;
            }
            if(secilen==2) {
                System.out.println("PC: "+"Taş");
                System.out.println("Oyuncu: "+"Kağıt");
                System.out.println("Oyuncu kazandı!");
                break;
            }
            if(secilen==3) {
                System.out.println("PC: "+"Taş");
                System.out.println("Oyuncu: "+"Makas");
                System.out.println("Bilgisayar kazandı!");
                break;
            }
        }
        
        while(pc==2) {
            if(secilen==1) {
                System.out.println("PC: "+"Kağıt");
                System.out.println("Oyuncu: "+"Taş");
                System.out.println("Bilgisayar kazandı!");
                break;
            }
            if(secilen==2) {
                System.out.println("PC: "+"Kağıt");
                System.out.println("Oyuncu: "+"Kağıt");
                System.out.println("Berabere");
                break;
            }
            if(secilen==3) {
                System.out.println("PC: "+"Kağıt");
                System.out.println("Oyuncu: "+"Makas");
                System.out.println("Oyuncu kazandı!");
                break;
            }
        }
        
        while(pc==3) {
            if(secilen==1) {
                System.out.println("PC: "+"Makas");
                System.out.println("Oyuncu: "+"Taş");
                System.out.println("Oyuncu kazandı!");
                break;
            }
            if(secilen==2) {
                System.out.println("PC: "+"Makas");
                System.out.println("Oyuncu: "+"Kağıt");
                System.out.println("Bilgisayar kazandı!");
                break;
            }
            if(secilen==3) {
                System.out.println("PC: "+"Makas");
                System.out.println("Oyuncu: "+"Makas");
                System.out.println("Berabere");
                break;
            }
        }
       
        
      
        
        
        
        
    }
    
}
        