package _2;

public class ChineseApplianceFactory implements ApplianceFactory {
    @Override
    public Appliance createRefrigerator() {
        return new ChineseRefrigerator();
    }

    @Override
    public Appliance createWashingMachine() {
        return new ChineseWashingMachine();
    }

    @Override
    public Appliance createMicrowave() {
        return new ChineseMicrowave();
    }
}
