//java strings basics
public class StringsBasics {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println("Name: " + name);

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        int length = name.length();
        System.out.println("Length of name: " + length);

        char firstChar = name.charAt(0);
        System.out.println("First character: " + firstChar);

        String substring = name.substring(0, 4);
        System.out.println("Substring (0-4): " + substring);

        String anotherName = "john doe";
        boolean isEqual = name.equals(anotherName);
        System.out.println("Is equal (case-sensitive): " + isEqual);

        boolean isEqualIgnoreCase = name.equalsIgnoreCase(anotherName);
        System.out.println("Is equal (case-insensitive): " + isEqualIgnoreCase);
    }
}