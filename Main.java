import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhuAwal, suhuAkhir;
        char jenisAwal, jenisAkhir;

        System.out.print("Masukkan suhu awal: ");
        suhuAwal = input.nextDouble();
        System.out.print("Jenis suhu awal (C/F/K): ");
        jenisAwal = input.next().charAt(0);
        System.out.print("Jenis suhu akhir (C/F/K): ");
        jenisAkhir = input.next().charAt(0);

        if (jenisAwal == 'C' && jenisAkhir == 'F') {
            suhuAkhir = (suhuAwal * 9 / 5) + 32;
        } else if (jenisAwal == 'C' && jenisAkhir == 'K') {
            suhuAkhir = suhuAwal + 273.15;
        } else if (jenisAwal == 'F' && jenisAkhir == 'C') {
            suhuAkhir = (suhuAwal - 32) * 5 / 9;
        } else if (jenisAwal == 'F' && jenisAkhir == 'K') {
            suhuAkhir = (suhuAwal - 32) * 5 / 9 + 273.15;
        } else if (jenisAwal == 'K' && jenisAkhir == 'C') {
            suhuAkhir = suhuAwal - 273.15;
        } else if (jenisAwal == 'K' && jenisAkhir == 'F') {
            suhuAkhir = (suhuAwal - 273.15) * 9 / 5 + 32;
        } else {
            suhuAkhir = suhuAwal; // Jika jenis suhu awal dan akhir sama
        }

        System.out.println("Suhu setelah konversi: " + suhuAkhir + " " + jenisAkhir);
    }
}
