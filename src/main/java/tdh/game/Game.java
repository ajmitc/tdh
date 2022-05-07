package tdh.game;

public class Game {
    private Deck<TimeCard> timeCardDeck = new Deck<>();
    private Deck<Apocalypse> apocalypseDeck = new Deck<>();
    private int timeMachineHealth = 8;

    public Game(){
        // Medieval Era
        timeCardDeck.add(new TimeCard("King's Weakness", Era.MEDIEVAL, "Kings_Weakness.jpg", TimeSymbol.CROSSED_SWORDS_RED, TimeSymbol.BUTTONS_RED, TimeSymbol.CROSS_RED));
        // Ability: You don't have to discard cards during the Cache Action
        timeCardDeck.add(new TimeCard("Knight's Templar", Era.MEDIEVAL, "Knights_Templar.jpg", TimeSymbol.CROSSED_SWORDS_BLACK));

        // Great War Era
        timeCardDeck.add(new TimeCard("Sea Mines", Era.GREAT_WAR, "Sea_Mines.jpg", TimeSymbol.BUTTONS_RED, TimeSymbol.FOREST_RED));
        timeCardDeck.add(new TimeCard("One Less Ace", Era.GREAT_WAR, "One_Less_Ace.jpg", TimeSymbol.CROSSED_SWORDS_RED, TimeSymbol.FOREST_RED));
        timeCardDeck.add(new TimeCard("Overrun", Era.GREAT_WAR, "Overrun.jpg", TimeSymbol.CROSS_RED, TimeSymbol.ON_OFF_RED));

        // Lunar Era
        timeCardDeck.add(new TimeCard("Holographic Dictator", Era.LUNAR, "Holographic_Dictator.jpg", TimeSymbol.CROSS_RED));
        // Ability: Traveler gains 3x fists.  Discard this card after it is used in an event.
        timeCardDeck.add(new TimeCard("Lunar Pistol", Era.LUNAR, "Lunar_Pistol.jpg", TimeSymbol.CROSSED_SWORDS_BLACK, TimeSymbol.BUTTONS_BLACK, TimeSymbol.CROSS_BLACK));
        timeCardDeck.add(new TimeCard("EMP Terrorism", Era.LUNAR, "EMP_Terrorism.jpg", TimeSymbol.ON_OFF_RED));
        // Ability: Traveler gains 3x Lights.  Discard this card after it is used in an event.
        timeCardDeck.add(new TimeCard("Lunar Eye", Era.LUNAR, "Lunar_Eye.jpg", TimeSymbol.CROSSED_SWORDS_BLACK, TimeSymbol.ON_OFF_BLACK, TimeSymbol.CROSS_BLACK));

        // Apocalypses
        apocalypseDeck.add(new Apocalypse("Monster", "Monster.jpg", TimeSymbol.FOREST_RED, TimeSymbol.FOREST_RED, TimeSymbol.FOREST_RED));
        apocalypseDeck.add(new Apocalypse("Radioactive", "Monster.jpg", TimeSymbol.FOREST_RED, TimeSymbol.FOREST_RED, TimeSymbol.FOREST_RED));
    }

    public Deck<TimeCard> getTimeCardDeck() {
        return timeCardDeck;
    }

    public int getTimeMachineHealth() {
        return timeMachineHealth;
    }

    public void setTimeMachineHealth(int timeMachineHealth) {
        this.timeMachineHealth = timeMachineHealth;
    }

    public void adjTimeMachineHealth(int amount) {
        this.timeMachineHealth += amount;
    }
}
