-- 코드를 입력하세요
SELECT round(AVG(daily_fee), 0) AVERAGE_FEE
FROM car_rental_company_car
WHERE car_type = 'SUV';