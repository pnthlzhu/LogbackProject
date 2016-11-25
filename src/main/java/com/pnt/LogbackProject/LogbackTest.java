package com.pnt.LogbackProject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logback日志框架
 * @author hlzhu
 * @date 2016年11月25日
 */
public class LogbackTest {

	private Logger logger;

	@Before
	public void init() throws Exception {
		logger = LoggerFactory.getLogger(LogbackTest.class);
	}

	/**
	 * 简单日志输出
	 * @throws Exception
	 */
	@Test
	public void test1() throws Exception {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

	/**
	 * 含变量的日志输出
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		String name = "hlzhu";
		String message = "hello logback";
		String[] fruits = new String[]{"apple", "banana"};

		logger.info("Hello,{}!", name);
		logger.info("Hello,{}! {}!", name, message);
		logger.info("Fruits:{},{}", fruits);
	}
}
