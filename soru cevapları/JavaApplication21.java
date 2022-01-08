
package javaapplication21;

import java.util.Scanner;

public class JavaApplication21 {

    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
                      
    
        System.out.println("Oyuncu 1 ismi giriniz:");
        String oyuncu1=k.nextLine();
        
         System.out.println("Oyuncu 2 ismi giriniz:");
        String oyuncu2=k.nextLine();
        
        int o1can=100,o2can=100,o1atk=20,o2atk=20;
      
        
        int sayac=2;
         
        
        
        
        do{
            
            int zar1=(int)(Math.random()*21);
        int zar2=(int)(Math.random()*21);
            
            
            while(sayac%2==0){                                                                       //--------------------Oyuncu 1 saldırı
            System.out.println(oyuncu1+" saldırıyor!");
           
            System.out.println(oyuncu1+" "+zar1+" attı.");
            System.out.println(oyuncu2+" "+zar2+" attı.");
        
            if(zar1>=zar2){
                o2can=o2can-o1atk;
                System.out.println(oyuncu1+" başarıyla saldırdı!");
                System.out.println(oyuncu2+" nin canı:"+o2can);
                sayac++;
                
                
            }
            
            else{
                System.out.println(oyuncu1+" saldıramadı.");
                System.out.println(oyuncu2+" nin canı:"+o2can);
                sayac++;
            }
        
        }
            
             int zar11=(int)(Math.random()*21);
        int zar22=(int)(Math.random()*21);
            
        while(sayac%2!=0){                                                                       //--------------------Oyuncu 2 saldırı
            System.out.println(oyuncu2+" saldırıyor!");
           
            System.out.println(oyuncu1+" "+zar11+" attı.");
            System.out.println(oyuncu2+" "+zar22+" attı.");
        
            if(zar22>=zar11){
                o1can=o1can-o2atk;
                System.out.println(oyuncu2+" başarıyla saldırdı!");
                System.out.println(oyuncu1+" nin canı:"+o1can);
                sayac++;
                
            }
            else{
                System.out.println(oyuncu2+" saldıramadı.");
                System.out.println(oyuncu1+" nin canı:"+o1can);
                sayac++;
                
            }
        
        }
        
            
            
            
            
            
            
            
            
        }while(o1can>0&&o2can>0);
    
        
        
        
        
        }
        
        
    }
    

