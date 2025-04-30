
public class Test {
		 public static void main(String[] args){

		 Person taro = new Person(); //（演習①）
		 taro.name="山田太郎";
		 taro.age=20;
		 taro.phoneNumber="090-0000-0000";
		 taro.address="東京都新宿区西大通り3丁目15番地パークヒル新宿302号室";
		 
		 Person jaro = new Person();//(演習②木村次郎、18）
		 jaro.name="木村次郎";
		 jaro.age=18;
		 jaro.phoneNumber="080-1234-0000";
		 jaro.address="大阪府吹田市青葉台1丁目22-5 サンライズタワー10階";

		 Person hanako = new Person();//(演習②鈴木花子、16）
		 hanako.name="鈴木花子";
		 hanako.age=16;
		 hanako.phoneNumber="070-9999-9999";
		 hanako.address="北海道札幌市中央区北5条西12丁目6-8 グリーンコート札幌101号";
		 
		 Person hitomi = new Person();//（演習②自身のお名前）、（自身のご年齢）
		 hitomi.name="早川ひとみ";
		 hitomi.age=24;
		 hanako.phoneNumber="090-8888-1234";
		 hitomi.address="福岡県福岡市博多区南浜町4丁目9-21 メゾン博多B棟205号室";
		
				 
		 System.out.println(taro.name);
		 System.out.println(taro.age);
		 System.out.println(taro.address);
		 System.out.println(taro.phoneNumber);
		 
		 System.out.println(jaro.name);
		 System.out.println(jaro.age);
		 System.out.println(jaro.address);
		 System.out.println(jaro.phoneNumber);
		 
		 System.out.println(hanako.name);
		 System.out.println(hanako.age);
		 System.out.println(hanako.address);
		 System.out.println(hanako.phoneNumber);
		 
		 System.out.println(hitomi.name);
		 System.out.println(hitomi.age);//（演習④） phoneNumber,adressのプログラミング、表示
		 
	}

}
