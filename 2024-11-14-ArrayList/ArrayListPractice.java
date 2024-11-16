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
	public static void main(String[] args) {
		System.out.println(createRandomArray(2));
	}
}