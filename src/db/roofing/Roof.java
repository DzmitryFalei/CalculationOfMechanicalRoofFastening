package db.roofing;

import model.Resource;

public class Roof implements RoofData {

    public Roof(Resource res) {
    }

    @Override
    public double getPressureCoefficientFCpe1(int IdRoofType) {
        return 0;
    }

    @Override
    public double getPressureCoefficientGCpe1(int IdRoofType) {
        return 0;
    }

    @Override
    public double getPressureCoefficientHCpe1(int IdRoofType) {
        return 0;
    }

    @Override
    public double getPressureCoefficientICpe1(int IdRoofType) {
        return 0;
    }
}
