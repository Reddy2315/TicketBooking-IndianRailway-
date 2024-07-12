package com.wipro.TicketBooking_IndianRailway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingInfoDto {
    private int bookingId;
    private int trainNumber;
    private int passengerId;

    public BookingInfoDto(int bookingId, int trainNumber, int id, String name, String email, String pnrNumber) {

    }
}
