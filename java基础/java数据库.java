set names gbk; //�������

mysqlĬ�Ͽ�������

��ʽһ: ��һ������������ٴο����Ż���������
	set autocommit = false //�ر�����
	...
	set autocommit = true // ��������
	
��ʽ��: ֻ��Ҫ���ֿ����ֶ��ύ������
	start transaction;
	...
	commit �� rollback
	
	
3������ƽ����ݿ�����룿��ȫģʽ��¼
1:ͨ��������������߷������,�ص�mysqld(�������)
	net stop mysql5.5
2:ͨ��������+�����������mysqld
	mysqld --skip-grant-tables //����������̴�
3:��ʱ,mysqld��������Ѿ���,����,����ҪȨ�޼��.
4:mysql -uroot  �������½������.
5: �޸�Ȩ�ޱ�
  A: use mysql;
  B: update user set Password = password('123456') where User = 'root';
  C: flush privileges;
6:ͨ�����������,�ص�mysqld�������.
7:�ٴ�ͨ���������,��mysql����
	net start mysql5.5
8:�������޸ĺ���������½.


java springboot ��Ŀ
https://github.com/lenve/vhr 