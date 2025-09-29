import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

//        ZADANIE 1
        double stopnieC, stopnieF;
        System.out.println("Podaj stopnie Celsjusza: ");
        stopnieC = scanner.nextDouble();
        stopnieF = 1.8 * stopnieC + 32;
        System.out.println("Stopnie F: " + stopnieF);

//        ZADANIE 2
        double z1, z2, z3;
        System.out.println("Pierwsza liczba: ");
        z1 = scanner.nextDouble();
        System.out.println("Druga liczba: ");
        z2 = scanner.nextDouble();
        System.out.println("Trzecia liczba: ");
        z3 = scanner.nextDouble();

        double max = z1;
        if (z2 > max) max = z2;
        if (z3 > max) max = z3;
        System.out.println(max + " jest największe");

//        ZADANIE 3
        double waga, wzrost, bmi;
        System.out.println("Podaj wagę (kg): ");
        waga = scanner.nextDouble();
        System.out.println("Podaj wzrost (cm): ");
        wzrost = scanner.nextDouble();
        wzrost = wzrost / 100;
        bmi = waga / (wzrost * wzrost);

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi > 24.9) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Waga prawidłowa");
        }

//        ZADANIE 4
        System.out.print("Podaj swój dochód: ");
        double income = scanner.nextDouble();
        double tax;
        if (income < 85528) {
            tax = income * 0.18 - 556.02;
        } else {
            tax = (income - 85528) * 0.32 + 14839.02;
        }
        if (tax < 0) tax = 0;
        System.out.println("Podatek wynosi: " + tax);

//        ZADANIE 5
        double price;
        int instalment;
        double monthlyFee;

        do {
            System.out.print("Jaka jest cena towaru? ");
            price = scanner.nextDouble();
            if (price < 100 || price > 10000) System.out.println("Błąd! Cena nie mieści się w zakresie.");
        } while (price < 100 || price > 10000);

        do {
            System.out.print("Ile rat? (zakres 6-48) ");
            instalment = scanner.nextInt();
            if (instalment < 6 || instalment > 48) System.out.println("Błąd! Liczba rat nie mieści się w zakresie.");
        } while (instalment < 6 || instalment > 48);

        if (instalment <= 12) monthlyFee = (price + price * 0.025) / instalment;
        else if (instalment <= 24) monthlyFee = (price + price * 0.05) / instalment;
        else monthlyFee = (price + price * 0.1) / instalment;

        System.out.printf("Miesięczna rata wynosi: %.2f zł%n", monthlyFee);

//        ZADANIE 6
        System.out.println("\nWitaj w prostym kalkulatorze!");

        System.out.print("Podaj pierwszą liczbę: ");
        double num1 = scanner.nextDouble();

        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Podaj drugą liczbę: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Błąd: Nie można dzielić przez 0!");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Błąd: Nieznany operator.");
                valid = false;
        }

        if (valid) {
            System.out.print("Wynik działania: ");
            printNumber(num1);
            System.out.printf(" %c ", operator);
            printNumber(num2);
            System.out.print(" = ");
            printNumber(result);
            System.out.println();
        }

        scanner.close();
    }

    private static void printNumber(double number) {
        if (number == (long) number) {
            System.out.print((long) number);
        } else {
            System.out.print(number);
        }
    }
}
