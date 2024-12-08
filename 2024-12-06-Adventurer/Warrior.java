import java.util.Random;
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

  public int restoreSpecial(int n){
      if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
      setSpecial(getSpecial()+n);
      return n;
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
	Random ran = new Random();
    int dam = (int) ran.nextDouble() * 11;
    other.applyDamage(dam);
    return this.getName() + " deals " + dam + " to " + other.getName();
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
	Random ran = new Random();
    int support = (int) ran.nextDouble() * 6;
    if (other.getHP() + support <= other.getmaxHP()) {
      other.setHP(other.getHP() + support);
      return other.getName() + " recieved support. " + support + " HP was restored.";
    }
    else {
      other.setHP(other.getmaxHP());
      return other.getName() + " was supported and healed to full health";
    }
  }

  //heall or buff self
  public String support() {
	Random ran = new Random();
    int support = (int) ran.nextDouble() * 6;
    if (this.getHP() + support <= this.getmaxHP()) {
      this.setHP(this.getHP() + support);
      return this.getName() + " recieved support. " + support + " HP was restored.";
    }
    else {
      this.setHP(this.getmaxHP());
      return this.getName() + " was supported and healed to full health";
    }
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
	  Random ran = new Random();
	  int dam = (int) ran.nextDouble() * 11;
	  if (strength > 0) {
		other.applyDamage(dam);
		return this.getName() + " uses a special attack and deals " + dam + " to " + other.getName();
	  }
	  else {
		  return this.getName() + " doesn't have enough " + this.getSpecialName() + " to use this attack.";
	  }
  }

}
