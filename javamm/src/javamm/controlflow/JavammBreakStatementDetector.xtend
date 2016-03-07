package javamm.controlflow

import javamm.javamm.JavammContinueStatement
import javamm.javamm.JavammSemicolonStatement
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XWhileExpression

/**
 * Whether in the passed expression a break is surely executed.
 * 
 * @author Lorenzo Bettini
 */
class JavammBreakStatementDetector extends JavammBranchingStatementDetector {

	def boolean containsSureBreakStatement(XExpression e) {
		if (e == null)
			return false;
		return sureBreak(e)
	}

	def protected dispatch sureBreak(XExpression e) {
		return false
	}

	def protected dispatch sureBreak(JavammSemicolonStatement e) {
		e.expression.containsSureBreakStatement
	}

	def protected dispatch sureBreak(XWhileExpression e) {
		return e.body.isSureBranchStatement
	}

	def protected dispatch sureBranch(JavammContinueStatement e) {
		return false
	}

}
