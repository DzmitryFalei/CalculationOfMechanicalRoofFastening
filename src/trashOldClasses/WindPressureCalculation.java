package trashOldClasses;

public class WindPressureCalculation {
    private double roughnessZo;
    private double heightZ;
    private double windSpeedVb;

    public WindPressureCalculation(double roughnessZo, double heightZ, double windSpeedVb) {
        this.roughnessZo = roughnessZo;
        this.heightZ = heightZ;
        this.windSpeedVb = windSpeedVb;
    }

    private double coefficientKr = 0.19 * Math.pow((roughnessZo / 0.05), 0.07);
    private double coefficientCrZ = coefficientKr * Math.log(heightZ / roughnessZo);
    private double averageWindSpeedVmZ = coefficientCrZ * windSpeedVb;
    private double turbulenceDeflection = coefficientKr * windSpeedVb;
    private double turbulenceIntensityLvZ = turbulenceDeflection / averageWindSpeedVmZ;
    private double peakValueOfVelocityPressureQpZ = (1 + 7 * turbulenceIntensityLvZ) * 0.5 * 1.25 * Math.pow(averageWindSpeedVmZ, 2) * 0.001;

    public double getPeakValueOfVelocityPressureQpZ() {
        return peakValueOfVelocityPressureQpZ;
    }

}
