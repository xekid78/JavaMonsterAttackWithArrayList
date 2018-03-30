# JavaMonsterAttackWithArrayList
コレクション

## 処理
`AllayList()`クラスを使って複数のモンスターが攻撃してきたと表示する。

## コード
```
import java.util.ArrayList;

public class Msatk {

	public static void main(String[] args) {
		ArrayList<Enemy2> enemies = new ArrayList<Enemy2>();
		enemies.add(new Enemy2("モンスター"));
		enemies.add(new Enemy2("ガイコツ"));
		enemies.add(new Enemy2("ドラゴン"));

		for (Enemy2 member : enemies) {
			member.Attack();
		}

	}

}

class Enemy2 {
	// メンバ変数
	private String MyName;
	// コンストラクタ
	public Enemy2(String name) {
		MyName = name;
	}

	public void Attack() {
		System.out.println(MyName + "が攻撃してきた。");
	}

}

```

## 出力結果  
```
モンスターが攻撃してきた。
ガイコツが攻撃してきた。
ドラゴンが攻撃してきた。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
