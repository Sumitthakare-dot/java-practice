public class strings2 {
    public static void main(String[] args) {
        
        String firstName = "rohan";
        String secondName = "Stark";

        String fullName = firstName + " "+ secondName;
        for(int i=0; i<fullName.length(); i++){
            System.err.println(fullName.charAt(i));
        }
    }
    
}
