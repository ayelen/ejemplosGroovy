package dds.cliente



import grails.test.mixin.*

import org.junit.*
import org.junit.rules.ExpectedException

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(SafeShopDecorator)
class SafeShopDecoratorTests {
	

	
   void testCompraSatisfactoriaConSafeShop(){
		
		def joseConSafeShop = new SafeShopDecorator(cliente: new Cliente(saldo:40),
			montoMaximoSafeShop: 20)
		
		joseConSafeShop.comprar(20)
	}
   
   @Test(expected = BusinessException.class)
   void testCompraFallidaConSafeShop(){
	   
	   def joseConSafeShop = new SafeShopDecorator(cliente: new Cliente(saldo:40),
		   montoMaximoSafeShop: 20)
	   
	   joseConSafeShop.comprar(30)
	   
   }
}
