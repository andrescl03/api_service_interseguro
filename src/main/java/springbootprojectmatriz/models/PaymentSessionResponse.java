package springbootprojectmatriz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentSessionResponse {
	 @JsonProperty("sessionKey")
	    private String sessionKey;

	    public PaymentSessionResponse(String sessionKey) {
	        this.sessionKey = sessionKey;
	    }

		public String getSessionKey() {
			return sessionKey;
		}

		public void setSessionKey(String sessionKey) {
			this.sessionKey = sessionKey;
		}
	    
	    
}
