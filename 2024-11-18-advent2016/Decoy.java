import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Decoy {
  public static void main(String[] args) {
    System.out.println(find("input3.txt"));
  }
  public static String find (String filename) {
    int rooms = 0;
	  String checksum = "";
	  try {
      File file = new File(filename);
	  Scanner input = new Scanner (file);
	  while (input.hasNextLine()) {
		  String line = input.nextLine().trim();
		  if (!line.isEmpty()) {
			  String[]nums = line.split("");
        for (int s = 0; s < nums.length; s++) {

		  }
  			  }
			  pad = pad + digit;
      }

      }
	        input.close();

		  }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }

    return rooms;
  }
}
