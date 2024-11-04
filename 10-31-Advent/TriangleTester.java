import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester {
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
  public static int countTrianglesA(String filename) {
    Scanner input = new Scanner (filename);
    int count = 0;
    String line = input.nextLine();
    String[]nums = line.split(" ");
    while (input.hasNextLine()) {
      for (int y = 0; y < nums.length; y++) {
      if (validTri(Integer.parseInt(nums[y]), Integer.parseInt(nums[y] + 1), Integer.parseInt(nums[y]+2))) {
        count++;
      }
    }
  }
  return count;
}
  public static boolean validTri (int a, int b, int c) {
    return a + b > c && b + c > a && c + a > b;
  }
}
