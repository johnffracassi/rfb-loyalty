package com.rfb.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RfbEventAttendance.class)
public abstract class RfbEventAttendance_ {

	public static volatile SingularAttribute<RfbEventAttendance, Long> id;
	public static volatile SingularAttribute<RfbEventAttendance, RfbUser> rfbUser;
	public static volatile SingularAttribute<RfbEventAttendance, RfbEvent> rfbEvent;
	public static volatile SingularAttribute<RfbEventAttendance, LocalDate> attendanceDate;

}

