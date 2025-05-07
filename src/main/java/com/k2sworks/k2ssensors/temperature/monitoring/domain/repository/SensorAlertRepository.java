package com.k2sworks.k2ssensors.temperature.monitoring.domain.repository;

import com.k2sworks.k2ssensors.temperature.monitoring.domain.model.SensorAlert;
import com.k2sworks.k2ssensors.temperature.monitoring.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorAlertRepository extends JpaRepository<SensorAlert, SensorId> {
}