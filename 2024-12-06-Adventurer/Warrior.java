public class Warrior extends Adventurer {
  private int strength;

  public Adventurer(String name, int hp){
      super.(name, hp);
      this.strength = 10;
  }


  public abstract String getSpecialName() {
    return "strength";
  }
  //accessor methods
  public abstract int getSpecial(){
    return this.strength;
  }

  public abstract void setSpecial(int n){
    this.strength = n;
  }

  public abstract int getSpecialMax(){
    return 100;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other) {
    int dam = (int) Random.nextDouble() * 11;
    other.applyDamage(dam);
    return this.getName() + " deals " + dam + " to " + other.getName();
  }

  //heall or buff the target adventurer
  public abstract String support(Adventurer other) {
    int support = (int) Random.nextDouble() * 6;
    if (other.getHP() + 5 <= other.getmaxHP())) {
      other.setHP(other.getHP() + 5);
      return other.getName() + " was healed " + support + " HP";
    }
    else {
      other.setHP(other.getmaxHP());
      return other.getName() + " was healed to full health";
    }
  }

  //heall or buff self
  public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);
}
