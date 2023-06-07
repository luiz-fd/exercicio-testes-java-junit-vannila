package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void FinancingShouldCreateObjectWhenValidData(){		
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;		
		Financing fin = new Financing(totalAmount, income, months);		
		Assertions.assertNotNull(fin);		
	}
	
	@Test
	public void FinancingShouldThrowExceptionWhenInvalidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 40;			
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			Financing fin = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void FinancingShouldSeTotalAmountWhenValidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 100;		
		Financing fin = new Financing(totalAmount, income, months);	
		Assertions.assertAll(()->{
			fin.setTotalAmount(100020.0);
		});
	}
	
	@Test
	public void TotalAmountShouldThrowExceptionWhenInvalidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;		
		Financing fin = new Financing(totalAmount, income, months);
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			fin.setTotalAmount(100020.0);
		});
	}
	
	@Test
	public void FinancingShouldSetIncomeWhenValidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;	
		Financing fin = new Financing(totalAmount, income, months);	
		Assertions.assertAll(()->{
			fin.setIncome(4000.0);
		});
	}
	
	@Test
	public void SetIncomeShouldThrowExceptionWhenInvalidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;
		Financing fin = new Financing(totalAmount, income, months);	
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			fin.setIncome(1000.0);
		});
	}

	@Test
	public void FinancingShouldSetMonthsWhenValidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;	
		Financing fin = new Financing(totalAmount, income, months);	
		Assertions.assertAll(()->{
			fin.setMonths(100);
		});
	}
	
	@Test
	public void SetMonthsShouldThrowExceptionWhenInvalidData() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;
		Financing fin = new Financing(totalAmount, income, months);	
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			fin.setMonths(60);
		});
	}
	
	@Test
	public void EntryShouldCorrectCalculate() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;
		Financing fin = new Financing(totalAmount, income, months);	
		Double entryResult = fin.entry();
		Assertions.assertEquals(20000.0, entryResult);
	}

	@Test
	public void QuotaShouldCorrectCalculate() {
		Double totalAmount = 100000.0; 
		Double income = 2000.0; 
		Integer months = 80;
		Financing fin = new Financing(totalAmount, income, months);	
		Double quotaResult = fin.quota();
		Assertions.assertEquals(1000.0, quotaResult);
	}

}
