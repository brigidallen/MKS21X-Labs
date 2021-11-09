
public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    if(deno != 0){
      denominator = deno;
    } else {
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    return numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    RationalNumber hi = new RationalNumber(denominator, numerator);
    return hi;
  }

  public boolean equals(RationalNumber other){
    if (other.getNumerator() == numerator && other.getDenominator() == denominator){
      return true;
    } else {
      return false;
    }
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b) {
    int c = 0;
    int rem = 0;
    if (a < b) {
      c = b;
      b = a;
      a = c;
    }
      rem = a % b;
    if (rem == 0) {
      return b;
    } else {
      return gcd(b, rem);
    }
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int n = numerator;
    int d = denominator;
    numerator = n/gcd(n, d);
    denominator = d/gcd(n, d);
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber a = ((numerator * other.numerator),(denominator * other.denominator));
    return a;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return (numerator * other.denominator)/(denominator * other.numerator);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return ((numerator * other.denominator)/(denominator * other.denominator)).reduce() +
      ((other.numerator * denominator)/(other.denominator * denominator)).reduce();
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return ((numerator * other.denominator)/(denominator * other.denominator)).reduce() -
      ((other.numerator * denominator)/(other.denominator * denominator)).reduce();;
  }
}
