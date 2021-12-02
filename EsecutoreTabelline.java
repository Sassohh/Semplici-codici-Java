import java.util.Scanner;

//sto utilizzando i metodi per rendere il body del programma più pulito
public class Main {
    static void Tab1() {
        int[] Num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }
    
    static void Tab2() {
        int[] Num1 = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }
    
    static void Tab3() {
        int[] Num1 = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab4() {
        int[] Num1 = { 4, 8, 12, 16, 20, 24, 28, 32, 36, 40 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab5() {
        int[] Num1 = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }
    
    static void Tab6() {
        int[] Num1 = { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab7() {
        int[] Num1 = { 7, 14, 21, 28, 35, 42, 49, 56, 63, 70 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab8() {
        int[] Num1 = { 8, 16, 24, 32, 40, 48, 56, 64, 72, 80 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab9() {
        int[] Num1 = { 9, 18, 27, 36, 45, 54, 63, 72, 81, 90 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    static void Tab10() {
        int[] Num1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int i : Num1) {
            System.out.println(i);
            System.out.println("---");
        }
    }

    public static void main(String[] args) {
        //utilizzo Scanner come comando input
        Scanner myNum = new Scanner(System.in);
        System.out.println("Inserisci il numero della tabellina che vuoi conoscere: ");
        int num = myNum.nextInt();

        
        switch (num) {
            case 1:
                Tab1();
                break;

            case 2:
                Tab2();
                break;
                
            case 3:
                Tab3();
                break;

            case 4:
                Tab4();
                break;

            case 5:
                Tab5();
                break;    

            case 6:
                Tab6();
                break;
                
            case 7:
                Tab7();
                break;

            case 8:
                Tab8();
                break;

            case 9:
                Tab1();
                break;

            case 10:
                Tab10();
                break;
        }


    }
}
