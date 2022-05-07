package tdh.game;

import tdh.view.ImageUtil;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Apocalypse extends Card{
    private String name;
    private Image image;
    private List<TimeSymbol> timeSymbols = new ArrayList<>();

    public Apocalypse(String name, String filename, TimeSymbol ... symbols){
        super(CardType.APOCALYPSE);
        this.name = name;
        this.image = ImageUtil.get(filename);
        for (TimeSymbol symbol: symbols) {
            this.timeSymbols.add(symbol);
        }
    }

    public String getName() {
        return name;
    }

    public Image getImage() {
        return image;
    }

    public List<TimeSymbol> getTimeSymbols() {
        return timeSymbols;
    }
}
