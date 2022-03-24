abstract class PairMap {
    protected String keyArray [];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap {
   Dictionary(int lenght) {
       keyArray = new String[10];
       valueArray = new String[10];
       for (int i = 0; i < 10; i++) {
           keyArray[i] = "null";
           valueArray[i] = "null";
       }
   }
   public void put(String key, String value) {
       for (int i = 0; i < keyArray.length; i++) {
           if (keyArray[i].equals(key)) {
               valueArray[i] = value;
               break;
           }
           else {
               if (keyArray[i].equals("null")) {
                   keyArray[i] = key;
                   valueArray[i] = value;
                   break;
               }
           }
       }
   }
   public String get(String key) {
       String str = "null";
       for (int i = 0; i < keyArray.length; i++) {
           if (keyArray[i].equals(key)) {
               str = valueArray[i];
           }
       }
       return str;
   }
   public String delete(String key) {
       String str = "null";
       for (int i = 0; i < keyArray.length; i++) {
           if (keyArray[i].equals(key)) {
               keyArray[i] = "null";
               valueArray[i] = "null";
           }
       }
       return str;
   }
   public int length() {
       return 1;
   }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 " + dic.get("이재문"));
        System.out.println("황기태의 값은 " + dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 " + dic.get("황기태"));
    }
}
