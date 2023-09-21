public class LeapYearAlternativesMain {
    public static void main(String[] args) {
      LeapYearAlternatives lp = new LeapYearAlternatives();
      System.out.println("You should have 8 leap years for each method: 2092, 2096, 2104, 2108, 2112, 2116, 2120, 2124");
      System.out.println("My Method");
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method(year);
          if(isLeapYear)
            System.out.println(year + ":" + isLeapYear);
      }

      System.out.println("");
      System.out.println("Method 1");
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method1(year);
          if(isLeapYear)
            System.out.println(year + ":" + isLeapYear);
      }

      System.out.println("");
      System.out.println("Method 2");
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method2(year);
          if(isLeapYear)
            System.out.println(year + ":" + isLeapYear);
      }
       
      System.out.println("");
      System.out.println("Method 3")
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method3(year);
          if(isLeapYear)
            System.out.println(year + ":" + isLeapYear);
      }
    }
  }