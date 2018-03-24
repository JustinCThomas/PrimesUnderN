public class PrimesUnderN{

  private static void calcPrimesUnderN(int n){
    for (int x = 1; x < n; x++){
      boolean isPrime = true;
      if (x == 1) {
        isPrime = false;
      }
      else if (x % 2 == 0 && x != 2) {
        isPrime = false;
      }
      else if (isPrime) {
        for (int y = 3; y <= Math.sqrt(x); y += 2){
          if (x % y == 0){
            isPrime = false;
            break;
          }
        }
      }

      if (isPrime) {
        System.out.println(x);
      }
    }
  }

  public static void main(String[] args){
    calcPrimesUnderN(100);
  }
}
