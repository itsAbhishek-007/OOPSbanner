
public class uc4 {

    public static void main(String[] args) {

        // Array storing all banner lines
        String[] banner = {

                String.join("  ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*     *", "*     *"),
                String.join("  ", "*     *", "*     *", "*     *", "*     *"),
                String.join("  ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("  ", "*     *", "*     *", "*      ", "      *"),
                String.join("  ", "*     *", "*     *", "*      ", "      *"),
                String.join("  ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
