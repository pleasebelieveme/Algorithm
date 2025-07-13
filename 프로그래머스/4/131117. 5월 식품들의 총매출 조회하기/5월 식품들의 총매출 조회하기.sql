-- 오라클에서는 GROUP BY 절에 SELECT에 있는 모든 비집계 컬럼(Non-Aggregate Columns) 을 포함
SELECT p.product_id, p.product_name, SUM(o.amount*p.price) AS TOTAL_SALES
FROM food_product p JOIN food_order o ON p.product_id=o.product_id
WHERE date_format(o.produce_date, '%Y%m') = '202205'
GROUP BY p.product_id
ORDER BY 3 DESC, 1;