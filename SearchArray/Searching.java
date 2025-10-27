package SearchArray;
import java.util.*;

public class Searching {
    String [] names ={"Zaldy","Romualdez","Soto","Lacson"};


    public void names (String[] names){
     this.names= names;
     return;
    }

    public static void main(String[] args) {
       
        String y= "yes"; 
        String n="no";
     

        Scanner input = new Scanner (System.in);
        Searching find = new Searching();
        

        System.out.println("Do you want to know if the person is Congressman or Not?");
        y=input.nextLine();


        
        boolean found = false;
       if (y.equalsIgnoreCase("yes")) {
        System.out.println("...................\n");

      
        
       
        if (n.equalsIgnoreCase("no")) {
            System.out.println("Thank you ");

        }
            
        }

        else{
            System.out.println("Error!! please try again");
        }


        System.out.println("Enter the Name");
                System.out.println("\n");
                System.out.println("\n");
                String name = input.nextLine();
            
        
            
        
        if (found) {
                
        switch (name) {
           
            
            case "Zaldy":
                        System.out.println("Yes, Confirmed Congressman");
            case "Romualdez":
                        System.out.println("Yes, Confirmed Congressman");
                break;

            case "Soto":
                        System.out.println("No, but his a comedian Senator");
                break;

            case "Lacson":
                        System.out.println("No, His but sometimes comedy");
                break;
            
        
           /**  default:
                        System.out.println("NOT MATCHED");
                break;**/
            
        }
        }
         else if (y.equalsIgnoreCase("no")) {
            System.out.println("Thank you ");
        } else {
            System.out.println("Error!! please try again");
        }
    
            
            input.close();
        }
}
        

    
        
    




