/*
* Name: Joshua Acklin
* Class: CIT-244
* Date: 9 Oct 2017
* Description: Parts is comprised of objects used to track and monitor supply levels.
*/


abstract class Part{
	private String type;
	private String id;
	private String orderNumber;
	private double price;

    public Part(String type, Sring id, double price){
    	this.type = type;
    	this.id = id;
    	this.price = price;
    }

    public String getType(){ return this.type;}
    public void setType(String t){ this.type = t;}
    public String getId(){ return this.id;}
    public void setId(String id){ this.id = id;}
    public String getOrderNumber(){ return this.orderNumber;}
    public void setOrderNumber(String o){ this.orderNumber = o;}
	public void setPrice(double p){this.price = p;}
	public double getPrice(){return this.price;}

    public String toString(){
			return "";}

}

class Body extends Part{
	private String name;
    public Body(String type, Sring id, double price, String name){
    	super(type, id, price);
    }
    public String getName(){return this.name;}
    public void setName(String n){this.name =n;}
    public String toString(){return "stupid";}
}


class Exterior extends Part{
	private String color;
    public Body(String type, Sring id, double price, String color){
    	super(type, id, price);
    }
    public String getColor(){return this.color;}
    public void setColor(String c){this.color = c;}
    public String toString(){return "";}
}


class Interior extends Part{
	private String color;
	private String material;

    public Interior(String type, Sring id, double price, String color, String material){
    	super(type, id, price);
    }
    public String getColor(){return this.color;}
    public void setColor(String c){this.color = c;}
    public String getMaterial(){return this.material;}
    public void setMaterial(String m){this.material =m;}
    public String toString(){return "";}
}


class Powertrain extends Part{
	private Boolean auto;
    public Powertrain(String type, Sring id, double price, Boolean auto){
    	super(type, id, price);
    }
    public Boolean getAuto(){return this.auto;}
    public void setAuto(Boolean a){this.auto =a;}
    public String toString(){return "";}
}


class Seat extends Part{
	private String sType;
    public Seat(String type, Sring id, double price, String sType){
    	super(type, id, price);
    }
    public String getSType(){return this.sType;}
    public void setSType(String s){this.sType =s;}
    public String toString(){return "";}
}


class Radio extends Part{
	private String console;

    public Radio(String type, Sring id, double price, String console){
    	super(type, id, price);
    }
    public String getConsole(){return this.console;}
    public void setConsole(String c){this.console =c;}
    public String toString(){return "";}
}


class Rim extends Part{
	private int size;
    public Rim(String type, Sring id, double price, int size){
    	super(type, id, price);
    }
    public int getSize(){return this.size;}
    public void setSize(int s){this.size =s;}
    public String toString(){return "";}
}


class Tire extends Part{
	private String tType;
    public Tire(String type, Sring id, double price, String tType){
    	super(type, id, price);
    }
    public String getTType(){return this.tType;}
    public void setTType(String t){this.tType =t;}
    public String toString(){return "";}
}


abstract class Misc extends Part{
	private int index;
    public Misc(String type, Sring id, double price, int index){
    	super(type, id, price);
    	this.index = index;
    }
    public int getIndex(){return this.index;}
    public void setIndex(int i){this.index =i;}
    public String toString(){return "";}
}


class DrivingAssist extends Misc{
	private String cType;
    public DrivingAssist(String type, Sring id, double price, int index, String cType){
    	super(type, id, price, index);
    	this.cType = cType;
    }
    public String getCType(){return this.cType;}
    public void setCType(String c){this.cType =c;}
    public String toString(){return "";}
}


class Roof extends Misc{
	private String rType;

    public Roof(String type, Sring id, double price, int index, String rType){
    	super(type, id, price, index);
    	this.rType = rType;
    }
    public String getRType(){return rType;}
    public void setRType(String r){this.rType =r;}
    public String toString(){return "";}
}


class Backup extends Misc{
	private String bType;

    public Backup(String type, Sring id, double price, int index, String bType){
    	super(type, id, price, index);
    	this.bType = bType;
    }
    public String getBType(){return this.bType;}
    public void setBType(String b){this.bType =b;}
    public String toString(){return "";}
}


class Sensor extends Misc{
	private String sType;
    public Sensor(String type, Sring id, double price, int index, String sType){
    	super(type, id, price, index);
    	this.sType = sType;
    }
    public String getSType(){return this.sType;}
    public void setSType(String s){this.sType =s;}
    public String toString(){return "";}
}
