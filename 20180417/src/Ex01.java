
public class Ex01 {
	public static void main(String[] args) {
		Product pro1 = new Product();
		System.out.println(pro1.serialNum);
		Product pro2 = new Product();
		
		System.out.println(pro2.toString());
		System.out.println(pro2.serialNum);
		Product.out.printllll();
	}
}



class HomeWork{
	public int private_subject_cnt = 0;
	public static int common_subject_cnt = 0;
	public void doWork() {
		private_subject_cnt++;
		common_subject_cnt++;
	}
}


class Product{
	static int count=0;
	public static Out out = new Out(); 
	int serialNum=0;
	{
		count++;
		serialNum = count;
	}
	
}
 class Out{
	static public void printllll(){
		System.out.println("llll");
	}
}
interface Father{
	
}
interface Mother{
	
}

class Child implements Father, Mother{
	
}