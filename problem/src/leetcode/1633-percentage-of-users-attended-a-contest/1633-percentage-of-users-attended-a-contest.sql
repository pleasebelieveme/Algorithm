SELECT 
    contest_id,
    ROUND(COUNT(DISTINCT r.user_id) * 100.0 / total.total_users, 2) AS percentage
FROM 
    Register r,
    (SELECT COUNT(*) AS total_users FROM Users) total
GROUP BY 
    contest_id
ORDER BY 
    percentage DESC,
    contest_id ASC;
