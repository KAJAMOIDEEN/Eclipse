package basics;

public class sample {
    public static void main(String[] args) {

        String name = "praveen";
        char initial = 'm';
        int age = 29;
        long phoneNumber = 8967890348L; // Correct variable name (no spaces)
        float height = 172.5f;
        double weight = 48.5d;
        boolean resultPass = true; // Corrected camelCase naming
        byte languages = 3;
        short favourite = 1;

        // Corrected syntax in the print statement
        System.out.println("Bio Data:"
        		+ "\nName:" + name + 
                           "\nInitial:" + initial +
                           "\nAge: " + age +
                           "\n: " + phoneNumber +
                           "\nFloat: " + height +
                           "\nDouble: " + weight +
                           "\nBoolean: " + resultPass +
                           "\nByte: " + languages +
                           "\nShort: " + favourite);
    }
}
