public class Taxicab {
  public static void main(String[] args) {
	  
  }
  public static int map {
	  int xcoor = 0;
	  int ycoor = 0;
	  int dir = 0;
	  File file = new File(filename);
	  Scanner input = new Scanner (file);
	  while (input.hasNext()) {
		  String line = input.nextLine().trim();
		  if (!line.isEmpty()) {
			  String[]nums = line.split("\\s+");
			  if (nums[0].indexOf("R") > -1) {
				  dir++;
				  if (dir == 4) {
					  dir = 0;
				  }
				  xcoor = xcoor + Integer.parseInt(nums[0].charAt(1));
			  }
			  if (nums[0].indexOf("L") > -1) {
				  dir--;
				  if (dir == 4) {
					  dir = 0;
				  } 
				  xcoor = xcoor - Integer.parseInt(nums[0].charAt(1));
			  }
		  }
	  }
  }
}
