public class Utils {
    public static String zeros(int difficulty) {
        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i<difficulty; i++) {
            toReturn.append("0");
        }

        return toReturn.toString();
    }
}
