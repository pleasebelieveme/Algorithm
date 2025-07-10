-- 코드를 입력하세요
-- 오라클 FETCH FIRST 숫자 ROWS ONLY, mysql limit
SELECT i.name, i.datetime
FROM animal_ins i LEFT JOIN animal_outs o ON i.animal_id=o.animal_id
WHERE o.animal_id is null
ORDER BY i.datetime
LIMIT 3;