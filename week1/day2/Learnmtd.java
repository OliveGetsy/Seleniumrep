package week1.day2;

public class Learnmtd {

	//sybtax for mtd: access modifer return type mtdname(){}
		public void add()
		{
			int a=4;
			int b=5; 
			System.out.println(a+b);
		}
		public void sub()
		{
			int a=4;
			int b=5; 
			System.out.println(a-b);
		}
public static void main (String args[])
{
	//classname obj = new classname() -it is called as constructor 
	Learnmtd obj =new Learnmtd();
	obj.add();
	obj.sub();
}

}
