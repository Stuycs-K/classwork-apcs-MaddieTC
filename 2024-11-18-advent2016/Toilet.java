import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Toilet {
  public static void main(String[] args) {
    System.out.println(code("input2.txt"));
  }
  public static String code (String filename) {
	  int[][] digit = {{0,0,1,0,0},
	  {0,2,3,4,0},{5,6,7,8,9},{0,'A','B','C',0},{0,0,'D',0,0}};
	  int row = 2;
	  int column = 0;
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
			  if (row > 0 && digit[row-1][column] != 0) {
				  row--;
			  }
  				  }
		  if (nums[s].equals("D")) {
			  if (row < 4 && digit[row+1][column] != 0) {
				  row++; 
			  }
		  }
		  if (nums[s].equals("R")) {
			  if (column < 4 && digit[row][column + 1] != 0) {
				  column++;
			  }
		  }
		  if (nums[s].equals("L")) {
			  if (column > 0 && digit[row][column - 1] != 0) {
				  column--;
			  }
		  }
  			  }
			  if (digit[row][column] == 'A') {
				  pad = pad + "A";
			  }
			  if (digit[row][column] == 'B') {
				  pad = pad + "B";
			  }
			  if (digit[row][column] == 'C') {
				  pad = pad + "C";
			  }
			  if (digit[row][column] == 'D') {
				  pad = pad + "D";
			  }
			  else if (digit[row][column] != 'A' 
			  && digit[row][column] != 'B' 
			  && digit[row][column] != 'C'
			  && digit[row][column] != 'D') {
			  pad = pad + digit[row][column];
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