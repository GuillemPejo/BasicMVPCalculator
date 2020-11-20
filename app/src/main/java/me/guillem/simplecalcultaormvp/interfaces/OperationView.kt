package me.guillem.simplecalcultaormvp.interfaces

/**
 ** Created by Guillem on 20/11/20.
 */
interface OperationView {
    fun showResult(result: String?)
    fun invalidOperation()
}