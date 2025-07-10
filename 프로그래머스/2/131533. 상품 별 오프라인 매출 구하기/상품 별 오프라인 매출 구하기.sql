-- 코드를 입력하세요
-- 오라클 GROUP BY는 컬럼명으로만 접근 가능
SELECT p.product_code, sum(p.price*o.sales_amount) sales
FROM product p JOIN offline_sale o ON p.product_id=o.product_id
GROUP BY 1
ORDER BY 2 DESC, 1;