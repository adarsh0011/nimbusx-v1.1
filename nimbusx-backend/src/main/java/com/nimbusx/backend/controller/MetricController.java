package com.nimbusx.backend.controller;

import com.nimbusx.backend.model.Metric;
import com.nimbusx.backend.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/metrics")
public class MetricController {

    @Autowired
    private MetricService metricService;

    @PostMapping
    public Metric createMetric(@RequestBody Metric metric) {
        return metricService.saveMetric(metric);
    }

    @GetMapping
    public List<Metric> getAllMetrics() {
        return metricService.getAllMetrics();
    }
}
