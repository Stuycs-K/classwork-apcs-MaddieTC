import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int[][] arr1;
    arr1 = new int[][] {{1, 0, 3}, {0, 5, 0}};
    System.out.println("Arr: " + Arrays.deepToString(arr1) + " Zeros: " + countZeros2D(arr1));
    arr1 = new int[][] {{0, 0, 0, 0}, {0, 5, 0}};
    System.out.println("Arr: " + Arrays.deepToString(arr1) + " Zeros: " + countZeros2D(arr1));
    arr1 = new int[][] {{}, {}};
    System.out.println("Arr: " + Arrays.deepToString(arr1) + " Zeros: " + countZeros2D(arr1));
    arr1 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println("Arr: " + Arrays.deepToString(arr1) + " Zeros: " + countZeros2D(arr1));
	System.out.println("Does personal method match the built in method? " + Arrays.deepToString(arr1).equals(arrToString(arr1)));
	
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

	int[][] arr5;
	arr5 = new int[][] {{-3, -2, -1}, {3, 2, 1}};
	System.out.println("Old: " + Arrays.deepToString(arr5)); 
	replaceNegative(arr5);
	System.out.println("New: " + Arrays.deepToString(arr5));
	arr5 = new int[][] {{-3, -2, -1}, {3, -2, 1}};
	System.out.println("Old: " + Arrays.deepToString(arr5)); 
	replaceNegative(arr5);
	System.out.println("New: " + Arrays.deepToString(arr5));
	arr5 = new int[][] {{-3, -2, -1}, {3, -2, 1, -4}, {-9,-7,-3}};
	System.out.println("Old: " + Arrays.deepToString(arr5)); 
	replaceNegative(arr5);
	System.out.println("New: " + Arrays.deepToString(arr5));
	System.out.println("Does personal method match the built in method? " + Arrays.deepToString(arr5).equals(arrToString(arr5)));
	
	int[][] arr6; 
	arr6 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	System.out.println("Original: " + Arrays.deepToString(arr6) + " Copy: " + Arrays.deepToString(copy(arr6)) + " Is the address the same? (expected false): " + (arr6 == (copy(arr6))));
	arr6 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	int[][] arr7 = copy(arr6);
	arr6[0][0] = 10;
	System.out.print("Original (edited): " + Arrays.deepToString(arr6));
	System.out.println(" Copy of (unedited) original: " + Arrays.deepToString(arr7) + " Is the address the same? (expected false): " + (arr6 == arr7));
	System.out.println("Does personal method match the built in method? " + Arrays.deepToString(arr7).equals(arrToString(arr7)));
	
    int[][] arr4;
	arr4 = new int[][] {{1, 2, 3}, {4, 5, 6}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{1, 2, 3}, {4, 5}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{1, 2}, {4, 5, 6}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{1, 2, 3}, {4, 5, 6, 7, 8}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{1, 2, 3, 4, 5}, {6, 7, 8}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{}, {4, 5, 6}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	arr4 = new int[][] {{1, 2, 3}, {}};
	System.out.println("Initial: " + Arrays.deepToString(arr4) + " Into: " + Arrays.deepToString(swapRC(arr4)));
	System.out.println("Does personal method match the built in method? " + Arrays.deepToString(arr4).equals(arrToString(arr4)));
	
	int[][] arr2;
	arr2 = new int[][] {{1,2},{3}};
	System.out.println("Arr: " + Arrays.deepToString(arr2) + " html: " + htmlTable(arr2));
	arr2 = new int[][] {{}, {1}};
	System.out.println("Arr: " + Arrays.deepToString(arr2) + " html: " + htmlTable(arr2));
	arr2 = new int[][] {{}, {}};
	System.out.println("Arr: " + Arrays.deepToString(arr2) + " html: " + htmlTable(arr2));
	arr2 = new int[][] {{1}, {2, 3}};
	System.out.println("Arr: " + Arrays.deepToString(arr2) + " html: " + htmlTable(arr2));
	System.out.println("Does personal method match the built in method? " + Arrays.deepToString(arr2).equals(arrToString(arr2)));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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


  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String result = "[";
  	for (int y = 0; y < ary.length; y++) {
  		result = result + arrToString(ary[y]);
  		if (y != ary.length - 1) {
  			result += ", ";
  		}
  	}
      return result + "]";
    }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int y = 0; y < nums.length; y++) {
      for (int x = 0; x < nums[y].length; x++) {
        if (nums[y][x] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int result = 0;
	for (int y = 0; y < nums.length; y++) {
		for (int x = 0; x < nums[y].length; x++) {
			result = result + nums[y][x];
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


  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
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

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
	for (int y = 0; y < nums.length; y++) {
		if (nums[y].length == 0) {
			result = result + "<tr></tr>";
		}
		else {
		for (int x = 0; x < nums[y].length; x++) {
			if (x == 0) {
				result = result + "<tr>";
			}
			result = result + "<td>" + nums[y][x] + "</td>";
		}
		result = result + "</tr>";
	}
	}
	return result + "</table>";
  }
}
