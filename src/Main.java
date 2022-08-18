public class Main
{
  public static void main(String[] args){

    int[] coinsArray = {1, 7, 10, 22};
    int sum = 15;

    UtopiasCoins utopia = new UtopiasCoins();
    System.out.println("Minimum of " + utopia.utopiaCoins(coinsArray, sum)
        + " coins needed for " + sum);
  }
}
