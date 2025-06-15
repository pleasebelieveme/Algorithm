-- 오라클 EXTRACT사용
/*
SELECT date_format(o.sales_date, '%Y') YEAR, 
    date_format(o.sales_date, '%c') MONTH,
    u.gender GENDER,
    count(distinct u.user_id) USERS
FROM user_info u JOIN online_sale o ON u.user_id=o.user_id
WHERE u.gender IS NOT NULL
GROUP BY date_format(o.sales_date, '%Y'), date_format(o.sales_date, '%c'), u.gender
ORDER BY 1, 2, 3;
*/
SELECT YEAR(S.SALES_DATE) AS YEAR , MONTH(S.SALES_DATE) AS MONTH, I.GENDER, COUNT(DISTINCT I.USER_ID) AS USERS
FROM USER_INFO I
RIGHT JOIN ONLINE_SALE S
ON I.USER_ID = S.USER_ID
WHERE I.GENDER IS NOT NULL
GROUP BY YEAR(S.SALES_DATE), MONTH(S.SALES_DATE),  I.GENDER
ORDER BY YEAR, MONTH, I.GENDER ASC;