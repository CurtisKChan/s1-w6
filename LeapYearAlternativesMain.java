public class LeapYearAlternativesMain {
    public static void main(String[] args) {
      LeapYearAlternatives lp = new LeapYearAlternatives();
      System.out.println("You should have 4 leap years for each method: 2021, 2024, 2100, 2400");
      System.out.println("My Method");
      int[] years = {2021, 2024, 2100, 2400};
      for(int year: years){
          boolean isLeapYear = lp.method(year);
          System.out.println(year + ":" + isLeapYear);
      }

      System.out.println("");
      System.out.println("Method 1");
      for(int year: years){
          boolean isLeapYear = lp.method1(year);
          System.out.println(year + ":" + isLeapYear);
      }

      System.out.println("");
      System.out.println("Method 2");
      for(int year: years){
          boolean isLeapYear = lp.method2(year);
          System.out.println(year + ":" + isLeapYear);
      }
       
      System.out.println("");
      System.out.println("Method 3");
      for(int year: years){
          boolean isLeapYear = lp.method3(year);
          System.out.println(year + ":" + isLeapYear);
      }
    }
  }