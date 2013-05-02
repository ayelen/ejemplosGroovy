package dds.cliente



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Cliente)
class ClienteTests {

	void testCompraSatisfactoria() {

		def jose = new Cliente(saldo: 40)

		jose.comprar(20)
		
		Assert.assertEquals(jose.saldo, 20)
	}
	
	
}
