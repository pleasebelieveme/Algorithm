-- 오라클은 LIMIT 사용불가, ROWNUM 또는 FETCH FIRST 사용
SELECT datetime 시간
FROM animal_ins
ORDER BY datetime
LIMIT 1;