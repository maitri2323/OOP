class Time
{

	//Data members
	int hours;
	int minutes;

	//Method to set time
	void setTime(int h, int m)
	{
	hours = h;
	minutes = m;
	}
	
	//Method to add two Time objects
	void addTime(Time t1, Time t2)
	{
	hours = t1.hours+t2.hours;
	minutes = t1.minutes+t2.minutes;
	

	//Adjust minutes if greater than equal to 60
	if (minutes >= 60) 
	{
		hours = hours + (minutes / 60);
		minutes = minutes % 60;
	}

}

//Method to display time
void displayTime(){
	System.out.println("Time:" + hours +"hours" + minutes + "minutes");
}

//Main Method
public static void main(String[] args){

	Time t1 = new Time();
	Time t2 = new Time();
	Time t3 = new Time();

	//Set time values
	t1.setTime(2, 45);
	t2.setTime(1, 30);

	//Add t1 and t2 and store result in t3
	t3.addTime(t1,t2);

	//Display times
	t1.displayTime();
	t2.displayTime();
	t3.displayTime();
	System.out.println("Maitri Chauhan, 250393107003");
	}
}

