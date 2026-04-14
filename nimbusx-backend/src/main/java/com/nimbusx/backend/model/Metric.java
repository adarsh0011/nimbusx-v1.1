package com.nimbusx.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "metrics")
@Data
public class Metric {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	private double cpuUsage;
	private double memoryUsage;

	private LocalDateTime timestamp;
}
