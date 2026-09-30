import java.util.Scanner;
void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Tangan Abu: ");
    String inputAbu = input.nextLine();
    System.out.print("Tangan Bagas: ");
    String inputBagas = input.nextLine();

    int skorAbu = 0;
    int skorBagas = 0;

    int ronde = 0;
    int indeksHuruf = 0;
    do {
        char tanganAbu = inputAbu.charAt(indeksHuruf);
        char tanganBagas = inputBagas.charAt(indeksHuruf);
        if (tanganAbu != tanganBagas) {
            if ((tanganAbu == 'B' && tanganBagas == 'G') ||
                    (tanganAbu == 'G' && tanganBagas == 'K') ||
                    (tanganAbu == 'K' && tanganBagas == 'B')) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }
        ronde++;
        indeksHuruf += 2;

    } while (ronde < 3);
    if (skorAbu > skorBagas) {
        System.out.println("Abu");
    } else if (skorBagas > skorAbu) {
        System.out.println("Bagas");
    } else {
        System.out.println("Seri");
    }

    input.close();
}