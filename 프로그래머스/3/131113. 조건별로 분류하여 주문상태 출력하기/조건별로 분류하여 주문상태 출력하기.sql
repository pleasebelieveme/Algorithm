-- 코드를 입력하세요
SELECT order_id, 
       product_id,
       to_char(out_date, 'YYYY-MM-DD'),
       CASE WHEN to_char(out_date, 'YYYY-MM-DD') <= '2022-05-01' then '출고완료'
            WHEN to_char(out_date, 'YYYY-MM-DD') > '2022-05-01' then '출고대기'
            ELSE '출고미정'
       END AS "출고여부"
FROM food_order
ORDER BY 1;