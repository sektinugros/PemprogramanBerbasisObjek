package w07_Inheritance;
public class Toni extends Kakek implements AyahInterface, IbuInterface{
    @Override
    public void cetak() {
        super.cetak();
        AyahInterface.super.cetak();
        IbuInterface.super.cetak();
    }

    public static void main(String[] args) {
        Toni toni = new Toni();
        toni.cetak();
    }
}
