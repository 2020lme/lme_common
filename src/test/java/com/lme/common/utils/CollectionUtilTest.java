package com.lme.common.utils;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CollectionUtilTest {

	@Test
	public void testisEmpty() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Nihao");
		boolean flag = CollectionUtil.isEmpty(list);
		System.out.println(flag);
	}

}
