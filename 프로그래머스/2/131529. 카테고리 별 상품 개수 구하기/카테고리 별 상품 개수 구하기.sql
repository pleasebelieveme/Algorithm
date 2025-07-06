-- 코드를 입력하세요
-- 오라클 GROUP BY 숫자가 인식못함
SELECT substr(product_code, 1, 2) category, count(1) products
FROM product
GROUP BY 1
ORDER BY 1;