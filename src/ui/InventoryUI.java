package ui;

import model.Inventory;

import java.util.Scanner;

public class InventoryUI {
    InventoryUI() {
        Inventory inv = new Inventory();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            processInput(input.next());
        }
    }

    private void displayMenu() {
        System.out.println("Menu");
    }

    private void processInput(String input) {
        System.out.println("Process input");
    }

}
