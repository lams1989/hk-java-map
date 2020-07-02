package com.lams1989.hk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<>(n);
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine().trim();
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
