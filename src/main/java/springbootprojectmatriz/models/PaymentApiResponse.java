package springbootprojectmatriz.models;

public class PaymentApiResponse {
	private String code;
    private String title;
    private String message;
    private PaymentApiData data;
    
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PaymentApiData getData() {
		return data;
	}
	public void setData(PaymentApiData data) {
		this.data = data;
	}

    // getters y setters
}
