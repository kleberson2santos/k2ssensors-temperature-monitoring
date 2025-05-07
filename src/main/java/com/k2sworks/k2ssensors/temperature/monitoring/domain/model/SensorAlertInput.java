package com.k2sworks.k2ssensors.temperature.monitoring.domain.model;

import lombok.Data;

@Data
public class SensorAlertInput {
    private Double maxTemperature;
    private Double minTemperature;
}