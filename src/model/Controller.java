package model;

import db.material.MaterialData;
import db.material.Material;
import db.roofing.RoofData;
import db.roofing.Roof;
import db.territory.TerrainData;
import db.territory.Terrain;
import ui.UIConsole;
import ui.UserInterface;

public class Controller {
    Resource res = new Res();      //!!!!!!!!!!!!
    UserInterface ui = new UIConsole(res);
    TerrainData terrainData = new Terrain(res);
    RoofData roofData = new Roof(res);
    MaterialData materialData = new Material(res);


    FasteningCalc fasteningCalc = new FasteningCalc();


    public void start() {
        System.out.println("start");
    }
}
