public class LeapYearAlternatives{

    //this one works. Make the others works
    //BUT YOU CAN ONLY RE-ARRANGE THE LINES 
    //I have given you for each method
    public boolean method(int year){
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 ==0) {
            return true;
          }
          return false;
        }
        return true;
      }
      return false;
    }

    public boolean method1(int year){
      // else if (year % 100 == 0)
      // else if (year % 400 == 0) 
      // if (year % 4 != 0) 
      // else 

      // return false;
      // return true;
      // return false;
      // return true;

      //WHEN YOU DO THIS ERASE THIS LINE -- 
      //WE NEED SO YOU CAN RUN THE OTHERS
      return false;
    }

    public boolean method2(int year){
        //  boolean isLeapYear = false;
        //  isLeapYear = true;
        //  isLeapYear = false;
        //  isLeapYear = true;
        //  isLeapYear = false; 
        //  return isLeapYear;
        //  if (year % 400 == 0) 
        //  else if (year % 100 == 0) 
        //  else if (year % 4 == 0) 
        //  else 

        //WHEN YOU DO THIS ERASE THIS LINE -- 
        //WE NEED SO YOU CAN RUN THE OTHERS
        return false;
    }

    public boolean method3(int year){
        // boolean isLeapYear = false;
        // isLeapYear = true;   
        // isLeapYear = true;
        // return isLeapYear;
        // if(year % 4 == 0)
        // if(year % 100 != 0)
        // if(year % 400 == 0)
        // else 
        
        //WHEN YOU DO THIS ERASE THIS LINE -- 
        //WE NEED SO YOU CAN RUN THE OTHERS
        return false;
    }
}