package me.guillem.simplecalcultaormvp.interfaces
/**
 ** Created by Guillem on 20/11/20.
 */
open interface OperationInteractor {
    fun add(num1: Int, num2: Int)
    fun subtract(num1: Int, num2: Int)
    fun multiply(num1: Int, num2: Int)
    fun divide(num1: Int, num2: Int)
}