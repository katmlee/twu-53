public class FizzBuzz{
  public static void FizzBuzz() {
    //iterate 1 through 100
    for (int i = 1; i <= 100; i++) {
      //if the number is divisible by 3 and 5 print out FizzBuzz
      if (i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
        //otherwise, if the number is only divisible by 3 print out Fizz
      } else if (i % 3 == 0){
        System.out.println("Fizz");
        //otherwise, if the number is only divisible by 5 print out Buzz
      } else if (i % 5 == 0){
        System.out.println("Buzz");
        //otherwise, print the number
      } else {
        System.out.println(i);
      }
    }
  }
  public static void main (String[] args) {
    FizzBuzz();
  }
}
