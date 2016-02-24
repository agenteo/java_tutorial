package com.wetaxiyou;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ReservationConfig.class)
public class ReservationHandlerTest {
    @Autowired
    private ConfirmedReservationUpdater confirmedReservationUpdater;

    @Test
    public void updaterShouldNotBeNull(){
        Quote quote = new Quote(100, 11);
        assertEquals(true, confirmedReservationUpdater.recalculateQuote(quote));
    }

}
