-- %서울% => 오답, 서울% 정답
-- Oracle에서는 GROUP BY 절에 SELECT에 있는 그룹화되지 않은 컬럼들이 모두 들어가야 합니다.
SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, ROUND(AVG(r.review_score), 2) SCORE
FROM rest_info i JOIN rest_review r ON i.rest_id=r.rest_id
WHERE i.address LIKE '서울%'
GROUP BY i.rest_name
ORDER BY 6 DESC, 4 DESC;