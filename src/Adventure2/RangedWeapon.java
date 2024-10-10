package Adventure2;

public class RangedWeapon extends Weapon {
    private int remainingUses;
    private int damage;

    public RangedWeapon(String name, String description, int uses, int damage) {
        super(name, description);
        this.remainingUses = uses;
        this.damage = damage;
    }

    @Override
    public boolean canUse() {
        return remainingUses > 0;
    }

    public void use() {
        if (canUse()) {
            remainingUses--;
        } else {
            System.out.println("Your ranged weapon is out of uses.");
        }
    }

    public int getRemainingUses() {
        return remainingUses;
    }

    public int getDamage() {
        if(canUse()) {
            return damage;
        } else {
            return 0;
        }
    }
}