-- 오라클은 문자열을 입력할때 ""가 아니라 ''를 써야하며 대소문자를 구분한다.
SELECT animal_id, name
FROM animal_ins
WHERE intake_condition = "sick"
ORDER BY animal_id;