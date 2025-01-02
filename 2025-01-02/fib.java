public class fib {
  public static int fib (int n) {
    if (n <= 1) {
      return n;
    }
    else {
      return fib(n - 1) + fib(n - 2);
    }
  }
  public static void main(String[] args) {
	  fib(45);
    //System.out.println(fib(46)); this is the largest number before it overflows.
	//System.out.println(fib(47));
  }
}
