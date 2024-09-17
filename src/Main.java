//Challenge 1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the cities temperature gauge calculator in weeks");
        Scanner scan = new Scanner(System.in);
        System.out.println("How much cities you want to measure temperature to calculate?");
        int quantCity = scan.nextInt();

        int matrixCityTemp [][] = new int[quantCity][7];
        int matrixAverageCity [] = new int[quantCity];

        byte i = 0;
        byte j = 0;

        int som = 0;
        int somAll = 0;
        int biggerValue = 0;
        byte indiceBig = 0;

        for (i = 0; i < quantCity; i++) {
            for (j = 0; j < 7; j++) {
                System.out.println("Type the temperature of the city " + (i + 1) + " in the day " + (j + 1) + " of the week");
                matrixCityTemp[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < quantCity; i ++){
            for (j = 0; j < 7; j++) {
                som += matrixCityTemp[i][j];
            }
            matrixAverageCity[i] = som / 7;
            if (matrixAverageCity[i] > biggerValue){
                biggerValue = matrixAverageCity[i];
                indiceBig = i;
            }
            somAll += som;
            som = 0;
        }

        System.out.println("The average temperature of each city:");
        for (i = 0; i < quantCity; i ++){
            System.out.print("City "+ (i+1) + ": " + matrixAverageCity[i]);
            System.out.println();
        }

        System.out.println("The hottest temperature of all cities is " + biggerValue + " from city " + (indiceBig+1));
    }
}
