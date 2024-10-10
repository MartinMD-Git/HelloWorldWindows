package Adventure2;

public class MeleeWeapon extends Weapon {
    private int damage;

    public MeleeWeapon(String name, String description, int damage) {
        super(name, description);
        this.damage = damage;
    }

    @Override
    public boolean canUse() {
        return true; // Melee våben kan hele tiden bruges
    }
    public int getDamage() {
        return damage;
    }
}