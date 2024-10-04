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
/*  Original code:
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
    return (result + "]]"); */
	
	String result = "[";
	for (int y = 0; y < ary.length; y++) {
		result = result + arrToString(ary[y]);
		if (y != ary.length - 1) {
			result += ", ";
		}
	}
    return result + "]";
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
  public static int[][] swapRC(int[][]nums){
    int[][] result;
	int big = 0;
	for (int z = 0; z < nums.length; z++) {
		if (nums[z].length > big) {
			big = nums[z].length;
		}
	}
	result = new int[big][nums.length];
	for (int y = 0; y < nums.length; y++) {
		for (int x = 0; x < nums[y].length; x++) {
			result[x][y] = nums[y][x];
		}
	}
	return result;
  }
//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
	public static void replaceNegative(int[][] vals){ 
	for(int i = 0; i < vals.length; i++) {
    for(int j = 0; j < vals[i].length; j++) {
      if(vals[i][j] < 0) {
        if(i == j) {
          vals[i][j] = 1;
        }
        else {
          vals[i][j] = 0;
        }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
	public static int[] helper(int[] nums) {
		int[] result = new int[nums.length];
		for (int y = 0; y < nums.length; y++) {
			result[y] = nums[y];
			}
		  return result;
	}
	
	public static int[][] copy(int[][] nums){
		int[][] result = new int[nums.length][];
		for (int y = 0 ; y < nums.length; y++) {
			result[y] = helper(nums[y]);
		}
		return result;
	}
  
  public static void main(String[] args) {
	  int[] arr1;
	  arr1 = new int[] {2, 3, 4, 9};
	  System.out.println(arrToString(arr1));
	  arr1 = new int[] {};
	  System.out.println(arrToString(arr1));
	  
	  int[][] arr2;
	  arr2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{}, {5, 6, 7}, {2, 4, 9}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{2, 3, 4}, {}, {2, 4, 9}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{}, {}, {}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{}, {}, {2, 4, 9}};
	  System.out.println(arrToString(arr2));
	  arr2 = new int[][] {{2, 3, 4}, {5, 6, 7}, {}};
	  System.out.println(arrToString(arr2));
	  
	  int[][] arr3;
	  arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 21));
	  arr3 = new int[][] {{1, 2}, {4, 5, 6}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 18));
	  arr3 = new int[][] {{1, 2, 3}, {4, 5}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 15));
	  arr3 = new int[][] {{}, {4, 5, 6}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 15));
	  arr3 = new int[][] {{1, 2, 3}, {}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 6));
	  arr3 = new int[][] {{}, {}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 0));
	  arr3 = new int[][] {{1}, {4}};
	  System.out.println("Sum: " + arr2DSum(arr3) + " expected? " + (arr2DSum(arr3) == 5));

	  int[][] arr4;
	  arr4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{1, 2, 3}, {4, 5}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{1, 2}, {4, 5, 6}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{1, 2, 3}, {4, 5, 6, 7, 8}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{}, {4, 5, 6}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  arr4 = new int[][] {{1, 2, 3}, {}};
	  System.out.println("Initial: " + arrToString(arr4) + " Into: " + arrToString(swapRC(arr4)));
	  
	  int[][] arr5;
	  arr5 = new int[][] {{-3, -2, -1}, {3, 2, 1}};
	  System.out.println("Old: " + arrToString(arr5)); 
	  replaceNegative(arr5);
	  System.out.println("New: " + arrToString(arr5));
	  arr5 = new int[][] {{-3, -2, -1}, {3, -2, 1}};
	  System.out.println("Old: " + arrToString(arr5)); 
	  replaceNegative(arr5);
	  System.out.println("New: " + arrToString(arr5));
	  
	  int[][] arr6; 
	  arr6 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	  System.out.println("Original: " + arrToString(arr6) + " Copy: " + arrToString(copy(arr6)) + " Is the address the same? (expected false): " + (arr6 == (copy(arr6))));
	  arr6 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	  int[][] arr7 = copy(arr6);
	  arr6[0][0] = 10;
	  System.out.print("Original (edited): " + arrToString(arr6));
	  System.out.println(" Copy of (unedited) original: " + arrToString(arr7) + " Is the address the same? (expected false): " + (arr6 == (copy(arr6))));
  }
}