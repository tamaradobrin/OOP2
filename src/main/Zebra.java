
public class Zebra {

  private String nickname;
  private double weight;
  private String height;
  private int numberOfStripes;

  public void eat(){ System.out.println("I'm eating");}
  public void sleep() { System.out.println("I'm sleeping");}
  public void trot() { System.out.println("I'm trotting");}

  public String getNickname() { return nickname;}
  public void setNickname(String nickname) { this.nickname = nickname;}
  public double getWeight() { return weight;}
  public void setWeight(double weight) { this.weight = weight;}
  public String getHeight() { return height;}
  public void setHeight(String height) { this.height = height;}
  public int getNumberOfStripes() { return numberOfStripes;}
  public void setNumberOfStripes(int numberOfStripes) {
    if (numberOfStripes <= 0) {
      //values less than 0 are not accepted
    } else {
      this.numberOfStripes = numberOfStripes;
    }
  }

}
