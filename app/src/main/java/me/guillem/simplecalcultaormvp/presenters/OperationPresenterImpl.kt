package me.guillem.simplecalcultaormvp.presenters

import me.guillem.simplecalcultaormvp.interactor.OperationInteractorImpl
import me.guillem.simplecalcultaormvp.interfaces.OperationInteractor
import me.guillem.simplecalcultaormvp.interfaces.OperationPresenter
import me.guillem.simplecalcultaormvp.interfaces.OperationView


/**
 ** Created by Guillem on 20/11/20.
 */
class OperationPresenterImpl(view: OperationView?) : OperationPresenter {
    private val view: OperationView? = view
    private val interactor: OperationInteractor?
    override fun showResult(result: String?) {
        view?.showResult(result)
    }

    override fun invalidOperation() {
        view?.invalidOperation()
    }

    override fun add(num1: Int, num2: Int) {
        interactor?.add(num1, num2)
    }

    override fun subtract(num1: Int, num2: Int) {
        interactor?.subtract(num1, num2)
    }

    override fun multiply(num1: Int, num2: Int) {
        interactor?.multiply(num1, num2)
    }

    override fun divide(num1: Int, num2: Int) {
        interactor?.divide(num1, num2)
    }

    init {
        interactor = OperationInteractorImpl(this)
    }
}