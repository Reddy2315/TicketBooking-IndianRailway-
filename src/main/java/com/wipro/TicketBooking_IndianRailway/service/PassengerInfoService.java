package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.PassengerInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.PassengerInfo;

import java.util.List;

public interface PassengerInfoService {
    PassengerInfo convertToEntity(PassengerInfoDto passengerInfoDto);
    PassengerInfoDto convertToDto(PassengerInfo passengerInfo);
    PassengerInfo savePassengerInfo(PassengerInfo passengerInfo);

    List<PassengerInfoDto> getAllPassengersInfo();
}
