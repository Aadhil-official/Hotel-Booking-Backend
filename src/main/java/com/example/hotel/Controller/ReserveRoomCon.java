package com.example.hotel.Controller;

import com.example.hotel.Entity.ReserveRoom;
import com.example.hotel.Services.ReserveRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class ReserveRoomCon {

    private final ReserveRoomService reserveRoomService;


    public ReserveRoomCon(ReserveRoomService reserveRoomService) {
        this.reserveRoomService = reserveRoomService;
    }

    @PostMapping("/addRoomReservetion")
    public ReserveRoom addReserveRoom(@RequestBody ReserveRoom reserveRoom){
        return reserveRoomService.addReservation(reserveRoom);
    }
}
