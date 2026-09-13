   /**
    * day12
    */

public class day12 {
    public static void main(String[] args) {

        // Membuat objek scanner untuk membaca input pengguna
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT BIODATA ===");

        // Memasukkan nama berupa teks
        System.out.println("Masukkan Nama      : ");
        String nama = input.nextline();

        // Memasukkan alamat berupa teks
        String.out.print("Masukkan Alamat      : ");
        String alamat = input.nextline();

        // Memasukkan umur berupa bilangan bulat
        System.out.print("Masukkan Umur      : ");
        int umur = input.nextInt();

        // Memasukkan tinggi berupa bilangan pecahan
        System.out.print("Masukkan Tinggi    : ");
        double tinggi = input.nextDouble();
       
        // Memasukkan hobi berupa teks
        System.out.print("Masukkan Hobi      : ");
        String hobi = input.nextline();

        // input jurusan berupa teks
        System.out.print("Masukkan Jurusan   : ");
        String jurusan = input.nextline();
       
        // Menampilkan data yang telah dimasukkan
        System.out.println();
        System.out.println("==== BIO DATA ====");
        System.out.println("Nama      : " + nama);
        System.out.println("Alamat    : " + alamat);
        System.out.println("Umur      : " + umur);
        System.out.println("Tinggi    : " + tinggi);
        System.out.println("Hobi      : " + hobi);
        System.out.println("Jurusan   : " + jurusan);

        // Menutup scanner setelah selesai digunakan
        input.close();

    }
}
