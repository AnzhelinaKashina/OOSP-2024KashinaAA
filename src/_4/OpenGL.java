package _4;

public class OpenGL implements GraphicsAPI {
    @Override
    public void initialize() {
        System.out.println("Инициализация OpenGL");
    }

    @Override
    public void render() {
        System.out.println("Рендеринг с помощью  OpenGL");
    }

    @Override
    public void cleanup() {
        System.out.println("Очистка OpenGL");
    }
}
