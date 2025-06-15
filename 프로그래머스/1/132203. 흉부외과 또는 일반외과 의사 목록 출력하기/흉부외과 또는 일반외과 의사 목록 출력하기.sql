-- 오라클 대소문자 구분 to_char('YYYY-MM-DD'), mysql date_format('%Y-%M-D%')
SELECT dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d')
FROM doctor
WHERE mcdp_cd IN ('cs', 'gs')
ORDER BY 4 DESC, 1;