package ir.jaryaan.matchmatch.model.manager;

import android.support.annotation.NonNull;

import java.util.List;

import ir.jaryaan.matchmatch.entities.Card;
import ir.jaryaan.matchmatch.entities.CardImage;

/**
 * Created by E.Mehranvari on 5/13/2017.
 */

public interface GameManagerContract {

    void initialGame(@NonNull List<CardImage> cardImages);

    @Card.CardStatus
    int flip(@NonNull Card card);

    @NonNull
    List<Card> getCards();
}
