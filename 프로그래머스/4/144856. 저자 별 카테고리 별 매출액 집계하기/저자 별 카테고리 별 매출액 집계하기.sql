-- LEFT JOIN으로 쿼리를 작성하는 걸 추천
-- 오라클은 집계함수 이외의 값은 GROUP BY절에 모두 적어줘야함
SELECT b.author_id, a.author_name, b.category, SUM(b.price * s.sales) 'total_sales'
FROM book b
    RIGHT JOIN book_sales s
    ON b.book_id = s.book_id
    LEFT JOIN author a
    ON b.author_id = a.author_id
WHERE s.sales_date LIKE '2022-01%'
GROUP BY b.category, b.author_id
ORDER BY a.author_id, b.category DESC;