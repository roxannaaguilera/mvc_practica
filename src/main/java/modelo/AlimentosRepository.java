package modelo;

import java.util.ArrayList;
import java.util.List;

public class AlimentosRepository {
	
	public void registrarAlimento (Alimento a) {
		//TODO guardar datos de un alimento en base de datos
	}
	
	public List <Alimento> obtenerAlimentos() {
		
		List <Alimento> listado = new ArrayList<Alimento>();
		listado.add(new Alimento("arroz",3600,15,1.8,"Arroz blanco calidad superior está cuidadosamente seleccionado y procesado para ofrecer un grano largo, suave y ligeramente esponjoso al cocinarlo"));
		listado.add(new Alimento("spaguetti",1600,15,1.8,"pasta de grano largo, con un grosor medio que ofrece una textura suave y ligeramente firme al morder"));
		listado.add(new Alimento("aceite",3840,15,1.8,"Aceite de oliva extra virgen, de color dorado y sabor afrutado, con una textura suave y ligera, perfecto para aderezos y cocinar a altas temperaturas."));
		listado.add(new Alimento("harina de trigo",3600,15,1.8,"Harina de trigo de textura fina y granulometría suave, perfecta para amasar y crear masas ligeras y esponjosas en panadería y repostería."));
		listado.add(new Alimento("harina gluten free",340,15,1.8,"Harina sin gluten, con una textura suave y ligeramente granulada, ideal para preparar panes y postres sin gluten, manteniendo la ligereza y esponjosidad."));
		
		return listado;
	} 
	
	public void borrarAlimento(int id) {
		//TODO borrar alimento de id indicada 
	}
	
	public void modificarAlimento() {
		//TOOD modificar datos de un alimento 
	}

}
