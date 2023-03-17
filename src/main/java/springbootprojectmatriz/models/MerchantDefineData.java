package springbootprojectmatriz.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantDefineData {


    @JsonProperty("MDD1")
    private String MDD1;

	public String getMDD1() {
		return MDD1;
	}

	public void setMDD1(String mDD1) {
		MDD1 = mDD1;
	}
    
    
	    
}
