package org.chw.game.ide.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.chw.game.ide.proto.Comment_ALL;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumFieldOpt;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.ImportInfo;
import org.chw.game.ide.proto.Map;
import org.chw.game.ide.proto.MapField;
import org.chw.game.ide.proto.MapRef;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.OptionInfo;
import org.chw.game.ide.proto.ProtoPackage;
import org.chw.game.ide.services.ProtoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProtoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProtoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ProtoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProtoPackage.COMMENT_ALL:
				if(context == grammarAccess.getComment_ALLRule()) {
					sequence_Comment_ALL(context, (Comment_ALL) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.ENUM_FIELD:
				if(context == grammarAccess.getEnumFieldRule()) {
					sequence_EnumField(context, (EnumField) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.ENUM_FIELD_OPT:
				if(context == grammarAccess.getEnumFieldOptRule()) {
					sequence_EnumFieldOpt(context, (EnumFieldOpt) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.ENUM_TYPE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEnumTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_EnumType(context, (EnumType) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.IMPORT_INFO:
				if(context == grammarAccess.getImportInfoRule()) {
					sequence_ImportInfo(context, (ImportInfo) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MAP:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMapRule()) {
					sequence_Map(context, (Map) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MAP_FIELD:
				if(context == grammarAccess.getMapFieldRule()) {
					sequence_MapField(context, (MapField) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MAP_REF:
				if(context == grammarAccess.getMapRefRule()) {
					sequence_MapRef(context, (MapRef) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MESSAGE_COMPLEX_FIELD:
				if(context == grammarAccess.getMessageComplexFieldRule() ||
				   context == grammarAccess.getMessageFieldRule()) {
					sequence_MessageComplexField(context, (MessageComplexField) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MESSAGE_SIMPLE_FIELD:
				if(context == grammarAccess.getMessageFieldRule() ||
				   context == grammarAccess.getMessageSimpleFieldRule()) {
					sequence_MessageSimpleField(context, (MessageSimpleField) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MESSAGE_TYPE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getMessageTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_MessageType(context, (MessageType) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ProtoPackage.OPTION_INFO:
				if(context == grammarAccess.getOptionInfoRule()) {
					sequence_OptionInfo(context, (OptionInfo) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (text=COMMENT_SL | text=COMMENT_ML)
	 */
	protected void sequence_Comment_ALL(EObject context, Comment_ALL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME value=IDENTITY)
	 */
	protected void sequence_EnumFieldOpt(EObject context, EnumFieldOpt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.ENUM_FIELD_OPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.ENUM_FIELD_OPT__NAME));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.ENUM_FIELD_OPT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.ENUM_FIELD_OPT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumFieldOptAccess().getNameENTITY_NAMEParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumFieldOptAccess().getValueIDENTITYTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME index=NUMBER)
	 */
	protected void sequence_EnumField(EObject context, EnumField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.ENUM_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.ENUM_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.ENUM_FIELD__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.ENUM_FIELD__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumFieldAccess().getNameENTITY_NAMEParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnumFieldAccess().getIndexNUMBERTerminalRuleCall_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME (comm+=Comment_ALL | fields+=EnumField | options+=EnumFieldOpt)*)
	 */
	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=SL_STRING
	 */
	protected void sequence_ImportInfo(EObject context, ImportInfo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.IMPORT_INFO__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.IMPORT_INFO__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportInfoAccess().getImportURISL_STRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attr=FIELD_ATTR name=ENTITY_NAME filter=[Map|QualifiedName]? links=MapRef)
	 */
	protected void sequence_MapField(EObject context, MapField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (link=[MessageField|IDENTITY] child=MapRef?)
	 */
	protected void sequence_MapRef(EObject context, MapRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME bind=[MessageType|QualifiedName] (comm+=Comment_ALL | fields+=MapField)*)
	 */
	protected void sequence_Map(EObject context, Map semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attr=FIELD_ATTR type=[Type|QualifiedName] name=ENTITY_NAME index=NUMBER)
	 */
	protected void sequence_MessageComplexField(EObject context, MessageComplexField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__ATTR));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__INDEX));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_COMPLEX_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_COMPLEX_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageComplexFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0(), semanticObject.getAttr());
		feeder.accept(grammarAccess.getMessageComplexFieldAccess().getTypeTypeQualifiedNameParserRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getMessageComplexFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMessageComplexFieldAccess().getIndexNUMBERTerminalRuleCall_4_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attr=FIELD_ATTR type=FIELD_TYPE name=ENTITY_NAME index=NUMBER)
	 */
	protected void sequence_MessageSimpleField(EObject context, MessageSimpleField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__ATTR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__ATTR));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_FIELD__INDEX));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.MESSAGE_SIMPLE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.MESSAGE_SIMPLE_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMessageSimpleFieldAccess().getAttrFIELD_ATTRTerminalRuleCall_0_0(), semanticObject.getAttr());
		feeder.accept(grammarAccess.getMessageSimpleFieldAccess().getTypeFIELD_TYPETerminalRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getMessageSimpleFieldAccess().getNameENTITY_NAMEParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMessageSimpleFieldAccess().getIndexNUMBERTerminalRuleCall_4_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME (comm+=Comment_ALL | fields+=MessageField | types+=Type)*)
	 */
	protected void sequence_MessageType(EObject context, MessageType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName | imports+=ImportInfo | options+=OptionInfo | elements+=Element | comm+=Comment_ALL)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ENTITY_NAME value=SL_STRING)
	 */
	protected void sequence_OptionInfo(EObject context, OptionInfo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.OPTION_INFO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.OPTION_INFO__NAME));
			if(transientValues.isValueTransient(semanticObject, ProtoPackage.Literals.OPTION_INFO__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProtoPackage.Literals.OPTION_INFO__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOptionInfoAccess().getNameENTITY_NAMEParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOptionInfoAccess().getValueSL_STRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
}
