public class ProjectEuler {
public static int problem1() {
int sum = 0;
 for (int i = 0; i < 1000; i++) {
  if ( (i % 3 == 0) || (i % 5 == 0) ) {
  sum += i;
  }
  }
  return sum;
  }
  
  
  public static int problem2() {
  int num1 = 1;
   int num2 = 2;
   int num3 = 0;
   
    for (int i = 0; i <= 4000000; i++) {
     num1 += num2; 
     if ((num2 % 2) == 0) {
       num3 += num1;
       }
      }
   return num3;
   }
  
 
   
  
  
 
 public static void main(String[] args) {
 System.out.println("the answer to problem 1 is " + problem1());
 System.out.println("the answer to problem 2 is " + problem2());

 
 
 
  }
 }
 