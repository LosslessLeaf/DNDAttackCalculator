package com.dndattacksim;

public class CalculateDamage {
    private String finalResult;
    private Integer d20Roll;

    public CalculateDamage() {

    }

    public CalculateDamage(PlayerCharacter pc, AttackTarget atkTar) {
        setD20(rollD20());
        showRoll();

        Integer totalTargetDefense = atkTar.getArmorClass() + atkTar.getDefenseModifier();
        Integer totalPlayerAttack = getD20() + pc.getAttackModifier();


        System.out.println("Player attack: " + totalPlayerAttack + " | Target defense: " + totalTargetDefense);

        // calculate damage
        if (checkIfHit(totalPlayerAttack, totalTargetDefense)) {
            if (this.d20Roll == 20) {
                Integer[] rolls = {0, 0};
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < pc.getDieCount(); j++) {
                        Die die = new Die(pc.getDieSides());
                        die.roll();
                        rolls[i] += die.getVal();
                    }
                }

                this.finalResult = "Critical Hit! " + rolls[0] + " " + rolls[1] + " = " + rolls[0] + rolls[1] + " damage!";

            } else if (this.d20Roll == 1) {

                this.finalResult = "Critical Miss!";

            } else {
                Integer totalDamage = 0;
                for (int j = 0; j < pc.getDieCount(); j++) {
                    Die die = new Die(pc.getDieSides());
                    die.roll();
                    totalDamage += die.getVal();
                }

                this.finalResult = "Hit! " + totalDamage + " damage dealt!";
            }
        } else {
            this.finalResult = "Miss! 0 Damage Dealt";
        }

    }

    public Integer rollD20() {
        // Roll d20
        Die d20 = new Die(20);
        d20.roll();
        return d20.getVal();
    }

    public void setD20(Integer d20Roll) {
        this.d20Roll = d20Roll;
    }

    public Integer getD20() {
        return this.d20Roll;
    }

    public void showRoll() {
        System.out.println("======================================");
        System.out.println("You have rolled: " + this.d20Roll + "!");
        System.out.println("======================================");
    }

    public String getFinalResult() {
        return this.finalResult;
    }

    public Boolean checkIfHit(Integer totalPlayerAttack, Integer totalTargetDefense) {
        if (totalPlayerAttack > totalTargetDefense)
            return true;
        return false;
    }
}
