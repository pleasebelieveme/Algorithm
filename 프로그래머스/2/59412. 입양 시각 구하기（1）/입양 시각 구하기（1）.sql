-- 코드를 입력하세요
-- 오라클 EXTRACT사용 후 CAST필요, mysql hour()
SELECT hour(datetime), count(1)
FROM animal_outs
WHERE hour(datetime) BETWEEN 9 AND 19
GROUP BY 1
ORDER BY 1;