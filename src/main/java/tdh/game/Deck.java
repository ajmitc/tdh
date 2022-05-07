package tdh.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck<T extends Card> {
    private List<T> cards = new ArrayList<>();
    private List<T> discardPile = new ArrayList<>();

    public Deck(){

    }

    public T draw(){
        if (cards.isEmpty()){
            shuffleDiscardPile();
        }
        return cards.remove(0);
    }

    public T peek(){
        if (cards.isEmpty()){
            shuffleDiscardPile();
        }
        return cards.get(0);
    }

    public void discard(T card){
        discardPile.add(card);
    }

    public void shuffleDiscardPile(){
        cards.addAll(discardPile);
        discardPile.clear();
        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void add(T card){
        cards.add(card);
    }
}
