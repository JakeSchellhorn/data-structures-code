package inheritance_polymorphism;

public class Cleric extends PlayerCharacter{
    
    public Cleric(String n, int m){
        super(n, m);
    }
    
    public String shout(){
        return "I heal thee!";
    }
    
    public int damage(){
        return 0;
    }
}
