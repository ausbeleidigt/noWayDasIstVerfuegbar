public class Tier{
    String art;
    int groesse;
    
    
    Tier(int groesse, String art){
        this.groesse = groesse;
        this.art = art;
        System.out.println("Das Tier ist " + groesse + " cm groß und ist ein " + art);
        
        
    }
    
    
    void laufen(int strecke){
        System.out.println("Das Tier ist" + strecke + "cm gelaufen.");
    }
     
    
    
}