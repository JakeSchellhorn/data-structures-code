package inheritance_polymorphism;

public abstract class PlayerCharacter implements Targetable{
    protected String name;
    protected int maxHP;
    protected int currHP;

    PlayerCharacter(String n, int m)
    {
        name = n;
        maxHP = m;
        currHP = maxHP;
    }
    public abstract String shout();
    
    public abstract int damage();
    
    public void hurt (int hp){
        currHP = currHP-hp;
        if (currHP<0){
            currHP=0;
        }
    }
    
    public void heal(int hp){
        currHP = currHP+hp;
        if (currHP>maxHP){
            currHP=maxHP;
        }
    }
    
    public int getHP(){
        return currHP;
    }
}
