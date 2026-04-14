package com.nimbusx.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nimbusx.backend.model.Metric;
import com.nimbusx.backend.repository.MetricRepository;

@Service
public class MetricService {

    private final MetricRepository metricRepository;

    public MetricService(MetricRepository metricRepository) {
        this.metricRepository = metricRepository;
    }

    public Metric saveMetric(Metric metric) {
        return metricRepository.save(metric);
    }

    public List<Metric> getAllMetrics() {
        return metricRepository.findAll();
    }
}
