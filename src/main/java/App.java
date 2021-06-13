import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */
public class App {
    public static void main(String[] args){

        // state scanner&arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);

        //concat; loop from input via user
        for (int i = 0; i<5; i++){
            System.out.print("Enter Number: ");
            numbers.add(inputScanner.nextInt());
        }
        double total = numbers.stream().mapToDouble(a -> a).sum();
        System.out.println("The total is" +total);

        // must close 
        inputScanner.close();
    }
}
