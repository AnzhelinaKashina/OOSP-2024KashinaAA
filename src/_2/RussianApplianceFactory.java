package _2;
public class RussianApplianceFactory implements ApplianceFactory {
    @Override
    public Appliance createRefrigerator() {
        return new RussianRefrigerator();
    }

    @Override
    public Appliance createWashingMachine() {
        return new RussianWashingMachine();
    }

    @Override
    public Appliance createMicrowave() {
        return new RussianMicrowave();
    }
}
