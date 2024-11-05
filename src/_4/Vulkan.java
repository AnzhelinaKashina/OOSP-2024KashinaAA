package _4;

public class Vulkan implements GraphicsAPI {
    @Override
    public void initialize() {
        System.out.println("Инициализация Vulkan");
    }

    @Override
    public void render() {
        System.out.println("Рендеринг с помощью Vulkan");
    }

    @Override
    public void cleanup() {
        System.out.println("Очистка Vulkan");
    }
}
