package com.next.app.api.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "business_hyemin")
@Data
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String businessNumber;

    @Column
    private String companyName;

    @Column
    private String representativeName;

    @Column
    private String contactEmail;

    @Column
    private String contactPhone;

    @Column
    private String address;

    @Column
    private LocalDate registeredAt;

    public Business() {
    }

    public Business(Long id, String businessNumber, String companyName, String representativeName, String contactEmail, String contactPhone, String address, LocalDate registeredAt) {
        this.id = id;
        this.businessNumber = businessNumber;
        this.companyName = companyName;
        this.representativeName = representativeName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
        this.registeredAt = registeredAt;
    }

}
