//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


//    ZADANIE 1


    Random generator = new Random();
    int[] randNumbers = new int[10];

    for (int i = 0; i < 10; i++) {
        randNumbers[i] = generator.nextInt(21)-10;
    }

    int min = randNumbers[0];
    int max = randNumbers[0];
    int sum = 0;

    for (int i = 0; i < 10; i++) {
        if (max < randNumbers[i]) max = randNumbers[i];
        if (min > randNumbers[i]) min = randNumbers[i];
        sum += randNumbers[i];
    }

    double randAvg = (double)sum / 10;

    int smaller = 0, bigger = 0;
    for (int i = 0; i < 10; i++) {
        if (randNumbers[i] < randAvg) smaller++;
        if (randNumbers[i] > randAvg) bigger++;
        sum += randNumbers[i];
    }

    System.out.println("Wylosowane liczby:" + Arrays.toString(randNumbers));
    System.out.printf("Min: %d, max: %d\n", min, max);
    System.out.println("Średnia: " + randAvg);
    System.out.println("Mniejszych od średniej: " + smaller);
    System.out.println("Większych od średniej: " + bigger);

    for (int i = 0; i < randNumbers.length / 2; i++) {
        int t = randNumbers[i];
        randNumbers[i] = randNumbers[randNumbers.length - 1 - i];
        randNumbers[randNumbers.length - 1 - i] = t;
    }

    System.out.println("Liczby w odwrotnej kolejności:\n" + Arrays.toString(randNumbers));


//    ZADANIE 2


    Random generator = new Random();
    int[] tablica = new int[20];
    int[] wystapienia = new int[10];

    System.out.print("Wylosowane liczby: ");
    for (int i = 0; i < tablica.length; i++) {
        tablica[i] = generator.nextInt(10) + 1; // 1..10
        System.out.print(tablica[i] + " ");
        wystapienia[tablica[i]-1]++;
    }
    System.out.println();

    System.out.println("Wystąpienia:");
    for (int i = 0; i < 10; i++) {
        System.out.println(i+1 + " - " + wystapienia[i]);
    }



//    ZADANIE 3

    Random generator = new Random();
    int[][] dataCube = new int[5][5];
    int[] minArray = new int[5];
    int[] maxArray = new int[5];

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            dataCube[i][j] = generator.nextInt(11) - 5;
        }
    }

    for (int i = 0; i < 5; i++) {
        int min = dataCube[0][i];
        int max = dataCube[0][i];
        for (int j = 0; j < 5; j++) {
            if (dataCube[j][i] < min) min = dataCube[j][i];
            if (dataCube[j][i] > max) max = dataCube[j][i];
        }
        minArray[i] = min;
        maxArray[i] = max;
    }

    System.out.println("Macierz 5x5: ");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.printf("%3d ", dataCube[i][j]);
        }
        System.out.println();
    }

    System.out.println("Minima kolumn kolejno: " + Arrays.toString(minArray));
    System.out.println("Maksima kolumn kolejno: " + Arrays.toString(maxArray));



//    ZADANIE 4

    Scanner scan = new Scanner(System.in);
    int userNumber;
    int[] bits = new int[32];

    System.out.print("Podaj liczbę całkowitą: ");
    userNumber = scan.nextInt();

    int signBit = (userNumber < 0) ? 1 : 0;
    int absValue = Math.abs(userNumber);

    int index = 0;
    while (index < 32 && absValue > 0) {
        bits[index] = absValue % 2;
        absValue /= 2;
        index++;
    }

    System.out.printf("Liczba %d binarnie: %d.", userNumber, signBit);
    for (int i = index-1; i >= 0; i--) {
        System.out.print(bits[i]);
    }



//    ZADANIE 5


}


