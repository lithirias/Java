import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leituScanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("Insert:");
            nota = leituScanner.nextDouble();
            media += nota;
        }

        System.out.println("Media is: " + media/3);
    }
}
