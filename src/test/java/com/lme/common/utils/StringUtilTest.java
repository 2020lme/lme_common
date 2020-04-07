package com.lme.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilTest {

	@Test
	void testHasLength() {
		String src = "abc";
		boolean flag = StringUtil.hasLength(src);
		System.out.println(flag);
	}

	@Test
	void testHasText() {
		String src = " ";
		boolean flag = StringUtil.hasText(src);
		System.out.println(flag);
	}

	@Test
	void testRandomChineseString() {

		String str = StringUtil.randomChineseString(500);
		System.out.println(str);
		
	}

	@Test
	void testGenerateChineseName() {
		String name = StringUtil.generateChineseName();
		System.out.println(name);
	}

}
