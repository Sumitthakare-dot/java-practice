import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // int size =sc.nextInt();
        // int numbers[]=new int[size];

        // for(int i=0; i<size; i++){
        //     numbers[i]=sc.nextInt();
        // }
        // for(int i=0; i<numbers.length;i++){
        //     System.out.println(numbers[i]+" ");
        // }
        //Take an array of names as input from the user and print them on the screen.
        int size=sc.nextInt();
        String names[]=new String[size];

        for(int i=0; i<size;i++){
            names[i] = sc.next();
        }
        for(int i=0; i<names.length;i++){
            System.out.println("name"+(i+1)+"is:"+names[i]);
        }
    }
}
