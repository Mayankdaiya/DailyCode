CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
Set N=N-1;
  RETURN (
      # Write your MySQL query statement below.
       select distinct(salary) from Employee order by salary DESC LIMIT 1 OFFSET N
  );
END