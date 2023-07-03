package aaa.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MemData {
	public Map<String, ArrayList<String>> mem = new HashMap<>();

	public MemData() {
		super();
		ArrayList<String> member = new ArrayList<>();
		member.add("장동건");
		member.add("1111");
		mem.put("aaa",member);
		member = new ArrayList<>();
		member.add("장서건");
		member.add("2222");
		mem.put("bbb",member);
		member = new ArrayList<>();
		member.add("장동건");
		member.add("3333");
		mem.put("ccc",member);
		member = new ArrayList<>();
		member.add("장남건");
		member.add("1111");
		mem.put("ddd",member);
		member = new ArrayList<>();
		member.add("북두신건");
		member.add("3333");
		mem.put("eee",member);
		member = new ArrayList<>();
		member.add("관리자");
		member.add("1234");
		mem.put("root",member);
	}
	
	
}
