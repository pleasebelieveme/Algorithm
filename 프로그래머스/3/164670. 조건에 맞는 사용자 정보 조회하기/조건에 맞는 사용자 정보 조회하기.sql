-- 오라클에서는 CONCAT() 대신 || 연산자를 사용하고, SUBSTRING() 대신 SUBSTR()을 사용
SELECT u.user_id, u.nickname,
    concat(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) '전체주소',
    CONCAT(SUBSTRING(u.TLNO, 1, 3), '-', 
    SUBSTRING(u.TLNO, 4, 4), '-', 
    SUBSTRING(u.TLNO, 8, 4)) '전화번호'
FROM used_goods_board b JOIN used_goods_user u ON b.writer_id=u.user_id
GROUP BY u.user_id
HAVING count(b.board_id) >= 3
ORDER BY u.user_id DESC;