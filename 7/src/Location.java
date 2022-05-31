import java.util.*;

class Locate {
    private String latit, longi;

    public Locate(String latit, String longi) {
        this.latit = latit;
        this.longi = longi;
    }
    public String getLatit() {
        return latit;
    }
    public String getLongi() {
        return longi;
    }
}
public class Location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Locate> h = new HashMap<>();
        System.out.println("도시, 위도, 경도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s, ",");
            String city = st.nextToken().trim();
            String latit = st.nextToken().trim();
            String longi = st.nextToken().trim();
            h.put(city, new Locate(latit, longi));
        }

        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        String[] citys = new String[4];
        int k = 0;

        System.out.println("-------------------------");
        while(it.hasNext()) {
            String city = it.next();
            String latit = h.get(city).getLatit();
            String longi = h.get(city).getLongi();
            System.out.println(city + " " + latit + " " + longi);
            citys[k] = city;
            k++;
        }
        System.out.println("-------------------------");

        while (true) {
            System.out.print("도시 이름 >> ");
            String city = sc.nextLine();
            if (city.equals("그만")) {
                break;
            }
            Locate l = h.get(city);
            if (l == null) {
                System.out.println(city + "는 없습니다.");
            }
            else {
                System.out.println(city + " " + l.getLatit() + " " + l.getLongi());
            }
        }
    }
}
