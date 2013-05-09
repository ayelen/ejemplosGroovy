package ar.edu.piratas


@Mixin(Mision)
class BusquedaDelTesoro{
	
	
	def puedeSerCompletadaPor(unBarco){
		(super.puedeSerCompletadaPor(unBarco) 
		&&	unBarco.tripulacion.every{ (it.monedas <= 5) && it.items.containsAny(['grogXD','brujula','mapa'])
			
			}
		)
	}

}
