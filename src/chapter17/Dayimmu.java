package chapter17;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Dayimmu {
	public static void main(String[] args) {
//		var map = Map.ofEntries(Map.entry("憲法記念日", LocalDate.of(2025,2,11)),
//				  				 Map.entry("昭和の日", LocalDate.of(2025,4,29)),
//				  				 Map.entry("建国記念日", LocalDate.of(2025,5,3)),
//				  				 Map.entry("こどもの日", LocalDate.of(2025,5,4)),
//				  				 Map.entry("みどりの日", LocalDate.of(2025,5,5)));
		
		var map = new HashMap<String, LocalDate>();
		map.put("憲法記念日", LocalDate.of(2025,2,11));
		map.put("昭和の日", LocalDate.of(2025,4,29));
		map.put("建国記念日", LocalDate.of(2025,5,3));
		map.put("こどもの日", LocalDate.of(2025,5,4));
		map.put("みどりの日", LocalDate.of(2025,5,5));
		var map2 = Map.copyOf(map);
		
		for (Entry<String, LocalDate> entry : map2.entrySet()) {
			System.out.printf("%5s\t%s\n",entry.getKey() , entry.getValue());
		}
	}
}
