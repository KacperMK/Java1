import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        ZADANIE 1

        double stopnieC, stopnieF;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj stopnnie Celsjusza: ");
        stopnieC=scanner.nextDouble();
        stopnieF=1.8 * stopnieC + 32;
        System.out.println("Stopnie f:" + stopnieF);



//        ZADANIE 2

        double z1, z2, z3;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Pierwsza liczba");
        z1=scanner1.nextDouble();
        System.out.println("Druga liczba");
        z2=scanner1.nextDouble();
        System.out.println("Trzecia liczba");
        z3=scanner1.nextDouble();
        if (z1>z2) {
            if (z3>z1) {
                System.out.println(z3 + "jest najwieksze");
            }else{
                System.out.println(z1 + " jest najwieksze");
            }
        } else if (z2>z3) {
            if (z2 > z1){
                System.out.println(z2 + " jest najwieksze");
            }else{
                System.out.println(z1 + " jest najwieksze");
            }
        } else if (z3>z1) {
            if (z2>z3){
                System.out.println(z1 + " jest najwieksze");
            }else{
                System.out.println(z3 + " jest najwieksze");
            }
        }



//        ZADANIE 3

        double waga, wzrost, bmi;
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Podaj wage:");
        waga= scanner3.nextDouble();
        System.out.println("Podaj wzrost:");
        wzrost= scanner3.nextDouble();
        wzrost = wzrost/100;
        bmi = waga / (wzrost * wzrost);
        if (bmi < 18.5){
            System.out.println("Niedowaga");
        } else if (bmi > 24.9) {
            System.out.println("Nadwaga");
        } else{
            System.out.println("Waga prawidlowa");
        }
    }
}