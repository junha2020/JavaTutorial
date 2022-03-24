public class ave {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int a = 0; a < 10; a++) {
            int i = (int)(Math.random()*10 + 1);
            arr[a] = i;
        }
        System.out.print("랜덤한 정수들 : ");
        double i = 0;
        for (int a = 0; a < 10; a++) {
            System.out.print(arr[a] + " ");
            i += arr[a];
        }
        i /= 10;
        System.out.println();
        System.out.println("평균은 " + i);
    }
}
