-- 코드를 입력하세요
-- 오라클 right join이 없음 left join사용, 대소문자 구분(lower()사용)
SELECT a.animal_id, a.animal_type, a.name
FROM animal_outs o RIGHT JOIN
(
    SELECT animal_id, animal_type, name
    FROM animal_ins
    WHERE SEX_UPON_INTAKE LIKE '%intact%'
) a ON o.animal_id = a.animal_id
WHERE o.SEX_UPON_outcome LIKE '%spayed%' OR sex_upon_outcome LIKE '%neutered%'