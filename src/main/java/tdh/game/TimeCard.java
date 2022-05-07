package tdh.game;

import tdh.view.ImageUtil;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

public class TimeCard extends Card{
    private String name;
    private Era era;
    private Image image;
    private List<TimeSymbol> timeSymbols = new ArrayList<>();

    public TimeCard(String name, Era era, String filename, TimeSymbol ... symbols){
        super(CardType.TIME);
        this.name = name;
        this.era = era;
        image = ImageUtil.get(filename);
        for (TimeSymbol symbol: symbols){
            this.timeSymbols.add(symbol);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Era getEra() {
        return era;
    }

    public void setEra(Era era) {
        this.era = era;
    }

    public Image getImage() {
        return image;
    }

    public List<TimeSymbol> getTimeSymbols() {
        return timeSymbols;
    }
}
