-- 코드를 입력하세요
SELECT book_id, to_char(published_date, 'YYYY-MM-DD')
FROM book
WHERE to_char(published_date, 'YYYY') = '2021'
AND category = '인문'
ORDER BY published_date;