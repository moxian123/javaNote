jdk: jre+开发工具
jre：java runtime environment
	 jvm + 核心类库(提前写好的代码)
jvm  java 虚拟机
ANSI 与当前操作系统一致
java 注释 // 
	/**/ 
	文档注释 /** **/注解部分讲解
编程风格

缩进对齐和python 差不多
class 类名{
	方法{
		System.out.println("xzxzx");
	}
}

public 类 和源文件名一致 

常量名所有字母大写

变量的作用域：从声明开始到他所属的{}结束
for(int i=0;i<10;i++){
	int num=10
}
System.out.println(num); // 报错找不到变量

对于long 类型的常量要加 L 例如 long le=12321312321L 建议用大写L 或l
float 需要加F

String 类型是引用类型

0B 二进制
0 8进制
0X  16进制

1字节8位

十进制小数部分，乘二取整，从上往下写

类型转换 强制转换 int a = (int)10.1
小到大自动完成，大到小强制类型转换
所有类型和字符串进行+运算都是拼接，结果是字符串

1+3+4*2=

//逻辑 & | ！^(异或，不同为真)， 开发常用短路&& 短路||
if(70 <= score & score>=60){
	
}

三目运算符：条件?:表达式1:表达式2	a>b ?:"a>b":"a<b"

运算符(底层用效率高) 左移<<乘以2的几次方  右移>>除以2的几次方

java 重main方法开始
if (a==x){ a=x1;} // 当只有一句时可以去掉大括号if (a==x) a=1;

if () {
	
}else if () {
	
}else{
	
} 

非基本数据类型String 比较需要用.equals() 来比较
String a="cool"
a.equals("帅") 判断是否相等
"帅".equals(a)


switch(week){
	case 1:
		System.out.println('星期一');
		break;
	case 2:
		System.out.println('星期二');
		break;
	...
	default:
		System.out.println('其他');
}
//1、出口分为自然出口}
//2、中断出口 break或return
//四种类型可以 byte short int char、枚举类型(JDK1.5)、Striang类型（JDK1.7）

//条件必须是Boolean类型

int i=10;
while(i<20){
	i++;
}

循环结构
for
while
do... while

do{
	// 循环体
}while(循环条件);

continue;
break;

//求最大公约数：9和6 解法,拿最小的数来取模，余数为0就是，通过i--，向下取，直到条件满足 
while(){
	num=min;
	if(max%num==0&&min%num==0){
		System.out.println('The max Number is '+num);
		break;
	}else{
		num--;
	}
}
// 最小公倍数=max*min/num,不知道公式，从
for(int i=max;i<=max*min;i++0){
	if(i%max==0&&i%min==0){
		System.out.println(i);
	}
}

数组
// Array
需要限制大小、类型一致
int[] scores = new int[7]; //用scores统一名称来管理这7个int类型元素，索引或下标来区分
socres[0]=10;
scores[1]=20;

len=scores.length// 长度为7

//数组声明
int[] scores;
//初始化
/*
（1）静态初始化
	scores = new int[]{20,30,50};
	int[] scores = new int[]{20,30,50};
	int[] scores = {20,30,50}; 简化new
	scores = {20,30,50} 报错,不能这样写
（2）动态初始化

遍历数组
*/
/*
变量类型 变量名 = 值
int[] a = {1}

JVM中最主要的两块区域：栈、堆
栈：存放局部变量，堆：存放对象
new 表示在堆中新建或者申请
数组名存放的是数组的首地址

数组名打印	[I@15db9742，类型@hashCode
*/

int[] scores = new int[长度]

for(int i =10;i<length;i++){
	
}

//数组元素是引用值时默认值是null,int类型默认值是0

/*
数组的翻转
（1）逆序输出
（2）首尾互换
*/
for(i=0;i<length;i++){
	newArray[i]=array[length-1-i];
}
array=newArray // 修改数组指向,将原来的数组废掉，修改了首地址指向

for(i=0;i<length/2;i++){
	x=array[i];
	array[i]=array[len-i-1];
	array[len-i-1]=[x];
}

0 1 2 3 4 5 6 
      3

0 1 2 3 4 5 6 7
        4
		
// 扩容数组用小的length，
for(i=0;i<arr2.length&&i<arr1.length;i++){ //保证左右两边数组都不越界
	
}


