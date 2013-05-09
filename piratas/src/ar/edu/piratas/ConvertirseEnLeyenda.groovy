package ar.edu.piratas


@Mixin(Mision)
class ConvertirseEnLeyenda {
	
	def puedeSerCompletadaPor(unBarco){
		(super.puedeSerCompletadaPor(unBarco)
		&&  unBarco.tripulacion.items.length() >=10)
	}
}


