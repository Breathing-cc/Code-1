/*
 * Date 	存储 年-月-日 信息
 * 原则: 一切从用户角度出发
 * 功能：
 *		1） 初始化
 *			i.	传入年/月/日
 *			2.  不传，今天		回头
 *		2） 多少天之后的年/月/日
 *		3） 多少天之前的年/月/日
 */
 public class Date{
	public int year;
    public int month;
    public int day;
	public int []day_of_month={
		31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	};
// 构造方法
// 年支持的范围 [1840, 2020]
// 月支持的范围 [1, 12]
// 日支持的范围 
    public Date(int year,int month,int day){
		if(year < 1840 || year > 2020){
			System.err.println("年的支持范围是[1840,2020]");
			return;
		}
		if(month < 1 || month > 12){
			System.err.println("月份不对");
			return;
		}
		if(day < 1 || day > 31){
			System.err.println("天数不对");
			return;
		}
		this.year = year;
		this.month = month;
		this.day = day;
    }
	public boolean isLeapYear(int year){
		if(year % 4 == 0 && year % 100 != 0){
			return true;
		}
		if(year % 400 == 0){
			return true;
		}
		return false;
	}
	public int calcDaysOfMonth(int year , int month){
		if(month != 2){
			return day_of_month[month-1];
		}
		if(isLeapYear(year)){
			return 28;
		}else{
			return 29;
		}
	}
	public Date after(int days){
		day += days;
		while(day > calcDaysOfMonth(year , month)){
			day -= calcDaysOfMonth(year , month);
			month += 1;
			if (month > 12){
				month =1;
				year += 1;
			}
		}
		return this;
	}
	// public Date before(int days){
		// day -= days;
		// while(day < calcDaysOfMonth(year , month)){
			// day +=calcDaysOfMonth(year , month);
			// month -= 1;
			// year -= 1;
		// }
		// return this;
	// }
	public String toString(){
		return String.format("%04d-%02d-%02d",year , month ,day);
	}
	public static void main(String[] args){
		Date d =new Date(2019,7,20);
		Date r =d.after(80);
		// Date s =d.before(80);
        System.out.println(d.toString());
		// System.out.println(d.toString());
	}
}
    

