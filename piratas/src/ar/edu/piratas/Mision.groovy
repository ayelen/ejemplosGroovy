package ar.edu.piratas

abstract class Mision {
	
	def puedeSerCompletadaPor(def unBarco){
		
		(unBarco.tripulacion.size() > unBarco.capacidad * 0.9) &&
		this.condicionMisionConcreta(unBarco)
	}
	
	abstract def condicionMisionConcreta(unBarco);

}
