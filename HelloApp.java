public class HelloApp {
    public static void main(String args[]) {
         if (args.length == 0) {
            System.out.println("Usage: java HelloApp <name>");
            return;
        }

        String name = args[0];
        System.out.println("Hello, " + name + "!");
        
    }
}