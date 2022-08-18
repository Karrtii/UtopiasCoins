

public class UtopiasCoins
{

  public int utopiaCoins(int[] coinsArray, int sum){

    int totalCoins = coinsArray.length;

    double[][] arr = new double[totalCoins + 1][sum + 1];

    for(int j = 0; j <= sum; j++)
    {
      arr[0][j] = Double.POSITIVE_INFINITY;
    }

    for(int i = 1; i <= totalCoins; i++)
    {
      arr[i][0] = 0;
    }

    for(int i = 1; i <= totalCoins; i++){
      for(int j = 1; j <= sum; j++){
        if(coinsArray[i - 1] <= j)
          arr[i][j] = minimum(1 + arr[i][j - coinsArray[i - 1]], arr[i - 1][j]);
        else
          arr[i][j] = arr[i - 1][j];
      }
    }

    return (int)arr[totalCoins][sum];
  }

  public double minimum(double a, double b){
    if(a <= b){
      return a;
    }
    else{
      return b;
    }
  }
  }

