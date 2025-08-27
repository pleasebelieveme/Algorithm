SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents, to_char(r.created_date, 'YYYY-MM-DD') created_date
FROM used_goods_board b JOIN used_goods_reply r ON b.board_id=r.board_id
WHERE to_char(b.created_date, 'YYYY-MM') = '2022-10'
ORDER BY created_date, b.title