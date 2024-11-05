package _2;

public class Main {
    public static void main(String[] args) {
        ApplianceManager russianManager = new ApplianceManager(new RussianApplianceFactory());
        russianManager.operateRefrigerator();
        russianManager.operateWashingMachine();
        russianManager.operateMicrowave();

        ApplianceManager chineseManager = new ApplianceManager(new ChineseApplianceFactory());
        chineseManager.operateRefrigerator();
        chineseManager.operateWashingMachine();
        chineseManager.operateMicrowave();
    }
}
