public class strings5 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("sumitthkare");
        // System.out.println(sb);

        // StringBuilder sb =new StringBuilder(" troy");
        // System.out.println(0);

        // StringBuilder sb =new StringBuilder("tony");

        // sb.insert(0, 's');
        // System.out.println(sb);


 //delet char at some index

        // StringBuilder sb = new StringBuilder("troy");
        // sb.insert(0, 's');
        // System.out.println(sb);

        // sb.delete(0, 1);
        // System.out.println(sb);


//reverse a string(using stringbulder class).
        
        StringBuilder  sb = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length()/2;i++){
            int front =i;
            int back = sb.length() - i - 1;

        char frontChar =sb.charAt(front);
        char backChar =sb.charAt(back);

        sb.setCharAt(front,backChar);
        sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);




    }
    
}
