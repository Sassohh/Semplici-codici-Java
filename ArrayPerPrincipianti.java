import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nomifighissimi = {"Andrea0", "Andrea1", "Andrea2", "Andrea3", "Andrea4", "Andrea5", "Andrea6", "Andrea7", "Andrea8", "Andrea9"};
        String[] nomibruttissimi = {"Andrea9", "Andrea8", "Andrea7", "Andrea6", "Andrea5", "Andrea4", "Andrea3", "Andrea2", "Andrea1", "Andrea0"};
        
        for (String i : nomifighissimi) {
            nomifighissimi[5] = "no";
            nomifighissimi[7] = "no";
            System.out.println(i);
            System.out.println("-----------");
        }
        
        System.out.println("_______________");
        
        for (String j : nomibruttissimi) {
            System.out.println(j);
            System.out.println("-----------");
        }
        
    }
}