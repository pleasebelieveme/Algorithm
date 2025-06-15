-- mysql LIMIT, 오라클 ROWNUM(WHERE절), FETCH FIRST 1 ROWS ONLY
SELECT product_id, product_name, product_cd, category, price
FROM food_product
ORDER BY 5 DESC
LIMIT 1;