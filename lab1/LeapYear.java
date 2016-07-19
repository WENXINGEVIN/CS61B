public class LeapYear{
	int year;

	public LeapYear(int i) {
		year=i;
	}

	public boolean checkLeapYear(){
		if(year%400==0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		LeapYear aYear=new LeapYear(2014);
		System.out.println(aYear);
		System.out.println(aYear.checkLeapYear());
		LeapYear anotherYear=new LeapYear(2000);
		System.out.println(anotherYear.checkLeapYear());
	}
}	
