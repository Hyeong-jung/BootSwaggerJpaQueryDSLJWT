package com.swgquerydsljwt.sample.Service;


import com.swgquerydsljwt.sample.entity.Sensor;
import com.swgquerydsljwt.sample.repository.SensorRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SensorService {

    private final SensorRepository sensorRepository;

    public List<Sensor> select() {
        return sensorRepository.findAll();
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
