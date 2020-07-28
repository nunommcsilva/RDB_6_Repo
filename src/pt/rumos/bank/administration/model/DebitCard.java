package pt.rumos.bank.administration.model;

import java.util.Objects;

public class DebitCard {

	private Integer uniqueNumber;
	private Integer pin;
	private Double withdrawn;
	private Boolean isFirstUse;
//____________________________________________________//

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

	public Double getWithdrawn() {
		return withdrawn;
	}

	public void setWithdrawn(Double withdrawn) {
		this.withdrawn = withdrawn;
	}
//______________________________________________________//

	@Override
	public int hashCode() {
		return Objects.hash(pin, uniqueNumber, withdrawn);
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
		DebitCard other = (DebitCard) obj;
		return Objects.equals(pin, other.pin) && Objects.equals(uniqueNumber, other.uniqueNumber)
				&& Objects.equals(withdrawn, other.withdrawn);
	}

	@Override
	public String toString() {
		return "DebitCard [uniqueNumber=" + uniqueNumber + ", pin=" + pin + ", withdrawn=" + withdrawn + "]";
	}

}
