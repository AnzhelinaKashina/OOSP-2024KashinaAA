package _4;

public class Main {
    public static void main(String[] args) {
        GraphicsApplication app = new GraphicsApplication();

        app.setGraphicsAPI(new OpenGL());
        app.run();

        app.setGraphicsAPI(new DirectX());
        app.run();

        app.setGraphicsAPI(new Vulkan());
        app.run();
    }
}
