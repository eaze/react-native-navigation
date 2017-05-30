package com.reactnativenavigation.utils;

import com.reactnativenavigation.BaseTest;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ReflectionUtilsTest extends BaseTest {

	static class Foo {
		private String bar = "old value";
	}

	@Test
	public void setField() throws Exception {
		Foo target = new Foo();
		ReflectionUtils.setField(target, "bar", "a new value");
		assertThat(target.bar).isEqualTo("a new value");
	}

	@Test
	public void getDeclaredField() throws Exception {
		assertThat(ReflectionUtils.getDeclaredField(new Foo(), "bar")).isEqualTo("old value");
	}
}
