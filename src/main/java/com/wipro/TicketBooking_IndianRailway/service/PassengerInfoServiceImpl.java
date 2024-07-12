package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.PassengerInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.PassengerInfo;
import com.wipro.TicketBooking_IndianRailway.repository.PassengerInfoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PassengerInfoServiceImpl implements PassengerInfoService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PassengerInfo convertToEntity(PassengerInfoDto passengerInfoDto) {
        return modelMapper.map(passengerInfoDto, PassengerInfo.class);
    }

    @Override
    public PassengerInfoDto convertToDto(PassengerInfo passengerInfo) {
        return modelMapper.map(passengerInfo, PassengerInfoDto.class);
    }

    @Override
    public PassengerInfo savePassengerInfo(PassengerInfo passengerInfo) {
        return passengerInfoRepository.save(passengerInfo);
    }


    @Override
    public List<PassengerInfoDto> getAllPassengersInfo() {
        return passengerInfoRepository.findAll().stream()
                .map(this::convertToPassengerInfoDto)
                .collect(Collectors.toList());
    }

    private PassengerInfoDto convertToPassengerInfoDto(PassengerInfo passengerInfo) {
        return new PassengerInfoDto(
                passengerInfo.getId(),
                passengerInfo.getName(),
                passengerInfo.getEmail(),
                passengerInfo.getPassword(),
                passengerInfo.getGender(),
                passengerInfo.getAge(),
                passengerInfo.getPhoneNumber(),
                passengerInfo.getAddress(),
                passengerInfo.getPnrNumber()
        );
    }
}
