package com.example.hotel.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roomForm")
public class ReserveRoom {
    @Id
    @GeneratedValue
    private String id;

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "Must be date format")
    private String checkInDate;

    @NotBlank
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}",message = "Must be date format")
    private String checkOutDate;

    @NotBlank
    @Min(value = 1,message = "Must be 1 or more")
    @Pattern(regexp = "\\d+",message = "Must be number format")
    private String adults;

    @NotBlank
    @Min(value = 1,message = "Must be 1 or more")
    @Pattern(regexp = "\\d+",message = "Must be number format")
    private String children;
}
