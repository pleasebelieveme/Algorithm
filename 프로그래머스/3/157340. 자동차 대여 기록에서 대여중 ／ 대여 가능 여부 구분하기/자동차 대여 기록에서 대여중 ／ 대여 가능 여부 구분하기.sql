-- 오라클은 if문 대신 case when문 사용
SELECT distinct car_id, if(max(START_DATE<='2022-10-16' and END_DATE >= '2022-10-16'),'대여중','대여 가능') AVAILABILITY
FROM car_rental_company_rental_history
GROUP BY car_id
ORDER BY car_id DESC;