import java.util.Map;
import java.util.HashMap;

public class StringMap implements SimpleMap {

	Map<String, String> dictionary;

	public StringMap() {
		dictionary = new HashMap<String, String>();
	}

	public void put(int key, String name) {
		String stringKey = new Integer(key).toString();
		dictionary.put(stringKey, name);
	}

	public String get(int key) {
		String stringKey = new Integer(key).toString();
		return dictionary.get(stringKey);
	}

	public void remove(int key) {
		String stringKey = new Integer(key).toString();
		dictionary.remove(stringKey);
	}

	public boolean isEmpty() {
		return dictionary.isEmpty();
	}

}