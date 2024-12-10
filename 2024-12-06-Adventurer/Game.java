import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
while (true) {
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
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	System.out.println();

    while (a.getHP() > 0 && b.getHP() > 0) {
		String input = userInput.nextLine();
    if (input.equals("a") || input.equals("attack")) {
      System.out.println(a.attack(b));
	  if (b.getHP() > 0) {
	  System.out.println();
	  System.out.println(Game.back(b,a));
	  System.out.println();
	  }
      System.out.println(userName + ", " + a.getHP() + "/20 HP, " +
      a.getSpecial() + "/100 Strength");
      System.out.println("Goose, " + b.getHP() + "/20 HP, " +
      b.getSpecial() + "/12 Caffeine");
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	  System.out.println();
    }
	else if (input.equals("sp") || input.equals("special")) {
      System.out.println(a.specialAttack(b));
	  if (b.getHP() > 0) {
	  System.out.println();
	  System.out.println(Game.back(b,a));
	  System.out.println();
	  }
      System.out.println(userName + ", " + a.getHP() + "/20 HP, " +
      a.getSpecial() + "/100 Strength");
      System.out.println("Goose, " + b.getHP() + "/20 HP, " +
      b.getSpecial() + "/12 Caffeine");
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	  System.out.println();
    }
	else if (input.equals("su") || input.equals("special")) {
      System.out.println(a.support());
	  if (b.getHP() > 0) {
	  System.out.println();
	  System.out.println(Game.back(b,a));
	  System.out.println();
	  }
      System.out.println(userName + ", " + a.getHP() + "/20 HP, " +
      a.getSpecial() + "/100 Strength");
      System.out.println("Goose, " + b.getHP() + "/20 HP, " +
      b.getSpecial() + "/12 Caffeine");
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
	  System.out.println();
    }
	else if (input.equals("quit")) {
		return;
	}
	else{
		System.out.println("You don't get that option. Try again?");
		System.out.println();
	}
}
	if (a.getHP() <= 0) {
	System.out.println("Game over! You lost :(");
	System.out.println();
	}
	else if (b.getHP() <= 0) {
		System.out.println("Game over! Goose lost :)");
		System.out.println();
	}
}
  }
  private static String back(Adventurer one, Adventurer other) {
	  int ran = (int) (Math.random() * 3) + 1;
	  if (ran == 1) {
		  return one.attack(other);
	  }
	  else if (ran == 2) {
		  return one.specialAttack(other);
	  }
	  else if (ran == 3) {
		  return one.support();
	  }
	  return "Something went wrong :(";
  }
}
