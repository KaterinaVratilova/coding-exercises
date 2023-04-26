public class IntEqualityPrinter {

  public static void main(String[] args) {
    printEqual(1, 1, 1);
    printEqual(1,1,2);
    printEqual(-1,-1,-1);
    printEqual(1, 2, 3);
  }

  public static void printEqual(int p1, int p2, int p3) {
    if (p1 < 0 || p2 < 0 || p3 < 0) {
      System.out.println("Invalid value");
    } else if (p1 == p2 && p2== p3) {
      System.out.println("All numbers are equal");
    } else if (p1 != p2 && p1!= p3 && p2!=p3) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither are all equal or different");
    }
  }
}

/*
Write a method printEqual with 3 parameters of type int. The method should not return anything (void).

If one of the parameters is less than 0, print text "Invalid Value".

If all numbers are equal print text "All numbers are equal"

If all numbers are different print text "All numbers are different".

Otherwise, print "Neither all are equal or different".


EXAMPLES OF INPUT/OUTPUT:

* printEqual(1, 1, 1); should print text All numbers are equal

* printEqual(1, 1, 2); should print text Neither all are equal or different

* printEqual(-1, -1, -1); should print text Invalid Value

* printEqual(1, 2, 3); should print text All numbers are different

* */
