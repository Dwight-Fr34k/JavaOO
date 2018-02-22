/**
 * @author Dwight
 */
public class Console {
    Bankrekening br;
    
    public void testBankrekening(){
        br = new Bankrekening("123-1234567-12", "Dwight Van der Velpen");
        
        if(br == null) return;
        
        // test it
        System.out.println(br.toString());
        br.stort(500);
        System.out.println(br.toString());
        if(!br.haalAf(800)){
            System.out.println("Saldo onvoldoende!");
        }        
        System.out.println(br.toString());
    }
}
