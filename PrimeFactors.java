public class PrimeFactors{
  private int num;

  public int GetPrimeFactors(int num) {
    //assign the parameter to a number variable
    int number = num;
    //keep dividing the variable by the next number in ascending order starting with two until the variable can only be divisible by 1. Get it in ascending order!
    int i=2;
      while(number >1) {
        //When the variable is divisble
        if (number % i == 0)
          //Divide the variable by that number and reassign the variable to quotient
          { number = number/i;
            //Print out the number that it's divisible by
            System.out.print(i + ", ");
          //if the number is not divisble, increment to the next possible number
        } else {
          i++;
        }
      }
    return (i);
  }
  public static void main (String[] args) {
    PrimeFactors number = new PrimeFactors();
    number.GetPrimeFactors(30);
  }
}
