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
	  String[] movess = new String[10000000];
	  int stat = 0;
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
			  int moves = Integer.parseInt(nums[s].substring(1));
			  for (int j = 0; j < moves; j++) {
        if (dir == 0) {
          ycoor++;
        }
        if (dir == 1) {
          xcoor++;
        }
        if (dir == 2) {
          ycoor--;
        }
        if (dir == 3) {
          xcoor--;
        }
		String rn = xcoor + " " + ycoor;
		for (int g = 0; g < stat; g++) {
		if (movess[g].equals(rn)) {
			return Math.abs(xcoor) + Math.abs(ycoor);
		}
		}
		movess[stat] = rn;
		stat++;
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
