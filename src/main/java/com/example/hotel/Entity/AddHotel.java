package com.example.hotel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "industryHotels")
public class AddHotel {
    @Id
    @GeneratedValue
    private String id;

    @NotBlank
    private String hotelName;

//    ------img
    @NotBlank
    private String fileName;

    @NotBlank
    private String filePath;

//    -----------img end


}
