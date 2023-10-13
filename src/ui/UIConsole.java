package ui;

import java.util.Scanner;

public class UIConsole implements UserInterface{

    Scanner in = new Scanner(System.in);

    @Override
    public int territoryTypeRequest() {
        System.out.println("Введите тип территории:(от 1 до 4)");
        int territoryType = in.nextInt();
        return territoryType;
    }

    @Override
    public double heightRequest() {
        System.out.println("Введите отметку верха кровли:(до 200)");
        double height = in.nextDouble();
        return height;
    }

    @Override
    public int roofTypeRequest() {
        System.out.println("Введите тип кровли:(от 1 до 1)");
        int roofType = in.nextInt();
        return roofType;
    }
}
