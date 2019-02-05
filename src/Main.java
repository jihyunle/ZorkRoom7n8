import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    // private static int roomCount = 0;

    private static ArrayList<Boolean> roomsVisited = new ArrayList<>();
    // Initialized at false


    public static void main(String[]args){
        // welcomeMessage method
        // promptUser method
        // Ask the user what direction they want to go
        System.out.println("Which direction would you like to go? Press N/S/W/E or Q to quit.");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        while(!input.equalsIgnoreCase("q")){
            // call room 7
            room7();
        }

        // moveUser method -- we may not need this
        // Move user to the desired room, tell them what room it is, and what's in the room, and what directions other exists are in
        // exitMessage method
        // 25% chance the user is followed by a ghost
        // if user followed, let them know
        // let user know how many rooms they've been in
    }

    public static void room7(){
        roomsVisited.add(true);
        System.out.println("You are in the parlor.");
        System.out.println("And there is a treasure chest in this room.");
        System.out.println("To leave the room, proceed West or South: (W/S)");
        Scanner keyboard = new Scanner(System.in);
        String proceed = keyboard.nextLine();

        if(proceed.equalsIgnoreCase("w")){
            // go to room 6
            room6();
        }

        if(proceed.equalsIgnoreCase("s")){
            // go to room 4
            room4();
        }
    }

    public static void room8(){
        roomsVisited.add(true);
        System.out.println("You are in the secret room.");
        System.out.println("Yay! You've struck the piles of hidden gold!");
        System.out.println("To leave the room, proceed West: (W)");
        Scanner keyboard = new Scanner(System.in);
        String proceed = keyboard.nextLine();

        if(proceed.equalsIgnoreCase("w")){
            // go to room 6
            room6();
        }
    }

    public static void exitMessage(){
        // System.out.println("There's a chance you're being followed by a ghost...");
        int randomNum = (int)Math.random()*4;
        if(randomNum==0){
            System.out.println("Run! There's a ghost chasing you!");
        }else{
            System.out.println("No ghost on your tail.");
        }
        showVisitedRooms();

    }

    public static void showVisitedRooms(){
        int count = 0;
        for(boolean b:roomsVisited){
            if(b==false) { // never visited
                count++;
            }
        }
        System.out.println("There are " + count + " rooms that you haven't been to yet.");
    }
}