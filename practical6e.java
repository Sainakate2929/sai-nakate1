import java.lang.*;
public class practical6e {
    public static void main(String[] args) {
        // @SuppressWarnings("removal")
        Integer num = new Integer(123);  

        byte byteValue = num.byteValue(); 
        short shortValue = num.shortValue(); 
        double doubleValue = num.doubleValue();  

        System.out.println("byte value  : " + byteValue); 
        System.out.println("short value  : " + shortValue); 
        System.out.println("double value  : " + doubleValue); 
    }
}