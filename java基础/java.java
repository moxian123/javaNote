jdk: jre+��������
jre��java runtime environment
	 jvm + �������(��ǰд�õĴ���)
jvm  java �����
ANSI �뵱ǰ����ϵͳһ��
java ע�� // 
	/**/ 
	�ĵ�ע�� /** **/ע�ⲿ�ֽ���
��̷��

���������python ���
class ����{
	����{
		System.out.println("xzxzx");
	}
}

public �� ��Դ�ļ���һ�� 

������������ĸ��д

�����������򣺴�������ʼ����������{}����
for(int i=0;i<10;i++){
	int num=10
}
System.out.println(num); // �����Ҳ�������

����long ���͵ĳ���Ҫ�� L ���� long le=12321312321L �����ô�дL ��l
float ��Ҫ��F

String ��������������

0B ������
0 8����
0X  16����

1�ֽ�8λ

ʮ����С�����֣��˶�ȡ������������д

����ת�� ǿ��ת�� int a = (int)10.1
С�����Զ���ɣ���Сǿ������ת��
�������ͺ��ַ�������+���㶼��ƴ�ӣ�������ַ���

1+3+4*2=

//�߼� & | ��^(��򣬲�ͬΪ��)�� �������ö�·&& ��·||
if(70 <= score & score>=60){
	
}

��Ŀ�����������?:���ʽ1:���ʽ2	a>b ?:"a>b":"a<b"

�����(�ײ���Ч�ʸ�) ����<<����2�ļ��η�  ����>>����2�ļ��η�

java ��main������ʼ
if (a==x){ a=x1;} // ��ֻ��һ��ʱ����ȥ��������if (a==x) a=1;

if () {
	
}else if () {
	
}else{
	
} 

�ǻ�����������String �Ƚ���Ҫ��.equals() ���Ƚ�
String a="cool"
a.equals("˧") �ж��Ƿ����
"˧".equals(a)


switch(week){
	case 1:
		System.out.println('����һ');
		break;
	case 2:
		System.out.println('���ڶ�');
		break;
	...
	default:
		System.out.println('����');
}
//1�����ڷ�Ϊ��Ȼ����}
//2���жϳ��� break��return
//�������Ϳ��� byte short int char��ö������(JDK1.5)��Striang���ͣ�JDK1.7��

//����������Boolean����

int i=10;
while(i<20){
	i++;
}

ѭ���ṹ
for
while
do... while

do{
	// ѭ����
}while(ѭ������);

continue;
break;

//�����Լ����9��6 �ⷨ,����С������ȡģ������Ϊ0���ǣ�ͨ��i--������ȡ��ֱ���������� 
while(){
	num=min;
	if(max%num==0&&min%num==0){
		System.out.println('The max Number is '+num);
		break;
	}else{
		num--;
	}
}
// ��С������=max*min/num,��֪����ʽ����
for(int i=max;i<=max*min;i++0){
	if(i%max==0&&i%min==0){
		System.out.println(i);
	}
}

����
// Array
��Ҫ���ƴ�С������һ��
int[] scores = new int[7]; //��scoresͳһ������������7��int����Ԫ�أ��������±�������
socres[0]=10;
scores[1]=20;

len=scores.length// ����Ϊ7

//��������
int[] scores;
//��ʼ��
/*
��1����̬��ʼ��
	scores = new int[]{20,30,50};
	int[] scores = new int[]{20,30,50};
	int[] scores = {20,30,50}; ��new
	scores = {20,30,50} ����,��������д
��2����̬��ʼ��

��������
*/
/*
�������� ������ = ֵ
int[] a = {1}

JVM������Ҫ����������ջ����
ջ����žֲ��������ѣ���Ŷ���
new ��ʾ�ڶ����½���������
��������ŵ���������׵�ַ

��������ӡ	[I@15db9742������@hashCode
*/

int[] scores = new int[����]

for(int i =10;i<length;i++){
	
}

//����Ԫ��������ֵʱĬ��ֵ��null,int����Ĭ��ֵ��0

/*
����ķ�ת
��1���������
��2����β����
*/
for(i=0;i<length;i++){
	newArray[i]=array[length-1-i];
}
array=newArray // �޸�����ָ��,��ԭ��������ϵ����޸����׵�ַָ��

