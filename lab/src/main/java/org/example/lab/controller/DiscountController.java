package org.example.lab.controller;

import jakarta.websocket.server.PathParam;
import org.example.lab.service.EarlyBirdDiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api")
public class DiscountController {
private final EarlyBirdDiscountService earlyBirdDiscountService;

    public DiscountController(EarlyBirdDiscountService earlyBirdDiscountService) {
        this.earlyBirdDiscountService = earlyBirdDiscountService;
    }

    @GetMapping("/discount")
    public String getDiscount( @RequestParam LocalDate eventDate,
                               @RequestParam LocalDate bookingDate){

        return earlyBirdDiscountService.calculateDiscount(eventDate,bookingDate);
    }

}
