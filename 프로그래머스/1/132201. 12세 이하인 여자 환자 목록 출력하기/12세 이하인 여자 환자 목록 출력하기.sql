-- 코드를 입력하세요
-- 오라클 nvl, mysql ifnull
SELECT pt_name, pt_no, gend_cd, age, ifnull(tlno, 'NONE') tlno
FROM patient
WHERE age <= 12 AND gend_cd = 'W'
ORDER BY age DESC, pt_name;