package org.as.devtechsolution.unittesting.business;

import java.util.Arrays;

import org.as.devtechsolution.unittesting.service.BusinessDataService;

public class BusinessImpl {

	private BusinessDataService dataService;

	public void setDataService(BusinessDataService dataService) {
		this.dataService = dataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).sum();

	}

	public int calculateSumUsingDataService() {

		int data[] = dataService.retrieveAllData();
		return Arrays.stream(data).sum();

	}

}
