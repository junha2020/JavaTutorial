import java.util.*;

public class PassingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        System.out.print("황기태 시작 <Enter>키>>");
        sc.nextLine();
        Calendar hs = Calendar.getInstance();
        int hss = hs.get(Calendar.SECOND);
        System.out.println("      현재 초 시간 = " + hss);
        System.out.print("10초 예상 후 <Enter>키>>");
        sc.nextLine();
        Calendar he = Calendar.getInstance();
        int hes = he.get(Calendar.SECOND);
        System.out.println("      현재 초 시간 = " + hes);
        System.out.print("이재문 시작 <Enter>키>>");
        sc.nextLine();
        Calendar ls = Calendar.getInstance();
        int lss = ls.get(Calendar.SECOND);
        System.out.println("      현재 초 시간 = " + lss);
        System.out.print("10초 예상 후 <Enter>키>>");
        sc.nextLine();
        Calendar le = Calendar.getInstance();
        int les = le.get(Calendar.SECOND);
        System.out.println("      현재 초 시간 = " + les);
        System.out.print("황기태의 결과 " + Math.abs(hes - hss) + ", 이재문의 결과 " + Math.abs(les - lss) + ", 승자는 ");
        if (Math.abs(10 - Math.abs(hes - hss)) < Math.abs(10 - Math.abs(les - lss))) {
            System.out.println("황기태");
        }
        if (Math.abs(10 - Math.abs(hes - hss)) > Math.abs(10 - Math.abs(les - lss))){
            System.out.println("이재문");
        }
        else {
            System.out.println("없습니다");
        }
    }
}
