package _1;

public class ViolinFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Violin();
    }
}
