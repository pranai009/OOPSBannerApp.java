import java.util.HashMap;

public class UC8 {

    public static HashMap<Character, String[]> buildCharacterPatterns() {

        HashMap<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patterns;
    }

    public static void printBanner(String word, HashMap<Character, String[]> patterns) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> patterns = buildCharacterPatterns();

        printBanner("OOPS", patterns);
    }
}