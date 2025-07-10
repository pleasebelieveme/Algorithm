-- 코드를 입력하세요
SELECT DISTINCT c.car_id
FROM car_rental_company_rental_history h JOIN car_rental_company_car c ON h.car_id = c.car_id
WHERE c.car_type = '세단'
AND to_char(h.start_date, 'MM') = '10'
ORDER BY c.car_id DESC;