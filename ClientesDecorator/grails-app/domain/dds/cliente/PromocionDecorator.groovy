package dds.cliente

class PromocionDecorator {

	def cliente

	def puntos



	def comprar(monto) {

		cliente.comprar(monto)

		if (monto > 50) {

			puntos += 15
		}
	}
}
