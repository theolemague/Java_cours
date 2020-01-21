
public class MultiMapClient{
	public static void main (String args[]){
		
		MultiMap<K, List<V>> mm = new MultiMap<K, List<V>>();
		
		mm.putOneValue(1, "salut");
		mm.putOneValue(1, "ca va ?");
		mm.putOneValue(2, "Je");
		mm.putOneValue(2, "suis");
		mm.putOneValue(2, "Theo");

		System.out.println(mm); // ToString de hashmap

		System.out.println(mm.containsOneValue("salut"));
		System.out.println(mm.containsOneValue("tulas"));
	}
}