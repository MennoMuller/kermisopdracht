package control;

import attractions.*;
import attractions.general.Attraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Carnival {
    private final ArrayList<Attraction> attractions = new ArrayList<>();
    private final CashRegister cashRegister = new CashRegister();

    private boolean active = true;

    public Carnival() {
        attractions.add(new BumperCars());
        attractions.add(new Spider());
        attractions.add(new MirrorPalace());
        attractions.add(new HauntedHouse());
        attractions.add(new Hawaii());
        attractions.add(new LadderClimbing());
    }

    public boolean isActive() {
        return active;
    }

    public void processInput() {
        for (int i = 0; i < attractions.size(); i++) {
            System.out.println(i + 1 + ": " + attractions.get(i).getName());
        }
        System.out.println("O: revenue");
        System.out.println("K: tickets");
        System.out.println("Q: quit");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose action: ");
        String command = input.nextLine();
        if (command.equalsIgnoreCase("q")) {
            active = false;
            System.out.println("Quitting program.");
            return;
        }
        if (command.equalsIgnoreCase("o")) {
            displayRevenue();
            System.out.println("Press enter to continue.");
            input.nextLine();
            return;
        }
        if (command.equalsIgnoreCase("k")) {
            displayTickets();
            System.out.println("Press enter to continue.");
            input.nextLine();
            return;
        }
        try {
            int selected = Integer.parseInt(command);
            Attraction attraction = attractions.get(selected - 1);
            attraction.run();
            cashRegister.addRevenue(attraction.getPrice());
        } catch (Exception e) {
            System.out.println("Unrecognized command");
            processInput();
        }
        System.out.println("Press enter to continue.");
        input.nextLine();
    }

    public void displayRevenue() {
        for (int i = 0; i < attractions.size(); i++) {
            System.out.println(i + 1 + ": " + attractions.get(i).getName() + " $" + attractions.get(i).getRevenue());
        }
        System.out.println("Total: $" + cashRegister.getRevenue());
    }

    public void displayTickets() {
        for (int i = 0; i < attractions.size(); i++) {
            System.out.println(i + 1 + ": " + attractions.get(i).getName() + " " + attractions.get(i).getTickets() + " tickets");
        }
        System.out.println("Total: " + cashRegister.getTickets() + " tickets");
    }
}
