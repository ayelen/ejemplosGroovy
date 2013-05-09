package ar.edu.piratas

class Mision {
	
	def puedeSerCompletadaPor(def unBarco){
		
		(unBarco.tripulacion.size() > unBarco.capacidad * 0.9) &&
		super.puedeSerCompletadaPor(unBarco)
	}

}
