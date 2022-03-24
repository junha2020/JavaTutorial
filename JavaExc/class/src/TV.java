public class TV {
    String corp;
    int year, inch;

    public TV(String c, int y, int i) {
        corp = c;
        year = y;
        inch = i;
    }
    void Show() {
        System.out.println(corp + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.Show();
    }
}
