package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.BookingInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.BookingInfo;
import com.wipro.TicketBooking_IndianRailway.model.PassengerInfo;
import com.wipro.TicketBooking_IndianRailway.model.TrainInfo;
import com.wipro.TicketBooking_IndianRailway.repository.BookingInfoRepository;
import com.wipro.TicketBooking_IndianRailway.repository.PassengerInfoRepository;
import com.wipro.TicketBooking_IndianRailway.repository.TrainInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingInfoServiceImpl implements BookingInfoService {

    @Autowired
    private BookingInfoRepository bookingInfoRepository;

    @Autowired
    private TrainInfoRepository trainInfoRepository;

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Override
    public BookingInfo saveBookingInfo(BookingInfoDto bookingInfoDto) {
        TrainInfo trainInfo = trainInfoRepository.findById(bookingInfoDto.getTrainNumber())
                .orElseThrow(() -> new RuntimeException("Train not found"));
        PassengerInfo passengerInfo = passengerInfoRepository.findById(bookingInfoDto.getPassengerId())
                .orElseThrow(() -> new RuntimeException("Passenger not found"));

        BookingInfo bookingInfo = new BookingInfo();
        bookingInfo.setTrainInfo(trainInfo);
        bookingInfo.setPassengerInfo(passengerInfo);
        return bookingInfoRepository.save(bookingInfo);
    }

    @Override
    public List<BookingInfoDto> getAllTicketBookings() {
        return bookingInfoRepository.findAll().stream().map(this::convertToBookingInfoDto).collect(Collectors.toList());
    }

    private BookingInfoDto convertToBookingInfoDto(BookingInfo bookingInfo) {
        return new BookingInfoDto(
                bookingInfo.getBookingId(),
                bookingInfo.getTrainInfo().getTrainNumber(),
                bookingInfo.getPassengerInfo().getId()
        );
    }
}

