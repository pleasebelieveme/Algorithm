-- 오라클 nvl, MySql ifnull
SELECT warehouse_id, warehouse_name, address, ifnull(freezer_YN, "N")
FROM food_warehouse
WHERE warehouse_name LIKE '%경기%'
ORDER BY 1;