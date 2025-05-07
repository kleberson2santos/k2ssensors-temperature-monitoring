package com.k2sworks.k2ssensors.temperature.monitoring.domain.repository;

import com.k2sworks.k2ssensors.temperature.monitoring.domain.model.SensorId;
import com.k2sworks.k2ssensors.temperature.monitoring.domain.model.SensorMonitoring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorMonitoringRepository extends JpaRepository<SensorMonitoring, SensorId> {
}
