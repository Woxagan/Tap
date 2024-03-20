//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de caractere:");
        String input = scanner.nextLine();

        String result = extractMaxSubstring(input);

        System.out.println("Primul subşir cu lungime maximă, care nu conţine litere este: " + result);
    }
    public static String extractMaxSubstring(String input)
    {
        String maxSubstring = "";
        String currentSubstring = "";

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (currentSubstring.length() > maxSubstring.length())
                {
                    maxSubstring = currentSubstring;
                }
                currentSubstring = "";
            } else
            {
                currentSubstring += c;
            }
        }

        if (currentSubstring.length() > maxSubstring.length() && !currentSubstring.isEmpty())
        {
            maxSubstring = currentSubstring;
        }
        return maxSubstring;
    }
}
