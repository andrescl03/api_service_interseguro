package springbootprojectmatriz.models;

public class PaymentApiRequest {
    private Double amount;
    private AntiFraud antifraud;
    private String currency;
    private String channel;
    private Integer recurrentMaxAmount;

    public PaymentApiRequest(Double amount, AntiFraud antifraud, String currency, String channel, Integer recurrentMaxAmount) {
        this.amount = amount;
        this.antifraud = antifraud;
        this.currency = currency;
        this.channel = channel;
        this.recurrentMaxAmount = recurrentMaxAmount;
    }

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public AntiFraud getAntifraud() {
		return antifraud;
	}

	public void setAntifraud(AntiFraud antifraud) {
		this.antifraud = antifraud;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Integer getRecurrentMaxAmount() {
		return recurrentMaxAmount;
	}

	public void setRecurrentMaxAmount(Integer recurrentMaxAmount) {
		this.recurrentMaxAmount = recurrentMaxAmount;
	}

}
