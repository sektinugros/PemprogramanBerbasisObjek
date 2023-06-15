/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w04_encapsulation;

/**
 *
 * @author LENOVO
 */
public class MainKinetic {
    
  double massa, kecepatan;
  
  
         
    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

  
    
    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hasilEnergiKinetic (){
        double energiKinetic = 0.5*massa*kecepatan*kecepatan;
        return energiKinetic;
    }
    
    
    public static void main(String[] args) {
        
       MainKinetic hasil = new MainKinetic();
       hasil.setMassa(20);
       hasil.setKecepatan(2);
        
       double energiKinetic = hasil.hasilEnergiKinetic();
        System.out.println("massa terhitung =");
        System.out.println(hasil.getMassa());
        
        System.out.println("kecepatan terhitung ");
        System.out.println(hasil.getKecepatan());
        
        System.out.println("hasil energi kinetiknya =");
        System.out.println(energiKinetic);
    }
        
   


}
