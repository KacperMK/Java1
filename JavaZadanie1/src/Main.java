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


        double z1, z2, z3;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Pierwsza liczba");
        z1=scanner1.nextDouble();
        System.out.println("Druga liczba");
        z2=scanner1.nextDouble();
        System.out.println("Trzecia liczba");
        z3=scanner1.nextDouble();
        if (z1>z2){
            System.out.println(z1+" jest najwieksze");
        }else{
            System.out.println(z2 + "jest najwieksze");
        }
    }
}