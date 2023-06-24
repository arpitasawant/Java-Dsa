public class maxsubarray {
  public static void maxsub(int numbers[]) {
    // int ts = 0;
    int maxsum = Integer.MIN_VALUE;
    ;
    int curr = 0;
    for (int i = 0; i < numbers.length; i++) {
      int start = i;
      for (int j = i; j < numbers.length; j++) {
        int end = j;

        curr = 0;
        for (int k = start; k <= end; k++) {
          curr += numbers[k];

        }
        System.out.println(curr);
        if (maxsum < curr) {
          maxsum = curr;
        }

      }

    }
    System.out.println("max is: " + maxsum);
  }

  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    maxsub(numbers);
  }
}
