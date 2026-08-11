-- Last updated: 8/11/2026, 2:18:43 PM
# Write your MySQL query statement below
SELECT 
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
