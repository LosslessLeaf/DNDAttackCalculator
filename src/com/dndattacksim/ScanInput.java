package com.dndattacksim;
import java.util.Scanner;
import java.util.ArrayList;

public class ScanInput {

    public ScanInput() {
    }

    public String getPlayerName() {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Player Name: " + playerName);
        return playerName;
    }

    public void pressEnter() {
        System.out.println("Press Enter to continue...");
        try{System.in.read();}
        catch(Exception e){}
    }

    public String getPlayerDamageDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your damage dice (Ex: 2d4 | 1d10):");
        return scanner.nextLine();
    }

    public Integer getPlayerAttackModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your attack modifier: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Integer getTargetArmorClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target's armor class: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public Integer getTargetDefenseModifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target's defense modifier: ");
        return Integer.parseInt(scanner.nextLine());
    }

}
