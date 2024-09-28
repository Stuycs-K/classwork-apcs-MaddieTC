public class MyArrays {
      public static String arrayToString(int[] nums) {
          String end = "[";
          for (int y = 0; y < nums.length; y++) {
              end = end + nums[y];
              if (y != nums.length - 1) {
                  end = end + ", ";
              }
          }
          return end + "]";
      }
	  
	  public static int[] returnCopy(int[]ary) {
		  int[] copy = new int[ary.length];
		  for (int y = 0; y < ary.length; y++) {
			  copy[y] = ary[y];
		  }
		  return copy;
	  }
	  
      public static void main(String[] args) {
		//arrayToString
        int[] test = {1, 2, 3};
        System.out.println(arrayToString(test));
		
		//returnCopy
		int[] test2 = {1, 2, 3};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? " + (test2 == returnCopy(test2)));
      }
}
