/**
 * 
 */
package javamm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * Retrieves the original program text, to check for the terminating
 * semicolon.
 * 
 * @author Lorenzo Bettini
 *
 */
public class JavammNodeModelUtil {

	public String getProgramText(EObject object) {
		final ICompositeNode node = NodeModelUtils.findActualNodeFor(object);
		return NodeModelUtils.getTokenText(node);
	}

	public boolean hasSemicolon(EObject object) {
		return getProgramText(object).endsWith(";");
	}
}