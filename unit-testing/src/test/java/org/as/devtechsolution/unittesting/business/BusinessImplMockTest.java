package org.as.devtechsolution.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.as.devtechsolution.unittesting.service.BusinessDataService;
import org.junit.Before;
import org.junit.Test;;

public class BusinessImplMockTest {

	BusinessImpl business = new BusinessImpl();
	BusinessDataService dataServiceMock = mock(BusinessDataService.class);

	@Before
	public void before() {
		business.setDataService(dataServiceMock);
	}

	@Test
	public void calculateSumUsingDataService_basic() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });

		assertEquals(6, business.calculateSumUsingDataService());
	}

	@Test
	public void calculateSumUsingDataService_empty() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

		assertEquals(0, business.calculateSumUsingDataService());

	}

	@Test
	public void calculateSumUsingDataService_oneValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 5 });

		assertEquals(5, business.calculateSumUsingDataService());
	}
}
