package tdh.game;

public abstract class Card {
    private CardType type;

    public Card(CardType type){
        this.type = type;
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }
}
