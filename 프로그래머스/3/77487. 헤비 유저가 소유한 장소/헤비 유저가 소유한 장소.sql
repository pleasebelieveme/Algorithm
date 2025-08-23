-- 서브쿼리 활용
select id, name, host_id
from PLACES
where HOST_ID in 
(
    select 
        HOST_ID
    from PLACES p1
    group by HOST_ID
    having count(*) >= 2
)
order by id;