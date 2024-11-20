import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Taxicab {
  public static void main(String[] args) {
    System.out.println(map("input.txt"));
  }
  public static int map (String filename) {
	  int xcoor = 0;
	  int ycoor = 0;
	  int dir = 0;
	  try {
      File file = new File(filename);
	  Scanner input = new Scanner (file);
	  while (input.hasNext()) {
		  String line = input.nextLine().trim();
		  if (!line.isEmpty()) {
			  String[]nums = line.split(", ");
        for (int s = 0; s < nums.length; s++) {
          if (nums[s].indexOf("R") > -1) {
  				  dir++;
  				  if (dir == 4) {
  					  dir = 0;
  				  }
  			  }
  			  if (nums[s].indexOf("L") > -1) {
  				  dir--;
  				  if (dir == -1) {
  					  dir = 3;
  				  }
  			  }
        if (dir == 0) {
          ycoor = ycoor + Integer.parseInt(nums[s].substring(1));
        }
        if (dir == 1) {
          xcoor = xcoor + Integer.parseInt(nums[s].substring(1));
        }
        if (dir == 2) {
          ycoor = ycoor - Integer.parseInt(nums[s].substring(1));
        }
        if (dir == 3) {
          xcoor = xcoor - Integer.parseInt(nums[s].substring(1));
        }
      }

      }
		  }
      input.close();
	  }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }

    return Math.abs(xcoor) + Math.abs(ycoor);
  }
}
