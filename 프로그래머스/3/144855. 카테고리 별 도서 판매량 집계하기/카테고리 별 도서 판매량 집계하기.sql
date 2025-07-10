-- 코드를 입력하세요
SELECT b.category, sum(s.sales) total_sales
FROM book b JOIN book_sales s ON b.book_id=s.book_id
WHERE to_char(s.sales_date, 'YYYY-mm') = '2022-01'
GROUP BY b.category
ORDER BY b.category;