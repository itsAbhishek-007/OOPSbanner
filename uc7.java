public class UC7 {
    public static class CharacterPatternMap{
        public String[] pattern;
    }
    public static CharacterPatternMap getCharacterPatternMap(Character character) {
        CharacterPatternMap characterPatternMap = new CharacterPatternMap();
        switch (character) {
            case 'O' -> characterPatternMap.pattern = get0pattern();
            case 'o' -> characterPatternMap.pattern = getopattern();
            case 'P' -> characterPatternMap.pattern = getPpattern();
            case 'S' -> characterPatternMap.pattern = getSpattern();
        }
        return characterPatternMap;
    }

    private static String[] get0pattern() {
        return new String[]{};
    }

    private static String[] getopattern() {
        return new String[]{};
    }

    private static String[] getPpattern() {
        return new String[]{};
    }

    private static String[] getSpattern() {
        return new String[]{};
    }
}
