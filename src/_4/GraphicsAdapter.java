package _4;


public class GraphicsAdapter implements GraphicsAPI {
    private final GraphicsAPI graphicsAPI;

    public GraphicsAdapter(GraphicsAPI graphicsAPI) {
        this.graphicsAPI = graphicsAPI;
    }

    @Override
    public void initialize() {
        graphicsAPI.initialize();
    }

    @Override
    public void render() {
        graphicsAPI.render();
    }

    @Override
    public void cleanup() {
        graphicsAPI.cleanup();
    }
}
