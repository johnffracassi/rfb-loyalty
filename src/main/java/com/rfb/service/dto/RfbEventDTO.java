package com.rfb.service.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the RfbEvent entity.
 */
@Getter
@Setter
public class RfbEventDTO implements Serializable {

    private Long id;

    private LocalDate eventDate;

    private String eventCode;

    private RfbLocationDTO rfbLocationDTO;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RfbEventDTO rfbEventDTO = (RfbEventDTO) o;
        if(rfbEventDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), rfbEventDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "RfbEventDTO{" +
            "id=" + getId() +
            ", eventDate='" + getEventDate() + "'" +
            ", eventCode='" + getEventCode() + "'" +
            "}";
    }
}
