import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Angka: ");
    int angka = input.nextInt();
    int i = 0;
    int hasil = angka;
    while(i < 10){
        if(hasil % 5 == 0){
            int kelipatan = (hasil / 5)-1;
            System.out.print(kelipatan);
        }else {
            System.out.print(hasil);
        }
        if (i < 9)System.out.print(", ");
        i++;
        hasil += 1;
    }
    input.close();
}