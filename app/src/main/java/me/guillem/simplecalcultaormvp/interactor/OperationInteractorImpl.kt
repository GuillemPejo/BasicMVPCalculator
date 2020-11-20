package me.guillem.simplecalcultaormvp.interactor

import me.guillem.simplecalcultaormvp.interfaces.OperationInteractor
import me.guillem.simplecalcultaormvp.interfaces.OperationPresenter

/**
 ** Created by Guillem on 20/11/20.
 */

class OperationInteractorImpl(operationPresenter: OperationPresenter) :
    OperationInteractor {
    private var result = 0
    private val presenter: OperationPresenter = operationPresenter
    override fun add(num1: Int, num2: Int) {
        result = num1 + num2
        presenter.showResult(Integer.toString(result))
    }

    override fun subtract(num1: Int, num2: Int) {
        result = num1 - num2
        presenter.showResult(Integer.toString(result))
    }

    override fun multiply(num1: Int, num2: Int) {
        result = num1 * num2
        presenter.showResult(Integer.toString(result))
    }

    override fun divide(num1: Int, num2: Int) {
        if (num2 != 0) {
            result = num1 / num2
            presenter.showResult(Integer.toString(result))
        } else {
            presenter.invalidOperation()
        }
    }
}