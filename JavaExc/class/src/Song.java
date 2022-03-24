public class  Song {
    String title, artisit, country;
    int year;

    public Song () {

    }
    public Song (int y, String c, String a, String t) {
        year = y;
        country = c;
        artisit = a;
        title = t;
    }

    void show () {
        System.out.println(year + "년 " + country + "국적의 " + artisit + "가 부른 " + title);
    }
    public static void main(String[] args) {
        Song abba = new Song(1978, "스웨덴", "ABBA", "Dancing Quuen");
        abba.show();
    }
}
