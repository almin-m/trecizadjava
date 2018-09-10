package javaapplication10;



import java.util.Arrays;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;



public class JavaApplication10 {



 
    public static void main(String[] args)  {

   ArrayList myList = new ArrayList();
  String name = null;
  String surname = null;
  String date = null;
  String place = null;
  String s = null ;
  
String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
int i;
 String[] niz = text.split("[ ./]+");
    
       for(i=0; i < niz.length ; i+=4){
           
     name = niz [i];
    surname = niz[i+1];
     date = niz[i+2];
     place = niz[i+3];
    
    
    
           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyyy");
   LocalDate ld = LocalDate.parse(date, dtf) ;
       
    
    
   Person p = new Person (name, surname, ld, place) ;
   
   myList.add(p);
   
   }
    
  
    for (Object obj: myList){
        System.out.println(obj);
        
    }
    
        
        
        
        
        
        
        
        
        
        
        
        }

    }


