
public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // OOPS = O O P S
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }

    // ---------- Pattern for O ----------
    public static String[] buildO() {
        return new String[]{
                String.join(" ", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", "*"),
                String.join(" ", "*", " ", " ", "*"),
                String.join(" ", "*", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*")
        };
    }

    // ---------- Pattern for P ----------
    public static String[] buildP() {
        return new String[]{
                String.join(" ", "*", "*", "*", " "),
                String.join(" ", "*", " ", " ", "*"),
                String.join(" ", "*", "*", "*", " "),
                String.join(" ", "*", " ", " ", " "),
                String.join(" ", "*", " ", " ", " ")
        };
    }

    // ---------- Pattern for S ----------
    public static String[] buildS() {
        return new String[]{
                String.join(" ", "*", "*", "*", "*"),
                String.join(" ", "*", " ", " ", " "),
                String.join(" ", "*", "*", "*", "*"),
                String.join(" ", " ", " ", " ", "*"),
                String.join(" ", "*", "*", "*", "*")
        };
    }
}
