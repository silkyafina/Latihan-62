/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166017.pbo.lat62;

/**
 *
 * @author User
 * Nama     : Silky Afina Saly
 * NIM      : 22166017
 * Prodi    : Sistem Informasi
 * Matkul   : PBO 1
 */
public interface LivingThing {
    public String walk();
    public String breath();
    public String eat();
}
class Human implements LivingThing{
    private String nama;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama= nama;
    }
@Override
    public String walk(){
        return "Sedang berjalan";
    }
@Override
    public String breath(){
        return "Bernafas";
    }
@Override
    public String eat(){
        return "Makan";
    }
    public static void main(String[] args) {
        Human h = new Human();  
        h.setNama("Silky");
        System.out.println(""+h.getNama()+" "+h.walk());
        System.out.println(""+h.getNama()+" "+h.breath());
        System.out.println(""+h.getNama()+" "+h.eat());
        
    }
    
}
