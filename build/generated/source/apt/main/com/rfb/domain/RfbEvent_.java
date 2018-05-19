package com.rfb.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RfbEvent.class)
public abstract class RfbEvent_ {

	public static volatile SingularAttribute<RfbEvent, String> eventCode;
	public static volatile SingularAttribute<RfbEvent, RfbLocation> rfbLocation;
	public static volatile SetAttribute<RfbEvent, RfbEventAttendance> rfbEventAttendances;
	public static volatile SingularAttribute<RfbEvent, Long> id;
	public static volatile SingularAttribute<RfbEvent, LocalDate> eventDate;

}

