package ar.edu;

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

import ar.edu.piratas.Barco
import ar.edu.piratas.BusquedaDelTesoro
import ar.edu.piratas.Pirata


class TestMisiones {
	
	def unBarquito
	
	
	
	@Before
	void init() {
		unBarquito = new Barco(capacidad: 3)
		
		def barbaNegra = new Pirata(monedas:4, items: ['brujula','mapa'])
		
		def jackSparrow = new Pirata(monedas:4, items: ['grogXD','brujula','mapa', 'crema para peinar', 'espada', 'soga',
														'desodorante','navaja', 'timon USB', 'mantita' ])
		
		
		
		unBarquito.tripulacion.addAll([barbaNegra, jackSparrow])
		
		
		}
	
	@Test
	void testBusquedaDelTesoroSinTripulacion() {
		def busquedaDelTesoro = new BusquedaDelTesoro()
		
		assertFalse(busquedaDelTesoro.puedeSerCompletadaPor(unBarquito))
	}
	
	
	@Test
	void testBusquedaDelTesoroOK() {
		
		def busquedaDelTesoro = new BusquedaDelTesoro()
		
		def garfio = new Pirata(monedas:3, items: ['grogXD','brujula','mapa'])
		
		unBarquito.tripulacion.add(garfio)
		
		
		assertTrue(busquedaDelTesoro.puedeSerCompletadaPor(unBarquito))
	}

	
	@Test
	void testBusquedaDelTesoroConPirataGuitudo() {
		
		def busquedaDelTesoro = new BusquedaDelTesoro()
		
		def pirataGuitudo = new Pirata(monedas:2000, items: ['grogXD','brujula','mapa'])
		
		unBarquito.tripulacion.add(pirataGuitudo)
		
		assertFalse(busquedaDelTesoro.puedeSerCompletadaPor(unBarquito))
	}
}
