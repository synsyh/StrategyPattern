/**
 * Created by sunning on 2016/11/16.
 */
public class SwordAttack implements PhysicalAttack {
    private String attackPattern="attack with sword";
    @Override
    public String attack() {
        return attackPattern;
    }
}
