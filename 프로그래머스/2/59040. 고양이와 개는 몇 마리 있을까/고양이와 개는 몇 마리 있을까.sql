-- 코드를 입력하세요
SELECT animal_type, count(1) total_count
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type;