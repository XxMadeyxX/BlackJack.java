import java.util.Scanner;
import java.util.Random;

//public class drawCard {

    //public static void printDrawCard() {

    //}
public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        Random random = new Random();

        int gameNumber = 0;
        int dealerHand = 0;
        int card = 0;
        int totalHand = 0;
        int totalValue2 = 0;

        gameNumber = (gameNumber + 1);
        System.out.println("START GAME # " + gameNumber);
        System.out.println("");

        // this is the section that gives the dealerHand

        dealerHand = random.nextInt(21);
        //System.out.println(dealerHand);

        boolean playerTurn = false;
        while (!playerTurn) {

            int playerHand = 0;
            playerHand = random.nextInt((13) + 1); // still getting 0 as a result or card value

            if (playerHand < 11) {
                totalHand = totalHand + playerHand;
                if (playerHand == 1) {
                    System.out.println("Your card is an ACE!");
                } else {
                    System.out.println("Your card is a " + playerHand);
                }
            } else {
                totalHand = totalHand + 10;
                if (playerHand == 11) {
                    System.out.println("Your card is a JACK!");
                }
                if (playerHand == 12) {
                    System.out.println("Your card is a QUEEN!");
                }
                if (playerHand == 13) {
                    System.out.println("Your card is a KING!");
                }
            }
            //totalPlayerValue = totalPlayerValue + playerHand;
            System.out.println("Your hand is: " + totalHand);
            System.out.println();
            if (totalHand > 21) {
                System.out.println("You exceeded 21! You lose :(");
                System.out.println("");
                gameNumber = gameNumber + 1;
                //return;
            }


            //while (!playerTurn) {
    /* while (!playerTurn) { */

            System.out.println("1. Get another card.");
            System.out.println("2. Hold hand.");
            System.out.println("3. Print statistics.");
            System.out.println("4. Exit.");

            System.out.println("");
            System.out.println("Choose an option: ");


            int userInput = scnr.nextInt();

            switch (userInput) {
                case 1:

                    playerHand = random.nextInt((13) + 1); // still getting 0 as a result or card value

                    if (playerHand < 11) {

                        if (playerHand == 1) {
                            //totalValue2 = totalValue2 + playerHand;
                            System.out.println("Your card is an ACE!");
                        } else {
                            System.out.println("Your card is a " + playerHand);
                        }
                    } else {
                        totalHand = totalHand + 10;
                        if (playerHand == 11) {
                            System.out.println("Your card is a JACK!");
                        }
                        if (playerHand == 12) {
                            System.out.println("Your card is a QUEEN!");
                        }
                        if (playerHand == 13) {
                            System.out.println("Your card is a KING!");
                        }
                    }
                    System.out.println("Your hand is: " + (totalHand + playerHand));
                    System.out.println();
                    if (totalHand > 21) {
                        System.out.println("You exceeded 21! You lose :(");
                        System.out.println("");
                        gameNumber = gameNumber + 1;
                    }
                    return;
                case 2:
                    System.out.println("NO 2");
                    System.out.println("");
                    return;
                case 3:
                    System.out.println("No 3");
                    System.out.println("");
                    return;
                case 4:
                    System.out.println("NO 4");
                    System.out.println("");
                    return;
                default:
                    System.out.println("'" + userInput + "'" + " is not a valid option");
                    System.out.println("");
                    return;
            }

        }
            //public class userInputOptions {
            //if (userInput == 1) {
            //    System.out.println("No 1");
            //    System.out.println("");
            //} else if (userInput == 2) {
            //    System.out.println("NO 2");
            //    System.out.println("");
            //} else if (userInput == 3) {
            //    System.out.println("No 3");
            //    System.out.println("");
            //} else if (userInput == 4) {
            //    System.out.println("NO 4");
            //    System.out.println("");
                //return void Main;
            //} else {
            //    System.out.println("'" + userInput + "'" + " is not a valid option");
            //    System.out.println("");
            //    return;
            }
        }

//}

        //    return Main;





//System.out.println()





    //switch (card) {
    //case 1:
    //playerHand == (playerHand + 1);
    //System.out.println("Your card is an ACE!");
    //case 11:
    //playerHand == (playerHand +10);
    //System.out.println("Your card is a JACK!");
    //case 12:
    //playerHand == (playerHand +10);
    //System.out.println("Your card is a QUEEN!");
    //case 13:
    //playerHand == (playerHand + 10);
    //System.out.println("Your card is a KING!");
    //}

    //int menu = mainMenu.length();

    //System.out.println(menu);

    //System.out.println("BLACKJACK! You Win!");
    //System.out.println("It's a tie! No one wins!");
    //System.out.println("You win!");
    //System.out.println("Dealer wins!");
    //System.out.println(scnr.nextInt + " is not a valid option.");










