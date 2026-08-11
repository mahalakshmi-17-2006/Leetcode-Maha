-- Last updated: 8/11/2026, 2:17:10 PM
# Write your MySQL query statement below
SELECT *
FROM Users
WHERE REGEXP_LIKE(mail,
'^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$',
'c');