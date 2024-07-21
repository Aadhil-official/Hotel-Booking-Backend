package com.example.hotel.Services;

import com.example.hotel.Entity.ReserveRoom;
import com.example.hotel.Repository.ReserveRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveRoomService {

    private final ReserveRoomRepo reserveRoomRepo;

    public ReserveRoomService(ReserveRoomRepo reserveRoomRepo) {
        this.reserveRoomRepo = reserveRoomRepo;
    }

    public ReserveRoom addReservation(ReserveRoom reserveRoom){
        return reserveRoomRepo.save(reserveRoom);
    }

//    public
}
