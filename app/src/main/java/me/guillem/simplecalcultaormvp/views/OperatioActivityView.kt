package me.guillem.simplecalcultaormvp.views

import android.R
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import me.guillem.simplecalcultaormvp.interfaces.OperationPresenter
import me.guillem.simplecalcultaormvp.interfaces.OperationView
import me.guillem.simplecalcultaormvp.presenters.OperationPresenterImpl


/**
 ** Created by Guillem on 20/11/20.
 */
class OperationActivityView : AppCompatActivity(), OperationView {
    private var number1: EditText? = null
    private var number2: EditText? = null
    private var txtResult: TextView? = null
    private var presenter: OperationPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(me.guillem.simplecalcultaormvp.R.layout.activy_operation)
        number1 = findViewById(me.guillem.simplecalcultaormvp.R.id.txtNumber1)
        number2 = findViewById(me.guillem.simplecalcultaormvp.R.id.txtNumber2)
        txtResult = findViewById(me.guillem.simplecalcultaormvp.R.id.txtResult)
        presenter = OperationPresenterImpl(this)
    }

    fun doAdd(view: View?) {
        try {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            presenter!!.add(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doSubtract(view: View?) {
        try {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            presenter!!.subtract(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doMultiply(view: View?) {
        try {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            presenter!!.multiply(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    fun doDivide(view: View?) {
        try {
            val num1 = number1!!.text.toString().toInt()
            val num2 = number2!!.text.toString().toInt()
            presenter!!.divide(num1, num2)
        } catch (e: NumberFormatException) {
            invalidOperation()
        }
    }

    override fun showResult(result: String?) {
        txtResult!!.text = result
    }

    override fun invalidOperation() {
        Toast.makeText(this, "Invalid operation", Toast.LENGTH_SHORT).show()
    }
}