public class Wizard extends Adventurer{
  private int magic;
  private String power;
  private int magicMax;

  public Wizard(){
    this("Gary");
  }

  public Wizard(String name){
    this(name, "Ice", 1, 20, 50);
  }

  public Wizard(String name, String power, int magic, int magicMax, int maxHP){
    super(name,30+(int)(Math.random()*10));
    setMagic(magic);
    setPower(power);
  }

  public String attack(Damageable other){
    int damage = (int)(Math.random()*10)+1;
    other.applyDamage(damage);
    setMagic(getMagic()+1);
    return(this + " used their " + getPower() + " powers against "+ other + " for " + damage + " damage!");
  }

  public String specialAttack(Damageable other){
    if(getMagic() >= 5){
      int damage = (int)((Math.random()*10)*(getMagic()+1));
      other.applyDamage(damage);
      setMagic(getMagic() - 5);
      return(this + " unleashed their fury upon "
               + other + " for " + damage + " damage! ");

    }
    else {
      attack(other);
      return("Magic not strong enough!");
    }
  }
  public String getPower(){
    return power;
  }
  public int getMagic(){
    return magic;
  }
  public String getSpecialName(){
    return "Magic";
  }
  public int getSpecialMax(){
  return magicMax;
  }
  public int getSpecial(){
    return magic;
  }
  public void setMagic(int m){
    this.magic = m;
  }
  public void setPower(String power){
    this.power = power;
  }
}
