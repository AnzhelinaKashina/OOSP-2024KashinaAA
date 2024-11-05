package _1;

public class Main {
    public static void main(String[] args) {
        MusicComposition composition = new MusicComposition();

        InstrumentFactory guitarFactory = new GuitarFactory();
        InstrumentFactory pianoFactory = new PianoFactory();
        InstrumentFactory violinFactory = new ViolinFactory();

        composition.addInstrument(guitarFactory.createInstrument());
        composition.addInstrument(pianoFactory.createInstrument());
        composition.addInstrument(violinFactory.createInstrument());

        composition.playComposition();
    }
}
