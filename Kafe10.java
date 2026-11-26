import java.util.Scanner;
public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");
    
    if (jamKunjung <= 16 && jamKunjung >= 14) {
        System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
    }
    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
    }

    System.out.println("==== MENU RESTO KAFE ====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==========================");
    System.out.println("Silahkan pilih menu yang Anda inginkan.");
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nama pelanggan: ");
    String namaPelanggan = input.nextLine();

    System.out.print("Member?(true/false): ");
    boolean isMember = input.nextBoolean();

    System.out.print("Jam kunjung: ");
    int jamKunjung = input.nextInt();
    input.nextLine();

    Menu(namaPelanggan, isMember, jamKunjung);
    input.close();
}
