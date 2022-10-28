package tugas2;

//Created by 21343050_Heri Ramadhan

import java.util.Scanner;

public class Mahasiswa {
    String nama, semester, nim;
    float ip;

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM\t\t: ");
        nim = input.nextLine();
        System.out.print("Masukkan Semester\t: ");
        semester = input.nextLine();
        System.out.print("Masukkan IP\t\t: ");
        ip = input.nextFloat();
        input.close();
    }

    public void keterangan() {
        if (ip >= 3.5) {
            System.out.println("Anda berhak mengontrak 24 SKS pada semester " + semester);
        } else if (ip >= 3.0) {
            System.out.println("Anda berhak mengontrak 22 SKS pada semester " + semester);
        } else if (ip >= 2.5) {
            System.out.println("Anda berhak mengontrak 20 SKS pada semester " + semester);
        } else if (ip >= 2.0) {
            System.out.println("Anda berhak mengontrak 18 SKS pada semester " + semester);
        } else {
            System.out.println("Anda berhak mengontrak 15 SKS pada semester " + semester);
        }
    }
}
