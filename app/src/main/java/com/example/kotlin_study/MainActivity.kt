package com.example.kotlin_study

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.example.kotlin_study.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        val email = activityMainBinding.textInputEditText.text.toString().trim()
        val emailPattern: Boolean = android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

        activityMainBinding.run{

            textInputLayout.run{

                // error = "입력 오류가 발생하였습니다"

                editText?.run {
                    addTextChangedListener {
                        if (it!!.length > 20){
                            // error = "10글자 이하로 입력해주세요"
                            textInputLayout.error = "10글자 이하로 입력해주세요"
                        } else if (!emailPattern) {
                            textInputLayout.error = "이메일 형식이 맞지 않습니다"
                        } else {
                            // error = null
                            textInputLayout.error = null
                            textInputLayout.isErrorEnabled = false
                        }
                    }
                }
            }

            button.run{
                setOnClickListener {

                    // val str1 = textInputEditText.text.toString()
                    // textView.text = str1

                    // TextInputLayout으로 부터 EditText를 추출한다.
                    if(textInputLayout.editText != null) {
                        val str1 = textInputLayout.editText!!.text.toString()
                        textView.text = str1
                    }
                    if (emailPattern) {
                        Log.d("TEST", "이메일 형식이 맞습니다")
                    }
                }
            }
        }
    }
}