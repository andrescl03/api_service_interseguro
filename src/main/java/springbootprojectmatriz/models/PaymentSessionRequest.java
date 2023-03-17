package springbootprojectmatriz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentSessionRequest {
	  @JsonProperty("amount")
	    private double amount;

	    @JsonProperty("antifraud")
	    private AntiFraud antifraud;

	    @JsonProperty("currency")
	    private String currency;

	    @JsonProperty("channel")
	    private String channel;

	    @JsonProperty("recurrentMaxAmount")
	    private double recurrentMaxAmount;

	    public PaymentSessionRequest(double amount, AntiFraud antifraud, String currency, String channel, double recurrentMaxAmount) {
	        this.amount = amount;
	        this.antifraud = antifraud;
	        this.currency = currency;
	        this.channel = channel;
	        this.recurrentMaxAmount = recurrentMaxAmount;
	    }
}
