public class MyArrays {
      public String arrayToString(int[] nums) {
          String end = "[";
          for (int y = 0; y < nums.length; y++) {
              end = end + nums[y];
              if (y != nums.length - 1) {
                  end = end + ", ";
              }
          }
          return end + "]";
      }
      public static void main(String[] args) {
        System.out.println(arrayToString({1, 2, 3}))
      }
}
