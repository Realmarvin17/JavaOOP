package seminar4;

// класс нулевого воина
public abstract class Warrior {
    private final String  name;
    private int healthPoint;
    private final Weaponable weapon;
    private final Defendable defend;



    public Warrior(String name, int healthPoint, Weaponable weapon, Defendable defend) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defend = defend;
    }
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon() {
        return weapon;
    }
    public Defendable getDefend() {
        return defend;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + ", defend = " + defend + "]";
    }

}

