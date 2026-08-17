package com.analytics.analytics_service.Model;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "workout_record")
public class WorkoutRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long athleteId;

    private Double volumeLoad;

    private LocalDate workoutDate;

    public WorkoutRecord(){

    }

    public Long getAthleteId() {
        return athleteId;
    }
    public Long getId() {
        return id;
    }
    public Double getVolumeLoad() {
        return volumeLoad;
    }
    public LocalDate getWorkouDate() {
        return workoutDate;
    }
    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }
    public void setWorkouDate(LocalDate workouDate) {
        this.workoutDate = workouDate;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setVolumeLoad(Double volumeLoad) {
        this.volumeLoad = volumeLoad;
    }


    
}
