public class Kuis_Ilham_2{
    public static void main(String args[]){
        double kecepatanAwal = 50.0;
        double kecepatanAkhir = 30.0; 
        double percepatan;
        double waktu = 0.5;

        percepatan = (kecepatanAkhir - kecepatanAwal) / waktu;

        System.out.println(String.format("Kecepatan awal %s km/jam, kecepatan akhir %s km/jam, percepatan %s km/jam", kecepatanAwal, kecepatanAkhir, percepatan));
    }
}