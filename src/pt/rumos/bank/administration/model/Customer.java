package pt.rumos.bank.administration.model;

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

import java.time.LocalDate;
//import java.util.Date;
import java.util.Objects;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class Customer {

    private String nif;
    private String password;
    private String name;
    private LocalDate dob;
    private String telephone;
    private String cellphone;
    private String email;
    private String occupation;

    private DebitCard debitCard;
    private CreditCard creditCard;
//______________________________________________//

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

//----------------------------------------------------------//
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//---------------------------------------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//-------------------------------------------------------//
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

//------------------------------------------------------//
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

//------------------------------------------------------------//
    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
//_____________________________________________________________________________//

    @Override
    public int hashCode() {
        return Objects.hash(cellphone, dob, email, name, nif, occupation, password, telephone);
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
        Customer other = (Customer) obj;
        return Objects.equals(cellphone, other.cellphone) && Objects.equals(dob, other.dob)
                && Objects.equals(email, other.email) && Objects.equals(name, other.name)
                && Objects.equals(nif, other.nif) && Objects.equals(occupation, other.occupation)
                && Objects.equals(password, other.password) && Objects.equals(telephone, other.telephone);
    }

    @Override
    public String toString() {
        return "Customer [nif=" + nif
                + ", \npassword=" + password
                + ", \nname=" + name
                + ", \ndob=" + dob
                + ", \ntelephone=" + telephone
                + ", \ncellphone=" + cellphone
                + ", \nemail=" + email
                + ", \noccupation=" + occupation + "]";
    }
//--------------------------------------------------------------------------//	
}
