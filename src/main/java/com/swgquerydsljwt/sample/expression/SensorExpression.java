package com.swgquerydsljwt.sample.expression;

import com.swgquerydsljwt.sample.entity.QSensor;
import com.querydsl.core.types.dsl.BooleanExpression;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@RequiredArgsConstructor
public class SensorExpression {

    //private final QSensor entity;
    private final QSensor entity;

    public BooleanExpression inId(Long... param) {
        return param == null ? null : entity.id.in(param);
    }

    public BooleanExpression inCode(String... param) {
        return param == null ? null : entity.code.in(param);
    }

    public BooleanExpression inType(String... param) {
        return param == null ? null : entity.type.in(param);
    }

    public BooleanExpression likeName(String param) {
        // import org.apache.commons.lang3.StringUtils;
        return StringUtils.isEmpty(param) ? null : entity.name.contains(param);
    }
}