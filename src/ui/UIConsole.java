package ui;

import model.Resource;

import java.util.Scanner;

public class UIConsole implements UserInterface{
    Resource resource;

    public UIConsole(Resource resource) {
        this.resource = resource;
    }

    @Override
    public int showMainMenu() {
        return 0;
    }

    @Override
    public int showResultsMenu() {
        return 0;
    }

    @Override
    public int setTerrainType() {
        return 0;
    }

    @Override
    public double setHeight() {
        return 0;
    }

    @Override
    public int setRoofType() {
        return 0;
    }
}
