package com.swgquerydsljwt.sample.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSensor is a Querydsl query type for Sensor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSensor extends EntityPathBase<Sensor> {

    private static final long serialVersionUID = 993374035L;

    public static final QSensor sensor = new QSensor("sensor");

    public final StringPath code = createString("code");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public QSensor(String variable) {
        super(Sensor.class, forVariable(variable));
    }

    public QSensor(Path<? extends Sensor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSensor(PathMetadata metadata) {
        super(Sensor.class, metadata);
    }

}

