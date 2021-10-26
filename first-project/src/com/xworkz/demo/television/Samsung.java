package com.xworkz.demo.television;

 class Samsung {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungClass sam=new SamsungClass(25.0f);	
		sam.working();
		String tone=sam.getColor();
		System.out.println(tone);
		String data=sam.setColor("grey");
		System.out.println(data);
		

	}

}
