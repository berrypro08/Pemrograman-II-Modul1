import  java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int bilangan = input.nextInt();
    int i = 0;
    do {
        if (bilangan % 2 != 0) {
            System.out.print(bilangan);
            if (i < n-1)System.out.print(", ");
            i++;
        }
        bilangan++;
    }while (i < n);
    input.close();
}