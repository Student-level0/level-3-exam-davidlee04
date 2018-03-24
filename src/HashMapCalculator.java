import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int count = 0;
		for(String name : hashmap1.keySet()) {
			for(String name2 : hashmap2.keySet()) {
				if(name.equals(name2)) {
					if(hashmap1.get(name) == hashmap2.get(name2)) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
