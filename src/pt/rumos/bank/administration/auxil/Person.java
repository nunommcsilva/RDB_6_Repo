package pt.rumos.bank.administration.auxil;

//public class Person {
//}

/*
 * =================================================================
 * Person.java. Create person objects and compute their age...
 * 
 * Written By: Mark Austin                             December 2006
 * =================================================================
 */

import java.lang.Math.*;
import java.util.*;
import java.io.*;
import java.text.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
   protected String   sName;
   protected Date birthdate;//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

   // ==============================================================
   // Set/get name of a person 
   // ==============================================================

   public void setName( String sName ) {
      this.sName = sName;
   }

   public String getName() {
      return sName;
   }

   // ==============================================================
   // Compute age of a person ...
   // ==============================================================

   public int getAge() {

      // Calendar objects for "today" and "date of birth"...

      Calendar today    = Calendar.getInstance(); 
      Calendar birthday = new GregorianCalendar();//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      birthday.setTime( birthdate );//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

      // Compute basic difference in years ....

      int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

      // Birthday still needs to occur this year...

      if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
	  yearDiff = yearDiff - 1;
      else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
               today.get(Calendar.DATE)   < birthday.get(Calendar.DATE) ) {
	  yearDiff = yearDiff - 1;
      }

      return yearDiff;
   }

   public void setBirthDate(Date aBirthDate) {//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      this.birthdate = aBirthDate;//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
   }

   public void setBirthDate(int iYear, int iMonth, int iDay ) {//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      Calendar cal = Calendar.getInstance();//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      cal.set( iYear, iMonth, iDay );//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      this.birthdate = cal.getTime();//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
   }

   public Date getBirthDate() {//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      return birthdate;//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
   }

   // ==========================================================
   // Create a String description of a persons cridentials 
   // ==========================================================

   public String toString() {
      String s = "Name: " + getName() + "\n"; 
            s += " Age: " + getAge() + "\n"; 
      return s;
   }

   // ==========================================================
   // Exercise methods in Person class ....
   // ==========================================================

   public static void main ( String [] args ) {

      // Create and print a person object ...

      Person homer = new Person();//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      homer.setName("Homer Simpson");
      homer.setBirthDate ( 1956, Calendar.JANUARY, 1 );//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      System.out.println ( homer );

   }
}

