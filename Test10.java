package elite;
    import java.util.ArrayList;
	import java.util.List;
	public class Test10{
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Ram");
	list.add("prasad");

	list.add("chenna");

	list.add("Ramprasad");

	list.add("prasad chenna");
	//list.forEach(
	//(names)->{System.out.println(names););
	//}
	list
	.stream()
	.filter(s -> s.startsWith("s"))
	.map(String::toUpperCase)
	.sorted()
	.forEach(System.out::println);
	}
	
	
	
	
	Stream.of("a1","a2","a3")
	.findFirst()
	.ifPresent(System.out::println);
	Arrays.stream(new int[] {1,2,3})
	.map(n->2*n+1)
	.average()
	.ifPresent(System.out::println);
	
	


