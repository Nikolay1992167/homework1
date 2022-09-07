package firstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int length = getNumber();
        int width = getNumber();
        int radius = getNumber();
        System.out.println(result(length, width, radius));
    }
    private static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()){
            return sc.nextInt();
        }
        else{
            System.out.println("Mistake. Repeat the input!");
            return getNumber();
        }
    }
    private static String result(int length, int width, int radius){
        double diagonalRectangle = Math.hypot(length, width);
        double diameterCircl = 2*radius;
        return diagonalRectangle < diameterCircl ? "Еhe circle closes the rectangle":"The circle does not cover the rectangle!";
    }
}

