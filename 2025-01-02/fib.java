public class fib {
  public static int fib (int n) {
    if (n > 1) {
      return fib(n - 2) + fib (n - 1);
    }
    else {
      return n;
    }
  }
  public static void main(String[] args) {
    System.out.println(fib(2));
    System.out.println(fib(7));
    System.out.println(fib(18));
    System.out.println(fib(23));
    System.out.println(fib(30));
  }
}
