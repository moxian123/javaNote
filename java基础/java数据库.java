set names gbk; //解决乱码

mysql默认开启事物

方式一: 在一次连接里必须再次开启才会启动事物
	set autocommit = false //关闭事物
	...
	set autocommit = true // 开启事物
	
方式二: 只需要部分开启手动提交的事物
	start transaction;
	...
	commit 或 rollback
	
	
3、如何破解数据库的密码？安全模式登录
1:通过任务管理器或者服务管理,关掉mysqld(服务进程)
	net stop mysql5.5
2:通过命令行+特殊参数开启mysqld
	mysqld --skip-grant-tables //保持这个进程打开
3:此时,mysqld服务进程已经打开,并且,不需要权限检查.
4:mysql -uroot  无密码登陆服务器.
5: 修改权限表
  A: use mysql;
  B: update user set Password = password('123456') where User = 'root';
  C: flush privileges;
6:通过任务管理器,关掉mysqld服务进程.
7:再次通过服务管理,打mysql服务。
	net start mysql5.5
8:即可用修改后的新密码登陆.


java springboot 项目
https://github.com/lenve/vhr 