package w07_Inheritance;
public class MainMamalia {
    
    public static void main(String[] args) {
      Mamalia cat = new Kucing();
      cat.speak();
      cat.nama = "Bristh Shorthair";
      cat.makan("ikan");
    }
}
