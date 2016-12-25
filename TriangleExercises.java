public class TriangleExercises {
  public static void main (String[] args) {
  //print out one *
    System.out.println("*");
    int x = 0;
    int y = 0;
  //print out a horizontal line of 8 stars.
    int n = 8;
    while (x < n) {
        System.out.print("*");
        x = x + 1;
    }
    //print out a vertical line of 3 stars.
    int number = 3;
    while (y <= number) {
        System.out.println("*");
        y = y + 1;
    }
    // print out a right triangle with 3 rows
    int v = 3;
    for (int c = 1; c <= v; c++ ) {
      for (int k = 0; k < c ; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
