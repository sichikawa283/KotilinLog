package jp.techacademy.shun.ichikawa.kotilinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("市川駿", 26, "ゴルフ") // 名前を市川駿、年齢26歳で、趣味ゴルフで、Humanのインスタンスを作る
        human1.say()
        human1.think()

        val human2 = Human("田中太朗", 55, "テニス") // 名前を田中太郎、年齢55歳で、趣味テニスで、Humanのインスタンスを作る
        human2.say()
        human2.think()
    }
}