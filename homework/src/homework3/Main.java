package homework3;

public class Main {
    public static void main(String[] args) {
        divisionIntoPositiveAndNegativeNumbers(mainArray());
        arrayPrimeNumbers(mainArray());
    }

    private static int[] mainArray() {
        int beginningOfTheInterval = -100000;
        int endOfTheInterval = 100000;
        int arraySize = Math.abs(beginningOfTheInterval) + endOfTheInterval + 1;
        int[] result = new int[arraySize];
        for (int i = 0; i < result.length; i++) {
            result[i] = i - 100000;
        }
        return result;
    }

    private static void divisionIntoPositiveAndNegativeNumbers(int[] result) {
        int dimensionArrayPositiveNumbers = 0;
        int dimensionArrayNegativeNumbers = 0;
        for (int i : result) {
            if (i < 0) {
                dimensionArrayNegativeNumbers = dimensionArrayNegativeNumbers + 1;
            } else {
                dimensionArrayPositiveNumbers = dimensionArrayPositiveNumbers + 1;
            }
        }
        int[] ArrayPositiveNumbers = new int[dimensionArrayPositiveNumbers];
        int[] ArrayNegativeNumbers = new int[dimensionArrayNegativeNumbers];
        int positive = 0;
        int negative = 0;
        for (int i : result) {
            if (i < 0) {
                ArrayNegativeNumbers[negative] = i;
                negative = negative + 1;
            } else {
                ArrayPositiveNumbers[positive] = i;
                positive = positive + 1;
            }
        }
        /*for (int element : ArrayPositiveNumbers) {
            System.out.print(element + " ");
        }
        for (int element : ArrayNegativeNumbers) {
            System.out.print(element + " ");
        }*/
    }

    private static boolean findPrimeNumbers(int number) {
        boolean prime = false;
        if (number >= 2) {
            int temporary;
            prime = true;
            for (int j = 2; j <= number / 2; j++) {
                temporary = number % j;
                if (temporary == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    private static int[] arrayPrimeNumbers(int[] result) {
        int dimensionArrayPrimeNumbers = 0;
        for (int element : result) {
            if (findPrimeNumbers(element)) {
                dimensionArrayPrimeNumbers = dimensionArrayPrimeNumbers + 1;
            }
        }
        int[] arrayPrime = new int[dimensionArrayPrimeNumbers];
        int timeDimension = 0;
        for (int element : result) {
            if (findPrimeNumbers(element)) {
                arrayPrime[timeDimension] = element;
                timeDimension = timeDimension + 1;
            }
        }
        /*for (int i : arrayPrime) {
            System.out.print(i + "  ");
        }*/
        return arrayPrime;
    }
}

