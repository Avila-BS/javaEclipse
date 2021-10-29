package com.xworkz.starters;
import com.xworkz.dto.examples.ItachiDTO;
public class HitachiStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ItachiDTO hitachi=new ItachiDTO();
      hitachi.setCompany("TATA");
      hitachi.setPrice(65152.99f);
      hitachi.setWeight(100.0f);
      hitachi.setColor("yellow");
      hitachi.setTyres(8);
      
      System.out.println(hitachi.getCompany());
      System.out.println(hitachi.getPrice());
      System.out.println(hitachi.getWeight());
      System.out.println(hitachi.getColor());
      System.out.println(hitachi.getTyres());
      
      ItachiDTO hitachi1=new ItachiDTO("Toyco",70000.0f,95.0f,"yellow",8);
      
      System.out.println(hitachi1.getCompany());
      System.out.println(hitachi1.getPrice());
      System.out.println(hitachi1.getWeight());
      System.out.println(hitachi1.getColor());
      System.out.println(hitachi1.getTyres());
      
      
	}

}
