package _1;

import java.util.ArrayList;
import java.util.List;

public class MusicComposition {
    private List<Instrument> instruments = new ArrayList<>();

    public void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public void playComposition() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
