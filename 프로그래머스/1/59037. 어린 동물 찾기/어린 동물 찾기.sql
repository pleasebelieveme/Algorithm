-- 오라클은 문자열은 ''로 감싸고 대소문자 구분
SELECT animal_id, name
FROM animal_ins
WHERE intake_condition <> "aged"
ORDER BY animal_id;