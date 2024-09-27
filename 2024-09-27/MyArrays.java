public class MyArrays {
      public String arrayToString(nums[]) {
          String end = "[";
          for (int y = 0; y < nums.length; y++) {
              end = end + nums[y];
              if (y != nums.length - 1) {
                  end = end + ", ";
              }
          }
          return end + "]";
      }
}
