
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

	/**
	 * @param args
	 */
	private static final long serialVersionUID = -479397564067719956L;
	private int size;
	
	private LRUCache(int size) {
		super(size, 0.75f, true);
		this.size = size;
	}
	
	public static <K, V> LRUCache<K, V> newInstance(int size) {
		return new LRUCache<K, V>(size);
	}
	
	public void setMaxSize(int size) {
		this.size = size;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache<String, String> lrucache = LRUCache.newInstance(3);
		lrucache.put("A", "A");
		lrucache.put("B", "B");
		lrucache.put("C", "C");
		lrucache.put("D", "D");
		lrucache.put("E", "E");
		
		System.out.println("LRU of 3 is: " + lrucache);
		
	}
}
