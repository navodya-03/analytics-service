package com.analytics.analytics_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.analytics.analytics_service.Model.WorkoutRecord;
import com.analytics.analytics_service.Repository.WorkoutRecordRepository;
import com.analytics.analytics_service.dto.WorkoutRecordDto;

@Service
public class WorkoutRecordService {

    private final WorkoutRecordRepository workoutRecordRepository;
    
    public WorkoutRecordService(WorkoutRecordRepository workoutRecordRepository) {
        this.workoutRecordRepository = workoutRecordRepository;
    }

    public WorkoutRecord saveRecord(WorkoutRecordDto wRecordDto){

        WorkoutRecord temp = new WorkoutRecord();
        temp.setAthleteId(wRecordDto.getAthleteId());
        temp.setVolumeLoad(wRecordDto.getVolumeLoad());
        temp.setWorkouDate(wRecordDto.getWorkoutDate());

        return workoutRecordRepository.save(temp);
    } 
}
