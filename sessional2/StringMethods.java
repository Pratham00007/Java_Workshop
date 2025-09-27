public class StringMethods {
    public static void main(String[] args) {
        // Original string
        String str1 = "Hello Java";
        String str2 = "Hello";

        // 1. substring()
        String sub = str1.substring(4, 6); // characters from index 4 to 5
        System.out.println("Substring (4,6): " + sub);

        // 2. concat()
        String str3 = str2.concat(" World");
        System.out.println("Concatenated String: " + str3);

        // 3. length()
        System.out.println("Length of str1: " + str1.length());

        // 4. equals()
        System.out.println("str2 equals 'Hello': " + str2.equals("Hello"));
        System.out.println("str2 equals 'hello' (case-sensitive): " + str2.equals("hello"));

        // 5. contains()
        System.out.println("str1 contains 'Java': " + str1.contains("Java"));
        System.out.println("str1 contains 'Python': " + str1.contains("Python"));
    }
}