package com.nazarenolevy.ejericicios.ejercicioPaquetes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import static org.junit.Assert.*;



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
	public void testReservePackageWithoutBalance() throws BalanceExceptions{
		
		when(pack.getTotalPrice()).thenReturn(50000000.2);
		
		single.reservePackage(pack);
		
	}
	
	
	@Test
	public void testReservePackateWithBalance() throws BalanceExceptions{
		
		when(pack.getTotalPrice()).thenReturn(3000.0);
		
		single.reservePackage(pack);
		
		assertEquals(1500, (int)single.getBalance());
	}
	
	@Test
	public void testFindMostExpensivePackage(){
		Pack pack2 = mock(Pack.class);
		
		ArrayList<Pack> listPacks = new ArrayList<Pack>();
		listPacks.add(pack);
		listPacks.add(pack2);
		
		single.setArrayPackages(listPacks);
		
		
		
		when(pack2.getTotalPrice()).thenReturn(100.0);
		when(pack.getTotalPrice()).thenReturn(50.0);
		
		
		
		assertEquals(1,single.findMostExpensePackage());
	}

}
