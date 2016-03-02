package com.nazarenolevy.ejericicios.ejercicioPaquetes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class ClientTest {
	
	private Pack pack;
	private Single single;
	private Company company;
	
	@Before
	public void setUp(){
		single  = new Single("SingleTest", 3000);
		company = new Company("COmpanyTest", 50000);
		
		pack = mock(Pack.class);
	}
	
	
	@Test(expected = BalanceExceptions.class)
	public void reservePackage() throws BalanceExceptions{
		
		when(pack.getTotalPrice()).thenReturn(50000000.2);
		
		single.reservePackage(pack);
		
	}

}
