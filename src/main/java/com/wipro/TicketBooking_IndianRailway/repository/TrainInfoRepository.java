package com.wipro.TicketBooking_IndianRailway.repository;

import com.wipro.TicketBooking_IndianRailway.model.TrainInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainInfoRepository extends JpaRepository<TrainInfo, Integer> {
}
