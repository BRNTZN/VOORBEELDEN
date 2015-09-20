package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StreamSupplier {

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
		
		StreamSupplier supplier = new StreamSupplier();
//		Supplier<String> supplier = () -> arrayList.stream();

	}

}
