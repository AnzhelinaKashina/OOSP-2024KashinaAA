package _2;

public class ChineseRefrigerator implements Appliance {
    @Override
    public void operate() {
        System.out.println("Китайский холодильник работает.");
    }
}

class ChineseWashingMachine implements Appliance {
    @Override
    public void operate() {
        System.out.println("Китайская стиральная машина работает.");
    }
}

class ChineseMicrowave implements Appliance {
    @Override
    public void operate() {
        System.out.println("Китайская микроволновая печь работает.");
    }
}
