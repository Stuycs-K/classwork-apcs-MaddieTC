import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Decoy {
  public static void main(String[] args) {
    System.out.println(find("input3.txt"));
  }
  public static String find (String filename) {
    int sum = 0;
	  try {
      File file = new File(filename);
	  Scanner input = new Scanner (file);
	  while (input.hasNextLine()) {
		  String line = input.nextLine().trim();
		  String[] alph = new String["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"];
		  String[] inst = new String[5];
		  String id = "";
		  if (!line.isEmpty()) {
			  String[]nums = line.split("-");
			  String 
        for (int s = 0; s < alph.length; s++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j].equals(alph[s])) {
					count++;
				}
			}
			for (int x = 0; x < inst.length; x++) {
				if (count > Integer.parseInt(inst[x].substring(1))) {
					inst[x] = alph[s] + count;
				}
			} 
		  }
		  for (int m > 0; m < inst.length; m++) {
			  for (int z = 0; z < ) {
			  if (inst[m].substring(0,1).equals) {
				  return true;
			  }
			  }
		  }
  			  }
			  return sum;
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
