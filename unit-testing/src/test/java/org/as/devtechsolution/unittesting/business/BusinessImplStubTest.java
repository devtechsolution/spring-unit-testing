package org.as.devtechsolution.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.as.devtechsolution.unittesting.service.BusinessDataService;
import org.junit.Test;

public class BusinessImplStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new BusinessDataServiceStubImpl());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_empty() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new BusinessDataServiceEmptyStubImpl());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_oneValue() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new BusinessDataServiceOneValueStubImpl());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
}

class BusinessDataServiceStubImpl implements BusinessDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 1, 2, 3 };
	}

}

class BusinessDataServiceEmptyStubImpl implements BusinessDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {};
	}

}

class BusinessDataServiceOneValueStubImpl implements BusinessDataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 5 };
	}

}
