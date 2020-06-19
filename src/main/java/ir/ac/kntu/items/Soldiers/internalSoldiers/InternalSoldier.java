package ir.ac.kntu.items.Soldiers.internalSoldiers;

import ir.ac.kntu.items.Soldiers.Soldier;

public abstract class InternalSoldier extends Soldier {
    private int fieldOfView;

    public InternalSoldier(int health, int attackPower, int range, int fieldOfView) {
        super(health, attackPower, range);
        this.fieldOfView = fieldOfView * 30;
    }

    public int getFieldOfView() {
        return fieldOfView/20;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }
}
