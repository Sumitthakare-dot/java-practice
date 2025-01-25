import java.util.*;

import javax.print.DocFlavor.STRING;
public class strings3 {
    public static void main(String[] args) {
        String name1 = "amit";
        String name2 = "sayli";

        if(name1.equals(name2)){
            System.out.println("They are same string");
        }else{
            System.out.println("They are different strings");
        }

        if(name1 == name2){
            System.out.println("They are the same string");
        }else {

        System.out.println("They are different string");
        }


        if(new String("amit")== new String("amit")){
            System.out.println("They are the same string");
        }else{
            System.out.println("They are different strings");
        }
    }
    
}
