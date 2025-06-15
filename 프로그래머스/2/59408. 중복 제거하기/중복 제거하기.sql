-- 코드를 입력하세요
SELECT count(distinct name) count
FROM animal_ins
WHERE name is not null;