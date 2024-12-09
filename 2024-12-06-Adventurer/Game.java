import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    Adventurer a = new Warrior (userName,20);
    Adventurer b = new CodeWarrior ("Goose",20);
    System.out.println(userName + ", " + a.getHP() + "/20 HP, " +
    a.getSpecial() + "/100 Strength");
    System.out.println("Goose, " + b.getHP() + "/20 HP, " +
    b.getSpecial() + "/12 Caffeine");
  }
}
