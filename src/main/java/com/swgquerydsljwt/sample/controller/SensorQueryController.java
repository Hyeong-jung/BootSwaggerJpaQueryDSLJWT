package com.swgquerydsljwt.sample.controller;


import com.swgquerydsljwt.sample.Service.SensorQueryService;
import com.swgquerydsljwt.sample.dto.SensorSelectRequest;
import com.swgquerydsljwt.sample.entity.Sensor;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/sensorquery")
@RequiredArgsConstructor
public class SensorQueryController {

    private final SensorQueryService sensorService;

    @GetMapping
    public List<Sensor> select(@ParameterObject SensorSelectRequest param) {
        return sensorService.select(param);
    }

    @PostMapping
    public Sensor create(@RequestBody Sensor param) {
        return sensorService.create(param);
    }

    @PutMapping
    public Sensor update(@RequestBody Sensor param) {
        return sensorService.update(param);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long param) {
        return sensorService.delete(param);
    }

}
