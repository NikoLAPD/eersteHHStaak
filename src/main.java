import java.util.Scanner;

public class main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("voer een getal in");
        String getal = scanner.nextLine();
        System.out.println(getal + " is fout voer een getal tussen 1 en 10 in:");
        String goedegetal = scanner.nextLine();
        System.out.println(goedegetal);
        System.out.println("Gelukt!");
    }

}
