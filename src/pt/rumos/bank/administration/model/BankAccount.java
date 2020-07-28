package pt.rumos.bank.administration.model;

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*; 

import java.util.List;
import java.util.Objects;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BankAccount {

	private Integer uniqueNumber;
	private Customer owner;
	private List<Customer> names;
	private Double balance;

//-----------------------------------------------------------//
	
	public Integer getUniqueNumber() {
		return uniqueNumber;
	}
	public void setUniqueNumber(Integer uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}
	public Customer getOwner() {
		return owner;
	}
	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	public List<Customer> getNames() {
		return names;
	}
	public void setNames(List<Customer> names) {
		this.names = names;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

//-------------------------------------------------------------------//
	
	@Override
	public int hashCode() {
		return Objects.hash(balance, names, owner, uniqueNumber);
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
		BankAccount other = (BankAccount) obj;
		return Objects.equals(balance, other.balance) && Objects.equals(names, other.names)
				&& Objects.equals(owner, other.owner) && Objects.equals(uniqueNumber, other.uniqueNumber);
	}

	@Override
	public String toString() {
		return "BankAccount [uniqueNumber=" + uniqueNumber + ", \nowner=" + owner + ", \nnames=" + names + ", \nbalance="
				+ balance + "]";
	}

}
//-------------------------------------------------------------------//