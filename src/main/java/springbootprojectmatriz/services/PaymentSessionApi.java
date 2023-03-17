package springbootprojectmatriz.services;

import org.springframework.stereotype.Service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import springbootprojectmatriz.models.PaymentSessionRequest;
import springbootprojectmatriz.models.PaymentSessionResponse;

@Service
public interface PaymentSessionApi  {

	  @POST("session")
	  Call<PaymentSessionResponse> createPaymentSession(
	            @Header("X-Apikey") String apiKey,
	            @Header("X-Provider") String provider,
	            @Body PaymentSessionRequest request
	    );
}
