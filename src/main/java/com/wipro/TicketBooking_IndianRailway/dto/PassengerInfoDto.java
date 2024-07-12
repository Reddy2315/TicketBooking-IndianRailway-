package com.wipro.TicketBooking_IndianRailway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassengerInfoDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private int age;
    private String phoneNumber;
    private String address;
    private String pnrNumber;
}
