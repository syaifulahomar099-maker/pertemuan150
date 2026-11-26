public class PengunjungCafe17 {
 static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Pengunjung:");
    for (int i = 0; i < namaPengunjung.length; i++) {
        System.out.println((i + 1) + ". " + namaPengunjung[i]);
    }
    daftarPengunjung("Andi", "Budi", "Citra");
    
 }   
}