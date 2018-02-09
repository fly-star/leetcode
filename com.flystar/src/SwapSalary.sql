-- update set 根据不同条件同时更新多个字段

update salary set sex=(case when sex='f' then 'm' when sex='m' then 'f' end);