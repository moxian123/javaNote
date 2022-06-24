# java常用总结

# 随机数

```java
Math.random() 产生随机数

Math.random() 产生[0,1)范围的随机值

Math.random() * 90：[0,90) 

Math.random() * 90 + 10：[10,100) 即得到 [10,99]

使用(int)(Math.random() * 90 + 10)产生一个两位数的随机数。
```

# 冒泡排序

```java
	//冒泡排序
	public static void maoPao(int[] arr){
		for (int i = 0; i < arr.length; i++) { // 遍历躺数
			for (int j = 0; j < arr.length-i-1; j++) { //比较数值交换
				if(arr[j]>arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
```

# 快速排序

```java
	/**
	 * 快速排序
	 * @param arr 排序的数组
	 * @param low 开始范围 0
	 * @param high 结束范围 length -1
	 */
	public static void quickSort(int[] arr,int low,int high){
		
		//结束条件
		if (low >= high ) return;
		
		//这样写防止越界，例如arr[low+1]越界了
		int flag = arr[low]; 
		
		//定义变量后面用来限制递归范围
		int i = low;
		int j = high;
		
		//结束条件为i == j
		while(i<j){
			
			// j <-- 找比flag小的
			if (arr[j]>=flag&&i<j){ 
				j--;
			}
			// 在j找到的基础上 再找 i --> 比flag大的
			else if(arr[i]<=flag&&i<j){
				i++;
			}
			
			// i j 都找到且不是 i == j 的情况下交换
			if(arr[j] <flag && arr[i]>flag && i<j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		
		// 结束条件i == j 找到flag的位置了
		arr[low] = arr[i];
		arr[i] = flag;
		
		//递归调用
		//System.out.println(Arrays.toString(arr));
		
		// flag的位置已经确定，找flag位置左右两边
		quickSort(arr,low,i-1);
		quickSort(arr,i+1,high);
	}
```

# 数组常用工具类

```java
/*
	java.util.Arrays类包含了用来操作数组（比如排序和搜索）的各种方法。Arrays拥有一组static方法。
	equals(数组1，数组2)：比较两个array是否相等。array拥有相同元素个数，且所有对应元素两两相等。
	fill(数组名,填充的值)：使用某个值填充array数组。 
	fill(数组名,开始下标，结束下标，填充的值)：使用某个值填充array数组的某个部分。
	sort(数组名)：用来对array进行排序。 
	binarySearch(数组名，要查找的数据)：在排好序的array中寻找元素。 只能用于已经排好序的数组，返回下标
	toString(数组名)：打印一个数组，格式：[元素值1，元素值2....]
	copyOf(原数组，新数组的长度)：复制数组，从下标为0的元素开始复制，复制n个元素。不够就默认值填充
	copyOfRange(原数组，from，to)：复制数组任意部分，从from到to（不包含）个元素
	另：System.arraycopy(原数组，开始位置，目标数组，开始位置，长度)：array的复制。
*/
```

