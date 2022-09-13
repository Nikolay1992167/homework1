package homework3;

public class Main {
    public static void main(String[] args) {
        mainArray(-100000, 100000);
        divisionIntoPositiveAndNegativeNumbers(mainArray(-100000, 100000));
        arrayPrimeNumbers(mainArray(-100000, 100000));
    }

    private static int[] mainArray(int beginningOfTheInterval, int endOfTheInterval) {
        int arraySize = 0;
        for (int i = beginningOfTheInterval; i <= endOfTheInterval; i++) {
            arraySize = arraySize + 1;
        }
        int[] result = new int[arraySize];
        for (int i = 0; i < result.length; i++) {
            result[i] = i - 100000;
        }
        return result;
    }

    private static void divisionIntoPositiveAndNegativeNumbers(int[] result) {
        int dimensionArrayPositiveNumbers = 0;
        int dimensionArrayNegativeNumbers = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                dimensionArrayNegativeNumbers = dimensionArrayNegativeNumbers + 1;
            } else {
                dimensionArrayPositiveNumbers = dimensionArrayPositiveNumbers + 1;
            }
        }
        int[] ArrayPositiveNumbers = new int[dimensionArrayPositiveNumbers];
        int[] ArrayNegativeNumbers = new int[dimensionArrayNegativeNumbers];
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                ArrayNegativeNumbers[negative] = result[i];
                negative = negative + 1;
            } else {
                ArrayPositiveNumbers[positive] = result[i];
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

    private static int[] arrayPrimeNumbers(int[] result) {
        int dimensionArrayPrimeNumbers = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 2) {
                int temporary = 0;
                boolean prime = true;
                for (int j = 2; j <= result[i] / 2; j++) {
                    temporary = result[i] % j;
                    if (temporary == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    dimensionArrayPrimeNumbers = dimensionArrayPrimeNumbers + 1;
                }
            }
        }
        int[] arrayPrimeNumbers = new int[dimensionArrayPrimeNumbers];
        int k = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] >= 2) {
                int temporary = 0;
                boolean prime = true;
                for (int j = 2; j <= result[i] / 2; j++) {
                    temporary = result[i] % j;
                    if (temporary == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    arrayPrimeNumbers[k] = result[i];
                    k = k + 1;
                }
            }
        }
        /*for (int element : arrayPrimeNumbers) {
            System.out.print(element + " ");}*/
        return arrayPrimeNumbers;
    }
}

