import java.util.Scanner;

/**
 * @author Dwight Van der Velpen
 */
public class Console {
    public void Start(){
        // Create objects
        Scanner sc = new Scanner(System.in);
        MijnString ms = new MijnString();
        
        // User interaction
        System.out.println("Welkom in de Tel Letter Appl., welke string wilt u onderzoeken?");
        String input = sc.nextLine();
        System.out.println("En welk karakater wilt u tellen?");
        char karakter = sc.next().charAt(0);
        
        // Get count
        int count = ms.telLetter(input, karakter);
        
        System.out.println("Het karakater kwam " + count + " maal voor in de String.");
    }
}
