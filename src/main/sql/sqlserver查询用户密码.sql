select mr.loginid,mr.name,mr.pwd,case mr.sex when '1' then '男' else '女' end,dep.fullname,pos.name,mr.officetel,mr.mobile,mr.email
from mrbaseinf mr,mrdep dep,mrposition po
left outer join mrempposition pos
on po.positionid=pos.positionid 
where 1=1
and po.sortid=1 
and po.depid=dep.depid 
and po.empid=mr.empid 
and mr.status=1
and dep.status=1
--and dep.name not in('车间见习','临时借调')
order by dep.branchid,dep.sortcode,pos.sortid asc;

select * from mrbaseinf where loginid = 'liuxiaofeng'

select SERVERPROPERTY('edition')
select @@version