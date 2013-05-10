package ar.edu.piratas



class Saqueo extends Mision{
	
	def monedasASaquear
	
	def condicionMisionConcreta(def unBarco){
		unBarco.tripulacion.every{unPirata -> unPirata.monedas <= monedasASaquear }
	}

}
