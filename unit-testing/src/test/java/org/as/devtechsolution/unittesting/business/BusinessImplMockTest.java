package org.as.devtechsolution.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.as.devtechsolution.unittesting.service.BusinessDataService;
import org.junit.Test;;

public class BusinessImplMockTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		BusinessImpl business = new BusinessImpl();
		BusinessDataService dataServiceMock = mock(BusinessDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });

		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_empty() {
		BusinessImpl business = new BusinessImpl();
		BusinessDataService dataServiceMock = mock(BusinessDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateSumUsingDataService_oneValue() {
		BusinessImpl business = new BusinessImpl();
		BusinessDataService dataServiceMock = mock(BusinessDataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5 });

		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
}
