-- 코드를 입력하세요
SELECT CAR_TYPE, count(options) CARS
from car_rental_company_car
where OPTIONS like '%가죽시트%'
or OPTIONS like '%열선시트%'
or OPTIONS like '%통풍시트%'
GROUP BY car_type
ORDER BY car_type;