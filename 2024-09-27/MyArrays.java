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
        int[] test;
		test = new int[]{1, 2, 3};
        System.out.println(arrayToString(test));
		test = new int[]{9, 2, 6, 8, 7};
        System.out.println(arrayToString(test));
		test = new int[]{};
        System.out.println(arrayToString(test));
		test = new int[]{10};
        System.out.println(arrayToString(test));
		test = new int[]{0, 2, 3, 20000};
        System.out.println(arrayToString(test));
		
		//returnCopy
		int[] test2;
		test2 = new int[]{1, 2, 3};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? (expected false): " + (test2 == returnCopy(test2)));
		test2 = new int[]{9, 2, 6, 8, 7};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? (expected false): " + (test2 == returnCopy(test2)));
		test2 = new int[]{};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? (expected false): " + (test2 == returnCopy(test2)));
		test2 = new int[]{10};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? (expected false): " + (test2 == returnCopy(test2)));
		test2 = new int[]{0, 2, 3, 20000};
		System.out.println("Old: " + arrayToString(test2) 
							+ " New: " + arrayToString(returnCopy(test2)));
		System.out.println("Do the addresses match? (expected false): " + (test2 == returnCopy(test2)));
		
		//concatArray
		int[] test3; 
		int[] test4; 
		test3 = new int[]{1, 2, 3};
		test4 = new int[]{4, 5, 6};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{4, 5, 6};
		test4 = new int[]{1, 2, 3};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{1, 2, 3, 4, 5, 6};
		test4 = new int[]{7, 8, 9};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{1, 2, 3};
		test4 = new int[]{4, 5, 6, 7, 8, 9, 10};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{1, 2, 3};
		test4 = new int[]{};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{};
		test4 = new int[]{4, 5, 6};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
		test3 = new int[]{};
		test4 = new int[]{};
		System.out.println("Add " + arrayToString(test3) + " to " + arrayToString(test4));
		System.out.println("Result: " + arrayToString(concatArray(test3, test4)));
      }
}
