-- 오라클은 IFNULL 대신 NVL을 사용, LIMIT 대신 FETCH FIRST N ROWS ONLY
SELECT f.flavor
FROM first_half f
LEFT JOIN 
(
    SELECT flavor, sum(total_order) total_order
    FROM july
    GROUP BY flavor
) j ON f.flavor=j.flavor
ORDER BY (f.total_order + IFNULL(j.total_order, 0)) DESC
LIMIT 3;