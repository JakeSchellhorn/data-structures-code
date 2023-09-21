package inheritance_polymorphism;

public class Mage extends PlayerCharacter{
    public Mage (String n, int m){
        super(n, m);
    }
    
    public String shout(){
        return "FWOOSH";
    }
    
    public int damage(){
        return 11;
    }
}
