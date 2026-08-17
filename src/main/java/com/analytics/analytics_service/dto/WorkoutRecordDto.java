package com.analytics.analytics_service.dto;
import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class WorkoutRecordDto {
    @NotNull(message = "athlete Id cannot be empty")
    private Long athleteId;

    @NotNull(message = "volume Load cannot be empty")
    private Double volumeLoad;

    @NotNull(message = "date cannot be empty")
    private LocalDate workoutDate;

    public WorkoutRecordDto(){}

    public Long getAthleteId(){
        return athleteId;
    }
    public Double getVolumeLoad() {
        return volumeLoad;
    }
    public LocalDate getWorkoutDate() {
        return workoutDate;
    }
    public void setWorkoutDate(LocalDate workoutDate) {
        this.workoutDate = workoutDate;
    }
    public void setAthleteId(Long athleteId) {
        this.athleteId = athleteId;
    }
    public void setVolumeLoad(Double volumeLoad) {
        this.volumeLoad = volumeLoad;
    }
    
    
}
