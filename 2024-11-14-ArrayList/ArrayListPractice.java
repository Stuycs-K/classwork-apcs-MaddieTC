import java.util.ArrayList;
public class ArrayListPractice {
	public static ArrayList<String>createRandomArray(int size) {
		ArrayList<String> aa = new ArrayList<String>();
		for (int y = 0; y < size; y++) {
			aa.add("" + (int) (Math.random() * 11));
		}
		for (int z = 0; z < size; z++) {
			if (aa.get(z).equals("0")) {
				aa.set(z, "");
			}
		}
		return aa;
	}
	public static void replaceEmpty( ArrayList<String> original){
		for (int y = 0; y < original.size(); y++) {
			if (original.get(y).equals("")) {
				original.set(y, "Empty");
			}
		}
	}
	
	public static ArrayList<String> makeReversedList( ArrayList<String> original){
		ArrayList<String> rev = new ArrayList<String>();
		for (int y = original.size() - 1; y > -1; y--) {
			rev.add(original.get(y));
		}
		return rev;
	}
	
	public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
		ArrayList<String> ret = new ArrayList<String>();
		ArrayList<String> smaller;
		ArrayList<String> larger;
		if (a.size() >= b.size()) {
			smaller = b;
			larger = a;
		}
		else {
			smaller = a;
			larger = b;
		}
		for (int y = 0; y < smaller.size(); y++) {
			ret.add(a.get(y));
			ret.add(b.get(y));
		}
		for (int z = smaller.size(); z < larger.size(); z++) {
			ret.add(larger.get(z));
		}
		return ret;
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
} 

	public static void main(String[] args) {
		System.out.println(createRandomArray(2));
		System.out.println(createRandomArray(0));
		
		ArrayList<String> a = createRandomArray(3);
		System.out.println(a);
		replaceEmpty(a);
		System.out.println(a);
		
		ArrayList<String> b = createRandomArray(5);
		System.out.println(b);
		System.out.println(makeReversedList(b));
		
		ArrayList<String> c = createRandomArray(2);
		ArrayList<String> d = createRandomArray(3);
		System.out.println(c);
		System.out.println(d);
		System.out.println(mixLists(c,d));

	}
}