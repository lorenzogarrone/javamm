/**
 * generated by Xtext
 */
package javamm.ui.outline;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

import javamm.javamm.JavammMethod;
import javamm.javamm.Main;

/**
 * Customization of the default outline structure.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 * 
 * @author Lorenzo Bettini
 */
public class JavammOutlineTreeProvider extends DefaultOutlineTreeProvider {
	public boolean _isLeaf(final JavammMethod m) { // NOSONAR required by polymorphic dispatch
		return true;
	}

	public boolean _isLeaf(final Main m) { // NOSONAR required by polymorphic dispatch
		return true;
	}
}