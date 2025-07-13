-- 코드를 입력하세요
-- 서브쿼리가 없으면 순위가 동일할 때 sql이 임의의 값을 지정할 수 있음
-- 오라클은 서브쿼리에서 별칭을 쓸때 as를 쓰면 오류
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM (
    SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES,
           ROW_NUMBER() OVER (PARTITION BY FOOD_TYPE ORDER BY FAVORITES DESC) as rnk
    FROM REST_INFO
) r
WHERE RNK = 1
ORDER BY FOOD_TYPE DESC;