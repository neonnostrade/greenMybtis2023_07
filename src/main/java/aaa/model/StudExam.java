package aaa.model;

import lombok.Data;

@Data
public class StudExam {
	String name, grade;
	int avg, tot;
	int [] jum;
	public StudExam(String name, int...jum) {
		super();
		this.name = name;
		this.jum = jum;
		tot = 0;
		for (int i : jum) {
			tot+=i;
		}
		avg = tot/jum.length;
	}
}
