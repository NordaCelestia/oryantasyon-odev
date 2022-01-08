
package javaapplication23;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class JavaApplication23 {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner k=new Scanner(System.in);
        int s=(int)(Math.random()*11);
        int s1=(int)(Math.random()*11);
        int s2=(int)(Math.random()*11);
        int s3=(int)(Math.random()*11);
        int s4=(int)(Math.random()*11);
        
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        TimeUnit.SECONDS.sleep(1);
        
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
         System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
         System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
         System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        
        System.out.println("1.sayıyı giriniz.");
        int giris=k.nextInt();
        System.out.println("2.sayıyı giriniz.");
        int giris1=k.nextInt();
        System.out.println("3.sayıyı giriniz.");
        int giris2=k.nextInt();
        System.out.println("4.sayıyı giriniz.");
        int giris3=k.nextInt();
        System.out.println("5.sayıyı giriniz.");
        int giris4=k.nextInt();
        
        if(giris==s&&giris1==s1&&giris2==s2&&giris3==s3&&giris4==s4){
            System.out.println("Tebrikler, kazandınız!");
            
        }
        else
            System.out.println("Tekrar deneyiniz.");
        
    }
    
}
