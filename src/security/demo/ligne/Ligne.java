package security.demo.ligne;

import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Ligne {

	private static Ligne ligne;
		
	public final CodeLigne code;
	public final String name;
	public final String description;
	public final Date date;
	public final long number;
	public final double percent;

	public Ligne(CodeLigne code,
				 String name,
				 String description,
				 Date date,
				 long nombre,
				 double percent){
		
		this.code=code;
		this.name=name;
		this.description=description;
		this.date=date;
		this.number=nombre;
		this.percent=percent;	
	}
	
	

	public static void add(Ligne l) {
		ligne=l;
	}
	

	public static Ligne get() {
		return ligne;
	}
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
