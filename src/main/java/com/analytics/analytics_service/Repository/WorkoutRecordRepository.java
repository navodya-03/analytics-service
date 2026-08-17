package com.analytics.analytics_service.Repository;

import com.analytics.analytics_service.Model.WorkoutRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRecordRepository extends JpaRepository<WorkoutRecord, Long>{

    
} 
