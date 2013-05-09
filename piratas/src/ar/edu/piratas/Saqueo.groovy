package ar.edu.piratas


@Mixin(Mision)
class Saqueo {
	
	def monedasASaquear
	
	def puedeSerCompletadaPor(unBarco){
		unBarco.tripulacion.every{unPirata -> unPirata.monedas <= monedasASaquear }
	}

}
