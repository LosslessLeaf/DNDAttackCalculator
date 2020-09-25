package com.dndattacksim;

public class AttackSim {

    public AttackSim() {
        // start scan input
        welcomePlayer();
        PlayerCharacter pc = new PlayerCharacter();
        AttackTarget atkTar = new AttackTarget();

        showPlayerStats(pc);

        showTargetStats(atkTar);

        calculateDamage(pc, atkTar);
    }

    public void welcomePlayer() {
        ScanInput scanInput = new ScanInput();
        System.out.println("Thank you for using DND Attack Sim!");
        scanInput.pressEnter();
    }

    public void showPlayerStats(PlayerCharacter pc) {
        // Player character
        System.out.println("Player: ");
        // show damage dice
        System.out.println("Die count: " + pc.getDieCount() + " Die sides: " + pc.getDieSides());
        // show attack mod
        System.out.println("Attack modifier: " + pc.getAttackModifier());
    }

    public void showTargetStats(AttackTarget atkTar) {
        // Target
        System.out.println("Target: ");
        // show armor class
        System.out.println("Armor Class: " + atkTar.getArmorClass());
        // Show defense mod
        System.out.println("Defense modifier: " + atkTar.getDefenseModifier());
    }

    public void calculateDamage(PlayerCharacter pc, AttackTarget atkTar) {
        // return results
        CalculateDamage damage = new CalculateDamage(pc, atkTar);

        System.out.println(damage.getFinalResult());
    }

}
