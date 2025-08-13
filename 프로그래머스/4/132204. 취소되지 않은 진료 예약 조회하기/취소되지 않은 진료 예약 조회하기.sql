-- 코드를 입력하세요
SELECT distinct a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
FROM appointment a JOIN patient p ON a.pt_no=p.pt_no JOIN doctor d ON a.mddr_id=d.dr_id
WHERE apnt_cncl_yn = 'N'
AND a.mcdp_cd = 'CS'
AND to_char(apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
ORDER BY a.apnt_ymd;