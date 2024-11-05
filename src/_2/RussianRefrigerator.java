package _2;

public class RussianRefrigerator implements Appliance {
    @Override
    public void operate() {
        System.out.println("Русский холодильник работает.");
    }
}

class RussianWashingMachine implements Appliance {
    @Override
    public void operate() {
        System.out.println("Русская стиральная машина работает.");
    }
}

class RussianMicrowave implements Appliance {
    @Override
    public void operate() {
        System.out.println("Русская микроволновая печь работает.");
    }
}
