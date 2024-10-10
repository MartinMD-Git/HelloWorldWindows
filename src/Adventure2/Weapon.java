package Adventure2;

public abstract class Weapon extends Item{
    public Weapon(String name, String description) {
        super(name, description);
    }
    public abstract boolean canUse();
    public abstract int getDamage();
}

