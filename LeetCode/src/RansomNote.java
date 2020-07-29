import java.util.HashMap;

public class RansomNote {
	public static void main(String[] args) {
		
		char[] array = new char[] {'a', 'b', 'c', 'd', 'e', 'f'};
		
		String bed = "bed";
		String cat = "cat";
 		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(Character c : array) {
			int count = map.getOrDefault(c, 0);
			map.put(c, ++count);
		}
		
		for(Character c : cat.toCharArray()) {
			if(map.containsKey(c)) {
				int count = map.get(c);
				map.put(c, --count);
			} else {
				System.out.print("invalid");
			}
		}
		
		System.out.println("done");
	}
}
