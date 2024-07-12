package com.wipro.TicketBooking_IndianRailway.controller;

import com.wipro.TicketBooking_IndianRailway.dto.BookingInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.BookingInfo;
import com.wipro.TicketBooking_IndianRailway.service.BookingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/indianrailway")
public class BookingInfoController {

    @Autowired
    private BookingInfoService bookingInfoService;

    @PostMapping("/bookticket")
    public ResponseEntity<BookingInfo> saveTicketBooking(@RequestBody BookingInfoDto bookingInfoDto) {
        return ResponseEntity.ok(bookingInfoService.saveBookingInfo(bookingInfoDto));
    }

    @GetMapping("/allticketbookings")
    public ResponseEntity<List<BookingInfoDto>> getAllTicketBookings() {
        return ResponseEntity.ok(bookingInfoService.getAllTicketBookings());
    }
}
