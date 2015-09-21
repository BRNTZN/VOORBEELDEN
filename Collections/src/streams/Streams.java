package streams;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("zzz");
		arrayList.add("bbb");
		arrayList.add("xax");
		arrayList.add("zaz");
		arrayList.add("ll");
		arrayList.add("aaa");
		arrayList.add("fff");
		arrayList.add("zzz");

		List<String> arrayList2 = new ArrayList<>();
		arrayList.stream().filter(s -> s.contains("a")).sorted().forEach(arrayList2::add);

		for (String string : arrayList2) {
			System.out.println(string);
		}
	}

}
