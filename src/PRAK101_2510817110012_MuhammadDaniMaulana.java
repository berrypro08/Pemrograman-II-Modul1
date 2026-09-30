import java.util.Scanner;

void main() {
        Scanner input = new Scanner(System.in);
        String[] nama_bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();
        input.nextLine();
        if (tanggal > 31 || tanggal < 1){
                System.out.print("Tanggal Tidak Valid");
                System.exit(1);
        }

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();
        if (bulan <= 12){
                if (List.of(4,6,9,11).contains(bulan) && tanggal > 30) {
                        System.out.print("Tanggal Tidak Valid");
                        System.exit(1);
                }
        }else {
                System.out.print("Bulan Tidak Valid");
                System.exit(1);
        }

        String bulan_lahir = nama_bulan[bulan-1];

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();
        if (tahun % 4 == 0 && bulan == 2){
                if (tanggal > 29){
                        System.out.print("Tahun Kabisat: Februari sampai tanggal 29");
                        System.exit(1);
                }
        } else if (bulan == 2 && tanggal > 28) {
                System.out.print("Tanggal Tidak Valid");
                System.exit(1);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        System.out.print("Nama Lengkap " + nama + " Lahir di " + tempatLahir + " pada tanggal " + tanggal + " " + bulan_lahir + " " + tahun + " Tinggi Badan " + tinggiBadan + " cm " + "dan Berat Badan " + beratBadan + " kilogram");
        input.close();
}

