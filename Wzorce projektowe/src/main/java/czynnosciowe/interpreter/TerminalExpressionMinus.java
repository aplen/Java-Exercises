package czynnosciowe.interpreter;

import java.util.Stack;

public class TerminalExpressionMinus implements Expression{
       

	@Override
    public String toString() {
	return "" + getClass().getName();
    }

    @Override
	public void interpret(Stack<Integer> s) {
	    s.push(s.pop() - s.pop());
	}}