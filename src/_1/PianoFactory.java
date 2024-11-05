package _1;

public class PianoFactory extends InstrumentFactory {
    @Override
    public Instrument createInstrument() {
        return new Piano();
    }
}
