package generics_sample;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
	public static void main(String[] args) {
		// ArrayList(変数名：list）をString型で宣言・生成
		List<String> list = new ArrayList<>();
		// 少し古いバージョンのJavaでは…
		ArrayList oldList = new ArrayList(); //データ型の指定なし
		
		// インスタンスを宣言する際にジェネリクスでデータ型を指定する
		// Double型で生成されたEntityインスタンス
		Entity<Double> e1 = new Entity<Double>();
		e1.setValues2(10.0); // Double型で宣言したのでエラーにならない
//		e1.setValues2("HELLO"); 文字列を格納しようとするとエラーになる
		
		// String型で生成されたEntityインスタンス
		Entity<String> e2 = new Entity<String>();
//		e2.setValues2(10.0);
		e2.setValues2("HELLO");
		
		
	}
}
