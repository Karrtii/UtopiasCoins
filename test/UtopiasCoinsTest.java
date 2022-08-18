import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtopiasCoinsTest
{

  UtopiasCoins utopia;

  @BeforeEach void setUp()
  {
    utopia= new UtopiasCoins();
  }

  @Test
  public void utopiasCoinsTrue()
  {
    int[] coinsArray = {1, 7, 10, 22};
    int sum = 15;

    assertEquals(3, utopia.utopiaCoins(coinsArray, sum));
  }

  @Test
  public void utopiasCoinsFalse()
  {
    int[] coinsArray = {1, 7, 10, 22};
    int sum = 15;

    assertNotEquals(4, utopia.utopiaCoins(coinsArray, sum));
  }
}