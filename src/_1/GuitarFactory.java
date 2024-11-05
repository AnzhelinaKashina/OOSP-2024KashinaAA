package _1;

public class GuitarFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Guitar();
    }
}
