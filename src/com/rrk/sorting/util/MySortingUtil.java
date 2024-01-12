package com.rrk.sorting.util;

import java.util.List;

import com.rrk.sorting.algorithm.BubbleSort;

public class MySortingUtil {

	public List<String> sort(List<String> names) {
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
	}
	
}
