import java.util.Scanner;

public class Harga {
    static void tampilNama(int id) {
        String namaPelanggan[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        System.out.println(namaPelanggan [id-1]);
    }

    static void hitungTarif (int jumlahPakai) {
        int harga = 0;
        if (jumlahPakai > 0 || jumlahPakai < 10) {
            jumlahPakai = 10;
            harga = jumlahPakai*2000;
        }

        else if (jumlahPakai >= 11 && jumlahPakai  <= 20) {
            harga = jumlahPakai*3000;
        }

        else if (jumlahPakai >= 21 && jumlahPakai  <= 30) {
            harga = jumlahPakai*4000;
        }

        else if (jumlahPakai >= 31) {
            harga = jumlahPakai*5000;
        }

        System.out.println("Jumlah Pemakaian: " + jumlahPakai);
        System.out.println("Harga: Rp " + String.format("%, d", (harga - 10000)));
        System.out.println("Tarif Pemakaian Dengan Biaya Administrasi: Rp " + String.format("%, d", (harga)));

        }

         public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            boolean status = true;

            do {

            System.out.print("Masukkan Nomor ID Pelanggan : ");
            int namaid = input.nextInt();
            System.out.print("Masukkan Jumlah Pemakaian : ");
            int tarif = input.nextInt();
            
            System.out.print("Nama : ");
            tampilNama(namaid);
            hitungTarif(tarif);

            System.out.println("");
            System.out.print("Apakah mau melihat setiap anggota? (ya/tidak): ");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase ("Tidak")) {
                status = false;

            } else {
                status =  true;
            }
        } while (status);
        
    }

}