package demo.extend;

import java.util.ArrayList;
import java.util.List;

public class Music {
    public static void main(String[] args) {
        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new Wind());
        instruments.add(new Guitar());
        for(Instrument instrument:instruments){
            instrument.play();
        }
    }
}

class Instrument{
    public void play(){
        System.out.println("Instrument is playing...");
    }
}

class Wind extends Instrument{
    @Override
    public void play() {
        System.out.println("Wind is playing...");
    }
}

class Guitar extends Instrument{
    @Override
    public void play() {
        System.out.println("Guitar is playing...");
    }
}

