import java.util.*;
class Time 
{
	int hours,min, sec;
	void input(int...Targs)
	{
		hours = Targs[0];
		min = Targs[1];
		sec = Targs[2];
	}

	void output()
	{
		System.out.println("time for current object is:" +hours+":"+min+":"+sec);
	}

	void sum(Time...time)
	{
		hours = time[0].hours + time[1].hours;
		min = time[0].min + time[1].min;
		sec = time[0].sec + time[1].sec;
	}

	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hours:");
		int hours = sc.nextInt();
		System.out.println("enter mins:");
		int min = sc.nextInt();
		System.out.println("enter secs:");
		int sec = sc.nextInt();
		Time t1 = new Time();
		t1.input(hours,min,sec);
		t1.output();
		Time t2 = new Time();
		t2.input(hours,min,sec);
		t2.output();
		Time t3 = new Time();
		t3.sum(t1, t2);
		t3.output();
	}

}