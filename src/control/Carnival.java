package control;

import attractions.*;
import attractions.general.Attraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Carnival {
    private final ArrayList<Attraction> attractions = new ArrayList<>();

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
        System.out.println("Q: quit");
        Scanner input = new Scanner(System.in);
        System.out.print("Choose action: ");
        String command = input.nextLine();
        if (command.equalsIgnoreCase("q")) {
            active = false;
            System.out.println("Quitting program.");
            return;
        }
        try {
            int selected = Integer.parseInt(command);
            attractions.get(selected - 1).run();
        } catch (Exception e) {
            System.out.println("Unrecognized command");
            processInput();
        }
    }

}
