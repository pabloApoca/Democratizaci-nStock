package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.LoteDao;
import datos.Cliente;
import datos.Local;
import datos.Lote;

public class LoteAbm {
	LoteDao loteDao = new LoteDao();
	
	
	public int agregarLote(int cantidad, LocalDate fechaIngreso, Local local) {
	Lote lote = new Lote(  cantidad, fechaIngreso, local);	
	return loteDao.agregarLote(lote);
}
	
	public Lote traerLote(long idLote) {
		return loteDao.traerLote(idLote);
	}

	public List<Lote> traerLote() {
		return loteDao.traerLote();
	}
	

	public List<Lote> traerLoteLocal(long idLocal) {
		return loteDao.traerLoteLocal(idLocal);
	}
	
	
	
	
	

}
