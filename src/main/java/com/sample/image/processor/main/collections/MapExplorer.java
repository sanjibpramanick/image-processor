package com.sample.image.processor.main.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExplorer {

	public static void main(String[] args) {
		
		String str = "pramanick";

		Map<Character, Integer> charCountMap = new HashMap<>();

		str.chars().parallel().forEach(c -> {
			charCountMap.put(Character.valueOf((char) c), charCountMap.getOrDefault(Character.valueOf((char) c), 0) + 1);
		});
		
		System.out.println(charCountMap);

	}

}
