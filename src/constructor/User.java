/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author aytaj.veyisli
 */
public class User {
    private String name;
    private String surname;
    private int age;
    
    public static int objectCount;
    
//========================================================CONSTRUCTOR========================================================
    
    public User(){ //constructor obyekt yarananda ilk defe ise dusur //PARAMETRSIZ
       // System.out.println("hello aytj");
       //asagida yazdiqlarim default olaraq gosterilsin deye yazilib yeni hele ki teyin edilmeyib amma obyekt yarananda teyin edende value-su belli olacaq 
       this("Aytaj", "Veyisli");
       System.out.println("User 1"); //user 2ni gozleyir user 2de user 3u gozleyir ki isini bitirsin ona gore ilk user3 sonra user2 sonra user1 cixacaq 
        
        
        
        
   //    String name = "alma"; 
   //    this.name = "name is undefined";
   //    this.surname = "surname is undefined";
   //    this.age = -1;
     //  callMeWhenYouCreated(); //Obyekt yaranan zaman hemin deqiqe cagirilacaq is ishleyecek
       
     //  objectCount++; // obyekt yaranan kimi artacaq 
    }
    
   
    
    
    public void callMeWhenYouCreated(){
        System.out.println("men burada cox vacib is gorurem");
    }
    
    public User(String name, String surname){
        this("Lorem", "Ipsum", 25);
        System.out.println("User 2");
        this.name = name;
        this.surname = surname;
    }
    
    
    public User(String name, String surname, int age){ //obyektin icindeki deyisenleri set elemek ucun istifade olunur
        System.out.println("User 3");
        this.name = name;
        this.surname = surname;
        this.age = age;
        
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
//===============================================REKURSIYA=========================================    
    
//    public static void foo(){ //rekursiya metod ozu ozunu cagirir
//        foo2(); //pause foo2nin icinde is gedir foo3u cagirir foo3 cixdiqdan sonra qayidir foo2ni cixardir sonra qayidir foo-nu cixardir
//        System.out.println("foo is called");
//        
//    }
//    public static void foo2(){
//        foo3();//pause foo3un icinde is gedir foo3u cixardir isini bitirir qayidir foo2ni cixardir 
//        System.out.println("foo2 is called");
//    }
//    public static void foo3(){
//        System.out.println("foo3 is called");
//    }
//    
                                                                                                                            
}
