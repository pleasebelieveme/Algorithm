-- 오라클은 if문이 없다
SELECT history_id, car_id, date_format(start_date, "%Y-%m-%d"), date_format(end_date, "%Y-%m-%d"), IF(DATEDIFF(end_date, start_date)+1 >= 30, '장기 대여', '단기 대여') RENT_TYPE
FROM car_rental_company_rental_history
WHERE date_format(start_date, "%Y-%m") = '2022-09'
ORDER BY history_id DESC;