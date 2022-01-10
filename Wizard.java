public class Wizard extends Adventurer{
  private int magic;
  private String power;

  public Wizard(){
    this("Gary");
  }

  public Wizard(String name){
    this(name, "Ice", 1);
  }

  public Wizard(String name, String power, int magic){
    super(name,30+(int)(Math.random()*10));
    setMagic(magic);
    setPower(power);
  }

  public void attack(Damageable other){
    int damage = (int)(Math.random()*10)+1;
    other.applyDamage(damage);
    setMagic(getMagic()+1);
    System.out.println(this + " used their " + getPower() + " powers against "+ other + " for " + damage + " damage!");
  }

  public void specialAttack(Damageable other){
    if(getMagic() >= 5){
      int damage = (int)((Math.random()*10)*(getMagic()+1));
      other.applyDamage(damage);
      System.out.println(this + " unleashed their fury upon "
               + other + " for " + damage + " damage! ");
      setMagic(getMagic() - 5);
    }
    else {
      System.out.println("Magic not strong enough!");
      attack(other);
    }
  }
  public String getPower(){
    return power;
  }
  public int getMagic(){
    return magic;
  }
  public void setMagic(int m){
    this.magic = m;
  }
  public void setPower(String power){
    this.power = power;
  }
}
