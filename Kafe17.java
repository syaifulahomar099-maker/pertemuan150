import java.util.Scanner;
public class Kafe17 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang di Resto Kafe, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        }
        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. cappuccino - Rp 20.000");
        System.out.println("3. latte - Rp 22.000");
        System.out.println("4. teh tarik - Rp 12.000");
        System.out.println("5. roti bakar - Rp 10.000");
        System.out.println("6. Mi goreng - Rp 18.000");
        System.out.println("===================================");
        System.out.println("Silahkan pilih menu yang ingin dipesan (1-6):");
}
public static void main(String[] args) {
        Menu("Andi", true);
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan nomor yang ingin anda pesan (1-6): ");
        int pilihanMenu = scanner.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = scanner.nextInt();

        int totalBayar = hitungTotalHarga17(pilihanMenu, banyakItem);
        System.out.println("total harga untuk pesanan anda : Rp " + totalBayar);

    }
    public static int hitungTotalHarga17( int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
}
