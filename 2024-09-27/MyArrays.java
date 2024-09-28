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
	  
	  public static int[] concatArray(int[]ary1,int[]ary2) {
		  int[] tgt = new int[ary1.length + ary2.length];
		  int i = 0;
		  for (int y = 0; y < ary1.length; y++) {
			  tgt[y] = ary1[y];
		  }
		  for (int z = ary1.length; z < ary2.length + ary1.length; z++) {
			  tgt[z] = ary2[i];
			  i++;
		  }
		  return tgt;
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
		
		//concatArray
		int[] test3 = {1, 2, 3};
		int[] test4 = {4, 5, 6};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
      }
}
