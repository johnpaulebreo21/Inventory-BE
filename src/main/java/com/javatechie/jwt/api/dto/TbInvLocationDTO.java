package com.javatechie.jwt.api.dto;

public class TbInvLocationDTO extends AbstractDTO<Long> {
    
    private Long id;
    private String locationName;
    private byte status;

    public TbInvLocationDTO() {
    }

    

    

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getStatus() {
        return this.status;
    }
}