import java.util.Scanner;

public class Kuis_Ilham_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double tinggicm, tinggimm, tinggim, hasil;

        System.out.println("----- Program Konversi Tinggi Badan -----");

        System.out.print("Masukkan Tinggi : ");
        tinggicm = sc.nextDouble();

        tinggimm = tinggicm * 10;
        tinggim = tinggicm * 0.01;

        System.out.println(String.format("Tinggi badan anda %s cm atau %s mm atau %s m", tinggicm, tinggimm, tinggim));
    }
}