package com.dndattacksim;

public class AttackTarget {

    private Integer defenseModifier;
    private Integer armorClass;

    public AttackTarget() {
        setTargetArmorClass();
        setTargetDefenseModifier();
    }

    public Integer getTargetDefenseModifier() {
        ScanInput scanInput = new ScanInput();
        return scanInput.getTargetDefenseModifier();
    }

    public void setTargetDefenseModifier() {
        this.defenseModifier = getTargetDefenseModifier();
    }

    public Integer getTargetArmorClass() {
        ScanInput scanInput = new ScanInput();
        return scanInput.getTargetArmorClass();
    }

    public void setTargetArmorClass() {
        this.armorClass = getTargetArmorClass();
    }

    public Integer getDefenseModifier() {
        return this.defenseModifier;
    }

    public Integer getArmorClass() {
        return this.armorClass;
    }
}
