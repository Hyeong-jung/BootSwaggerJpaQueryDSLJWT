package com.swgquerydsljwt.sample.Service;


import com.swgquerydsljwt.sample.dto.SensorSelectRequest;
import com.swgquerydsljwt.sample.entity.Sensor;

import com.swgquerydsljwt.sample.repository.SensorQueryRepository;
import com.swgquerydsljwt.sample.repository.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SensorQueryService {

    private final SensorRepository sensorRepository;
    private final SensorQueryRepository sensorQueryRepository;

    public List<Sensor> select(SensorSelectRequest param) {
        return sensorQueryRepository.select(param);
    }

    public Sensor create(Sensor param) {
        return sensorRepository.save(param);
    }

    public Sensor update(Sensor param) {
        return sensorRepository.save(param);
    }

    public boolean delete(Long param) {
        sensorRepository.deleteById(param);
        return true;
    }
}
