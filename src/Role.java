/**
 * Created by sunning on 2016/11/16.
 */
public abstract class Role {
    public int hp;
    public int mp;
    public Outlook outlook;

    KnifeAttack knifeAttack=new KnifeAttack();
    SwordAttack swordAttack=new SwordAttack();
    WaterAttack waterAttack=new WaterAttack();
    HandAttack handAttack=new HandAttack();
    FireAttack fireAttack=new FireAttack();
    MetalAttack metalAttack=new MetalAttack();

    Attack attack;

    public void setAttack(Attack attack){
        this.attack=attack;
    }

    public String startAttack(){
        return attack.attack();
    }

}
