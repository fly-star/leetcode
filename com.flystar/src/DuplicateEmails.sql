-- 查找指定字段中拥有重复值的值
select email from Person group by email having count(email)>1;