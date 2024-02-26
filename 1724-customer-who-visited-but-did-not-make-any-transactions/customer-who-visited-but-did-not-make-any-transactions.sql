# Write your MySQL query statement below
SELECT customer_id, COUNT(t1.visit_id) AS count_no_trans from Visits AS t1 LEFT JOIN Transactions
AS t2 ON t1.visit_id = t2.visit_id WHERE t2.transaction_id IS NULL GROUP BY t1.customer_id
ORDER BY customer_id;