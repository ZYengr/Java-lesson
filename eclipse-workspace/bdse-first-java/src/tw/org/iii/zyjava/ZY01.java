package tw.org.iii.zyjava;

public class ZY01 {

	public static void main(String[] args) {
		//強型別(Java) VS 弱型別(Java script)
		// [a-zA-Z$_][a-zA-Z0-9$_]*
		byte var1 = 101;
		byte var2 = 127;
		byte var3, var4;
		byte var5 = 123, var6, var7 = 100;
		System.out.println(var1);
		System.out.println("-----");
		
		//var2 = var1 +3; //byte, short,int運算時轉換為int
		int newvar = var1+var2;
		System.out.println(newvar);
	}

}
