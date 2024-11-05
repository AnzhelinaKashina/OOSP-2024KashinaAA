package _4;
public class GraphicsApplication {
    private GraphicsAPI graphicsAPI;

    public void setGraphicsAPI(GraphicsAPI graphicsAPI) {
        this.graphicsAPI = graphicsAPI;
    }

    public void run() {
        if (graphicsAPI == null) {
            throw new IllegalStateException("Графический API не установлен.");
        }
        graphicsAPI.initialize();
        graphicsAPI.render();
        graphicsAPI.cleanup();
    }
}
