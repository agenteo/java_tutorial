package com.wetaxiyou;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationHandler {
    @Autowired
    private ConfirmedReservationUpdater confirmedReservationUpdater;

    public boolean run(){
        Quote quote = new Quote(100, 1);
        return confirmedReservationUpdater.recalculateQuote(quote);
    }
}
