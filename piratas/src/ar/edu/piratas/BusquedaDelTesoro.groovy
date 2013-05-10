package ar.edu.piratas



class BusquedaDelTesoro extends Mision{
	
	
	def condicionMisionConcreta(def unBarco){
		unBarco.tripulacion.every{ pirata -> 
			(pirata.monedas <= 5) && pirata.items.any{item -> ['grogXD','brujula','mapa'].contains(item)}}
		
	}

}
