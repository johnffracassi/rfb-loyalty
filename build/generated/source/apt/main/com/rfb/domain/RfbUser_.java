package com.rfb.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RfbUser.class)
public abstract class RfbUser_ {

	public static volatile SingularAttribute<RfbUser, RfbLocation> homeLocation;
	public static volatile SetAttribute<RfbUser, RfbEventAttendance> rfbEventAttendances;
	public static volatile SingularAttribute<RfbUser, Long> id;
	public static volatile SingularAttribute<RfbUser, String> username;

}

