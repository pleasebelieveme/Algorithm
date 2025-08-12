SELECT 
    s.SCORE,
    e.EMP_NO,
    e.EMP_NAME,
    e.POSITION,
    e.EMAIL
FROM (
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE
    WHERE YEAR = 2022
    GROUP BY EMP_NO
) s
JOIN HR_EMPLOYEES e ON s.EMP_NO = e.EMP_NO
WHERE s.SCORE = (
    SELECT MAX(total_score)
    FROM (
        SELECT SUM(SCORE) AS total_score
        FROM HR_GRADE
        WHERE YEAR = 2022
        GROUP BY EMP_NO
    ) t
);
