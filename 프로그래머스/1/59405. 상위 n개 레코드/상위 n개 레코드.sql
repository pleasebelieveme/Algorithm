-- ROWNUM 또는 FETCH FIRST, 오라클은 limit가 없음
SELECT name
FROM animal_ins
ORDER BY datetime
LIMIT 1;