package com.lucas;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * wechat-order
 *
 * @author lucas <link>mailto:lucas.shao@foxmail.com</link>
 * @since 2018/4/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

	@Test
	public void test1() {
		String name = "lucas";
		String password = "123456";
		log.debug("debug...");
		log.info("info...-> name: {}, password: {}", name, password);
		log.info("info...");
		log.error("error...");
	}
}
