package characterarena;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int attack;
    protected int defence;
    protected int experience = 0;

 
    public Hero(String name, int hp, int attack, int defence) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public boolean upgrade() {
    if (experience >= 10) {
        attack += 5;
        defence += 3;
        hp += 10;
        experience -= 10;
        return true;
    }
    return false;
}

    public int getExperience() {
    return experience;
}

public void addExperience(int xp) {
    experience += xp;
}

}
