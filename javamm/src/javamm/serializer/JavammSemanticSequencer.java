/*
 * generated by Xtext
 */
package javamm.serializer;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.xbase.XExpression;

import com.google.inject.Inject;

import javamm.internal.serializer.XbaseSemanticSequencerAccess;
import javamm.javamm.JavammXMemberFeatureCall;
import javamm.services.JavammGrammarAccess;
import javamm.services.JavammGrammarAccess.XMemberFeatureCallElements;

/**
 * Customized to deal with custom AST structure for member feature call with array access.
 * 
 * @author Lorenzo Bettini
 *
 */
public class JavammSemanticSequencer extends XbaseSemanticSequencerAccess {

//	@Inject
//	private JavammGrammarAccess access;
//
//	@Override
//	protected void sequence_XMemberFeatureCall(EObject context, JavammXMemberFeatureCall featureCall) {
//		INodesForEObjectProvider nodes = createNodeProvider(featureCall);
//		SequenceFeeder acceptor = createSequencerFeeder(featureCall, nodes);
//		XMemberFeatureCallElements memberFeatureCallElements= access.getXMemberFeatureCallAccess();
//
//		// we manually modify the structure of this element, so we must serialize that accordingly
//		acceptor.accept(memberFeatureCallElements.getJavammXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
//				featureCall.getArrayAccessExpression().getArray());
//
//		final List<XExpression> indexes = featureCall.getIndexes();
//		acceptor.accept(memberFeatureCallElements.getIndexesXExpressionParserRuleCall_1_1_0_0_2_0(),
//				indexes.get(0), 0);
//		for (int i = 1; i < indexes.size(); i++) {
//			acceptor.accept(memberFeatureCallElements.getIndexesXExpressionParserRuleCall_1_1_0_0_4_1_0(),
//					indexes.get(i), i);
//		}
//
//		acceptor.accept(memberFeatureCallElements.getFeatureJvmIdentifiableElementIdOrSuperParserRuleCall_1_1_1_0_1(), featureCall.getFeature());
//
//		if (featureCall.isExplicitOperationCall()) {
//			acceptor.accept(memberFeatureCallElements.getExplicitOperationCallLeftParenthesisKeyword_1_1_2_0_0());
//		}
//		List<XExpression> arguments = featureCall.getMemberCallArguments();
//		if (!arguments.isEmpty()) {
//				acceptor.accept(memberFeatureCallElements.getMemberCallArgumentsXExpressionParserRuleCall_1_1_2_1_0_0(), arguments.get(0), 0);
//				for (int i = 1; i < arguments.size(); i++) {
//					acceptor.accept(memberFeatureCallElements.getMemberCallArgumentsXExpressionParserRuleCall_1_1_2_1_1_1_0(), arguments.get(i), i);
//				}
//		}
//		acceptor.finish();
//	}

}
