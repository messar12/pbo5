package atribut;

import java.util.Scanner;

public class Atri {
    String Nama, NPM, Status;
    int Tugas, UTS, UAS, Jumlah;
    double Rata;
    Scanner scan = new Scanner(System.in);

    public void Input() {

        int x;
        System.out.println("Jika Ingin Mulai Input Tekan 1/ 0=Tutup :");
        x = scan.nextInt();
        while (x == 1) {

            System.out.println("Nama : ");
            Nama = scan.next();
            System.out.println("NPM : ");
            NPM = scan.next();
            System.out.println("Nilai Tugas : ");
            Tugas = scan.nextInt();
            System.out.println("Nilai UTS : ");
            UTS = scan.nextInt();
            System.out.println("Nilai UAS : ");
            UAS = scan.nextInt();
            Jumlah = Tugas + UTS + UAS;
            Rata = Jumlah / 3;
            if (Rata > 50) {
                Status = "Lulus";

            } else {
                Status = "Tidak Lulus";

            }
            Show();
            System.out.println("Jika Ingin Mulai Input Tekan 1/ 0=Tutup : ");
            x = scan.nextInt();
        }
    }


    public void Welcome() {
        int Kode;
        System.out.println("===Selamat Datang Bos...=== *Pin 111 ");
        System.out.println("Masukkan Pin Number : ");
        Kode = scan.nextInt();

        if (Kode == 111) {
           Input();
        }else {
            System.out.println("Maaf Bos Salah...");
        }

    }

    public void Show() {
        System.out.println("Nama : " + Nama);
        System.out.println("NPM : " + NPM);
        System.out.println("Nilai Tugas : " + Tugas);
        System.out.println("Nilai UTS : " + UTS);
        System.out.println("Nilai UAS : " + UAS);
        System.out.println("Jumlah Nilai : " + Jumlah);
        System.out.println("Nilai Rata-Rata :" + Rata);
        System.out.println(" Status : " + Status);
    }

}
