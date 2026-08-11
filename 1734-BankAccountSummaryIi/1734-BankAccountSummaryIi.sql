-- Last updated: 8/11/2026, 2:17:01 PM
# Write your MySQL query statement below
SELECT
    u.name,
    SUM(t.amount) AS balance
FROM Users u
JOIN Transactions t
ON u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;