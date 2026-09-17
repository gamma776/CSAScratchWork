import java.util.Scanner; 
public class seattleyearetc {
   public static void main(String[] args) {
      double  houses = 3.0;
      boolean isHouse = true;
      int peopleInHouse = 9;
      String wordTyped;
      
      
      
      

      System.out.println("the people per house for my family is "+ houses / peopleInHouse);
      System.out.println("is the house a house? " + isHouse);
      System.out.println("Please enter anything");
      Scanner scan = new Scanner(System.in); 
      wordTyped = scan.nextLine();
      System.out.println("you entered the word \" " + wordTyped + "\" ");
      scan.close();

      
   }
  
}   