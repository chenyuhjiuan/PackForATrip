import java.util.*;
import java.util.stream.Collectors;

public class PackForAtrip {

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String workresult="";
    String playresult="";
    String vacationresult="";
    String workp="";
    String playp="";
    String vacationp="";
    String result="";
    ArrayList<String> worksuitcase=new ArrayList<>();
    ArrayList<String> playsuitcase=new ArrayList<>();
    ArrayList<String> vacationsuitcase=new ArrayList<>();

    String[] jacket1= {"Jacket for work","made of cotton","red color"};
    String[] jacket2= {"Jacket for play","made of polyester","yellow color"};
    String[] jacket3= {"Jacket for vacation","make of polyester","black color"};
    String[] shirt1= {"Shirt for work", "made of cotton","orange color"};
    String[] shirt2= {"Shirt for play", "made of cotton", "orange color"};
    String[] shirt3= {"Shirt for vacation", "made of polyester","orange color"};
    String[] pants1= {"Pants for work","made of denim","black color"};
    String[] pants2= {"Pants for play","made of denim","purple color"};
    String[] pants3= {"Pants for vacation","made of denim","blue color"};
    String[] footwear1= {"Footwear for work","made of plastic","black color"};
    String[] footwear2= {"Footwear for play","made of leather","red color"};
    String[] footwear3= {"Footwear for vacation","made of leather","green color"};





        System.out.println("Hello, my dear, what kind of suitcase do you need now?");
        System.out.printf("Do you need a work suitcase? (y/n)");
        workp=sc.nextLine();
while(true) {
    if (workp.equalsIgnoreCase("y")) {
        System.out.println("The following package is in your work suitcase.");
        System.out.println(Arrays.toString(jacket1));
        System.out.println(Arrays.toString(shirt1));
        System.out.println(Arrays.toString(pants1));
        System.out.println(Arrays.toString(footwear1));
    }
    break;
}


       while(true) {
           System.out.println("Do you need a play suitcase? (y/n)");
           playp = sc.nextLine();

           if (workp.equalsIgnoreCase("y")) {
               System.out.println("The following package is in your play suitcase.");
               System.out.println(Arrays.toString(jacket2));
               System.out.println(Arrays.toString(shirt2));
               System.out.println(Arrays.toString(pants2));
               System.out.println(Arrays.toString(footwear2));
           }
            break;

       }

       while(true) {
           System.out.println("Do you need a vacation suitcase? (y/n)");
           vacationp = sc.nextLine();

           if (vacationp.equalsIgnoreCase("y")) {
               System.out.println("The following package is in your vacation suitcase.");
               System.out.println(Arrays.toString(jacket3));
               System.out.println(Arrays.toString(shirt3));
               System.out.println(Arrays.toString(pants3));
               System.out.println(Arrays.toString(footwear3));
           }
           break;
       }
        System.out.printf("\nThank you for using Pack For A Trip!");
        }





}

