package com.pnt.LogbackProject;

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
	 * 日志输出
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
}
