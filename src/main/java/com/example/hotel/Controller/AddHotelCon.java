package com.example.hotel.Controller;

import com.example.hotel.Entity.AddHotel;
import com.example.hotel.Services.AddHotelSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("api/auth")
public class AddHotelCon {

    private final AddHotelSer addHotelSer;

    public AddHotelCon(AddHotelSer addHotelSer) {
        this.addHotelSer = addHotelSer;
    }

    @PostMapping("/addNewHotel")
    public AddHotel addNewHotel(@RequestBody AddHotel addHotel){
        return addHotelSer.addNewHotel(addHotel);
    }
}