for(i=0;i<length/2;i++){
	x=array[i];
	array[i]=array[len-i-1];
	array[len-i-1]=[x];
}

0 1 2 3 4 5 6 
      3

0 1 2 3 4 5 6 7
        4
		
// ����������С��length��
for(i=0;i<arr2.length&&i<arr1.length;i++){ //��֤�����������鶼��Խ��
	
}


//6 ��
/*
int[] a; ��java�� int[] ��һ��������������
int a[]; // ��c������û���������ͣ���ǿ����int������һ������
int[] arr1 = new int[4]{1,2,3,4,5,6} �����Ǵ����
*/
������������
int a=10,b=20
for(int a=10,b=30;i>10&&b<20;i++,j--){
	
}
����ȥ�أ��ҵ��ظ�����ǰŲ

ֱ��ѡ������/ֱ�Ӳ�������

/*
��ά���� ��perl������һ����⣬����Ԫ������������
��1����̬��ʼ��
	��ά������ = new Ԫ����������[][]{
		{��һ�е�ֵ�б�},
		{�ڶ��е�ֵ�б�},
		{}
	}
	��
	�������� ��ά������ ={
		{��һ�е�ֵ�б�},
		{�ڶ��е�ֵ�б�},
		{}
	}
	int[][] a={
		{123,213,2},
		{222,333}
	}
	����=��ά������.length
	����=��ά������[���±�].length
��2����̬��ʼ��
	int[][] arr;
	arr = new int[5][];
	arr[0] = new int[3];
*/

