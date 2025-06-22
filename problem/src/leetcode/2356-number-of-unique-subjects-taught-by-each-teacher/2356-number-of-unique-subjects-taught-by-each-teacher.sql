SELECT teacher_id, COUNT(subejct_id) AS cnt
FROM Teacher
GROUP BY teacher_id, subject_id