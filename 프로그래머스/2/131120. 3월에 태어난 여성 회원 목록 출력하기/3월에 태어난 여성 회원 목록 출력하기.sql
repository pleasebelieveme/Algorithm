-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH, 'YYYY-MM-DD') as DATE_OF_BIRTH
from member_profile
WHERE gender = 'W' AND to_char(date_of_birth, 'MM') = 3 AND tlno is not null
ORDER BY member_id;