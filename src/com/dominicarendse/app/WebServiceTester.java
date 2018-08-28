package com.dominicarendse.app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class WebServiceTester  {
	// Web Service Tester Initialization.
	private Client client;
	private String REST_SERVICE_URL = "http://localhost:8080/filesystem-restful-api/rest/Filesystem";
	private static final String PASS = "pass";
	private static final String FAIL = "fail";
	
	/**
	 * Initializes the Web Service Tester client.
	 *
	 * @return void
	 */
	private void init() {
		this.client = ClientBuilder.newClient();
	}
	
	/**
	 * The main of the Web Service application.
	 *
	 * @param String[] args
	 *
	 * @return void
	 */
	public static void main(String[] args) {
		// Creates an instance of the Web Service Tester.
		WebServiceTester tester = new WebServiceTester();
	    
		// Initialize the tester.
	    tester.init();
	    
	    // Test the root method.
	    tester.testRoot();
	}
	
	/**
	 * Tests the /root REST point.
	 *
	 * @return void
	 */
	private void testRoot() {
		String testName = "testRoot";
		
		// Simulates a request.
		String request = this.client
				.target(this.REST_SERVICE_URL)
				.path("/root")
				.request(MediaType.APPLICATION_XML)
				.get(String.class);
		
		String result = FAIL;
		if (request != null) {
			result = PASS;
		}
		
		System.out.println(
				"Test case name: " + testName +
				"\nResult: " + result +
				"\nResponse: " + request
		);
	}
}