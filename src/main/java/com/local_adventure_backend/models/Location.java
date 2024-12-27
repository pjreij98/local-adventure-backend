package com.local_adventure_backend.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "locations")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double latitude;
    private Double longitude;
}
