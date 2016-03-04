package com.despegar.jav.service;

import org.apache.commons.lang3.RandomUtils;

public class RandomProviderImpl implements RandomProvider {
	public int nextInt(int startInclusive, int endExclusive) {
		return RandomUtils.nextInt(startInclusive, endExclusive);
	}

}
