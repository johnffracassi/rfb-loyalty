package com.rfb.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RfbLocation.class)
public abstract class RfbLocation_ {

	public static volatile SingularAttribute<RfbLocation, String> locationName;
	public static volatile SetAttribute<RfbLocation, RfbEvent> rvbEvents;
	public static volatile SingularAttribute<RfbLocation, Integer> runDayOfWeek;
	public static volatile SingularAttribute<RfbLocation, Long> id;

}

