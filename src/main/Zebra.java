
public class Zebra extends Animal{

  private int numberOfStripes;

  public void eat(){ System.out.println("I'm eating");}
  public void sleep() { System.out.println("I'm sleeping");}
  public void trot() { System.out.println("I'm trotting");}

  public int getNumberOfStripes() { return numberOfStripes;}
  public void setNumberOfStripes(int numberOfStripes) {
    if (numberOfStripes <= 0) {
      //values less than 0 are not accepted
    } else {
      this.numberOfStripes = numberOfStripes;
    }
  }

}
