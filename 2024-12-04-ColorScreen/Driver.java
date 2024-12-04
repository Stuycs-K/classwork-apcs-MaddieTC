public class Driver {
	public static void main(String[]args){
		System.out.print(Text.CLEAR_SCREEN);
		border(30,80);
		int[] nums = random(3);
		check(nums[0]);
		Text.go(25, 20);
		System.out.print(nums[0]);
		Text.color(Text.background(Text.BLACK));
		check(nums[1]);
		Text.go(25, 40);
		System.out.print(nums[1]);
		Text.color(Text.background(Text.BLACK));
		check(nums[2]);
		Text.go(25, 60);
		System.out.print(nums[2]);
		Text.color(Text.background(Text.BLACK));
		Text.go(26,1);
		line(79);		
		Text.go(33, 20);
		Text.wait(500);
		line2(5,Text.RED,Text.YELLOW,"_");
		Text.go(33,60);
		line2(5,Text.RED,Text.YELLOW,"_");
		
		Text.go(40,40);
		Text.wait(500);
		line2(2,Text.RED,Text.YELLOW,"_");
		
		Text.go(46,35);
		line2(10,Text.RED,Text.YELLOW,"_");
		
		Text.go(47,33);
		line2(3,Text.RED,Text.YELLOW,"_");
		Text.go(47,44);
		line2(3,Text.RED,Text.YELLOW,"_"); 
		
		Text.go(52,0);
		System.out.println(Text.RESET); 
	}
	private static void border (int row, int column) {
		for (int y = 0; y < row; y++) {
			if (y == 0 || y == row - 1) {
				for (int z = 0 ; z < column; z++) {
					Text.color(Text.MAGENTA,Text.background(Text.CYAN));
					System.out.print("*");
				}
				Text.color(Text.background(Text.BLACK));
			}
			else {
				Text.color(Text.MAGENTA,Text.background(Text.CYAN));
				System.out.print("*");
				for (int x = 1; x < column - 1; x++) {
					Text.color(Text.background(Text.BLACK));
					System.out.print(" ");
				}
				Text.color(Text.MAGENTA,Text.background(Text.CYAN));
				System.out.print("*");
			}
			Text.color(Text.background(Text.BLACK));
			System.out.println();
		}
	}
	private static int[] random (int size) {
		int[] arr = new int[size];
		for (int y = 0; y < size; y++) {
			arr[y] = (int) (Math.random() * 100);
		}
		return arr;
	}
	private static void check(int hmm) {
		if (hmm < 25) {
			Text.color(Text.RED,Text.BRIGHT);
		}
		else if (hmm > 75) {
			Text.color(Text.GREEN,Text.BRIGHT);
		}
		else {
			Text.color(Text.WHITE);
		}
	}
	private static void line (int length) {
		Text.color(Text.MAGENTA,Text.background(Text.CYAN));
		System.out.print("*");
		for (int y = 1; y < length; y++) {
			System.out.print("=");
		}
	}
	
	private static void line2 (int length, int c, int bg, String dot) {
		Text.color(c,Text.background(bg));
		for (int y = 1; y < length; y++) {
			System.out.print(dot);
		}
	}
}