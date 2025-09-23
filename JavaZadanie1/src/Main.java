import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double stopnieC, stopnieF;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnnie Celsjusza: ");
        stopnieC=scanner.nextDouble();
        stopnieF=1.8 * stopnieC + 32;
        System.out.println("Stopnie f:" + stopnieF);
    }
}