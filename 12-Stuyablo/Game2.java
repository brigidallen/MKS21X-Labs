public class Game2 {
  public static void main(String[] args) {
    Adventurer a = new Wizard("Mii", "fire", 4);
    Adventurer b = new Wizard("Loola", "ice", 6);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");

  }
}
