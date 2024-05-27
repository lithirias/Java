import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insert a film");
        String film = leitura.nextLine();
        System.out.println(film);
    }
}
