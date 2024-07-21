package com.example.hotel.Controller;

import com.example.hotel.Entity.ReserveRoom;
import com.example.hotel.Services.ReserveRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class ReserveRoomCon {

    private final ReserveRoomService reserveRoomService;


    public ReserveRoomCon(ReserveRoomService reserveRoomService) {
        this.reserveRoomService = reserveRoomService;
    }

    public ReserveRoom addReserveRoom(@RequestBody ReserveRoom reserveRoom){
        return reserveRoomService.addReservation(reserveRoom);
    }
}
