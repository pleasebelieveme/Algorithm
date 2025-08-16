-- 오라클은 ROUND를 썻을때 30.0이 아니라 30으로 나오기에 형식을 따로 적어줘야 한다.
SELECT car_id, round(avg(DATEDIFF(end_date, start_date)+1), 1) AS AVERAGE_DURATION
FROM car_rental_company_rental_history
GROUP BY car_id
HAVING AVERAGE_DURATION >= 7
ORDER BY AVERAGE_DURATION DESC, car_id DESC;