package security.demo.ligne;

import java.util.List;

import security.util.AppEnum;

public class CodeLigne extends AppEnum{

	private static final long serialVersionUID = 1L;
	
	public static final CodeLigne LIGNE_1 = new CodeLigne("1","Ligne 1","Description de la ligne 1");
	public static final CodeLigne LIGNE_2 = new CodeLigne("2","Ligne 2","Description de la ligne 2");
	public static final CodeLigne LIGNE_AB = new CodeLigne("AB","Ligne AB","Description de la ligne AB");
	
	private CodeLigne(String id,String name,String description){
		super(id,name,description);
	}

	public static CodeLigne value(String value) {
		return  (CodeLigne)AppEnum.value(CodeLigne.class, value);			
	}

	public static List<AppEnum> values() {
		return AppEnum.values(CodeLigne.class);
	}
	
	public String toString() {
		return name;
	}
}
