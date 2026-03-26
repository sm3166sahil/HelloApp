public class UC6HelloApp {

    public static void main(String[] args) {

        String message;

        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder names = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                names.append(name).append(", ");
            }

            // Remove trailing ", "
            String finalNames = names.substring(0, names.length() - 2);

            message = "Hello, " + finalNames + "!";
        }

        System.out.println(message);
    }
}