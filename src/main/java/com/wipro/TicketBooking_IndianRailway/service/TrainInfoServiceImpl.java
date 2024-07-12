package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.TrainInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.TrainInfo;
import com.wipro.TicketBooking_IndianRailway.repository.TrainInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainInfoServiceImpl implements TrainInfoService {

    @Autowired
    private TrainInfoRepository trainInfoRepository;

    public TrainInfoDto saveTrainInfo(TrainInfoDto trainInfoDto) {
        TrainInfo trainInfo = new TrainInfo(
                trainInfoDto.getTrainNumber(),
                trainInfoDto.getTrainName(),
                trainInfoDto.getSource(),
                trainInfoDto.getDestination(),
                trainInfoDto.getDepartureTime(),
                trainInfoDto.getArrivalTime(),
                trainInfoDto.getStatus(),
                trainInfoDto.getFare(),
                trainInfoDto.getDuration(),
                trainInfoDto.getClassType(),
                trainInfoDto.getDistance()
        );
        trainInfoRepository.save(trainInfo);
        return trainInfoDto;
    }

    public List<TrainInfoDto> getAllTrainInfo() {
        return trainInfoRepository.findAll().stream().map(trainInfo -> new TrainInfoDto(
                trainInfo.getTrainNumber(),
                trainInfo.getTrainName(),
                trainInfo.getSource(),
                trainInfo.getDestination(),
                trainInfo.getDepartureTime(),
                trainInfo.getArrivalTime(),
                trainInfo.getStatus(),
                trainInfo.getFare(),
                trainInfo.getDuration(),
                trainInfo.getClassType(),
                trainInfo.getDistance()
        )).collect(Collectors.toList());
    }
}

