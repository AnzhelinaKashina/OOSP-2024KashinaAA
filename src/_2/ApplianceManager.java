package _2;

public class ApplianceManager {
    private final ApplianceFactory factory;

    public ApplianceManager(ApplianceFactory factory) {
        this.factory = factory;
    }

    public void operateRefrigerator() {
        Appliance refrigerator = factory.createRefrigerator();
        refrigerator.operate();
    }

    public void operateWashingMachine() {
        Appliance washingMachine = factory.createWashingMachine();
        washingMachine.operate();
    }

    public void operateMicrowave() {
        Appliance microwave = factory.createMicrowave();
        microwave.operate();
    }
}
