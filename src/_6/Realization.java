package _6;

class Car extends Transport {
    @Override
    protected void drive() {
        System.out.println("Автомобиль движется по дороге.");
    }
}

class Bicycle extends Transport {
    @Override
    protected void drive() {
        System.out.println("Велосипед движется по велодорожке.");
    }
}

class Train extends Transport {
    @Override
    protected void drive() {
        System.out.println("Поезд движется по рельсам.");
    }
}
