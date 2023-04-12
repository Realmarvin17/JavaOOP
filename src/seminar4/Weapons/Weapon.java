package seminar4.Weapons;

import seminar4.Weaponable;

public  abstract class Weapon implements Weaponable {
    protected int pointOfDamage;

    public Weapon(int pointOfDamage) {
        this.pointOfDamage = pointOfDamage;
    }

}
