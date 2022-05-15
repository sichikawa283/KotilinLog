package jp.techacademy.shun.ichikawa.kotilinlog

import android.util.Log

class BigDog : Dog {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String) : super(name, age, hobby) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", "大きな犬です。")
    }
}
