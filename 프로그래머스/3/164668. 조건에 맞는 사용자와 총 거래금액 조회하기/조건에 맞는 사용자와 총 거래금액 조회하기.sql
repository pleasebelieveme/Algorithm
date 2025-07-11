-- 코드를 입력하세요
-- 오라클에서는 SELECT 절에 있는 비집계 컬럼은 반드시 GROUP BY에 포함
SELECT u.user_id, u.nickname, sum(b.price)
FROM used_goods_board b JOIN used_goods_user u ON b.writer_id = u.user_id
WHERE status = 'DONE'
GROUP BY u.user_id
HAVING sum(b.price) >= 700000
ORDER BY sum(b.price);