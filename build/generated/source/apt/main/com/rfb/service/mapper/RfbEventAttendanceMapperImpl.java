package com.rfb.service.mapper;

import com.rfb.domain.RfbEvent;
import com.rfb.domain.RfbEventAttendance;
import com.rfb.domain.RfbUser;
import com.rfb.service.dto.RfbEventAttendanceDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-05-19T14:07:40-0400",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_172 (Azul Systems, Inc.)"
)
@Component
public class RfbEventAttendanceMapperImpl implements RfbEventAttendanceMapper {

    @Autowired
    private RfbEventMapper rfbEventMapper;
    @Autowired
    private RfbUserMapper rfbUserMapper;

    @Override
    public List<RfbEventAttendance> toEntity(List<RfbEventAttendanceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RfbEventAttendance> list = new ArrayList<RfbEventAttendance>( dtoList.size() );
        for ( RfbEventAttendanceDTO rfbEventAttendanceDTO : dtoList ) {
            list.add( toEntity( rfbEventAttendanceDTO ) );
        }

        return list;
    }

    @Override
    public List<RfbEventAttendanceDTO> toDto(List<RfbEventAttendance> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RfbEventAttendanceDTO> list = new ArrayList<RfbEventAttendanceDTO>( entityList.size() );
        for ( RfbEventAttendance rfbEventAttendance : entityList ) {
            list.add( toDto( rfbEventAttendance ) );
        }

        return list;
    }

    @Override
    public RfbEventAttendanceDTO toDto(RfbEventAttendance rfbEventAttendance) {
        if ( rfbEventAttendance == null ) {
            return null;
        }

        RfbEventAttendanceDTO rfbEventAttendanceDTO = new RfbEventAttendanceDTO();

        Long id = rfbEventAttendanceRfbUserId( rfbEventAttendance );
        if ( id != null ) {
            rfbEventAttendanceDTO.setRfbUserId( id );
        }
        Long id1 = rfbEventAttendanceRfbEventId( rfbEventAttendance );
        if ( id1 != null ) {
            rfbEventAttendanceDTO.setRfbEventId( id1 );
        }
        rfbEventAttendanceDTO.setId( rfbEventAttendance.getId() );
        rfbEventAttendanceDTO.setAttendanceDate( rfbEventAttendance.getAttendanceDate() );

        return rfbEventAttendanceDTO;
    }

    @Override
    public RfbEventAttendance toEntity(RfbEventAttendanceDTO rfbEventAttendanceDTO) {
        if ( rfbEventAttendanceDTO == null ) {
            return null;
        }

        RfbEventAttendance rfbEventAttendance = new RfbEventAttendance();

        rfbEventAttendance.setRfbEvent( rfbEventMapper.fromId( rfbEventAttendanceDTO.getRfbEventId() ) );
        rfbEventAttendance.setRfbUser( rfbUserMapper.fromId( rfbEventAttendanceDTO.getRfbUserId() ) );
        rfbEventAttendance.setId( rfbEventAttendanceDTO.getId() );
        rfbEventAttendance.setAttendanceDate( rfbEventAttendanceDTO.getAttendanceDate() );

        return rfbEventAttendance;
    }

    private Long rfbEventAttendanceRfbUserId(RfbEventAttendance rfbEventAttendance) {
        if ( rfbEventAttendance == null ) {
            return null;
        }
        RfbUser rfbUser = rfbEventAttendance.getRfbUser();
        if ( rfbUser == null ) {
            return null;
        }
        Long id = rfbUser.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long rfbEventAttendanceRfbEventId(RfbEventAttendance rfbEventAttendance) {
        if ( rfbEventAttendance == null ) {
            return null;
        }
        RfbEvent rfbEvent = rfbEventAttendance.getRfbEvent();
        if ( rfbEvent == null ) {
            return null;
        }
        Long id = rfbEvent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
