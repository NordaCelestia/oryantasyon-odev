
package ucgen;

public class Ucgen {

    public static void main(String[] args) {
       
        int boy=5,s=0;
        StringBuffer bosluk=new StringBuffer("     ");
        StringBuffer icbosluk=new StringBuffer(" ");
        while(boy>s){
            if(s==0){
                System.out.println(bosluk+"A");
                
                s++;
                bosluk.delete(0,1);
            }
            System.out.println(bosluk+"A"+icbosluk+"A");
            ;
            bosluk.delete(0,1);
            icbosluk.insert(0,"  ");
            s++;
            if(s==5){
                System.out.println("AAAAAAAAAAA");
            }
        }
        
    }
    
}

       