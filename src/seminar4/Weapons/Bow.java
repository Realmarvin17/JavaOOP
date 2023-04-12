package seminar4.Weapons;

import java.util.Random;

// Лук
public class Bow extends Weapon {

    private final int range;

    public int getRange() {
        return range;
    }

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    @Override
    public int damage() {
        return new Random().nextInt(0, pointOfDamage);
    }

    @Override
    public String toString() {
        return "Bow [range = " + range + "]" + "Damage  = " + pointOfDamage;
    }
}
