package inheritance_polymorphism;

import java.util.Random;
public class Fighter extends PlayerCharacter{
    public Fighter(String n, int m){
        super(n,m);
    }
    
    public String shout(){
        return "AAAARGH!";
    }
    
    public int damage(){
        return 5 +dice.nextInt(6)+1 + dice.nextInt(6)+1;
    }
    private static Random dice = new Random();
}
