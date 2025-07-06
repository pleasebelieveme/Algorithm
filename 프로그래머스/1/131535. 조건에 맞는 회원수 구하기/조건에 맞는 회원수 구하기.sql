-- 코드를 입력하세요
-- 오라클 to_char('YYYY'), mysql date_format('%Y')
SELECT count(user_id) 
FROM user_info
WHERE date_format(joined, '%Y') = 2021
AND age BETWEEN 20 AND 29;