# 学习SpringMVC

## hello-spring模块

这个模块是为了理解IOC控制反转,从原本的对象由程序员创建转交到Spring容器管理

## xml-config

这个模块是为了学习各种spring配置方式

* 无参构造+引用set

```xml

<beans>
    <bean id="dog" class="com.dinl.spring.pojo.Dog"/>
    <bean id="cat" class="com.dinl.spring.pojo.Cat"/>
    <bean id="person1" class="com.dinl.spring.pojo.User">
        <property name="cat" ref="cat"/>
        <property name="dog" ref="dog"/>
    </bean>
</beans>
```

### 有参构造1

```xml

<bean id="person1" class="com.dinl.spring.pojo.User">
    <constructor-arg name="cat" ref="cat"/>
    <constructor-arg name="dog" ref="dog"/>
</bean>
```

### 有参构造2

```xml

<bean id="person1" class="com.dinl.spring.pojo.User">
    <constructor-arg type="com.dinl.spring.pojo.Dog" ref="dog"/>
    <constructor-arg type="com.dinl.spring.pojo.Cat" ref="cat"/>
</bean>
```

### 有参构造3

```xml

<bean id="person1" class="com.dinl.spring.pojo.User">
    <constructor-arg index="0" ref="dog"/>
    <constructor-arg index="1" ref="cat"/>
</bean>
```

### 复杂数据结构构造

```xml

<bean id="address" class="com.dinl.spring.pojo.Address">
    <property name="province" value="安徽"/>
    <property name="city" value="安庆"/>
    <property name="part" value="怀宁"/>
</bean>

<bean id="student" class="com.dinl.spring.pojo.Student">
<property name="address" ref="address"/>
<property name="name" value="丁亮"/>
<property name="books">
    <list>
        <value>三国演义</value>
        <value>水浒传</value>
        <value>西游记</value>
        <value>红楼梦</value>
    </list>
</property>
<property name="score">
    <map>
        <entry key="语文" value="100"/>
        <entry key="数学" value="120"/>
        <entry key="英语" value="120"/>
    </map>
</property>
<property name="age" value="24"/>
<property name="hobby">
    <set>
        <value>篮球</value>
        <value>足球</value>
        <value>篮球</value>
    </set>
</property>
</bean>
```

### p:namespace

bean标签添加: `xmlns:p="http://www.springframework.org/schema/p"`

```xml

<bean id="person2" class="com.dinl.spring.pojo.User" p:dog-ref="dog" p:cat-ref="cat"/>
<bean id="person3" class="com.dinl.spring.pojo.User" c:cat-ref="cat" c:dog-ref="dog"/>
```

## configuration

这个模块是学习配置类加载


## proxy
这个模块是学习静态代理

**代理模式的好处**
* 可以使真实角色的操作更加纯粹,不用去关注一些公共的业务
* 公共业务就交给代理角色,实现了业务的分工
* 公共业务发生扩展的时候,方便集中管理

**代理模式的缺点**
一个真实的角色就需要一个代理角色,使代码量翻倍开发效率变低


## dynamic-proxy
这个模块是学习动态代理

* 动态代理的角色和静态代理的角色一样
* 动态代理的代理类是动态生成的,不是我们直接写好的
* 动态代理两大类:
    * 基于接口--JDK动态代理
    * 基于类-- cjlib
    * java字节码
  
* 动态代理的好处
  * 静态代理的所有好处
  * 一个动态代理类代理的是一个接口,对应一类业务
  * 一个动态代理可以代理多个类