//��̬��ʼ������
int[][] arr;
arr = new int[5][];
for(int i=0;i<arr.length;i++){
	arr[i]=new int[i+1];// ��ʼ��ÿ�ж���ֵ
	for(int j=0;j<arr[i].length;j++){
	arr[i][j]=i+1;// ��ֵ
}

//day7

pop �������
opp �������

����
����
������
�����
�ڲ��ࣺĳ�������������һ��������С����

//��


Body{
	//����
	weight double;
	age int;
	//����
	void eat(){
		
	}
	//������
	Body(){
		
	}
	Body(int age){
		this.age=age;
	}
	//�����
	{
		�����
	}
	//��̬�����
	static{
		
	}
	//�ڲ���
	class Heart{
		public void beat(){}
	}
}

������Ĭ��ֵ����null������0


�����������ʹ����ǡ���ֵ��
�����������ʹ����ǡ���ֵַ��
//day08
��ʽ��������������ֵ
int a = 10;
int b = 20;

// �������ύ�����������������;ͻᣬ���Ǹ����ǵ�ַ
public static swap(int x int y){
	int c;
	c = x;
	x = y;
	y = x;
}



�����в�������main�������ݵĲ���


��������洫�ݲ���
java TransferParameter Hello java

class TransferParameter
public static void main(String[] args){
	
}

/* ����
	�β�
	ʵ��
	�����в���
	�ɱ���� ����������... �β��������ɴ���0-n����Ӧ��ʵ�Σ�Ҳ���Դ����Ӧ�������͵����飬һ������ֻ����һ��
	
*/

//�ɱ������һ������ֻ�ܰ���һ���ɱ����
public static int sum(int... nums){
	//��nums����������
	int sum=0;
	for(int i=0;i<nums.length;i++){
		sum+=nums[i];
	}
	return sum
}
//����
int x = sum(1,2,3,4);//����ʵ��
int[] arr = {1,2,3,4}//��������
x=sum(arr);// ����Ҳ��



//int x �ǿɱ�������֣�int...�ɱ��������
public static int m(int x,int... nums){
	
}


��Ա���������н������۵Ķ��ǷǾ�̬�ĳ�Ա���� ��Ĭ��ֵ �кܶ�����
�ֲ�������ջ�У�û��Ĭ��ֵ final ����

java �������
/*
����	����	��������	����λ��
private ���ޱ���
ȱʡ ����
protected ��������
public ����λ��
*/
�ɼ����η���λ�ã�
�ࡢ���ԡ����������������ڲ���

�ࣺȱʡ��public����public ����������Դ�ļ���һ��
���Է������ֶ����ԣ����Դ��������private���������������public
����private ���ṩget/set����

public double getR(){
	return r;	
}
public void setR(double r){
	this.r=r;
}




/*����������ĵ�������ɲ��֣�Ҳ��Ϊ���췽�����������һ��ʵ�����췽��
(1) ���ô������󡢺�����ǰʹ��
(2) �ṹ�������η��� ����(�����б�){} ��û�з���ֵ���Ͳ�д
*/

//day09

overload
���أ���һ�����г�����������ͬ���ķ����������ǵĲ����б�ͬ���ͷ���ֵ�����޹�

//�����������
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
��̬������ͨ������.����(����)���ã��൱��ȫ�ֱ���

�������public���ε�static��Ա�����ͳ�Ա����������ȫ�ֱ�����ȫ�ַ���������������Ķ����У�������static�����ĸ����������������ʵ������ͬһ��static������

���ڽ�һ������������θ��

�����ֻҪ����౻���أ�Java��������ܸ�������������ʱ�������ķ��������ҵ����ǡ���ˣ�static��������������κζ��󴴽�֮ǰ���ʣ����������κζ���

*/

boolean ����û��get��������ϰ����Ӣ�ĵ�is��д

private boolean marry;
public boolean setMarry(boolean marry){
	this.marray = marray
}
public boolean isMarry(){
	return this.marry
}

/*
��
(1) ����������������
���˰������ȫ���ƾͱȽϳ��ˣ���.����
(2) ������֯�����ڶ����
(3) ����Ȩ�޿���
��������
package ����;
Ҫ��
(1)һ��.java �ļ�ֻ����һ����
(2) �����ڴ������У�ע�Ͳ���
�淶��ȫ��Сд��.�ָ�
�������ù�˾��������+ģ����
com.mysql.xxx
Ҫ������Ӧ���ļ���

���Ҫ����İ�����һ����һ���ü����ʣ�һ����ȫ����
*/



/*
����������
this 
super
*/

// .class �ļ���û�й���������˵��������<init>([����]) ��ʵ�ֶ���ʵ����ʼ����ֵ��
/*
	<init>([����])���м����������ͻ��м���[ʵ����ʼ������]
	1����Ա������ʾ��ֵ ���� privat int a=20; 1
	2���Ǿ�̬����� 2
	3�������� 3
	
	1��2 ��˳��ִ�� 3 ���ִ��
*/
class T3 {
	// �Ǿ�̬����飬�ڴ�������ʱִ�У�������
	// ÿ�δ�������ʱ��ִ�У��ȹ�������
	{
		System.out.println("�Ǿ�̬�����");
	}
	public T3(){
		System.out.println("�޲ι�����");
	}
}

��̬�������������������Ͳ�һ��
	����д�м̳У����뿴��ߣ����п��б�
	ֻ˵������˵����
	����û�ж�̬����������ʲô����ߣ�

Persion p = new Woman();

ʵ��Ӧ�ã���̬����
Cy[] all = new Cy[3];
//�洢���ζ���
all[0] = new Rect(2,4)


instanceof ������ֹ����ת��ʱ����ClassCastException�쳣

Person p = new Man();
Man m = (Man)p;

Person p = new Persion();
Man m = (Man)p; // ���־ͻᱨ��

//����
/*
	p instanceof Woman ��p��Woman�Ķ�������Ӷ�����true
*/
public static void test(Person p){
	if(p instanceof Person){ // ֻ��ִ����䣬��Ϊp��Զ��������Person���������
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

// 2021-12-16 �ڴ��ʸ���

/*
	Collection
		list
			vector
			ArrayList
			Stack
			LinkedList
		set
			HashSet
				�ײ���HashMap
			TreeSet
				�ײ���TreeMasp
					value ��һ�� Object ��������
			LinkedHashSet
	Map�洢��ֵ��
		Entry����
			Entry�ӿ���Map �ڲ��ӿڣ����е�map��ֵ�Զ�
			ʵ��������ӿ�
			jkd1.7��Entry��ʵ�֣�1.8��Node��ʵ��
		HashMap 
			keySet() ��������key
			values() ��������values
			entrySet() ����
			ͨ��hashCode �� equals ����֤�����ظ�
		TreeMap
			ͨ��Comparator �� Comparable �������Ƿ��ظ�
*/

/*
	modCount��¼�޸Ĵ���
	���Ⲣ������ʱ�����̴߳���һ���ڵ�����һ����add()��remove()
*/

/*
	1.5���룺����
		����:����������
		���������βα�ʾ��ʹ������ʵ����ȷ���������
			���ֳ�Ϊ����ʵ�Σ������β�
			���� <String>
			�ô�����ȫ���������͵�ת��
			
			
		Ϊ�����������ǰ�a��b��Ϊ�����β�
		public int sum(int a,int b){return a+b;}
*/

/*
	���Ϳ��Լ̳�
		//��ʾ����Number��������ʵ����Comparable�ӿ�
		class A<T extends Number & Comparable>{
			
		}
	
	//
	E
	K,V
	����ָ��������
		��д�������޵�����
	û��ָ������
		����Object����
*/

/**
java.io.File;
�淶���ļ��� �� /
 * windows ֧�� / �� \
 * ����ƽ̨֧�� /
 
String filePath = "E:/BaiduNetdiskDownload/�¸���Ӣ��ȶ���ļ�";
File file = new File(filePath);
System.out.println(file);
file.getName();//����
file.getPath();//���·��
file.getAbsoluteFile();//����·��
file.getCanonicalFile();//�淶·���Զ�����../ ./ / 
file.getParent();//��Ŀ¼
File parentFile = file.getParentFile();//��Ŀ¼����
file.exists();
fileDir.mkdir();//����Ŀ¼
fileDirs.mkdirs();//�ݹ鴴���ļ�Ŀ¼�������༶�ļ�Ŀ¼��
// ɾ���ļ����Ŀ¼�����ж��Ƿ����
file.delete();
file.isDirectory();//�Ƿ�Ŀ¼
file.isFile();//�Ƿ��ļ�
*/
package com.filePath;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class IoFile {
	@Test
	public void test01() throws IOException{
		/**�淶���ļ��� �� /
		 * windows ֧�� / �� \
		 * ����ƽ̨֧�� /
		 */
		String filePath = "E:/BaiduNetdiskDownload/�¸���Ӣ��ȶ���ļ�/�й��javaee19��10�±�ҵ��/�й��javaEE 19��10�±�ҵ��/01java����/day22_ȫ���Ͽ�����/day22_video";
		File file = new File(filePath);
		System.out.println(file);
		file.getName();//����
		file.getPath();//���·��
		file.getAbsoluteFile();//����·��
		file.getCanonicalFile();//�淶·���Զ�����../ ./ / 
		file.getParent();//��Ŀ¼
		File parentFile = file.getParentFile();//��Ŀ¼����
		System.out.println(parentFile);
		
	}
	@Test
	//�ļ��к��ļ�Ŀ¼����
	public void test02() throws IOException{
		// �����ļ�
		File file = new File("d:/test.txt");
		if(!file.exists())
			file.createNewFile();
		// �����ļ�Ŀ¼
		File fileDir = new File("d:/a111");
		if(!fileDir.exists()){
			fileDir.mkdir();
			System.out.println("����Ŀ¼");
		}
		//�ݹ鴴���ļ�Ŀ¼�������༶�ļ�Ŀ¼��
		File fileDirs = new File("d:/a111/aaa/xxx");
		if(!fileDirs.exists())
			fileDirs.mkdirs();//mkdirs
	}
	@Test
	//�ļ���ɾ����
	public void test03() throws IOException{
		// ɾ���ļ����Ŀ¼
		File file = new File("d:/test.txt");
		if(file.exists())
			file.delete();
		File fileDirs = new File("D:\\a111\\aaa");
		System.out.println("ɾ��Ŀ¼");
		if(fileDirs.exists()){
			fileDirs.delete();
			System.out.println("ɾ��Ŀ¼");
		}
		file.isDirectory();
		file.isFile();
	}
}


//���ʵ�ǰĿ¼�����ļ����ļ���
public void show(File file) throws IOException{
	String[] list = file.list();
	File[] listFiles = file.listFiles();
	for (File f : listFiles) {
		if(f.isDirectory()){
			System.out.println("Ŀ¼:"+f.getPath());//��ʾĿ¼
			show(f);
			
		}else{
			System.out.println(f);//��ʾ�ļ�
		}
	}
}
//�����ļ���С
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
	/////////////////��Ƶ����////////////////////
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

//ɾ���ļ����ļ���
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
	
	/////////////��Ƶ����///////////////////////
	if(file.isDirectory()){
			File[] list = file.listFiles();
			for (File f : list) {
				deleteDir(f);
			}
		}
		file.delete();
}


//�ļ�����
		String path = "D:\\xshell5\\Xshell";//�����¼�Ŀ¼
		File file = new File(path);
		File[] listFiles = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// ����java��β�ģ����ҳ��ȴ���10��
				return pathname.getName().endsWith(".bat")
						&&
						pathname.getName().length()<10;
			}
		});
		
