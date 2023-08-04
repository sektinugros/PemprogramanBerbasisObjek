package w07_Inheritance;
public class ContohVMI {    
    
    public static void main(String[] args) {
       HitungLuas contoh = new PersegiPanjang();
        System.out.println("panjang : "+ contoh.panjang);
        System.out.println("lebar : "+ contoh.lebar);
        contoh.luas();
    }
}
