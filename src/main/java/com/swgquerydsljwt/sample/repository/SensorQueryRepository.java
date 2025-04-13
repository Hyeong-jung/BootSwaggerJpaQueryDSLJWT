package com.swgquerydsljwt.sample.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.swgquerydsljwt.sample.dto.SensorSelectRequest;
import com.swgquerydsljwt.sample.entity.QSensor;
import com.swgquerydsljwt.sample.entity.Sensor;
import com.swgquerydsljwt.sample.expression.SensorExpression;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SensorQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    public List<Sensor> select(SensorSelectRequest param) {
        var sensor = QSensor.sensor;
        var sensorQueryExpression = new SensorExpression(sensor);
        return jpaQueryFactory
                .selectFrom(sensor)
                .where(
                        sensorQueryExpression.inId(param.getId()),
                        sensorQueryExpression.inCode(param.getCode()),
                        sensorQueryExpression.inType(param.getType()),
                        sensorQueryExpression.likeName(param.getLikeName())
                )
                .fetch();
    }
}