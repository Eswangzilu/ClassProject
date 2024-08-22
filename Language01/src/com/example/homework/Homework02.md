# Java Homework-02

```
本作业涉及大量Java API知识点，通过训练可以掌握
1.静态方法相互关系与使用
2.方法参数与返回值
3.静态方法与构造器使用差异
4.Date日期类与SimpleDateFormat日期格式化类
5.BigDecimal类与NumberFormat数字格式化类
6.StringBuilder类与StringBuffer类
7.java.lang中的包装类型
8.异常捕捉与处理
```





## Question 0

请自行决定Git分支，并按照自身喜好管理项目、包、类文件



## Question 1

在本次作业的文件中(Question1.java)创建一个静态方法，这个方法的作用是将 **意大利地区** 用户提供的 **浮点数存款值** 与 **整数类型存款年限** 转换为金额后进行计算，并返回**计算存款用户指定年份后应当收获的金额**，返回值类型为**字符串包装类型String**；请注意，本次存款年利率为0.02%，请注意本方法中所有数字均要使用 **金融环境** 以确保业务正常，如下代码为方法签名，仅供参考

```java
public static ??????? financial(??????? money, ??????? years)
```

代码中问号数量与所需数据类型无关。下方公式用于计算年利率影响下用户存款情况
$$
f(x) = x*(1 + p)^y
$$
其中有**x: 存款金额，p: 年利率，y: 存款年数**，仅供参考。Java中BigDecimal对象拥有pow(int n)方法，用于计算乘方，样本代码如下

```java
...
  	BigDecimal number = new BigDecimal("3.14");
		BigDecimal result = number.pow(5);
...
// 此运算计算了3.14的5次方，result中的值为计算结果
```

供参考。



## Question 2

某公司需要将用户数据存储入数据库中，但是用户仅可提供日期字符串与字符串格式。在本次作业的文件中(Question2.java)创建一个静态方法，此方法接收两个参数：**日期的字符串**，**日期的结构通式**；而此方法将会返回一个**字符串**，格式如下：

```
日期为: Thu Dec 19 20:23:07 CST 2002, 距离今天已经过去了: ????天
```

此方法中需要捕捉进行日期转化时可能产生的ParseException，自行处理，签名如下

```java
public static ??????? distance(??????? date, ??????? format)
```

供参考



## Question 3

在本次作业的文件中(Question3.java)创建一个静态方法，此静态方法无参数、无返回值。需要你在该方法中自行定义如下字符串到StringBuffer中

```
The quick brown donkey jump over the lazy dog
```

完成后请按照顺序编写下方任务

- 将其中**"donkey"**字眼替换为**"fox"**
- 在文本最后添加**" !!"**
- 文中**"jump"**后方插入一个**"s"**来解决动词变位错误问题
- 将文本所有字符变为大写
- 输出最终文本

方法签名如下

```java
public static void sentence()
```

供参考