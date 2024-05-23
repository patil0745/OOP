import java.util.Scanner;

class NoVowelsFound extends Exception {
    public NoVowelsFound(String message) {
        super(message);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input string
            System.out.print("Please enter the string: ");
            String input = scanner.nextLine();

            // Check if string contains vowels
            checkForVowels(input);

            System.out.println("String contains vowels.");
        } catch (NoVowelsFound e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void checkForVowels(String str) throws NoVowelsFound {
        boolean found = false;
        String vowels = "aeiouAEIOU";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new NoVowelsFound("String does not contain any vowels");
        }
    }
}
