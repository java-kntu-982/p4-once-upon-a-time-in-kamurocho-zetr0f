package ir.ac.kntu.items.Soldiers;

import ir.ac.kntu.items.Item;

public abstract class Soldier extends Item {
    private boolean isAttacking;
    private boolean isAttacked;
    private int attackPower;
    private int range;

    public Soldier(int health, int attackDamage, int range) {
        super(health);
        this.attackPower = attackDamage;
        this.range = range * 10;
    }

    public boolean isAttacking() {
        return isAttacking;
    }

    public void setAttacking(boolean attacking) {
        isAttacking = attacking;
    }

    public boolean isAttacked() {
        return isAttacked;
    }

    public void setAttacked(boolean attacked) {
        isAttacked = attacked;
    }

    public int getAttackDamage() {
        return attackPower;
    }

    public void setAttackDamage(int attackDamage) {
        if (attackDamage >= 500){
            this.attackPower = attackDamage;
        } else {
            this.attackPower = 500;
        }
    }

    public int getRange() {
        return range/10;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        setAttackDamage(getAttackDamage() + getAttackDamage()/100*4);
    }
}
