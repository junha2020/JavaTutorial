public class Add {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                int a = Integer.parseInt(arg);
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {

            }
        }
        System.out.printf("%d", sum);
    }
}
