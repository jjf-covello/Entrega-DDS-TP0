package DDS_UTN_FRBA_2019.ENTREGA_0;
import java.util.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CreadorDeSugerencias {
	
	public List<Sugerencia> Sugerencias= new ArrayList();
	
	
	public List<Sugerencia> getSugerencias() {
		return Sugerencias;
	}



	public void setSugerencias(List<Sugerencia> sugerencias) {
		Sugerencias = sugerencias;
	}



	public List<Prenda> ObtenerPantalones(  List<Prenda> prendas) {
		
		
		
		
		
		
		List<Prenda>pantalones;
		pantalones= prendas.stream().filter(Prenda-> Prenda.getTipo().equals("pantalon")).collect(Collectors.toList());
		
		return pantalones;
		
		
		
	}
	
	

	public List<Prenda> ObtenerRemeras(  List<Prenda> prendas) {
		
		
		
		
		
		
		List<Prenda>remeras;
		remeras= prendas.stream().filter(Prenda-> Prenda.getTipo().equals("remera")).collect(Collectors.toList());
		
		return remeras;
		
		
		
	}
	public List<Prenda> ObtenerCalzado(  List<Prenda> prendas) {
	
	
	
	
	
	
	List<Prenda>calzados;
	calzados= prendas.stream().filter(Prenda-> Prenda.getTipo().equals("calzado")).collect(Collectors.toList());
	
	return calzados;
	
	
	
}

	
	public List<Prenda> ObtenerAccesorios(  List<Prenda> prendas) {
	
	
	
	
	
	
	List<Prenda>Accesorios;
	Accesorios= prendas.stream().filter(Prenda-> Prenda.getTipo().equals("Accesorio")).collect(Collectors.toList());
	
	return Accesorios;
	
	
	
}

	
	public void ArmarSugerencias(List<Prenda> prendas) throws NoHayPrendasSuficientesException{
		
		List<Prenda> pantalones= this.ObtenerPantalones(prendas);
		List<Prenda> remeras= this.ObtenerRemeras(prendas);
		List<Prenda> calzados= this.ObtenerCalzado(prendas);
		List<Prenda>accesorios= this.ObtenerAccesorios(prendas);
		
		long cantidadPantalones= pantalones.stream().count();
		long cantidadRemeras= remeras.stream().count();
		long cantidadCalzado= calzados.stream().count();
		long cantidadAccesorios= accesorios.stream().count();
		
		
		
		
		if(this.hayCantidades(cantidadPantalones, cantidadRemeras, cantidadCalzado)){
			
			List<Sugerencia> combinacionesPosibles =this.generarTodasLasSugerencias(cantidadPantalones,pantalones, cantidadRemeras,remeras, cantidadCalzado, calzados,accesorios,cantidadAccesorios);
			
			this.setSugerencias(combinacionesPosibles);
			
		}else {
			throw new NoHayPrendasSuficientesException();
			
		}
		
		
		
		
		
	}
	
	public List<Sugerencia> generarTodasLasSugerencias(long cantidadPantalones,List<Prenda>pantalones, long cantidadRemeras,List<Prenda>remeras,long  cantidadCalzado,List<Prenda> calzados, List<Prenda>accesorios, long cantidadAccesorios){
		
		List<Sugerencia> sugerenciasPosibles= new ArrayList();
		
		if(cantidadAccesorios>0) {
		for(int i=0; i<cantidadPantalones;i++) {
			
			for(int j=0; j<cantidadRemeras; j++) {
				
				for(int k=0; k<cantidadCalzado;k++) {
					
					for(int l=0; l<cantidadAccesorios; l++) {
						
						Sugerencia nuevaSugerencia= new Sugerencia();
						nuevaSugerencia.setAccesorio(accesorios.get(l));
						nuevaSugerencia.setPantalon(pantalones.get(i));
						nuevaSugerencia.setRemera(remeras.get(j));
						nuevaSugerencia.setCalzado(calzados.get(k));
						nuevaSugerencia.setRecomendacion(l);
						
						sugerenciasPosibles.add(nuevaSugerencia);
						
						
					}}}}}else {
						
						Prenda accesorioVacio= new Prenda();
						accesorioVacio.setDescripcion(" ");
						accesorioVacio.setTipo("Accsesorio");
						
						for(int i=0; i<cantidadPantalones;i++) {
							
							for(int j=0; j<cantidadRemeras; j++) {
								
								for(int k=0; k<cantidadCalzado;k++) {
										
										Sugerencia nuevaSugerencia= new Sugerencia();
										nuevaSugerencia.setAccesorio(accesorioVacio);
										nuevaSugerencia.setPantalon(pantalones.get(i));
										nuevaSugerencia.setRemera(remeras.get(j));
										nuevaSugerencia.setCalzado(calzados.get(k));
										nuevaSugerencia.setRecomendacion(k+1);
										
										
										sugerenciasPosibles.add(nuevaSugerencia);
								}}}}
						
						
		return sugerenciasPosibles;
						
					}
		
		
		
		
		
		
		
		
		
	
		
		
	
	public boolean hayCantidades(long pantalones, long remeras, long calzados) {
		
		boolean condicion1= (pantalones>0);
		boolean condicion2= (remeras>0);
		boolean condicion3= (calzados>0);
		
		boolean condicionFinal= condicion1 && condicion2 && condicion3; 
		
		return condicionFinal;
		
		
		
	}
	
	
	
	public void mostrarSugerencias() {
		
	List<Sugerencia> todasLasSugerecias= this.getSugerencias();
	
	todasLasSugerecias.forEach(Sugerencia->Sugerencia.imprimirSugerencia());
	
	
	}
	
	

}