//6 天
/*
int[] a; 在java中 int[] 是一种引用数据类型
int a[]; // 在c语言中没有这种类型，它强调是int类型这一组数据
int[] arr1 = new int[4]{1,2,3,4,5,6} 这种是错误的
*/
定义两个变量
int a=10,b=20
for(int a=10,b=30;i>10&&b<20;i++,j--){
	
}
数组去重，找到重复的往前挪

直接选择排序/直接插入排序

/*
二维数组 和perl的引用一样理解，数组元素里面是数组
（1）静态初始化
	二维数组名 = new 元素数据类型[][]{
		{第一行的值列表},
		{第二行的值列表},
		{}
	}
	简化
	数据类型 二维数组名 ={
		{第一行的值列表},
		{第二行的值列表},
		{}
	}
	int[][] a={
		{123,213,2},
		{222,333}
	}
	行数=二维数组名.length
	列数=二维数组名[行下标].length
（2）动态初始化
	int[][] arr;
	arr = new int[5][];
	arr[0] = new int[3];
*/

//动态初始化例题
int[][] arr;
arr = new int[5][];
for(int i=0;i<arr.length;i++){
	arr[i]=new int[i+1];// 初始化每行多少值
	for(int j=0;j<arr[i].length;j++){
	arr[i][j]=i+1;// 赋值
}

//day7

pop 面向过程
opp 面向对象

属性
方法
构造器
代码块
内部类：某个大事物里包含一个独立的小事物

//类


Body{
	//属性
	weight double;
	age int;
	//方法
	void eat(){
		
	}
	//构造器
	Body(){
		
	}
	Body(int age){
		this.age=age;
	}
	//代码块
	{
		代码块
	}
	//静态代码块
	static{
		
	}
	//内部类
	class Heart{
		public void beat(){}
	}
}

属性有默认值引用null，基本0


基本数据类型传的是“数值”
引用数据类型传的是”地址值“
//day08
形式参数，交换两个值
int a = 10;
int b = 20;

// 这样不会交换，是引用数据类型就会，他们给的是地址
public static swap(int x int y){
	int c;
	c = x;
	x = y;
	y = x;
}



命令行参数：给main方法传递的参数


例如给下面传递参数
java TransferParameter Hello java

class TransferParameter
public static void main(String[] args){
	
}

/* 参数
	形参
	实参
	命令行参数
	可变参数 ”数据类型... 形参名“：可传入0-n个对应的实参，也可以传入对应数据类型的数组，一个方法只能有一个
	
*/

//可变参数，一个方法只能包含一个可变参数
public static int sum(int... nums){
	//把nums当成数组用
	int sum=0;
	for(int i=0;i<nums.length;i++){
		sum+=nums[i];
	}
	return sum
}
//调用
int x = sum(1,2,3,4);//传入实参
int[] arr = {1,2,3,4}//传入数组
x=sum(arr);// 这样也行



//int x 非可变参数部分，int...可变参数部分
public static int m(int x,int... nums){
	
}


成员变量：堆中今天讨论的都是非静态的成员变量 有默认值 有很多修饰
局部变量：栈中，没有默认值 final 修饰

java 类的修饰
/*
本类	本包	本包子类	任意位置
private 仅限本类
缺省 本包
protected 本包子类
public 任意位置
*/
可加修饰符的位置，
类、属性、方法、构造器、内部类

类：缺省、public，有public 类名必须与源文件名一样
属性方法四种都可以，属性大多数都是private，方法大多数都是public
属性private 会提供get/set方法

public double getR(){
	return r;	
}
public void setR(double r){
	this.r=r;
}




/*构造器，类的第三给组成部分，也称为构造方法，编译后是一个实例构造方法
(1) 作用创建对象、和类以前使用
(2) 结构，【修饰符】 类名(参数列表){} ，没有返回值类型不写
*/

//day09

overload
重载，在一个类中出现两个或多个同名的方法，但他们的参数列表不同，和返回值类型无关

//下面就是重载
int max(int a,int b){
	return a>b?a:b;
}
int max(int a,int b,int c){
	return max(max(a,b),c);
}
int max(int a,int b,int c,int d){
	return max(max(a,b,c),d);
}

/*
静态，可以通过类名.属性(方法)调用，相当于全局变量

（概念）用public修饰的static成员变量和成员方法本质是全局变量和全局方法，当声明它类的对象市，不生成static变量的副本，而是类的所有实例共享同一个static变量。

现在进一步理解下面两段概念：

（概念）只要这个类被加载，Java虚拟机就能根据类名在运行时数据区的方法区内找到他们。因此，static对象可以在它的任何对象创建之前访问，无需引用任何对象。

*/

boolean 类型没有get方法，他习惯用英文的is来写

private boolean marry;
public boolean setMarry(boolean marry){
	this.marray = marray
}
public boolean isMarry(){
	return this.marry
}

/*
包
(1) 避免类重名的问题
有了包后类的全名称就比较长了，包.类名
(2) 分类组织管理众多的类
(3) 用于权限控制
声明包：
package 包名;
要求
(1)一个.java 文件只能有一个句
(2) 必须在代码首行，注释不算
规范，全部小写用.分割
常见是用公司域名倒置+模块名
com.mysql.xxx
要创建响应的文件夹

如果要导入的包类名一样，一个用简名词，一个用全名称
*/



/*
出现在首行
this 
super
*/

// .class 文件里没有构造器这种说法，它是<init>([参数]) 来实现对象实例初始化赋值，
/*
	<init>([参数])，有几个构造器就会有几个[实例初始化方法]
	1、成员变量显示赋值 例如 privat int a=20; 1
	2、非静态代码块 2
	3、构造器 3
	
	1和2 按顺序执行 3 最后执行
*/
class T3 {
	// 非静态代码块，在创建对象时执行，构造器
	// 每次创建对象时都执行，比构造器早
	{
		System.out.println("非静态代码块");
	}
	public T3(){
		System.out.println("无参构造器");
	}
}

多态：编译类型与运行类型不一致
	有重写有继承：编译看左边，运行看有边
	只说方法不说属性
	属性没有多态，看编译是什么（左边）

Persion p = new Woman();

实际应用：多态数组
Cy[] all = new Cy[3];
//存储矩形对象
all[0] = new Rect(2,4)


instanceof 用来防止向下转型时出现ClassCastException异常

Person p = new Man();
Man m = (Man)p;

Person p = new Persion();
Man m = (Man)p; // 这种就会报错

//例子
/*
	p instanceof Woman 当p是Woman的对象或者子对象都是true
*/
public static void test(Person p){
	if(p instanceof Person){ // 只会执行这句，因为p永远都满足是Person的子类对象
		p.eat();
	}else if(p instanceof Woman){
		Woman w = (Woman)p;
		w.shop();
	}
}

public static void test(Person p){
	if(p instanceof Woman){
		Woman w = (Woman)p;
		w.shop();
	}
}

// 2021-12-16 在大朗隔离

/*
	Collection
		list
			vector
			ArrayList
			Stack
			LinkedList
		set
			HashSet
				底层是HashMap
			TreeSet
				底层是TreeMasp
					value 是一个 Object 常量对象
			LinkedHashSet
	Map存储键值对
		Entry类型
			Entry接口是Map 内部接口，所有的map键值对对
			实现了这个接口
			jkd1.7是Entry类实现，1.8是Node类实现
		HashMap 
			keySet() 返回所有key
			values() 返回所有values
			entrySet() 遍历
			通过hashCode 和 equals 来保证不会重复
		TreeMap
			通过Comparator 和 Comparable 来区分是否重复
*/

/*
	modCount记录修改次数
	避免并发迭代时出现线程错误。一个在迭代，一个在add()或remove()
*/

/*
	1.5引入：泛型
		泛型:泛化的类型
		把类型用形参表示，使用者用实参来确定这个类型
			这种称为类型实参，类型形参
			例如 <String>
			好处，安全、避免类型的转换
			
			
		为了了区别我们把a和b称为数据形参
		public int sum(int a,int b){return a+b;}
*/

/*
	泛型可以继承
		//表示类型Number或子类且实现了Comparable接口
		class A<T extends Number & Comparable>{
			
		}
	
	//
	E
	K,V
	泛型指定了上限
		不写就是上限的类型
	没有指定上限
		就是Object类型
*/

/**
java.io.File;
规范的文件名 用 /
 * windows 支持 / 和 \
 * 其他平台支持 /
 
String filePath = "E:/BaiduNetdiskDownload/新概念英语等多个文件";
File file = new File(filePath);
System.out.println(file);
file.getName();//名字
file.getPath();//获得路径
file.getAbsoluteFile();//绝对路径
file.getCanonicalFile();//规范路径自动解析../ ./ / 
file.getParent();//父目录
File parentFile = file.getParentFile();//父目录对象
file.exists();
fileDir.mkdir();//创建目录
fileDirs.mkdirs();//递归创建文件目录（创建多级文件目录）
// 删除文件或空目录，先判断是否存在
file.delete();
file.isDirectory();//是否目录
file.isFile();//是否文件
*/
package com.filePath;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class IoFile {
	@Test
	public void test01() throws IOException{
		/**规范的文件名 用 /
		 * windows 支持 / 和 \
		 * 其他平台支持 /
		 */
		String filePath = "E:/BaiduNetdiskDownload/新概念英语等多个文件/尚硅谷javaee19年10月毕业班/尚硅谷javaEE 19年10月毕业班/01java基础/day22_全天上课资料/day22_video";
		File file = new File(filePath);
		System.out.println(file);
		file.getName();//名字
		file.getPath();//获得路径
		file.getAbsoluteFile();//绝对路径
		file.getCanonicalFile();//规范路径自动解析../ ./ / 
		file.getParent();//父目录
		File parentFile = file.getParentFile();//父目录对象
		System.out.println(parentFile);
		
	}
	@Test
	//文件夹和文件目录创建
	public void test02() throws IOException{
		// 创建文件
		File file = new File("d:/test.txt");
		if(!file.exists())
			file.createNewFile();
		// 创建文件目录
		File fileDir = new File("d:/a111");
		if(!fileDir.exists()){
			fileDir.mkdir();
			System.out.println("创建目录");
		}
		//递归创建文件目录（创建多级文件目录）
		File fileDirs = new File("d:/a111/aaa/xxx");
		if(!fileDirs.exists())
			fileDirs.mkdirs();//mkdirs
	}
	@Test
	//文件夹删除和
	public void test03() throws IOException{
		// 删除文件或空目录
		File file = new File("d:/test.txt");
		if(file.exists())
			file.delete();
		File fileDirs = new File("D:\\a111\\aaa");
		System.out.println("删除目录");
		if(fileDirs.exists()){
			fileDirs.delete();
			System.out.println("删除目录");
		}
		file.isDirectory();
		file.isFile();
	}
}


//访问当前目录所有文件和文件夹
public void show(File file) throws IOException{
	String[] list = file.list();
	File[] listFiles = file.listFiles();
	for (File f : listFiles) {
		if(f.isDirectory()){
			System.out.println("目录:"+f.getPath());//显示目录
			show(f);
			
		}else{
			System.out.println(f);//显示文件
		}
	}
}
//计算文件大小
public long getDirLen(File file){
	File[] list = file.listFiles();
	long sum = 0;
	for (File f : list) {
		if(f.isDirectory()){
			sum+=getDirLen(f);
		}else{
			System.out.println(f + ":" + f.length());
			sum +=f.length();
			System.out.println(sum);
		}
	}
	return sum;
	/////////////////视频讲解////////////////////
		if(file.isFile()){
			return file.length();
		}else if(file.isDirectory()){
			int sum = 0;
			File[] list = file.listFiles();
			for (File sub : list) {
				sum+=getDirLen(sub);
			}
			return sum;
		}
		return 0;
}

//删除文件和文件夹
public void deleteDir(File file){
	File[] list = file.listFiles();
	System.out.println(Arrays.toString(list));
	for (File f : list) {
		if(f.isDirectory()){
			deleteDir(f);
		}
		f.delete();
	}
	
	file.delete();
	
	/////////////视频讲解///////////////////////
	if(file.isDirectory()){
			File[] list = file.listFiles();
			for (File f : list) {
				deleteDir(f);
			}
		}
		file.delete();
}


//文件过滤
		String path = "D:\\xshell5\\Xshell";//它的下级目录
		File file = new File(path);
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// 返回java结尾的，并且长度大于10的
				return pathname.getName().endsWith(".bat")
						&&
						pathname.getName().length()<10;
			}
		});
		
