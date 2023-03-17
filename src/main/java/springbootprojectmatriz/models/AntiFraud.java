package springbootprojectmatriz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AntiFraud {
	
	
	   @JsonProperty("clientIP")
	    private String clientIP;

	    @JsonProperty("merchantDefineData")
	    private MerchantDefineData merchantDefineData;

		public String getClientIP() {
			return clientIP;
		}

		public void setClientIP(String clientIP) {
			this.clientIP = clientIP;
		}

		public MerchantDefineData getMerchantDefineData() {
			return merchantDefineData;
		}

		public void setMerchantDefineData(MerchantDefineData merchantDefineData) {
			this.merchantDefineData = merchantDefineData;
		}

	   
	    
}
