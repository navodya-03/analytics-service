CREATE TABLE workout_record (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    athlete_id BIGINT,
    volume_load DOUBLE,
    workout_date DATE
);