/**
java对文件读写的分类
IO包括file的所有，还包含对网络的输入输出操作


四个基类/超类/父类(都是抽象类)
InputStream
OutputStream
Reader
Writer

1 file对象只是对文件的操作
	输入输出(已程序为参照物)
	输出到文件
	输入到程序
2 字节流
	音频、图片等都可以
	输入输出

3 字符流
	纯文本文件的操作
	
常用实现类 
字节流
FIleInputStream
FIleOutputStream
转义
InputStreamReader(fis,"gbk");
OuputStreamWriter(ofs,"gbk");

DataInputStream
DataOutputStream

需要实现序列化接口 Serializable,定义序列号 serialVersionUID = 1L; 或者 接口 Externalizable
ObjectInputStream
ObjectOutputStream
缓冲流 提高效率
BufferedInputStream
BufferedOutputStream


字符流
FileReader
FileWriter
缓冲
BufferedReader
BufferedWriter

节点流和处理流：
	节点流：filexxx
	处理流：在节点流基础上，Bufferxxx,Objectxxx,Dataxxx
	
装饰者设计模式

flash()，配合缓存流使用
**/

package com.filePath;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class TIO {
	@Test//读取文件内容
	public void test01() throws IOException{
		FileReader fr = new FileReader("E://eDiary//JAVA/t.txt");//字符流
		char[] arr = new char[10];
		while(true){
			int read = fr.read(arr);// 一个unicode编码、一个arr、一个指定arr
			if(read == -1){
				break;
			}
			String re = new String(arr,0,read);//char转String
			System.out.print(re);
		}
		fr.close();//关闭流
	}
	
	@Test//写文件
	public void test02() throws IOException{
		FileWriter fw = new FileWriter("E://eDiary//JAVA/t.txt", true);//这是追加模式
		String x = "aaaaa2";
		fw.write("\n");//换行
		fw.write(x);
		fw.close();//关闭流
	}
	@Test//复制文件
	public void test03() throws IOException{
		FileReader fr = new FileReader("E://eDiary//JAVA/t.txt");
		FileWriter fw = new FileWriter("E://eDiary//JAVA/t1.txt");
		char[] arr = new char[10];
		int len;	
		while((len = fr.read(arr))!=-1){
			fw.write(arr,0,len);
			System.out.println(Arrays.toString(arr));
		}
		fr.close();
		fw.close();// 不关闭就不会保存
	}
}





