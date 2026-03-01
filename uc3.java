public class uc3 {

    public static void main(String[] args) {

        printLine(" ***** ", " ***** ", " ***** ", " ***** ");
        printLine("*     *", "*     *", "*     *", "*     *");
        printLine("*     *", "*     *", "*     *", "*     *");
        printLine("*     *", "*     *", " ***** ", " ***** ");
        printLine("*     *", "*     *", "*      ", "      *");
        printLine("*     *", "*     *", "*      ", "      *");
        printLine(" ***** ", " ***** ", "*      ", " ***** ");

    }

    // Utility method using String.join()
    public static void printLine(String o1, String o2, String p, String s) {
        String line = String.join("  ", o1, o2, p, s);
        System.out.println(line);
    }
}