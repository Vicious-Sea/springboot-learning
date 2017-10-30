package com.sam.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

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

	@Test
	public void contextLoads() {


	}

}
