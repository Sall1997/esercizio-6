import java.sql.Array;

/* ESERCIZIO 6
    -Define a string called string1 that has assigned the value "Hello"
    -Define a string called string2 that has assigned the value "How are you?"
    -Take the first 2 characters string1 and the last 2 characters of string2 and combine the 4 chars (Heu?)
        into a dedicated array called charArray
    -Print charArray */

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        char [] charArray = new char[4];

        charArray[0] = string1.charAt(0);
        charArray[1] = string1.charAt(1);
        charArray[2] = string2.charAt(10);
        charArray[3] = string2.charAt(11);

        System.out.println(charArray);
    }
}