package security.demo.web.ligne;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import security.demo.ligne.CodeLigne;
import security.demo.ligne.Ligne;
import security.util.ApplicationException;
import security.web.servlet.MainServlet;

public class ModifyLigne extends MainServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException,
			ApplicationException {
		CodeLigne code=(CodeLigne)getMandatoryAppEnumParameter(request, "code", CodeLigne.class);

		String name=getMandatoryStringParameter(request, "name");
		String description=getStringParameter(request, "description",null);

//		Date date=getMandatoryDateParameter(request, "date", new SimpleDateFormat("yy-MM-dd HH:mm:ss SSS"));
		Date date=getMandatoryDateParameter(request, "date", new SimpleDateFormat("dd/MM/yyyy"));
		long number=getMandatoryIntParameter(request, "number");
		double percent=getMandatoryDoubleParameter(request, "percent");
		
		Ligne ligne=new Ligne(code, name, description, date, number, percent);
		
		Ligne.add(ligne);
		
	}


}
