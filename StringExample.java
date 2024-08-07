import java.util.HashMap;

public class StringExample {
    public static void main(String[] args) {
        // Declaration and Initialization
        String greeting = "Hello, World!";
        String anotherGreeting = new String("Hello, Java!");

        // Accessing Characters
        char firstChar = greeting.charAt(0);
        char seventhChar = greeting.charAt(6);
        System.out.println("First character: " + firstChar);
        System.out.println("Seventh character: " + seventhChar);

        // String Length
        int length = greeting.length();
        System.out.println("String length: " + length);

        // Concatenation
        String name = "John";
        String message = greeting + " My name is " + name + ".";
        System.out.println("Concatenated message: " + message);

        // Substrings
        String hello = greeting.substring(0, 5);
        String world = greeting.substring(7);
        System.out.println("Substring 'hello': " + hello);
        System.out.println("Substring 'world': " + world);

        // Comparison
        boolean isEqual = greeting.equals(anotherGreeting);
        int comparison = greeting.compareTo(anotherGreeting);
        System.out.println("Are greetings equal? " + isEqual);
        System.out.println("Comparison result: " + comparison);

        // Case Conversion
        String upper = greeting.toUpperCase();
        String lower = greeting.toLowerCase();
        System.out.println("Upper case: " + upper);
        System.out.println("Lower case: " + lower);

        // Trimming
        String paddedString = "   Hello, World!   ";
        String trimmed = paddedString.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        // Splitting
        String[] parts = greeting.split(", ");
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Replacing
        String replaced = greeting.replace("World", "Java");
        System.out.println("Replaced string: " + replaced);

        System.out.println();
        System.out.println();
        System.out.println();

        String key= "the quick brown fox jumps over the lazy dog";
        HashMap<Character,Character> map=new HashMap<>();
        int a=97;
        for(int i=0;i<key.length();i++)
        {
            map.put(key.charAt(i),(char)a);
            a++;
        }
        System.err.println(map);



    }
}
