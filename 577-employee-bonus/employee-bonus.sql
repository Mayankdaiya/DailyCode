# Write your MySQL query statement below
SELECT name, bonus FROM Employee as t1 LEFT JOIN Bonus as t2 ON t1.empId = t2.empId WHERE 
t2.bonus IS NULL OR t2.bonus < 1000;