import java.util.Random;
import java.util.Scanner;


public class sijieyunsuan {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
Random random=new Random();
char a[]=new char[4];
a[0]='+';
a[1]='-';
a[2]='×';
a[3]='÷';
System.out.println("请输入题目数量(整数的四则运算)：");
int size=scan.nextInt();

for(int i=0;i<size;i++)
{
	System.out.print(random.nextInt(100));
	System.out.print(a[(int) (Math.random()*4)]);
	int fenmu=random.nextInt(100);
if(fenmu==0)
{
	fenmu=random.nextInt(100);
}
	System.out.println(fenmu+"=");
}

int chose;
System.out.println("是否需要输出真分数运算题目？（1：是，0：否）");
chose=scan.nextInt();
if(chose==1)
{
	System.out.println("请输入需要打印的题目的数量：");
	int size1=scan.nextInt();
	int a1,a2,a3,a4;
	for(int i=0;i<size1;i++)
	{
		a1=random.nextInt(100);
		a2=random.nextInt(100);
		a3=random.nextInt(100);
		a4=random.nextInt(100);
		if(a1==0&&a1==0)
		{
			a1=random.nextInt(100);
			a2=random.nextInt(100);
		}
		if(a1>a2)
		{
		int flag;
		flag=a1;
		a1=a2;
		a2=flag;
		}
		if(a3>a4)
		{
			int f;
			f=a3;
			a3=a4;
			a4=f;
		}
		System.out.print(a1+"/"+a2);
		System.out.print(a[(int) (Math.random()*4)]);
		System.out.println(a3+"/"+a4+"=");	
	}
			
}


	}

}
