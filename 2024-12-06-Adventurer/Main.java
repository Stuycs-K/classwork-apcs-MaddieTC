public class Main {
	public static void main(String[] args) {
		Adventurer a = new Warrior ("Jerry", 50);
		Adventurer b = new Warrior("Lancy");
		System.out.println(a.getSpecialName());
		System.out.println(a.getSpecial());
		System.out.println(a.getSpecialMax());
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(a.getmaxHP());
		System.out.println(b.getmaxHP());
		b.setmaxHP(20);
		System.out.println(b.getmaxHP());
		System.out.println(b.getHP());
		System.out.println(b.attack(a));
		System.out.println(a.getHP());
		System.out.println(b.support(a));
		System.out.println(b.support(a));
		System.out.println(b.support(a));
		System.out.println(a.getHP());
		System.out.println(b.support());
		System.out.println(b.getHP());
		System.out.println(b.specialAttack(a));
		System.out.println(b.getSpecial());
		System.out.println(a.getHP());
		b.restoreSpecial(2);
		System.out.println(b.getSpecial());
		b.setSpecial(15);
		System.out.println(b.getSpecial());
	}
}