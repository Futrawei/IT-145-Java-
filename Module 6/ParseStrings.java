import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Scanner inSS = null;
        String lineString = "";
        String firstWord = "";
        String nextWord = "";

        System.out.println("Enter input string: ");

        while (!lineString.matches("q")) {
            lineString = scr.nextLine();
            lineString = lineString.replaceAll(",",", ");
            inSS = new Scanner(lineString);
            int deliComma = lineString.indexOf(",");

            if ((deliComma <= -1) && (!lineString.matches("q"))) {
                System.out.println("Error: No comma in string");
                System.out.println("Enter input string: ");
            }

            else if ((deliComma <= -1) && ((lineString == null) || (lineString.length() == 0) || (lineString.split("\\s+").length < 2)) && (lineString.matches("q") == false)) {
                System.out.println("Error: Two words");
                System.out.println("Enter input string: ");
            }

            else if (!lineString.matches("q")) {
                firstWord = inSS.next();
                nextWord = inSS.nextLine();
                System.out.println("First word: " + firstWord.replaceAll("\\s","").replaceAll("\\W","").replaceAll("\\n",""));

                System.out.println("Second word: " + nextWord.replaceAll("\\s","").replaceAll("\\W","").replaceAll("\\n",""));

                System.out.println("\n");

                System.out.println("Enter input string: ");
            }
        }

    }

}
