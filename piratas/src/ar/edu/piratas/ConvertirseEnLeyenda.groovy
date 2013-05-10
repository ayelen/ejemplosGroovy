package ar.edu.piratas



class ConvertirseEnLeyenda extends Mision{
	
	def condicionMisionConcreta(def unBarco){
		 unBarco.tripulacion.items.length() >=10
	}
}


