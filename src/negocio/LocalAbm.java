package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.LocalDao;
import datos.Local;
import datos.Persona;


public class LocalAbm {

	LocalDao localDao = new LocalDao();
	

	public Local traerLocal(long idLocal) {
		return localDao.traerLocal(idLocal);
	}

	public List<Local> traerLocal() {
		return localDao.traerLocal();
	}
	
		public int agregarLocal(String direccion, double latitud, double longitud, int codLocal, int nroTelefono, Persona persona) {
		Local local = new Local( direccion,  latitud,  longitud,  codLocal,  nroTelefono, persona );	
		return localDao.agregarLocal(local);
	}

	

	
	
	
	
}