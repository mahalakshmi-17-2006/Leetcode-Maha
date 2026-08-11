-- Last updated: 8/11/2026, 2:18:18 PM
# Write your MySQL query statement below
SELECT person_name
FROM (
    SELECT person_name,
           SUM(weight) OVER (ORDER BY turn) AS total_weight
    FROM Queue
) q
WHERE total_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1;