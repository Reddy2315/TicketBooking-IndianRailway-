package com.wipro.TicketBooking_IndianRailway.controller;

import com.wipro.TicketBooking_IndianRailway.dto.TrainInfoDto;
import com.wipro.TicketBooking_IndianRailway.service.TrainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indianrailway")
public class TrainInfoController {

    @Autowired
    private TrainInfoService trainInfoService;

    @PostMapping("/addtrain")
    public ResponseEntity<TrainInfoDto> saveTrainInfo(@RequestBody TrainInfoDto trainInfoDto) {
        return ResponseEntity.ok(trainInfoService.saveTrainInfo(trainInfoDto));
    }

    @GetMapping("/alltrainsinfo")
    public ResponseEntity<List<TrainInfoDto>> getAllTrainInfo() {
        return ResponseEntity.ok(trainInfoService.getAllTrainInfo());
    }
}

