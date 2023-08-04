package w07_Inheritance;
public class MainKendaraan extends Kendaraan{

    @Override
    public void jalankan() {
        System.out.println("matic"); }

    @Override
    public void setMesin(String mesin) {
        System.out.println("mesin besar : " + mesin); }

    @Override
    public String getMesin() {
        System.out.println("ayoo");
        return super.getMesin(); }
    
    public static void main(String[] args) {
        MainKendaraan mainkendaraan = new MainKendaraan();
        mainkendaraan.jalankan();
        mainkendaraan.setMesin("150cc");
        System.out.println(mainkendaraan.getMesin()); 
    }
}
