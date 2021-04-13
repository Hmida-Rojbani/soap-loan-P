package de.tekup.loan.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import de.tekup.loan.service.LoanEligebiltyService;
import de.tekup.loan.soap.ws.loaneligebilty.CustomerRequest;
import de.tekup.loan.soap.ws.loaneligebilty.WsResponse;

@Endpoint
public class LoanEligebiltyEndPoint {

	public static final String nameSpace="http://www.tekup.de/loan/soap/ws/loanEligebilty";
	@Autowired
	private LoanEligebiltyService service;
	
	@PayloadRoot(namespace = nameSpace, localPart = "CustomerRequest")
	@ResponsePayload
	public WsResponse getLoanStatus(@RequestPayload CustomerRequest customerRequest) {
		return service.checkLoanEligebilty(customerRequest);
	}
}
