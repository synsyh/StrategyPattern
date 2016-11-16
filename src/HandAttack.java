/**
 * Created by sunning on 2016/11/16.
 */
public class HandAttack implements PhysicalAttack {
    private String attackPattern="attack with hand";
    @Override
    public String attack() {
        return attackPattern;
    }
}