Scanner sc = new Scanner(System.in);
String a = sc.nextLine();//以换行符作为结束，会接受上一个换行符
String b = sc.next();//一空格结束



/*
	文件缓冲分为：输入和输出缓冲。
		它可以提高文件的复制效率
	IO 缓冲
	BufferedInputStream
	BufferedOutputStream
	文件字符缓冲
	BufferedReader
	BufferedWriter
	
	
编码和解码
解码
	1、先将文件以字节流的形式读出来
		FileInputStream fis = new FileInputStream(path);
	2、将读出来的字节流用特定的编码格式编码
		InputStreamReader isw = new InputStreamReader(fis,"gbk");
	3、可以将其放入缓冲里，也可不放
		BufferedReader br = new BufferedReader(isw);
	4、读取文件内容
		char[] arr = new char[10];//以字符为单位
		int len = br.read(arr);
		String s = br.readLine();
编码		
	1、先将文件以字节流的形式写
		FileOutputStream fos = new FileOutputStream(path);
	2、将读出来的字节流用特定的编码格式编码
		OutputStreamWriter osw = new OutputStreamWriter(fis,"gbk");
	3、可以将其放入缓冲里，也可不放
		BufferedWriter bw = new BufferedWriter(osw);
	4、读写数据
		String txt = "你好，123";
		bw.write(txt);//数据（字符）->字节->fos，编码->文件
		bw.close();//不关闭不会保存
		
除了文件是节点流外，其他都需要包装才能用

类似保存特定值类型，DataInputStream 换成 ObjectInputStream
序列化：将对象转换为字节流
	序列化的类必须实现Serializable 接口,添加序列号 serialVersionUID = 1L;
		输出类的时候不要输出对象，例子丈夫和妻子，需要改下toString()
反序列化：将字节流转换为对象

不会序列化的属性，private transient int a ;
				  public static int x=100;
*/

