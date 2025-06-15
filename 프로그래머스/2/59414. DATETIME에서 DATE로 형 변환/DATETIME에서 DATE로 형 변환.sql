-- 오라클 to_char, mysql date_format
SELECT animal_id, name, date_format(datetime, '%Y-%m-%d')
FROM animal_ins
ORDER BY 1;