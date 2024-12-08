public class Warrior extends Adventurer {
  private int strength;
  
  public Warrior(String name){
      super(name);
      this.strength = 10;
  }

  public Warrior(String name, int hp){
      super(name, hp);
      this.strength = 10;
  }


  public String getSpecialName() {
    return "strength";
  }
  //accessor methods
  public int getSpecial(){
    return this.strength;
  }

  public void setSpecial(int n){
    this.strength = n;
  }

  public int getSpecialMax(){
    return 100;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
	Random ran = new Random()
    int dam = (int) ran.nextDouble() * 11;
    other.applyDamage(dam);
    return this.getName() + " deals " + dam + " to " + other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
	Random ran = new Random()
    int support = (int) ran.nextDouble() * 6;
    if (other.getHP() + 5 <= other.getmaxHP()) {
      other.setHP(other.getHP() + 5);
      return other.getName() + " was healed " + support + " HP";
    }
    else {
      other.setHP(other.getmaxHP());
      return other.getName() + " was healed to full health";
    }
  }

  //heall or buff self
  public String support();

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other);
}
