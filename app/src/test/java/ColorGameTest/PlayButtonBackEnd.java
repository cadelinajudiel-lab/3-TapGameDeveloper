package ColorGameTest;

import java.util.Scanner;

public class PlayButtonBackEnd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Play");//Option 1
        System.out.println("Option");//Option 2
        System.out.println("Settings");//Option 3
        System.out.println("Exit");//Option 4

        int Scanner = scanner.nextInt();

        if (Scanner == 1){
            System.out.println("Good luck!"); //Game starts
        } else if (Scanner == 2){
            System.out.println("Easy, Medium, Hard"); // Difficulties of the game
        } else if (Scanner == 3){
            System.out.println("Volume Increase or Decrease");
        } else {
            System.out.println("Thanks For Playing");
        }



    }
}