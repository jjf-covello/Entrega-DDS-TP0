package DDS_UTN_FRBA_2019.ENTREGA_0;

public class Sugerencia {
	
	
	public int NumeroRecomendacion;
	
	public Prenda Pantalon;
	public Prenda calzado;
	public Prenda remera;
	public Prenda Accesorio;
	
	
	public String sugerencia() {
		
		
		return"["+ Pantalon.getDescripcion()+", "+ calzado.getDescripcion()+", "+ remera.getDescripcion()+", " + Accesorio.getDescripcion()   +"]";
		
	}
	
	
	
	
	public int getNumeroRecomendacion() {
		return NumeroRecomendacion;
	}

	public void setRecomendacion(int recomendacion) {
		this.NumeroRecomendacion = recomendacion;
	}


	
	
	public Prenda getPantalon() {
		return Pantalon;
	}
	
	public void setPantalon(Prenda pantalon) {
		Pantalon = pantalon;
	}
	
	public Prenda getCalzado() {
		return calzado;
	}
	
	public void setCalzado(Prenda calzado) {
		this.calzado = calzado;
	}
	
	public Prenda getRemera() {
		return remera;
	}
	
	public void setRemera(Prenda remera) {
		this.remera = remera;
	}
	
	public Prenda getAccesorio() {
		return Accesorio;
	}
	
	public void setAccesorio(Prenda accesorio) {
		Accesorio = accesorio;
	}


	public void imprimirSugerencia() {
		
		System.out.println(this.sugerencia());
		
		
	}



}
