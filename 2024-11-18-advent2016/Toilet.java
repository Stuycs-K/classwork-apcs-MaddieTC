import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Toilet {
  public static void main(String[] args) {
    System.out.println(code("input2.txt"));
  }
  public static String code (String filename) {
	  int digit = 5;
	  String pad = "";
	  try {
      File file = new File(filename);
	  Scanner input = new Scanner (file);
	  while (input.hasNextLine()) {
		  String line = input.nextLine().trim();
		  if (!line.isEmpty()) {
			  String[]nums = line.split("");
        for (int s = 0; s < nums.length; s++) {
          if (nums[s].equals("U")) {
			  if (digit - 3 < 1) {
				  digit = digit;
				  pad = pad + digit;
			  }
			  else {
				digit = digit - 3;
				pad = pad + digit;
			  }
  				  }
		  if (nums[s].equals("D")) {
			  if (digit + 3 > 9) {
				  digit = digit; 
				  pad = pad + digit;
			  }
			  else {
				  digit = digit + 3;
				  pad = pad + digit;
			  }
		  }			  
  			  }
      }

      }
	        input.close();

		  }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }

    return pad;
  }
}