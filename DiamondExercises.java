public class DiamondExercises {
  private int rows;

  public DiamondExercises(int rows) {
    this.rows = rows;
  }
  public void printIsoceles() {
    //make an isosceles triangle with 3 rows
    int n = rows;
    //the number of stars on the bottom row is just less than twice the number of rows
    //until you reach the number of stars needed for the bottom row increment each row by two stars starting with the first star (1, 3, 5, 7)
    for (int c = 1; c < n*2; c += 2 ) {
      //add the number of spaces based on what row you are. First row's number of spaces is half of the last row (which is n) minus one to account for center star. Rate of number of spaces decreasing is half that of the row increment. This number decreases as the row number increases.
      for (int d = 0; d < ((n-1)-c/2); d++){
        System.out.print(" ");
      }
      //add the number of star for each iteration increasing the stars
      for (int k = 0; k < c ; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void printBottomIsoceles(){
    int n = rows;
    //the number of stars in the top row of the second half of the diamond is two less than the middle row. Each row should decrement by 2.
    for (int c = (n*2)-2; c >= 1 ; c -= 2 ) {
      //Print out number of spaces starting with one and increase each row by half the rate of c.
      for (int d = 1; d < ((n+1)-c/2); d++){
        System.out.print(" ");
      }
      //Print out number of stars decreasing each row
      for (int k = 1; k < c ; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void printDiamond(){
    printIsoceles();
    printBottomIsoceles();
  }

  public void printDiamondName() {
    int n = rows;
    for (int c = 1; c < n*2; c += 2 ) {
      //add the number of spaces by dividing
      for (int d = 0; d < ((n-1)-c/2); d++){
        System.out.print(" ");
      }
      //At the middle row, print out name instead of stars
      if(c == (n*2-1)){
        System.out.print("Katrina");
      }
      else{
        for (int k = 0; k < c ; k++){
          System.out.print("*");
        }
      }
      //if last line print out name instead of stars
      System.out.println();
    }
    //print bottom half
    printBottomIsoceles();
  }

  public static void main (String[] args) {
    DiamondExercises exercise = new DiamondExercises(3);
    exercise.printIsoceles();
    exercise.printDiamond();
    exercise.printDiamondName();
  }
}
