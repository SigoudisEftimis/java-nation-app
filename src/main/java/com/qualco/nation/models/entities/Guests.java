package com.qualco.nation.models.entities;

import jakarta.persistence.*;

@Entity
public class Guests {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "guest_id", nullable = false)
    private int guestId;
    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
