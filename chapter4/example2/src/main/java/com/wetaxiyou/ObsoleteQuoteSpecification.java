package com.wetaxiyou;

import org.springframework.stereotype.Component;

@Component
public class ObsoleteQuoteSpecification {
    public boolean isSatisfied(Quote candidateQuote){
        if (candidateQuote.amount > 0 && candidateQuote.age > 10){
            return true;
        }
        return false;
    }
}
