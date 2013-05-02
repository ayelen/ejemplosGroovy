package dds.cliente

class SafeShopDecorator {

	def cliente

	def montoMaximoSafeShop



	def comprar(monto) {

		if (monto > montoMaximoSafeShop) {

			throw new BusinessException("Ha excedido el monto máximo")
		}

		cliente.comprar(monto)
	}
}