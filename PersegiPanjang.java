package w07_Inheritance;
public class PersegiPanjang extends HitungLuas{

    int panjang = 20;
    int lebar = 10;
    
    @Override
    public void luas() {
        System.out.println("luasnya :" + panjang * lebar );
    }
 }