/**
java���ļ���д�ķ���
IO����file�����У�������������������������


�ĸ�����/����/����(���ǳ�����)
InputStream
OutputStream
Reader
Writer

1 file����ֻ�Ƕ��ļ��Ĳ���
	�������(�ѳ���Ϊ������)
	������ļ�
	���뵽����
2 �ֽ���
	��Ƶ��ͼƬ�ȶ�����
	�������

3 �ַ���
	���ı��ļ��Ĳ���
	
����ʵ���� 
�ֽ���
FIleInputStream
FIleOutputStream
ת��
InputStreamReader(fis,"gbk");
OuputStreamWriter(ofs,"gbk");

DataInputStream
DataOutputStream

��Ҫʵ�����л��ӿ� Serializable,�������к� serialVersionUID = 1L; ���� �ӿ� Externalizable
ObjectInputStream
ObjectOutputStream
������ ���Ч��
BufferedInputStream
BufferedOutputStream


�ַ���
FileReader
FileWriter
����
BufferedReader
BufferedWriter

�ڵ����ʹ�������
	�ڵ�����filexxx
	���������ڽڵ��������ϣ�Bufferxxx,Objectxxx,Dataxxx
	
װ�������ģʽ

flash()����ϻ�����ʹ��
**/

package com.filePath;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class TIO {
	@Test//��ȡ�ļ�����
	public void test01() throws IOException{
		FileReader fr = new FileReader("E://eDiary//JAVA/t.txt");//�ַ���
		char[] arr = new char[10];
		while(true){
			int read = fr.read(arr);// һ��unicode���롢һ��arr��һ��ָ��arr
			if(read == -1){
				break;
			}
			String re = new String(arr,0,read);//charתString
			System.out.print(re);
		}
		fr.close();//�ر���
	}
	
	@Test//д�ļ�
	public void test02() throws IOException{
		FileWriter fw = new FileWriter("E://eDiary//JAVA/t.txt", true);//����׷��ģʽ
		String x = "aaaaa2";
		fw.write("\n");//����
		fw.write(x);
		fw.close();//�ر���
	}
	@Test//�����ļ�
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
		fw.close();// ���رվͲ��ᱣ��
	}
}





