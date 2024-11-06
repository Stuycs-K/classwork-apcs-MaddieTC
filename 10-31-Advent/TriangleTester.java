import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TriangleTester {
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
  public static int countTrianglesA(String filename) {
    int count = 0;
	try {
    File file = new File(filename);
    Scanner input = new Scanner (file);
    while (input.hasNextLine()) {
      String line = input.nextLine();
      String[]nums = line.split("\\s+");
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
  
  public static int countTrianglesB(String filename) {
	  int count = 0;
	  int size = 0;
	  try {
		  File file = new File(filename);
		  Scanner input = new Scanner (file);
		  while (input.hasNextLine()) {
			  input.nextLine();
			  size++;
		  }
		  input.close();
	  int[] uno = new int[size];
	  int[] dos = new int[size];
	  int[] tres = new int[size];
	  int i = 0;
	  input = new Scanner (file);
		  while (input.hasNextLine()) {
			  String line = input.nextLine();
			  String[]nums = line.split("\\s+");
		  if (nums.length == 3) {
			  uno[i] = Integer.parseInt(nums[0]);
			  dos[i] = (Integer.parseInt(nums[1]));
			  tres[i] = (Integer.parseInt(nums[2]));
			  i++;
			  }
		else {
			  System.out.println("Line contains more than 3 numbers.");
		  }
		  }
		 for (int z = 0; z < i - 2; z+=3) {
			if (validTri(uno[z], uno[z + 1], uno[z + 2])) {
				count++;
		 }
		 	if (validTri(dos[z], dos[z + 1], dos[z + 2])) {
				count++;
		 }
			if (validTri(tres[z], tres[z + 1], tres[z + 2])) {
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
}
