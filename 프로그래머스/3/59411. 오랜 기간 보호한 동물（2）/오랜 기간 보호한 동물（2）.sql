-- 코드를 입력하세요
SELECT o.animal_id, o.name
FROM animal_outs o JOIN animal_ins i ON o.animal_id=i.animal_id
ORDER BY i.datetime - o.datetime
FETCH FIRST 2 ROWS ONLY;