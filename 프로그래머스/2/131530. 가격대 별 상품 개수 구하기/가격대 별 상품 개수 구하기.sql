-- 코드를 입력하세요
-- 오라클에서 그룹바이절은 별칭을 사용할 수 없다?
SELECT CASE WHEN price between 0 AND 9999 then '0' 
            WHEN price between 10000 AND 19999 then '10000'
            WHEN price between 20000 AND 29999 then '20000'
            WHEN price between 30000 AND 39999 then '30000'
            WHEN price between 40000 AND 49999 then '40000'
            WHEN price between 50000 AND 59999 then '50000'
            WHEN price between 60000 AND 69999 then '60000'
            WHEN price between 70000 AND 79999 then '70000'
            WHEN price between 80000 AND 89999 then '80000'
       END PRICE_GROUP,
       count(price) PRODUCTS
FROM product
GROUP BY price_group
ORDER BY price_group;