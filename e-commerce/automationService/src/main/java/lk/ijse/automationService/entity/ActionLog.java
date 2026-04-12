package lk.ijse.automationService.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "action_logs")
@Data
public class ActionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneId;
    private String deviceId;

    private String action;

    private Double recordedTemperature;
    private LocalDateTime timestamp = LocalDateTime.now();
}