//流的练习
package com.filePath;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MyBuffer {
	
	
	@Test
	public void test01() throws IOException{
		String path1 = "E:/eDiary/JAVA/java.java";
		String path2 = "E:/eDiary/JAVA/ttt.txt";
		//copy(path1,path2);
		//readFile(path1);
		writerFile(path2);
		
		
	}
	@Test
	//写入特殊数据
	public void test02() throws IOException{
		//原数据
		int num = 123;
		double d = 122.21;
		boolean bool = false;
		String st = "哈哈";
		FileOutputStream fos = new FileOutputStream("data.dat");//输入字节流
		DataOutputStream dos = new DataOutputStream(fos);//特殊的处理方式，保存原来的数据
		dos.writeInt(num);
		dos.writeDouble(d);
		dos.writeBoolean(bool);
		dos.writeUTF(st);
		dos.close();
		fos.close();
		
	}
	
	@Test
	//读刚才写的数据
	public void test03() throws IOException{
		//原数据
		FileInputStream fis = new FileInputStream("data.dat");//输入字节流
		DataInputStream dis = new DataInputStream(fis);//特殊的处理方式，保存原来的数据
		//读写顺序必须一致，否则乱码
		int readInt = dis.readInt();
		double readDouble = dis.readDouble();
		boolean readBoolean = dis.readBoolean();
		String readUTF = dis.readUTF();
		System.out.println(readInt);
		System.out.println(readDouble);
		System.out.println(readBoolean);
		System.out.println(readUTF);
	}
	@Test
	//写入 "对象" 数据
	public void test04() throws IOException{
		User user = new User("张三", 12);//改类必须实现Serializable接口
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("aaa");
		arr.add("bbb");
		char[] ar2 = {'a','b','c'};
		FileOutputStream fos = new FileOutputStream("class.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.writeObject(arr);
		oos.writeObject(ar2);
		oos.close();
		fos.close();
	}
	@Test
	//读取"对象"数据，顺序必须一样
	public void test05() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("class.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object user = ois.readObject();
		System.out.println(user);
		Object arr = ois.readObject();
		System.out.println(arr);
		char[] arr2 = (char[]) ois.readObject();
		System.out.println(arr2[0]);
	}
	// 流 file -> fis -> bis ->bos ->fos -> bis.close->fis.close->bos.close->fos.close
	public void copy(String filePath,String copyFilePath) throws IOException{
		FileInputStream fis = new FileInputStream(filePath);//打开文件输入字节流 |内衣
		BufferedInputStream bis = new BufferedInputStream(fis);//打开文件输入缓冲流 |外套
		
		FileOutputStream fos = new FileOutputStream(copyFilePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] arr = new byte[10];
		int len;
		while((len = bis.read(arr))!=-1){
			bos.write(arr,0,len);
		}
		//先脱外套，再脱内衣
		bis.close();
		fis.close();
		
		bos.close();
		fos.close();
		
		
	}
	//BufferedReader 练习
	// 解码 字节->字符 只能处理纯文本
	public void readFile(String filePath) throws IOException{
		FileInputStream fis = new FileInputStream(filePath);//字节流
		InputStreamReader isr = new InputStreamReader(fis, "GB2312");//转成字符
		//isr.read();可以直接读，也可以放到缓冲里
		BufferedReader br = new BufferedReader(isr);//打开文件输入字符缓冲流 |外套
		String str;
		char[] arr = new char[3];
		//BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		//bw.newLine();//专门写了一个换行为了跨平台。c系列是\r\n才是换行
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		fis.close();
	}
	//写入都是字节写入的，需要编码,只能处理纯文本
	public void writerFile(String filePath) throws IOException{
		//方法1
		String txt = "我很好！";
		FileOutputStream fos = new FileOutputStream(filePath);//不用FileWriter它是字符流
		fos.write(txt.getBytes("gbk"));
		
		//方法2
		FileOutputStream fos2 = new FileOutputStream(filePath);//不用FileWriter它是字符流
		OutputStreamWriter osw = new OutputStreamWriter(fos2);
	}
	
}














