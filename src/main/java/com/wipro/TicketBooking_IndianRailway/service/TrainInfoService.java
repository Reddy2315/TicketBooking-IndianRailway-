package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.TrainInfoDto;

import java.util.List;

public interface TrainInfoService {
    TrainInfoDto saveTrainInfo(TrainInfoDto trainInfoDto);
    List<TrainInfoDto> getAllTrainInfo();
}
