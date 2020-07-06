package com.example.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private static final Logger Log = LoggerFactory.getLogger(TicketController.class);

    @GetMapping("/appName")
    public String getName(){
        return "Hello User! Welcome to Bus Ticketing System";
    }

//    @RequestMapping(value="/seats",method = RequestMethod.POST)
//    public String seatSelection(@RequestBody @Valid TicketOrder ticketOrder){
//        Log.info("User selected seat "+ticketOrder.seatNumber);
//        return "Seat is booked for ID : "+ticketOrder.ticketId;
//    }
}