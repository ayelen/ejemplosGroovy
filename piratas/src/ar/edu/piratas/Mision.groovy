package ar.edu.piratas

class Mision {
	
	def puedeSerCompletadaPor(unBarco){
		
		unBarco.tripulacion.size() > unBarco.capacidad * 0.9
	}

}
