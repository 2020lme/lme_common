package com.lme.common.utils;


import org.junit.jupiter.api.Test;


class RandomUtilTest {

	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test//返回一个
	public void testRandomCharacter() {
		char character = RandomUtil.randomCharacter();
		System.out.println(character);
	}

	@Test
	void testRandomString() {
		String str = RandomUtil.randomString(6);
		System.out.println(str);
	}

}
