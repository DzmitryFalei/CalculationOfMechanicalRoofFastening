package trashOldClasses;

public class FasteningCalculation {
    double peakValueOfVelocityPressureQpZ;
    double pressureCoefficientFCpe;
    double tensileStrength;
    double tearResistance;

    double windForce = peakValueOfVelocityPressureQpZ * pressureCoefficientFCpe;
    double numberOfAnchors = windForce / tearResistance; // количество анкеров
    double fasteningPitchForTearResistance = tearResistance / (0.5 * windForce); // шаг крепления от раздира
    double fasteningPitchForTensileStrength = tensileStrength / (1.35 * windForce); // шаг крепления от усилия

    public double getNumberOfAnchors() {
        return numberOfAnchors;
    }
    public double getFasteningPitchForTearResistance() {
        return fasteningPitchForTearResistance;
    }
    public double getFasteningPitchForTensileStrength() {
        return fasteningPitchForTensileStrength;
    }
}
