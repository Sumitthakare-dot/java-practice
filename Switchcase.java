import java.util.*;

public class Switchcase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("namaste");
                
                break;
            case 2 : System.out.println("wlecome");
            break;
            case 3 :System.out.println("bejuron");
            break;    
            default:System.out.println("invalied");
               
        }
    }
}