Scanner sc = new Scanner(System.in);
String a = sc.nextLine();//�Ի��з���Ϊ�������������һ�����з�
String b = sc.next();//һ�ո����



/*
	�ļ������Ϊ�������������塣
		����������ļ��ĸ���Ч��
	IO ����
	BufferedInputStream
	BufferedOutputStream
	�ļ��ַ�����
	BufferedReader
	BufferedWriter
	
	
����ͽ���
����
	1���Ƚ��ļ����ֽ�������ʽ������
		FileInputStream fis = new FileInputStream(path);
	2�������������ֽ������ض��ı����ʽ����
		InputStreamReader isw = new InputStreamReader(fis,"gbk");
	3�����Խ�����뻺���Ҳ�ɲ���
		BufferedReader br = new BufferedReader(isw);
	4����ȡ�ļ�����
		char[] arr = new char[10];//���ַ�Ϊ��λ
		int len = br.read(arr);
		String s = br.readLine();
����		
	1���Ƚ��ļ����ֽ�������ʽд
		FileOutputStream fos = new FileOutputStream(path);
	2�������������ֽ������ض��ı����ʽ����
		OutputStreamWriter osw = new OutputStreamWriter(fis,"gbk");
	3�����Խ�����뻺���Ҳ�ɲ���
		BufferedWriter bw = new BufferedWriter(osw);
	4����д����
		String txt = "��ã�123";
		bw.write(txt);//���ݣ��ַ���->�ֽ�->fos������->�ļ�
		bw.close();//���رղ��ᱣ��
		
�����ļ��ǽڵ����⣬��������Ҫ��װ������

���Ʊ����ض�ֵ���ͣ�DataInputStream ���� ObjectInputStream
���л���������ת��Ϊ�ֽ���
	���л��������ʵ��Serializable �ӿ�,������к� serialVersionUID = 1L;
		������ʱ��Ҫ������������ɷ�����ӣ���Ҫ����toString()
�����л������ֽ���ת��Ϊ����

�������л������ԣ�private transient int a ;
				  public static int x=100;
*/

