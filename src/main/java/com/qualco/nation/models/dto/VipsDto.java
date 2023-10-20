package com.qualco.nation.models.dto;

import com.qualco.nation.models.entities.Vips;

import java.io.Serializable;

/**
 * DTO for {@link Vips}
 */
public class VipsDto implements Serializable {
    private final int vipId;
    private final String name;

    public VipsDto(int vipId, String name) {
        this.vipId = vipId;
        this.name = name;
    }

    public int getVipId() {
        return vipId;
    }

    public String getName() {
        return name;
    }
}