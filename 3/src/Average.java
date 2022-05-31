public class Average {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        if (args.length == 0) {
            return;
        }
        System.out.printf("%d", sum/args.length);
    }
}
