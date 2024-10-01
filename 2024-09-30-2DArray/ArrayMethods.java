//Maddie Chin (mchin60@stuy.edu) and Vincent Chen (vchen60@stuy.edu)

public class ArrayMethods {
  //1. Write both your names + emails at the top of the document as a comment.

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] arr) {
    String result = "[";
    for(int i = 0; i < arr.length; i++) {
      result += arr[i];
      if(i != arr.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++) {
      result += '[';
      int rrr = ary[i].length;
      for(int j = 0; j < rrr; j++) {
        result += ary[i][j];
        if(j != rrr-1) {
          result += ", ";
        }
      }
	  if (i != ary.length-1){
		  result += "], ";
	  }
    }
    return (result + ']');
  }

  /*Return the sum of all of the values in the 2D array */
  //use a nested loop to solve this
  public static int arr2DSum(int[][]nums){
    int result = 0;
	for (int y = 0; y < nums.length; y++) {
		for (int x = 0; x < nums[y].length; x++) {
			result = result + nums[y][x];
		}
	}
    return result; 
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
 // public static int[][] swapRC(int[][]nums){
   // int r = nums[0].length;
//	return 0;
  //}
  
  public static void main(String[] args) {
	  int[] arr1;
	  arr1 = new int[] {2, 3, 4, 9};
	  System.out.println(arrToString(arr1));
	  
	  int[][] arr2;
	  arr2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
	  System.out.println(arrToString(arr2));
	  
	  int[][] arr3;
	  arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 21));
	  
//	  int[][] arr4;
//	  arr4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
//	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
  }
}