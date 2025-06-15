-- 코드를 입력하세요
-- IFNULL()은 오라클에서 NVL() 사용
SELECT animal_type, IFNULL(NAME, 'No name') NAME, sex_upon_intake
FROM animal_ins
ORDER BY animal_id;