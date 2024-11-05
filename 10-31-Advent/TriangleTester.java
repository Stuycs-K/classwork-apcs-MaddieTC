import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester {
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
  public static int countTrianglesA(String filename) {
    int count = 0;
	try {
    File file = new File(filename);
    Scanner input = new Scanner (file);
    while (input.hasNextLine()) {
      String line = input.nextLine();
      String[]nums = line.split(" ");
      if (validTri(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]), Integer.parseInt(nums[2]))) {
        count++;
    }
}
  input.close();
  }
  catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1; 
    }
	  return count;
}

  public static boolean validTri (int a, int b, int c) {
    return a + b > c && b + c > a && c + a > b;
  }
}