//������ϰ
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
	//д����������
	public void test02() throws IOException{
		//ԭ����
		int num = 123;
		double d = 122.21;
		boolean bool = false;
		String st = "����";
		FileOutputStream fos = new FileOutputStream("data.dat");//�����ֽ���
		DataOutputStream dos = new DataOutputStream(fos);//����Ĵ���ʽ������ԭ��������
		dos.writeInt(num);
		dos.writeDouble(d);
		dos.writeBoolean(bool);
		dos.writeUTF(st);
		dos.close();
		fos.close();
		
	}
	
	@Test
	//���ղ�д������
	public void test03() throws IOException{
		//ԭ����
		FileInputStream fis = new FileInputStream("data.dat");//�����ֽ���
		DataInputStream dis = new DataInputStream(fis);//����Ĵ���ʽ������ԭ��������
		//��д˳�����һ�£���������
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
	//д�� "����" ����
	public void test04() throws IOException{
		User user = new User("����", 12);//�������ʵ��Serializable�ӿ�
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
	//��ȡ"����"���ݣ�˳�����һ��
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
	// �� file -> fis -> bis ->bos ->fos -> bis.close->fis.close->bos.close->fos.close
	public void copy(String filePath,String copyFilePath) throws IOException{
		FileInputStream fis = new FileInputStream(filePath);//���ļ������ֽ��� |����
		BufferedInputStream bis = new BufferedInputStream(fis);//���ļ����뻺���� |����
		
		FileOutputStream fos = new FileOutputStream(copyFilePath);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte[] arr = new byte[10];
		int len;
		while((len = bis.read(arr))!=-1){
			bos.write(arr,0,len);
		}
		//�������ף���������
		bis.close();
		fis.close();
		
		bos.close();
		fos.close();
		
		
	}
	//BufferedReader ��ϰ
	// ���� �ֽ�->�ַ� ֻ�ܴ����ı�
	public void readFile(String filePath) throws IOException{
		FileInputStream fis = new FileInputStream(filePath);//�ֽ���
		InputStreamReader isr = new InputStreamReader(fis, "GB2312");//ת���ַ�
		//isr.read();����ֱ�Ӷ���Ҳ���Էŵ�������
		BufferedReader br = new BufferedReader(isr);//���ļ������ַ������� |����
		String str;
		char[] arr = new char[3];
		//BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		//bw.newLine();//ר��д��һ������Ϊ�˿�ƽ̨��cϵ����\r\n���ǻ���
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
		fis.close();
	}
	//д�붼���ֽ�д��ģ���Ҫ����,ֻ�ܴ����ı�
	public void writerFile(String filePath) throws IOException{
		//����1
		String txt = "�Һܺã�";
		FileOutputStream fos = new FileOutputStream(filePath);//����FileWriter�����ַ���
		fos.write(txt.getBytes("gbk"));
		
		//����2
		FileOutputStream fos2 = new FileOutputStream(filePath);//����FileWriter�����ַ���
		OutputStreamWriter osw = new OutputStreamWriter(fos2);
	}
	
}














