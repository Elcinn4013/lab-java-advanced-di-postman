package org.example.lab.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class EarlyBirdDiscountService {


    public String calculateDiscount(LocalDate eventDate , LocalDate bookingDate){
        if (bookingDate.isAfter(eventDate)) {
            return "Invalid booking date.";
        }
        long days = eventDate.toEpochDay() - bookingDate.toEpochDay();

        if (days >= 30) {
            return "15% discount";
        }
        return "No discount.";
    }

}
