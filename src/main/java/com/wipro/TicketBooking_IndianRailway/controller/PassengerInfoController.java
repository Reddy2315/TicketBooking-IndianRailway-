package com.wipro.TicketBooking_IndianRailway.controller;

import com.wipro.TicketBooking_IndianRailway.dto.PassengerInfoDto;
import com.wipro.TicketBooking_IndianRailway.dto.TrainInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.PassengerInfo;
import com.wipro.TicketBooking_IndianRailway.service.PassengerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indianrailway")
public class PassengerInfoController {

    private final PassengerInfoService passengerInfoService;

    @Autowired
    public PassengerInfoController(PassengerInfoService passengerInfoService) {
        this.passengerInfoService = passengerInfoService;
    }

    @PostMapping("/addpassenger")
    public ResponseEntity<Object> addPassenger(@RequestBody PassengerInfoDto passengerInfoDto) {
        PassengerInfo passengerInfo = passengerInfoService.convertToEntity(passengerInfoDto);
        passengerInfo = passengerInfoService.savePassengerInfo(passengerInfo);
        PassengerInfoDto savedPassengerDTO = passengerInfoService.convertToDto(passengerInfo);
        return ResponseEntity.ok(savedPassengerDTO);
    }
    @GetMapping("/allpassengersinfo")
    public ResponseEntity<List<PassengerInfoDto>> getAllPassengersInfo() {
        return ResponseEntity.ok(passengerInfoService.getAllPassengersInfo());
    }
}
