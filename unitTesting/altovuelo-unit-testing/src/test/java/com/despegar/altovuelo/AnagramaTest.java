package com.despegar.altovuelo;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class AnagramaTest {
	
	Anagrama anagrama;
	
	@Before
	public void setUp(){
		anagrama = new Anagrama();
	}
	
	@Test
	public void testIsAnagrama(){
		boolean result = anagrama.isAnagrama("TRATA", "TARTA");
		
		assertEquals(true,result);
		
	}
	
	@Test
	public void testIsNotAnagrama(){
		boolean result = anagrama.isAnagrama("ROMA", "TARTA");
		
		assertEquals(false,result);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsAnagramaPrimeraPalabraNula(){
		
		anagrama.isAnagrama(null, "TARTA");
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIsAnagramaSegundaPalabraNula(){
		
		anagrama.isAnagrama("TARTA", null);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAnagrama(){
		anagrama.anagrama(null);
	}
	
	@Test
	public void testAnagramaVacio(){
		Set<String> setVacio = anagrama.anagrama("");
		
		assertEquals(0, setVacio.size());
	}
	
	@Test
	public void testAnagramaCorrecto(){
		Set<String> setAnagramas = anagrama.anagrama("Hola");
		
		assertEquals(24, setAnagramas.size());
	}
	
	@Test
	public void testAnagramaNumero(){
		Set<String> setResultado = anagrama.anagrama("32");
		Set<String> setEsperado = new HashSet<String>();
		setEsperado.add("23");
		setEsperado.add("32");
		
		
		assertEquals(setEsperado, setResultado);
	}
	
	@Test
	public void testAnagramaMayusculas(){
		Set<String> setResultado = anagrama.anagrama("La");
		Set<String> setEsperado = new HashSet<String>();
		setEsperado.add("la");
		setEsperado.add("al");
		
		
		assertEquals(setEsperado, setResultado);
	}

}
