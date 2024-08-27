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

    public User(){ //constructor obyekt yarananda ilk defe ise dusur
       // System.out.println("hello aytj");
       //asagida yazdiqlarim default olaraq gosterilsin deye yazilib yeni hele ki teyin edilmeyib amma obyekt yarananda teyin edende value-su belli olacaq 
       String name = "alma"; 
       this.name = "name is undefined";
       this.surname = "surname is undefined";
       this.age = -1;
       callMeWhenYouCreated(); //Obyekt yaranan zaman hemin deqiqe cagirilacaq is ishleyecek
       
       objectCount++; // obyekt yaranan kimi artacaq 
    }
    
    
    public void callMeWhenYouCreated(){
        System.out.println("men burada cox vacib is gorurem");
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
    
    public static void foo(){ //rekursiya metod ozu ozunu cagirir
        foo2(); //pause foo2nin icinde is gedir foo3u cagirir foo3 cixdiqdan sonra qayidir foo2ni cixardir sonra qayidir foo-nu cixardir
        System.out.println("foo is called");
        
    }
    public static void foo2(){
        foo3();//pause foo3un icinde is gedir foo3u cixardir isini bitirir qayidir foo2ni cixardir 
        System.out.println("foo2 is called");
    }
    public static void foo3(){
        System.out.println("foo3 is called");
    }
    
    
}
