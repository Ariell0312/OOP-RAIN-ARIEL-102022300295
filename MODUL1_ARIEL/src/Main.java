import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManajemenInventaris inventaris = new ManajemenInventaris();
        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Makanan Kering");
            System.out.println("2. Tambah Makanan Basah");
            System.out.println("3. Tampilkan Semua Makanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");

            if (input.hasNextInt()) {
                pilihan = input.nextInt();
                input.nextLine();
            } else {
                System.out.println("Input tidak valid. Masukkan angka.");
                input.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
                    inventaris.tambahMakananKering();
                    break;
                case 2:
                    inventaris.tambahMakananBasah();
                    break;
                case 3:
                    inventaris.tampilkanSemuaMakanan();
                    break;
                case 4:
                    System.out.println("Keluar dari sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 4);

        input.close();
    }
}