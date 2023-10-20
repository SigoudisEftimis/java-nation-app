package com.qualco.nation.models.entities;

import jakarta.persistence.*;

@Entity
public class Vips {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vip_id", nullable = false)
    private int vipId;
    @Basic
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    public int getVipId() {
        return vipId;
    }

    public void setVipId(int vipId) {
        this.vipId = vipId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
