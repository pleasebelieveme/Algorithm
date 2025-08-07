-- 오라클에서 CASE 문법은 동일하게 사용되지만
-- CREATED_DATE가 DATE 타입이라면 날짜 비교 시 TO_DATE 또는 TRUNC를 사용
SELECT board_id, writer_id, title, price,
    case when status = 'SALE' then '판매중'
         when status = 'RESERVED' then '예약중'
         when status = 'DONE' then '거래완료'
         END "거래상태"
FROM used_goods_board
WHERE CREATED_DATE = '2022-10-05'
ORDER BY board_id DESC;