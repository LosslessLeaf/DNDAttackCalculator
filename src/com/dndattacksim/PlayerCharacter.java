package com.dndattacksim;

public class PlayerCharacter {

    private Integer attackModifier;
    private Integer dieCount;
    private Integer dieSides;

    public PlayerCharacter() {
        setPlayerDamageDice();
        setPlayerAttackModifier();
    }

    public String getPlayerDamageDice() {
        ScanInput scanInput = new ScanInput();
        return scanInput.getPlayerDamageDice();
    }

    public void setPlayerDamageDice() {
        String[] damageDice = getPlayerDamageDice().split("d");

        setPlayerDieCount(Integer.parseInt(damageDice[0]));
        setPlayerDieSides(Integer.parseInt(damageDice[1]));
    }

    public void setPlayerDieCount(Integer dieCount) {
        this.dieCount = dieCount;
    }

    public Integer getDieCount() {
        return this.dieCount;
    }

    public void setPlayerDieSides(Integer dieSides) {
        this.dieSides = dieSides;
    }

    public Integer getDieSides() {
        return this.dieSides;
    }

    public Integer getPlayerAttackModifier() {
        ScanInput scanInput = new ScanInput();
        return scanInput.getPlayerAttackModifier();
    }

    public void setPlayerAttackModifier() {
        this.attackModifier = getPlayerAttackModifier();
    }

    public Integer getAttackModifier() {
        return this.attackModifier;
    }




}
