package com.wipro.TicketBooking_IndianRailway.service;

import com.wipro.TicketBooking_IndianRailway.dto.BookingInfoDto;
import com.wipro.TicketBooking_IndianRailway.model.BookingInfo;

import java.util.List;

public interface BookingInfoService {
    BookingInfo saveBookingInfo(BookingInfoDto bookingInfoDto);

    List<BookingInfoDto> getAllTicketBookings();
}
