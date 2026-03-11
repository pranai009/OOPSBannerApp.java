public class UC7 {

    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap map : patterns) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7];
    }

    public static void printBanner(String word, CharacterPatternMap[] patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, patterns);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] oPattern = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] pPattern = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] sPattern = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        CharacterPatternMap o = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap p = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap s = new CharacterPatternMap('S', sPattern);

        CharacterPatternMap[] patterns = { o, p, s };

        printBanner("OOPS", patterns);
    }
}