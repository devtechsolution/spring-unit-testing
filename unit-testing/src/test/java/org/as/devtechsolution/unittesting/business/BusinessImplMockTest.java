package org.as.devtechsolution.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.as.devtechsolution.unittesting.service.BusinessDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;;

@RunWith(MockitoJUnitRunner.class)
public class BusinessImplMockTest {

	/*
	 * BusinessImpl business = new BusinessImpl(); BusinessDataService
	 * dataServiceMock = mock(BusinessDataService.class);
	 * 
	 * @Before public void before() { business.setDataService(dataServiceMock); }
	 */

	@InjectMocks
	BusinessImpl business;
	@Mock
	BusinessDataService dataServiceMock;

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
