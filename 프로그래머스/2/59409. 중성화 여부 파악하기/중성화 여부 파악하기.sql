-- 코드를 입력하세요
-- mysql if(), 오라클 case when()
SELECT animal_id, name, 
    if(lower(sex_upon_intake) LIKE '%neutered%' 
    OR lower(sex_upon_intake) LIKE '%spayed%', 'O', 'X')
FROM animal_ins
ORDER BY animal_id;