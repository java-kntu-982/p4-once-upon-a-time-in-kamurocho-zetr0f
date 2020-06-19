package ir.ac.kntu.items;

public abstract class Item {
    private int level;
    private int health;
    private boolean isAlive;

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Item(int health) {
        level = 1;
        isAlive = true;
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0 ) {
            this.level = level;
        } else {
            this.level = 1;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0) {
            this.health = health;
        } else {
            this.health = 0;
        }
    }

    public void levelUp(){
        health += health/100*4;
        setLevel(getLevel()+1);
    }
}
