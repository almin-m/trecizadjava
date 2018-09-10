
package javaapplication10;

import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.LocalTime;
import java.time.LocalDate;


public  class Person {
    
  public  String name;
 public    String surname;
  public  String place;
   LocalDate date;
  

public Person (String name, String surname, LocalDate date, String place){

this.name=name;
this.surname=surname;
this.date=date;
this.place=place;


}


@Override
public String toString(){
      
   
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd. MMM yyyy.");
String s = date.format(dtf); 

return "Ime: "+this.name +", prezime: "+this.surname + ", datum rodjenja: " + s + ", mjesto rodjenja: "+this.place ;

}
}