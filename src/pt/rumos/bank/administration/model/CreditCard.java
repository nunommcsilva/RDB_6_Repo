package pt.rumos.bank.administration.model;

import java.util.Objects;

public class CreditCard {

	private Integer uniqueNumber;
	private Integer pin;
	private Integer timesWithdrawnToday;
	private Double balance;
	private Double plafond;
	private Boolean isFirstUse;

//----------------------------------------------------//
	public Boolean getIsFirstUse() {
		return isFirstUse;
	}

	public void setIsFirstUse(Boolean isFirstUse) {
		this.isFirstUse = isFirstUse;
	}

	public Integer getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(Integer uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Integer getTimesWithdrawnToday() {
		return timesWithdrawnToday;
	}

	public void setTimesWithdrawnToday(Integer timesWithdrawnToday) {
		this.timesWithdrawnToday = timesWithdrawnToday;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getPlafond() {
		return plafond;
	}

	public void setPlafond(Double plafond) {
		this.plafond = plafond;
	}

//--------------------------------------------------//
	@Override
	public int hashCode() {
		return Objects.hash(balance, pin, plafond, timesWithdrawnToday, uniqueNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CreditCard other = (CreditCard) obj;
		return Objects.equals(balance, other.balance) && Objects.equals(pin, other.pin)
				&& Objects.equals(plafond, other.plafond)
				&& Objects.equals(timesWithdrawnToday, other.timesWithdrawnToday)
				&& Objects.equals(uniqueNumber, other.uniqueNumber);
	}

	@Override
	public String toString() {
		return "CreditCard [uniqueNumber=" + uniqueNumber + ", pin=" + pin + ", timesWithdrawnToday="
				+ timesWithdrawnToday + ", balance=" + balance + ", plafond=" + plafond + "]";
	}

}
