

# Spring boot learning (一) web项目

## 快速搭建spring boot learning 

### 启动项目

>`file`->`new`->`project`->`Spring Initializr` ->`文件名等操作`->`选择web`->`其他操作`->`finish`

![Jietu20171030-210746](http://oy2x74gbg.bkt.clouddn.com/2017-10-30-Jietu20171030-210746.jpg)

![Jietu20171030-211021](http://oy2x74gbg.bkt.clouddn.com/2017-10-30-Jietu20171030-211021.jpg)

*欣赏一下 pom.xml(自动生成)*

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/
2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/
	xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>com.sam.springboot</groupId>
	<artifactId>springboot</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>springboot</name>
	<description>Demo project for Spring Boot</description>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.8.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
	   <!--web项目需要的包都集成在一起-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
        <!--测试-->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>


</project>

```

### 写一个Controller

```java
@RestController
@EnableAutoConfiguration
@RequestMapping("/hello")
public class SamController {

    @RequestMapping("/sam")
    public String index(){
        //返回内容
        return "hello sam";
    }
}
```

### 运行...Application main方法

```java
//此内容自动生成
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
```

*漂亮的控制台*


![Jietu20171030-212208](http://oy2x74gbg.bkt.clouddn.com/2017-10-30-Jietu20171030-212208.jpg)



### 浏览器访问
- 浏览器输入locahost:8080/hello/sam

*当当当当*

![Jietu20171030-213030](http://oy2x74gbg.bkt.clouddn.com/2017-10-30-Jietu20171030-213030.jpg)

# Spring boot learning (二) 连接MySQL
## 添加依赖

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
```

## 添加配置文件，配置数据库

**`resource`->`application.properties`**

*添加内容如下：*

```properties
# 主要添加前四项，注意配置正确
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/test
spring.datasource.username=root
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.jdbc.Driver

spring.datasource.max-idle=10
spring.datasource.max-wait=10000
spring.datasource.min-idle=5
spring.datasource.initial-size=5    
server.port=8011
server.session.timeout=10
server.tomcat.uri-encoding=UTF-8

```

## 测试

*添加测试内容并运行*

```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {
	@Autowired
	/*连接数据库的类*/
	private JdbcTemplate jdbcTemplate;
	/*测试查询*/
	@Test
	public void testMySql() {
		List<Map<String,Object>> result = jdbcTemplate.queryForList("SELECT * FROM country");
		System.out.println("query result is" + result.size());
		System.out.println("success");
	}
	/*测试Update*/
	@Test
	public void testMySqlForUpdate() {
		jdbcTemplate.execute("UPDATE country SET countryname='ChinaNo1' WHERE id='35'");
		System.out.println("success");
	}
    //其他测试
}

```

## MySQL图形客户端
>推荐使用NaviCat 强大！智能！谁用谁知道！👍 
>Mac系统可以问我要安装包。

**[更多内容请点击](http://www.samcn26.com/category/#SpringBoot)**
