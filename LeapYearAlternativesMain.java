public class LeapYearAlternativesMain {
    public static void main(String[] args) {
      LeapYearAlternatives lp = new LeapYearAlternatives();
  
      int countLeapYears = 0;
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method(year);
          if(isLeapYear)
            countLeapYears++;
          //uncommment the next line to see all the years
          //System.out.println(year + ":" + isLeapYear);
      }
      System.out.println("You should have 8 leap years : 2092, 2096, 2104, 2108, 2112, 2116, 2120, 2124");
  
      countLeapYears = 0;
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method1(year);
          if(isLeapYear)
            countLeapYears++;
          //uncommment the next line to see all the years
          //System.out.println(year + ":" + isLeapYear);
      }
      System.out.println("Do you have 8 leap years? Your count: " + countLeapYears );
    
      countLeapYears = 0;
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method2(year);
          if(isLeapYear)
            countLeapYears++;
          //uncommment the next line to see all the years
          //System.out.println(year + ":" + isLeapYear);
      }
       System.out.println("Do you have 8 leap years? Your count: " + countLeapYears );
  
      countLeapYears = 0;
      for(int year = 2090; year < 2125; year++){
          boolean isLeapYear = lp.method3(year);
          if(isLeapYear)
            countLeapYears++;
          //uncommment the next line to see all the years
          //System.out.println(year + ":" + isLeapYear);
      }
       System.out.println("Do you have 8 leap years? Your count: " + countLeapYears );
    }
  }