-- 코드를 입력하세요
-- 오라클은 GROUP BY절에서 숫자사용불가
SELECT i.ingredient_type, SUM(f.total_order) "total_order"
FROM first_half f JOIN icecream_info i ON f.flavor=i.flavor
GROUP BY 1;