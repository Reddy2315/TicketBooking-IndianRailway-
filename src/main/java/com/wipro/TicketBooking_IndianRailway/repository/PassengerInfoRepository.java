package com.wipro.TicketBooking_IndianRailway.repository;

import com.wipro.TicketBooking_IndianRailway.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Integer> {
}
