# day14 json转换

```java
package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TestGson {
	public static void main(String[] args) {
		Gson g = new Gson();
		
		// 测试对象Student
		Student s = new Student("张三", 20);
		//转换为json
		String json = g.toJson(s);
		//结果{"name":"张三","age":20}
		System.out.println(json);
		//json 转换为对象
		Student student = g.fromJson(json, Student.class);
		//Student [name=张三, age=20]
		System.out.println(student);
		
		//ListArray转换
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("张三",20));
		list.add(new Student("李四",21));
		//转换
		String listJson = g.toJson(list);
		//[{"name":"张三","age":20},{"name":"李四","age":21}] json数组
		System.out.println(listJson);
		List<Student> fromJson = g.fromJson(listJson,new TypeToken<List<Student>>() {}.getType());
		System.out.println(fromJson);
		
		//map
		Map<String,Student> map = new HashMap<String, Student>();
		map.put("zs", new Student("张三",12));
		map.put("ls", new Student("李四",12));
		String mapjson = g.toJson(map);
		//{"ls":{"name":"李四","age":12},"zs":{"name":"张三","age":12}}
		System.out.println(mapjson);
		//类似list
		Map<String,Student> mapfromJson = g.fromJson(mapjson, new TypeToken<Map<String,Student>>() {}.getType());
		//{ls=Student [name=李四, age=12], zs=Student [name=张三, age=12]}
		System.out.println(mapfromJson);
		
	}
}
class Student {
	private String name;
	private Integer age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
```

