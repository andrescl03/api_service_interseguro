package springbootprojectmatriz.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springbootprojectmatriz.models.PaymentSessionRequest;
import springbootprojectmatriz.models.PaymentSessionResponse;
import springbootprojectmatriz.services.PaymentSessionApi;
import retrofit2.Response;

@RestController
public class PaymentSessionController {

	private PaymentSessionApi paymentSessionApi;

	@Autowired
	public PaymentSessionController(PaymentSessionApi paymentSessionApi) {
		this.paymentSessionApi = paymentSessionApi;
	}

	@PostMapping("/payment/session")
	public String createPaymentSession(@RequestBody PaymentSessionRequest request) {
		try {
			Response<PaymentSessionResponse> response = paymentSessionApi
					.createPaymentSession("4e657008-bb87-4e89-81bc-0fb62879b497", "NIUBIZ", request).execute();

			if (response.isSuccessful()) {
				PaymentSessionResponse paymentSessionResponse = response.body();
				String sessionKey = paymentSessionResponse.getSessionKey();
				return sessionKey;
			} else {
				return "Error: " + response.code() + " " + response.message();
			}
		} catch (IOException e) {
			return "Error: " + e.getMessage();
		}
	}
}
