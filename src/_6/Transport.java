package _6;

abstract class Transport {
    public final void move() {
        startEngine();
        drive();
        stopEngine();
    }

    protected abstract void drive();

    private void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    private void stopEngine() {
        System.out.println("Двигатель остановлен.");
    }
}

