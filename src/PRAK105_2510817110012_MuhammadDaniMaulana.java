import  java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    final double PHI = 3.14;
    System.out.print("Masukkan Jari-Jari: ");
    double r = input.nextDouble();
    System.out.print("Masukkan Tinggi:  ");
    double t = input.nextDouble();
    double volume = PHI * (r * r) * t;
    System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3", r, t, volume);
    input.close();
}
