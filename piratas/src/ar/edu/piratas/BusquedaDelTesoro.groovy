package ar.edu.piratas


@Mixin(Mision)
class BusquedaDelTesoro{
	
	
	def puedeSerCompletadaPor(Barco unBarco){
		unBarco.tripulacion.every{ pirata -> 
			(pirata.monedas <= 5) && pirata.items.any{item -> ['grogXD','brujula','mapa'].contains(item)}}
		
	}

}
