-- 코드를 입력하세요
-- 오라클 order by에서 집계함수(count)불가, 별칭은 ""
select
    MCDP_CD as '진료과코드',
    count(*) as '5월 예약 건수'
from APPOINTMENT
where date_format(APNT_YMD, '%Y-%m') = '2022-05'
GROUP BY 1
order by count(APNT_no), MCDP_CD;