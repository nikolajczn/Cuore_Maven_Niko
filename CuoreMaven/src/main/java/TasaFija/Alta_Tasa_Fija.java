package TasaFija;

import java.util.List;

public class Alta_Tasa_Fija {

	private String parentRateId;
	private String rateDate;
	private String rateID;
	private String rateInterest = "0.0";
	private boolean rateIsMultiplier;
	private boolean rateIsTop;
	private String rateState = "Alta";
	private List<String> rateSub;
	private String rateSubTypeRate;
	private String rateTypeMoney; 
	private RateTypeRate rateTypeRate;
	
	
    
	public String getparentRateId() {
		return parentRateId;
	}

	public void setparentRateId() {
		this.parentRateId = parentRateId;
	}
	
	public String getrateDate() {
		return rateDate;
	}

	public void setrateDate() {
		this.rateDate = rateDate;
	}
	
	public String getrateID() {
		return rateID;
	}

	public void setrateID(String rateID) {
		this.rateID = rateID;
	}
	
	public String getrateInterest() {
		return rateInterest;
	}	

	public void setrateInterest() {
		this.rateInterest = rateInterest;
	}
	
	public boolean getrateIsMultiplier() {
		return rateIsMultiplier;
	}

	public void setrateIsMultiplier(boolean rateIsMultiplier) {
		this.rateIsMultiplier = rateIsMultiplier;
	}
	
	public boolean getrateIsTop() {
		return rateIsTop;
	}

	public void setrateIsTop(boolean rateIsTop) {
		this.rateIsTop = rateIsTop;
	}
	
	public String getrateState() {
		return rateState;
	}

	public void setrateState() {
		this.rateState = rateState;
	}
	
	public List<String> getrateSub() {
		return rateSub;
	}

	public void setrateSub() {
		this.rateSub = rateSub;
	}
	
	public String getrateSubTypeRate() {
		return rateSubTypeRate;
	}

	public void setrateSubTypeRate(String rateSubTypeRate) {
		this.rateSubTypeRate = rateSubTypeRate;
	}
	
	public String getrateTypeMoney() {
		return rateTypeMoney;
	}

	public void setrateTypeMoney(String rateTypeMoney) {
		this.rateTypeMoney = rateTypeMoney;
	}
	
	public RateTypeRate getrateTypeRate() {
		RateTypeRate rateTypeRate = new RateTypeRate();
    	this.rateTypeRate = rateTypeRate;
		return rateTypeRate;
	}

    public void setrateTypeRate() {
    	this.rateTypeRate = rateTypeRate;
	}

	
}
