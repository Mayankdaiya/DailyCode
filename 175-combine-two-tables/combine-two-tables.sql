# Write your MySQL query statement below
select firstName, lastName, city, state from Person LEFT JOIN Address on Person.personId=Address.personId 