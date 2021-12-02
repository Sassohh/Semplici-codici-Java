// Bisogna importare la libreria per utilizzare il comando Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myNum1 = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        // utilizzo name ma si può utilizzare qualsiasi tipo di nome
        int name = myNum1.nextInt();

        Scanner myNum2 = new Scanner(System.in);
        System.out.println("Inserisci il secondo numero: ");
        // Stessa cosa per prima ma con obj
        int obj = myNum2.nextInt();

        // Selezione per dichiarare maggiore di:
        if (name > obj) {
            System.out.println("Il numero maggiore e': " + name);
        } else {
            System.out.println("Il numero maggiore e': " + obj);
        }
    }
}