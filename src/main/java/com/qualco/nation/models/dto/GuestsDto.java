package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.Guests;

import java.io.Serializable;

/**
 * DTO for {@link Guests}
 */
public class GuestsDto implements Serializable {
    private final int guestId;
    private final String name;

    public GuestsDto(int guestId, String name) {
        this.guestId = guestId;
        this.name = name;
    }

    public int getGuestId() {
        return guestId;
    }

    public String getName() {
        return name;
    }
}