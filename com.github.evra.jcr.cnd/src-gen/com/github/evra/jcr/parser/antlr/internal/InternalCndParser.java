package com.github.evra.jcr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.github.evra.jcr.services.CndGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCndParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_64", "KEYWORD_63", "KEYWORD_61", "KEYWORD_62", "KEYWORD_59", "KEYWORD_60", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_58", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_19", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=69;
    public static final int RULE_ANY_OTHER=75;
    public static final int KEYWORD_19=49;
    public static final int KEYWORD_56=12;
    public static final int KEYWORD_55=11;
    public static final int KEYWORD_54=10;
    public static final int KEYWORD_17=66;
    public static final int KEYWORD_53=17;
    public static final int KEYWORD_18=67;
    public static final int KEYWORD_52=16;
    public static final int KEYWORD_15=64;
    public static final int KEYWORD_51=15;
    public static final int KEYWORD_16=65;
    public static final int KEYWORD_50=23;
    public static final int KEYWORD_13=62;
    public static final int KEYWORD_14=63;
    public static final int KEYWORD_11=60;
    public static final int EOF=-1;
    public static final int KEYWORD_12=61;
    public static final int KEYWORD_10=59;
    public static final int KEYWORD_59=8;
    public static final int KEYWORD_58=14;
    public static final int KEYWORD_57=13;
    public static final int KEYWORD_6=55;
    public static final int KEYWORD_7=56;
    public static final int KEYWORD_8=57;
    public static final int KEYWORD_9=58;
    public static final int KEYWORD_28=45;
    public static final int RULE_EXID=68;
    public static final int KEYWORD_29=46;
    public static final int KEYWORD_64=4;
    public static final int RULE_INT=70;
    public static final int KEYWORD_61=6;
    public static final int KEYWORD_24=41;
    public static final int KEYWORD_60=9;
    public static final int KEYWORD_25=42;
    public static final int KEYWORD_63=5;
    public static final int KEYWORD_26=43;
    public static final int KEYWORD_27=44;
    public static final int KEYWORD_62=7;
    public static final int KEYWORD_20=37;
    public static final int KEYWORD_21=38;
    public static final int KEYWORD_22=39;
    public static final int KEYWORD_23=40;
    public static final int KEYWORD_30=47;
    public static final int KEYWORD_1=50;
    public static final int KEYWORD_34=34;
    public static final int KEYWORD_5=54;
    public static final int KEYWORD_33=33;
    public static final int KEYWORD_4=53;
    public static final int KEYWORD_32=32;
    public static final int KEYWORD_3=52;
    public static final int KEYWORD_31=48;
    public static final int KEYWORD_2=51;
    public static final int KEYWORD_38=29;
    public static final int KEYWORD_37=28;
    public static final int RULE_SL_COMMENT=73;
    public static final int KEYWORD_36=36;
    public static final int KEYWORD_35=35;
    public static final int RULE_ML_COMMENT=72;
    public static final int KEYWORD_39=30;
    public static final int RULE_STRING=71;
    public static final int KEYWORD_41=24;
    public static final int KEYWORD_40=31;
    public static final int KEYWORD_43=26;
    public static final int KEYWORD_42=25;
    public static final int KEYWORD_45=18;
    public static final int KEYWORD_44=27;
    public static final int KEYWORD_47=20;
    public static final int RULE_WS=74;
    public static final int KEYWORD_46=19;
    public static final int KEYWORD_49=22;
    public static final int KEYWORD_48=21;

    // delegates
    // delegators


        public InternalCndParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCndParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCndParser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g"; }




    	private CndGrammarAccess grammarAccess;
    	 	
    	public InternalCndParser(TokenStream input, CndGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected CndGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:70:1: ruleModel returns [EObject current=null] : ( ( (lv_mappings_0_0= ruleNsMapping ) ) | ( (lv_nodetypes_1_0= ruleNodeTypeDef ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_mappings_0_0 = null;

        EObject lv_nodetypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:73:28: ( ( ( (lv_mappings_0_0= ruleNsMapping ) ) | ( (lv_nodetypes_1_0= ruleNodeTypeDef ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:1: ( ( (lv_mappings_0_0= ruleNsMapping ) ) | ( (lv_nodetypes_1_0= ruleNodeTypeDef ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:1: ( ( (lv_mappings_0_0= ruleNsMapping ) ) | ( (lv_nodetypes_1_0= ruleNodeTypeDef ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_8) ) {
                    alt1=1;
                }
                else if ( (LA1_0==KEYWORD_12) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:2: ( (lv_mappings_0_0= ruleNsMapping ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:2: ( (lv_mappings_0_0= ruleNsMapping ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: (lv_mappings_0_0= ruleNsMapping )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: (lv_mappings_0_0= ruleNsMapping )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:76:3: lv_mappings_0_0= ruleNsMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getMappingsNsMappingParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNsMapping_in_ruleModel123);
            	    lv_mappings_0_0=ruleNsMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_0_0, 
            	            		"NsMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:93:6: ( (lv_nodetypes_1_0= ruleNodeTypeDef ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:93:6: ( (lv_nodetypes_1_0= ruleNodeTypeDef ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:1: (lv_nodetypes_1_0= ruleNodeTypeDef )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:1: (lv_nodetypes_1_0= ruleNodeTypeDef )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:95:3: lv_nodetypes_1_0= ruleNodeTypeDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNodetypesNodeTypeDefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeTypeDef_in_ruleModel150);
            	    lv_nodetypes_1_0=ruleNodeTypeDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodetypes",
            	            		lv_nodetypes_1_0, 
            	            		"NodeTypeDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeTypeDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:119:1: entryRuleNodeTypeDef returns [EObject current=null] : iv_ruleNodeTypeDef= ruleNodeTypeDef EOF ;
    public final EObject entryRuleNodeTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeDef = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:120:2: (iv_ruleNodeTypeDef= ruleNodeTypeDef EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:121:2: iv_ruleNodeTypeDef= ruleNodeTypeDef EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeDefRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDef_in_entryRuleNodeTypeDef186);
            iv_ruleNodeTypeDef=ruleNodeTypeDef();

            state._fsp--;

             current =iv_ruleNodeTypeDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDef196); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTypeDef"


    // $ANTLR start "ruleNodeTypeDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:128:1: ruleNodeTypeDef returns [EObject current=null] : (this_NodeTypeName_0= ruleNodeTypeName ( ruleSuperTypes )? ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )* ( rulePropertyDef | ruleChildNodeDef )* ) ;
    public final EObject ruleNodeTypeDef() throws RecognitionException {
        EObject current = null;

        EObject this_NodeTypeName_0 = null;

        AntlrDatatypeRuleToken lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:131:28: ( (this_NodeTypeName_0= ruleNodeTypeName ( ruleSuperTypes )? ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )* ( rulePropertyDef | ruleChildNodeDef )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:132:1: (this_NodeTypeName_0= ruleNodeTypeName ( ruleSuperTypes )? ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )* ( rulePropertyDef | ruleChildNodeDef )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:132:1: (this_NodeTypeName_0= ruleNodeTypeName ( ruleSuperTypes )? ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )* ( rulePropertyDef | ruleChildNodeDef )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:5: this_NodeTypeName_0= ruleNodeTypeName ( ruleSuperTypes )? ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )* ( rulePropertyDef | ruleChildNodeDef )*
            {
             
                    newCompositeNode(grammarAccess.getNodeTypeDefAccess().getNodeTypeNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNodeTypeName_in_ruleNodeTypeDef243);
            this_NodeTypeName_0=ruleNodeTypeName();

            state._fsp--;


                    current = this_NodeTypeName_0;
                    afterParserOrEnumRuleCall();
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:141:1: ( ruleSuperTypes )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_10) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:142:5: ruleSuperTypes
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeDefAccess().getSuperTypesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSuperTypes_in_ruleNodeTypeDef259);
                    ruleSuperTypes();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:149:3: ( (lv_attributes_2_0= ruleNodeTypeAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==KEYWORD_62||LA3_0==KEYWORD_57||LA3_0==KEYWORD_51||LA3_0==KEYWORD_49||LA3_0==KEYWORD_38||LA3_0==KEYWORD_40||LA3_0==KEYWORD_22||LA3_0==KEYWORD_25||LA3_0==KEYWORD_28||(LA3_0>=KEYWORD_19 && LA3_0<=KEYWORD_1)||(LA3_0>=KEYWORD_14 && LA3_0<=KEYWORD_16)||LA3_0==KEYWORD_18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:150:1: (lv_attributes_2_0= ruleNodeTypeAttribute )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:150:1: (lv_attributes_2_0= ruleNodeTypeAttribute )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:151:3: lv_attributes_2_0= ruleNodeTypeAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefAccess().getAttributesNodeTypeAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeTypeAttribute_in_ruleNodeTypeDef281);
            	    lv_attributes_2_0=ruleNodeTypeAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"NodeTypeAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:167:3: ( rulePropertyDef | ruleChildNodeDef )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_7) ) {
                    alt4=1;
                }
                else if ( (LA4_0==KEYWORD_5) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:168:5: rulePropertyDef
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNodeTypeDefAccess().getPropertyDefParserRuleCall_3_0()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyDef_in_ruleNodeTypeDef299);
            	    rulePropertyDef();

            	    state._fsp--;


            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:177:5: ruleChildNodeDef
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNodeTypeDefAccess().getChildNodeDefParserRuleCall_3_1()); 
            	        
            	    pushFollow(FOLLOW_ruleChildNodeDef_in_ruleNodeTypeDef320);
            	    ruleChildNodeDef();

            	    state._fsp--;


            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTypeDef"


    // $ANTLR start "entryRuleChildNodeDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:192:1: entryRuleChildNodeDef returns [String current=null] : iv_ruleChildNodeDef= ruleChildNodeDef EOF ;
    public final String entryRuleChildNodeDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleChildNodeDef = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:193:1: (iv_ruleChildNodeDef= ruleChildNodeDef EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:194:2: iv_ruleChildNodeDef= ruleChildNodeDef EOF
            {
             newCompositeNode(grammarAccess.getChildNodeDefRule()); 
            pushFollow(FOLLOW_ruleChildNodeDef_in_entryRuleChildNodeDef357);
            iv_ruleChildNodeDef=ruleChildNodeDef();

            state._fsp--;

             current =iv_ruleChildNodeDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildNodeDef368); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChildNodeDef"


    // $ANTLR start "ruleChildNodeDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:201:1: ruleChildNodeDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NodeName_0= ruleNodeName (this_RequiredTypes_1= ruleRequiredTypes )? (this_DefaultType_2= ruleDefaultType )? (this_NodeAttribute_3= ruleNodeAttribute )* ) ;
    public final AntlrDatatypeRuleToken ruleChildNodeDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NodeName_0 = null;

        AntlrDatatypeRuleToken this_RequiredTypes_1 = null;

        AntlrDatatypeRuleToken this_DefaultType_2 = null;

        AntlrDatatypeRuleToken this_NodeAttribute_3 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:205:6: ( (this_NodeName_0= ruleNodeName (this_RequiredTypes_1= ruleRequiredTypes )? (this_DefaultType_2= ruleDefaultType )? (this_NodeAttribute_3= ruleNodeAttribute )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:206:1: (this_NodeName_0= ruleNodeName (this_RequiredTypes_1= ruleRequiredTypes )? (this_DefaultType_2= ruleDefaultType )? (this_NodeAttribute_3= ruleNodeAttribute )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:206:1: (this_NodeName_0= ruleNodeName (this_RequiredTypes_1= ruleRequiredTypes )? (this_DefaultType_2= ruleDefaultType )? (this_NodeAttribute_3= ruleNodeAttribute )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:207:5: this_NodeName_0= ruleNodeName (this_RequiredTypes_1= ruleRequiredTypes )? (this_DefaultType_2= ruleDefaultType )? (this_NodeAttribute_3= ruleNodeAttribute )*
            {
             
                    newCompositeNode(grammarAccess.getChildNodeDefAccess().getNodeNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNodeName_in_ruleChildNodeDef415);
            this_NodeName_0=ruleNodeName();

            state._fsp--;


            		current.merge(this_NodeName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:217:1: (this_RequiredTypes_1= ruleRequiredTypes )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_2) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:218:5: this_RequiredTypes_1= ruleRequiredTypes
                    {
                     
                            newCompositeNode(grammarAccess.getChildNodeDefAccess().getRequiredTypesParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRequiredTypes_in_ruleChildNodeDef443);
                    this_RequiredTypes_1=ruleRequiredTypes();

                    state._fsp--;


                    		current.merge(this_RequiredTypes_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:228:3: (this_DefaultType_2= ruleDefaultType )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_9) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:229:5: this_DefaultType_2= ruleDefaultType
                    {
                     
                            newCompositeNode(grammarAccess.getChildNodeDefAccess().getDefaultTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDefaultType_in_ruleChildNodeDef473);
                    this_DefaultType_2=ruleDefaultType();

                    state._fsp--;


                    		current.merge(this_DefaultType_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:239:3: (this_NodeAttribute_3= ruleNodeAttribute )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_61||LA7_0==KEYWORD_59||LA7_0==KEYWORD_56||LA7_0==KEYWORD_58||LA7_0==KEYWORD_52||LA7_0==KEYWORD_46||LA7_0==KEYWORD_48||LA7_0==KEYWORD_43||LA7_0==KEYWORD_37||LA7_0==KEYWORD_32||LA7_0==KEYWORD_20||(LA7_0>=KEYWORD_23 && LA7_0<=KEYWORD_24)||LA7_0==KEYWORD_29||LA7_0==KEYWORD_31||LA7_0==KEYWORD_4||(LA7_0>=KEYWORD_14 && LA7_0<=KEYWORD_15)||LA7_0==KEYWORD_17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:240:5: this_NodeAttribute_3= ruleNodeAttribute
            	    {
            	     
            	            newCompositeNode(grammarAccess.getChildNodeDefAccess().getNodeAttributeParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleNodeAttribute_in_ruleChildNodeDef503);
            	    this_NodeAttribute_3=ruleNodeAttribute();

            	    state._fsp--;


            	    		current.merge(this_NodeAttribute_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChildNodeDef"


    // $ANTLR start "entryRuleNodeAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:258:1: entryRuleNodeAttribute returns [String current=null] : iv_ruleNodeAttribute= ruleNodeAttribute EOF ;
    public final String entryRuleNodeAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeAttribute = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:259:1: (iv_ruleNodeAttribute= ruleNodeAttribute EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:260:2: iv_ruleNodeAttribute= ruleNodeAttribute EOF
            {
             newCompositeNode(grammarAccess.getNodeAttributeRule()); 
            pushFollow(FOLLOW_ruleNodeAttribute_in_entryRuleNodeAttribute550);
            iv_ruleNodeAttribute=ruleNodeAttribute();

            state._fsp--;

             current =iv_ruleNodeAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttribute561); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeAttribute"


    // $ANTLR start "ruleNodeAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:267:1: ruleNodeAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Sns_4= ruleSns ) ;
    public final AntlrDatatypeRuleToken ruleNodeAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Autocreated_0 = null;

        AntlrDatatypeRuleToken this_Mandatory_1 = null;

        AntlrDatatypeRuleToken this_Protected_2 = null;

        AntlrDatatypeRuleToken this_Opv_3 = null;

        AntlrDatatypeRuleToken this_Sns_4 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:271:6: ( (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Sns_4= ruleSns ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:272:1: (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Sns_4= ruleSns )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:272:1: (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Sns_4= ruleSns )
            int alt8=5;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
            case KEYWORD_23:
            case KEYWORD_14:
                {
                alt8=1;
                }
                break;
            case KEYWORD_56:
            case KEYWORD_24:
            case KEYWORD_15:
                {
                alt8=2;
                }
                break;
            case KEYWORD_58:
            case KEYWORD_29:
            case KEYWORD_17:
                {
                alt8=3;
                }
                break;
            case KEYWORD_59:
            case KEYWORD_46:
            case KEYWORD_48:
            case KEYWORD_43:
            case KEYWORD_37:
            case KEYWORD_32:
            case KEYWORD_20:
                {
                alt8=4;
                }
                break;
            case KEYWORD_52:
            case KEYWORD_31:
            case KEYWORD_4:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:273:5: this_Autocreated_0= ruleAutocreated
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAttributeAccess().getAutocreatedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAutocreated_in_ruleNodeAttribute608);
                    this_Autocreated_0=ruleAutocreated();

                    state._fsp--;


                    		current.merge(this_Autocreated_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:285:5: this_Mandatory_1= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAttributeAccess().getMandatoryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleNodeAttribute641);
                    this_Mandatory_1=ruleMandatory();

                    state._fsp--;


                    		current.merge(this_Mandatory_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:297:5: this_Protected_2= ruleProtected
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAttributeAccess().getProtectedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProtected_in_ruleNodeAttribute674);
                    this_Protected_2=ruleProtected();

                    state._fsp--;


                    		current.merge(this_Protected_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:309:5: this_Opv_3= ruleOpv
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAttributeAccess().getOpvParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOpv_in_ruleNodeAttribute707);
                    this_Opv_3=ruleOpv();

                    state._fsp--;


                    		current.merge(this_Opv_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:321:5: this_Sns_4= ruleSns
                    {
                     
                            newCompositeNode(grammarAccess.getNodeAttributeAccess().getSnsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSns_in_ruleNodeAttribute740);
                    this_Sns_4=ruleSns();

                    state._fsp--;


                    		current.merge(this_Sns_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeAttribute"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:339:1: entryRuleSns returns [String current=null] : iv_ruleSns= ruleSns EOF ;
    public final String entryRuleSns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSns = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:340:1: (iv_ruleSns= ruleSns EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:341:2: iv_ruleSns= ruleSns EOF
            {
             newCompositeNode(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns785);
            iv_ruleSns=ruleSns();

            state._fsp--;

             current =iv_ruleSns.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns796); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSns"


    // $ANTLR start "ruleSns"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:348:1: ruleSns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleSns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:352:6: ( ( (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:353:1: ( (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:353:1: ( (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:353:2: (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:353:2: (kw= KEYWORD_31 | kw= KEYWORD_4 | kw= KEYWORD_52 )
            int alt9=3;
            switch ( input.LA(1) ) {
            case KEYWORD_31:
                {
                alt9=1;
                }
                break;
            case KEYWORD_4:
                {
                alt9=2;
                }
                break;
            case KEYWORD_52:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:354:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleSns835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getSnsKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:361:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSns854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getAsteriskKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:368:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleSns873); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getMultipleKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:373:2: (kw= KEYWORD_11 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:374:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSns888); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSns"


    // $ANTLR start "entryRuleDefaultType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:387:1: entryRuleDefaultType returns [String current=null] : iv_ruleDefaultType= ruleDefaultType EOF ;
    public final String entryRuleDefaultType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultType = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:388:1: (iv_ruleDefaultType= ruleDefaultType EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:389:2: iv_ruleDefaultType= ruleDefaultType EOF
            {
             newCompositeNode(grammarAccess.getDefaultTypeRule()); 
            pushFollow(FOLLOW_ruleDefaultType_in_entryRuleDefaultType930);
            iv_ruleDefaultType=ruleDefaultType();

            state._fsp--;

             current =iv_ruleDefaultType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultType941); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultType"


    // $ANTLR start "ruleDefaultType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:396:1: ruleDefaultType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_9 (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleDefaultType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:400:6: ( (kw= KEYWORD_9 (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:401:1: (kw= KEYWORD_9 (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:401:1: (kw= KEYWORD_9 (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:402:2: kw= KEYWORD_9 (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 )
            {
            kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleDefaultType979); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getEqualsSignKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:407:1: (this_JcrString_1= ruleJcrString | kw= KEYWORD_11 )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_25||LA11_0==RULE_EXID||LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==KEYWORD_11) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:408:5: this_JcrString_1= ruleJcrString
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultTypeAccess().getJcrStringParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrString_in_ruleDefaultType1002);
                    this_JcrString_1=ruleJcrString();

                    state._fsp--;


                    		current.merge(this_JcrString_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:420:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleDefaultType1026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultTypeAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultType"


    // $ANTLR start "entryRuleRequiredTypes"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:433:1: entryRuleRequiredTypes returns [String current=null] : iv_ruleRequiredTypes= ruleRequiredTypes EOF ;
    public final String entryRuleRequiredTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequiredTypes = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:434:1: (iv_ruleRequiredTypes= ruleRequiredTypes EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:435:2: iv_ruleRequiredTypes= ruleRequiredTypes EOF
            {
             newCompositeNode(grammarAccess.getRequiredTypesRule()); 
            pushFollow(FOLLOW_ruleRequiredTypes_in_entryRuleRequiredTypes1067);
            iv_ruleRequiredTypes=ruleRequiredTypes();

            state._fsp--;

             current =iv_ruleRequiredTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredTypes1078); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredTypes"


    // $ANTLR start "ruleRequiredTypes"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:442:1: ruleRequiredTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) kw= KEYWORD_3 ) ;
    public final AntlrDatatypeRuleToken ruleRequiredTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrStringList_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:446:6: ( (kw= KEYWORD_2 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) kw= KEYWORD_3 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:447:1: (kw= KEYWORD_2 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) kw= KEYWORD_3 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:447:1: (kw= KEYWORD_2 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) kw= KEYWORD_3 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:448:2: kw= KEYWORD_2 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleRequiredTypes1116); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRequiredTypesAccess().getLeftParenthesisKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:453:1: (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_25||LA12_0==RULE_EXID||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==KEYWORD_11) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:454:5: this_JcrStringList_1= ruleJcrStringList
                    {
                     
                            newCompositeNode(grammarAccess.getRequiredTypesAccess().getJcrStringListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrStringList_in_ruleRequiredTypes1139);
                    this_JcrStringList_1=ruleJcrStringList();

                    state._fsp--;


                    		current.merge(this_JcrStringList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleRequiredTypes1163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRequiredTypesAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleRequiredTypes1177); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRequiredTypesAccess().getRightParenthesisKeyword_2()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredTypes"


    // $ANTLR start "entryRuleNodeName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:485:1: entryRuleNodeName returns [String current=null] : iv_ruleNodeName= ruleNodeName EOF ;
    public final String entryRuleNodeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeName = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:486:1: (iv_ruleNodeName= ruleNodeName EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:487:2: iv_ruleNodeName= ruleNodeName EOF
            {
             newCompositeNode(grammarAccess.getNodeNameRule()); 
            pushFollow(FOLLOW_ruleNodeName_in_entryRuleNodeName1217);
            iv_ruleNodeName=ruleNodeName();

            state._fsp--;

             current =iv_ruleNodeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeName1228); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeName"


    // $ANTLR start "ruleNodeName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:494:1: ruleNodeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_5 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) ) ;
    public final AntlrDatatypeRuleToken ruleNodeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:498:6: ( (kw= KEYWORD_5 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:499:1: (kw= KEYWORD_5 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:499:1: (kw= KEYWORD_5 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:500:2: kw= KEYWORD_5 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 )
            {
            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNodeName1266); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNodeNameAccess().getPlusSignKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:505:1: (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_25||LA13_0==RULE_EXID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==KEYWORD_4) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:506:5: this_JcrString_1= ruleJcrString
                    {
                     
                            newCompositeNode(grammarAccess.getNodeNameAccess().getJcrStringParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeName1289);
                    this_JcrString_1=ruleJcrString();

                    state._fsp--;


                    		current.merge(this_JcrString_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:518:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleNodeName1313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNodeNameAccess().getAsteriskKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeName"


    // $ANTLR start "entryRulePropertyDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:531:1: entryRulePropertyDef returns [String current=null] : iv_rulePropertyDef= rulePropertyDef EOF ;
    public final String entryRulePropertyDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyDef = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:532:1: (iv_rulePropertyDef= rulePropertyDef EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:533:2: iv_rulePropertyDef= rulePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_rulePropertyDef_in_entryRulePropertyDef1354);
            iv_rulePropertyDef=rulePropertyDef();

            state._fsp--;

             current =iv_rulePropertyDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDef1365); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:540:1: rulePropertyDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyName_0= rulePropertyName (this_PropertyType_1= rulePropertyType )? (this_DefaultValues_2= ruleDefaultValues )? (this_PropertyAttribute_3= rulePropertyAttribute )* (this_ValueConstraints_4= ruleValueConstraints )? ) ;
    public final AntlrDatatypeRuleToken rulePropertyDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_PropertyName_0 = null;

        AntlrDatatypeRuleToken this_PropertyType_1 = null;

        AntlrDatatypeRuleToken this_DefaultValues_2 = null;

        AntlrDatatypeRuleToken this_PropertyAttribute_3 = null;

        AntlrDatatypeRuleToken this_ValueConstraints_4 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:544:6: ( (this_PropertyName_0= rulePropertyName (this_PropertyType_1= rulePropertyType )? (this_DefaultValues_2= ruleDefaultValues )? (this_PropertyAttribute_3= rulePropertyAttribute )* (this_ValueConstraints_4= ruleValueConstraints )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:545:1: (this_PropertyName_0= rulePropertyName (this_PropertyType_1= rulePropertyType )? (this_DefaultValues_2= ruleDefaultValues )? (this_PropertyAttribute_3= rulePropertyAttribute )* (this_ValueConstraints_4= ruleValueConstraints )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:545:1: (this_PropertyName_0= rulePropertyName (this_PropertyType_1= rulePropertyType )? (this_DefaultValues_2= ruleDefaultValues )? (this_PropertyAttribute_3= rulePropertyAttribute )* (this_ValueConstraints_4= ruleValueConstraints )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:546:5: this_PropertyName_0= rulePropertyName (this_PropertyType_1= rulePropertyType )? (this_DefaultValues_2= ruleDefaultValues )? (this_PropertyAttribute_3= rulePropertyAttribute )* (this_ValueConstraints_4= ruleValueConstraints )?
            {
             
                    newCompositeNode(grammarAccess.getPropertyDefAccess().getPropertyNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePropertyName_in_rulePropertyDef1412);
            this_PropertyName_0=rulePropertyName();

            state._fsp--;


            		current.merge(this_PropertyName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:556:1: (this_PropertyType_1= rulePropertyType )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_2) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:557:5: this_PropertyType_1= rulePropertyType
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDefAccess().getPropertyTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePropertyType_in_rulePropertyDef1440);
                    this_PropertyType_1=rulePropertyType();

                    state._fsp--;


                    		current.merge(this_PropertyType_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:567:3: (this_DefaultValues_2= ruleDefaultValues )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_9) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:568:5: this_DefaultValues_2= ruleDefaultValues
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDefAccess().getDefaultValuesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDefaultValues_in_rulePropertyDef1470);
                    this_DefaultValues_2=ruleDefaultValues();

                    state._fsp--;


                    		current.merge(this_DefaultValues_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:578:3: (this_PropertyAttribute_3= rulePropertyAttribute )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=KEYWORD_63 && LA16_0<=KEYWORD_61)||(LA16_0>=KEYWORD_59 && LA16_0<=KEYWORD_60)||LA16_0==KEYWORD_56||LA16_0==KEYWORD_58||(LA16_0>=KEYWORD_52 && LA16_0<=KEYWORD_53)||LA16_0==KEYWORD_46||LA16_0==KEYWORD_48||LA16_0==KEYWORD_50||LA16_0==KEYWORD_43||LA16_0==KEYWORD_37||LA16_0==KEYWORD_39||LA16_0==KEYWORD_32||LA16_0==KEYWORD_20||(LA16_0>=KEYWORD_23 && LA16_0<=KEYWORD_24)||(LA16_0>=KEYWORD_26 && LA16_0<=KEYWORD_27)||(LA16_0>=KEYWORD_29 && LA16_0<=KEYWORD_30)||LA16_0==KEYWORD_1||LA16_0==KEYWORD_4||(LA16_0>=KEYWORD_14 && LA16_0<=KEYWORD_15)||LA16_0==KEYWORD_17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:579:5: this_PropertyAttribute_3= rulePropertyAttribute
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPropertyDefAccess().getPropertyAttributeParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_rulePropertyAttribute_in_rulePropertyDef1500);
            	    this_PropertyAttribute_3=rulePropertyAttribute();

            	    state._fsp--;


            	    		current.merge(this_PropertyAttribute_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:589:3: (this_ValueConstraints_4= ruleValueConstraints )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_8) ) {
                switch ( input.LA(2) ) {
                    case RULE_EXID:
                        {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==EOF||(LA17_3>=KEYWORD_5 && LA17_3<=KEYWORD_8)||LA17_3==KEYWORD_12) ) {
                            alt17=1;
                        }
                        }
                        break;
                    case KEYWORD_25:
                        {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==EOF||(LA17_4>=KEYWORD_5 && LA17_4<=KEYWORD_8)||LA17_4==KEYWORD_12) ) {
                            alt17=1;
                        }
                        }
                        break;
                    case KEYWORD_11:
                    case RULE_STRING:
                        {
                        alt17=1;
                        }
                        break;
                }

            }
            switch (alt17) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:590:5: this_ValueConstraints_4= ruleValueConstraints
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyDefAccess().getValueConstraintsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleValueConstraints_in_rulePropertyDef1530);
                    this_ValueConstraints_4=ruleValueConstraints();

                    state._fsp--;


                    		current.merge(this_ValueConstraints_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleValueConstraints"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:608:1: entryRuleValueConstraints returns [String current=null] : iv_ruleValueConstraints= ruleValueConstraints EOF ;
    public final String entryRuleValueConstraints() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueConstraints = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:609:1: (iv_ruleValueConstraints= ruleValueConstraints EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:610:2: iv_ruleValueConstraints= ruleValueConstraints EOF
            {
             newCompositeNode(grammarAccess.getValueConstraintsRule()); 
            pushFollow(FOLLOW_ruleValueConstraints_in_entryRuleValueConstraints1577);
            iv_ruleValueConstraints=ruleValueConstraints();

            state._fsp--;

             current =iv_ruleValueConstraints.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueConstraints1588); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueConstraints"


    // $ANTLR start "ruleValueConstraints"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:617:1: ruleValueConstraints returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_8 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleValueConstraints() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrStringList_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:621:6: ( (kw= KEYWORD_8 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:622:1: (kw= KEYWORD_8 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:622:1: (kw= KEYWORD_8 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:623:2: kw= KEYWORD_8 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            {
            kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleValueConstraints1626); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getValueConstraintsAccess().getLessThanSignKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:628:1: (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_25||LA18_0==RULE_EXID||LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==KEYWORD_11) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:629:5: this_JcrStringList_1= ruleJcrStringList
                    {
                     
                            newCompositeNode(grammarAccess.getValueConstraintsAccess().getJcrStringListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrStringList_in_ruleValueConstraints1649);
                    this_JcrStringList_1=ruleJcrStringList();

                    state._fsp--;


                    		current.merge(this_JcrStringList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:641:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleValueConstraints1673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValueConstraintsAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueConstraints"


    // $ANTLR start "entryRulePropertyAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:654:1: entryRulePropertyAttribute returns [String current=null] : iv_rulePropertyAttribute= rulePropertyAttribute EOF ;
    public final String entryRulePropertyAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyAttribute = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:655:1: (iv_rulePropertyAttribute= rulePropertyAttribute EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:656:2: iv_rulePropertyAttribute= rulePropertyAttribute EOF
            {
             newCompositeNode(grammarAccess.getPropertyAttributeRule()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute1714);
            iv_rulePropertyAttribute=rulePropertyAttribute();

            state._fsp--;

             current =iv_rulePropertyAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttribute1725); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:663:1: rulePropertyAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Multiple_4= ruleMultiple | this_QueryOps_5= ruleQueryOps | this_NoFullText_6= ruleNoFullText | this_NoQueryOrder_7= ruleNoQueryOrder | this_Primary_8= rulePrimary ) ;
    public final AntlrDatatypeRuleToken rulePropertyAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Autocreated_0 = null;

        AntlrDatatypeRuleToken this_Mandatory_1 = null;

        AntlrDatatypeRuleToken this_Protected_2 = null;

        AntlrDatatypeRuleToken this_Opv_3 = null;

        AntlrDatatypeRuleToken this_Multiple_4 = null;

        AntlrDatatypeRuleToken this_QueryOps_5 = null;

        AntlrDatatypeRuleToken this_NoFullText_6 = null;

        AntlrDatatypeRuleToken this_NoQueryOrder_7 = null;

        AntlrDatatypeRuleToken this_Primary_8 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:667:6: ( (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Multiple_4= ruleMultiple | this_QueryOps_5= ruleQueryOps | this_NoFullText_6= ruleNoFullText | this_NoQueryOrder_7= ruleNoQueryOrder | this_Primary_8= rulePrimary ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:668:1: (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Multiple_4= ruleMultiple | this_QueryOps_5= ruleQueryOps | this_NoFullText_6= ruleNoFullText | this_NoQueryOrder_7= ruleNoQueryOrder | this_Primary_8= rulePrimary )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:668:1: (this_Autocreated_0= ruleAutocreated | this_Mandatory_1= ruleMandatory | this_Protected_2= ruleProtected | this_Opv_3= ruleOpv | this_Multiple_4= ruleMultiple | this_QueryOps_5= ruleQueryOps | this_NoFullText_6= ruleNoFullText | this_NoQueryOrder_7= ruleNoQueryOrder | this_Primary_8= rulePrimary )
            int alt19=9;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
            case KEYWORD_23:
            case KEYWORD_14:
                {
                alt19=1;
                }
                break;
            case KEYWORD_56:
            case KEYWORD_24:
            case KEYWORD_15:
                {
                alt19=2;
                }
                break;
            case KEYWORD_58:
            case KEYWORD_29:
            case KEYWORD_17:
                {
                alt19=3;
                }
                break;
            case KEYWORD_59:
            case KEYWORD_46:
            case KEYWORD_48:
            case KEYWORD_43:
            case KEYWORD_37:
            case KEYWORD_32:
            case KEYWORD_20:
                {
                alt19=4;
                }
                break;
            case KEYWORD_52:
            case KEYWORD_26:
            case KEYWORD_4:
                {
                alt19=5;
                }
                break;
            case KEYWORD_53:
            case KEYWORD_30:
                {
                alt19=6;
                }
                break;
            case KEYWORD_60:
            case KEYWORD_27:
                {
                alt19=7;
                }
                break;
            case KEYWORD_63:
            case KEYWORD_39:
                {
                alt19=8;
                }
                break;
            case KEYWORD_50:
            case KEYWORD_1:
                {
                alt19=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:669:5: this_Autocreated_0= ruleAutocreated
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getAutocreatedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAutocreated_in_rulePropertyAttribute1772);
                    this_Autocreated_0=ruleAutocreated();

                    state._fsp--;


                    		current.merge(this_Autocreated_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:681:5: this_Mandatory_1= ruleMandatory
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getMandatoryParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_rulePropertyAttribute1805);
                    this_Mandatory_1=ruleMandatory();

                    state._fsp--;


                    		current.merge(this_Mandatory_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:693:5: this_Protected_2= ruleProtected
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getProtectedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleProtected_in_rulePropertyAttribute1838);
                    this_Protected_2=ruleProtected();

                    state._fsp--;


                    		current.merge(this_Protected_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:5: this_Opv_3= ruleOpv
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getOpvParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOpv_in_rulePropertyAttribute1871);
                    this_Opv_3=ruleOpv();

                    state._fsp--;


                    		current.merge(this_Opv_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:717:5: this_Multiple_4= ruleMultiple
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getMultipleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleMultiple_in_rulePropertyAttribute1904);
                    this_Multiple_4=ruleMultiple();

                    state._fsp--;


                    		current.merge(this_Multiple_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:729:5: this_QueryOps_5= ruleQueryOps
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getQueryOpsParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleQueryOps_in_rulePropertyAttribute1937);
                    this_QueryOps_5=ruleQueryOps();

                    state._fsp--;


                    		current.merge(this_QueryOps_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:741:5: this_NoFullText_6= ruleNoFullText
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNoFullTextParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleNoFullText_in_rulePropertyAttribute1970);
                    this_NoFullText_6=ruleNoFullText();

                    state._fsp--;


                    		current.merge(this_NoFullText_6);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:753:5: this_NoQueryOrder_7= ruleNoQueryOrder
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getNoQueryOrderParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleNoQueryOrder_in_rulePropertyAttribute2003);
                    this_NoQueryOrder_7=ruleNoQueryOrder();

                    state._fsp--;


                    		current.merge(this_NoQueryOrder_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:765:5: this_Primary_8= rulePrimary
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAttributeAccess().getPrimaryParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_rulePrimary_in_rulePropertyAttribute2036);
                    this_Primary_8=rulePrimary();

                    state._fsp--;


                    		current.merge(this_Primary_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:783:1: entryRuleNoQueryOrder returns [String current=null] : iv_ruleNoQueryOrder= ruleNoQueryOrder EOF ;
    public final String entryRuleNoQueryOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQueryOrder = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:784:1: (iv_ruleNoQueryOrder= ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:785:2: iv_ruleNoQueryOrder= ruleNoQueryOrder EOF
            {
             newCompositeNode(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2081);
            iv_ruleNoQueryOrder=ruleNoQueryOrder();

            state._fsp--;

             current =iv_ruleNoQueryOrder.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder2092); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoQueryOrder"


    // $ANTLR start "ruleNoQueryOrder"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:792:1: ruleNoQueryOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_63 | kw= KEYWORD_39 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleNoQueryOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:796:6: ( ( (kw= KEYWORD_63 | kw= KEYWORD_39 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:797:1: ( (kw= KEYWORD_63 | kw= KEYWORD_39 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:797:1: ( (kw= KEYWORD_63 | kw= KEYWORD_39 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:797:2: (kw= KEYWORD_63 | kw= KEYWORD_39 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:797:2: (kw= KEYWORD_63 | kw= KEYWORD_39 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_63) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:798:2: kw= KEYWORD_63
                    {
                    kw=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleNoQueryOrder2131); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:805:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleNoQueryOrder2150); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNqordKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:810:2: (kw= KEYWORD_11 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_11) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:811:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNoQueryOrder2165); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoQueryOrder"


    // $ANTLR start "entryRuleNoFullText"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:824:1: entryRuleNoFullText returns [String current=null] : iv_ruleNoFullText= ruleNoFullText EOF ;
    public final String entryRuleNoFullText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoFullText = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:825:1: (iv_ruleNoFullText= ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:826:2: iv_ruleNoFullText= ruleNoFullText EOF
            {
             newCompositeNode(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText2207);
            iv_ruleNoFullText=ruleNoFullText();

            state._fsp--;

             current =iv_ruleNoFullText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText2218); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoFullText"


    // $ANTLR start "ruleNoFullText"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:833:1: ruleNoFullText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_60 | kw= KEYWORD_27 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleNoFullText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:837:6: ( ( (kw= KEYWORD_60 | kw= KEYWORD_27 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:838:1: ( (kw= KEYWORD_60 | kw= KEYWORD_27 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:838:1: ( (kw= KEYWORD_60 | kw= KEYWORD_27 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:838:2: (kw= KEYWORD_60 | kw= KEYWORD_27 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:838:2: (kw= KEYWORD_60 | kw= KEYWORD_27 )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_60) ) {
                alt22=1;
            }
            else if ( (LA22_0==KEYWORD_27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:839:2: kw= KEYWORD_60
                    {
                    kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleNoFullText2257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:846:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleNoFullText2276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:851:2: (kw= KEYWORD_11 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_11) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:852:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNoFullText2291); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoFullText"


    // $ANTLR start "entryRuleQueryOps"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:865:1: entryRuleQueryOps returns [String current=null] : iv_ruleQueryOps= ruleQueryOps EOF ;
    public final String entryRuleQueryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOps = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:866:1: (iv_ruleQueryOps= ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:867:2: iv_ruleQueryOps= ruleQueryOps EOF
            {
             newCompositeNode(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps2333);
            iv_ruleQueryOps=ruleQueryOps();

            state._fsp--;

             current =iv_ruleQueryOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps2344); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryOps"


    // $ANTLR start "ruleQueryOps"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:874:1: ruleQueryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_53 | kw= KEYWORD_30 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleQueryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:878:6: ( ( (kw= KEYWORD_53 | kw= KEYWORD_30 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:879:1: ( (kw= KEYWORD_53 | kw= KEYWORD_30 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:879:1: ( (kw= KEYWORD_53 | kw= KEYWORD_30 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:879:2: (kw= KEYWORD_53 | kw= KEYWORD_30 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:879:2: (kw= KEYWORD_53 | kw= KEYWORD_30 )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_53) ) {
                alt24=1;
            }
            else if ( (LA24_0==KEYWORD_30) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:880:2: kw= KEYWORD_53
                    {
                    kw=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleQueryOps2383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:887:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleQueryOps2402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:892:2: (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_25||LA25_0==RULE_EXID||LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==KEYWORD_11) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:893:5: this_JcrString_2= ruleJcrString
                    {
                     
                            newCompositeNode(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrString_in_ruleQueryOps2426);
                    this_JcrString_2=ruleJcrString();

                    state._fsp--;


                    		current.merge(this_JcrString_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:905:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleQueryOps2450); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryOps"


    // $ANTLR start "entryRuleMultiple"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:918:1: entryRuleMultiple returns [String current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final String entryRuleMultiple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiple = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:919:1: (iv_ruleMultiple= ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:920:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple2491);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple2502); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:927:1: ruleMultiple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleMultiple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:931:6: ( ( (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:932:1: ( (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:932:1: ( (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:932:2: (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:932:2: (kw= KEYWORD_52 | kw= KEYWORD_26 | kw= KEYWORD_4 )
            int alt26=3;
            switch ( input.LA(1) ) {
            case KEYWORD_52:
                {
                alt26=1;
                }
                break;
            case KEYWORD_26:
                {
                alt26=2;
                }
                break;
            case KEYWORD_4:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:933:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleMultiple2541); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMultipleKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:940:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleMultiple2560); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMulKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:947:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMultiple2579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getAsteriskKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:952:2: (kw= KEYWORD_11 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_11) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMultiple2594); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleOpv"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:966:1: entryRuleOpv returns [String current=null] : iv_ruleOpv= ruleOpv EOF ;
    public final String entryRuleOpv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpv = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:967:1: (iv_ruleOpv= ruleOpv EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:968:2: iv_ruleOpv= ruleOpv EOF
            {
             newCompositeNode(grammarAccess.getOpvRule()); 
            pushFollow(FOLLOW_ruleOpv_in_entryRuleOpv2636);
            iv_ruleOpv=ruleOpv();

            state._fsp--;

             current =iv_ruleOpv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpv2647); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpv"


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:975:1: ruleOpv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_32 | kw= KEYWORD_48 | kw= KEYWORD_59 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_37 | (kw= KEYWORD_20 kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleOpv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:979:6: ( (kw= KEYWORD_32 | kw= KEYWORD_48 | kw= KEYWORD_59 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_37 | (kw= KEYWORD_20 kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:980:1: (kw= KEYWORD_32 | kw= KEYWORD_48 | kw= KEYWORD_59 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_37 | (kw= KEYWORD_20 kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:980:1: (kw= KEYWORD_32 | kw= KEYWORD_48 | kw= KEYWORD_59 | kw= KEYWORD_46 | kw= KEYWORD_43 | kw= KEYWORD_37 | (kw= KEYWORD_20 kw= KEYWORD_11 ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case KEYWORD_32:
                {
                alt28=1;
                }
                break;
            case KEYWORD_48:
                {
                alt28=2;
                }
                break;
            case KEYWORD_59:
                {
                alt28=3;
                }
                break;
            case KEYWORD_46:
                {
                alt28=4;
                }
                break;
            case KEYWORD_43:
                {
                alt28=5;
                }
                break;
            case KEYWORD_37:
                {
                alt28=6;
                }
                break;
            case KEYWORD_20:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:981:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleOpv2685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getCOPYKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:988:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleOpv2704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getVERSIONKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:995:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleOpv2723); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getINITIALIZEKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1002:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOpv2742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getCOMPUTEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1009:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleOpv2761); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getIGNOREKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1016:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleOpv2780); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getABORTKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1022:6: (kw= KEYWORD_20 kw= KEYWORD_11 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1022:6: (kw= KEYWORD_20 kw= KEYWORD_11 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1023:2: kw= KEYWORD_20 kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleOpv2800); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getOPVKeyword_6_0()); 
                        
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOpv2813); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOpvAccess().getQuestionMarkKeyword_6_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpv"


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1042:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:1: (iv_ruleProtected= ruleProtected EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1044:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected2854);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected2865); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1051:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1055:6: ( ( (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1056:1: ( (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1056:1: ( (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1056:2: (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1056:2: (kw= KEYWORD_58 | kw= KEYWORD_29 | kw= KEYWORD_17 )
            int alt29=3;
            switch ( input.LA(1) ) {
            case KEYWORD_58:
                {
                alt29=1;
                }
                break;
            case KEYWORD_29:
                {
                alt29=2;
                }
                break;
            case KEYWORD_17:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1057:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleProtected2904); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProtectedKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1064:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleProtected2923); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1071:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleProtected2942); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getPKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1076:2: (kw= KEYWORD_11 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_11) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1077:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleProtected2957); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleMandatory"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1090:1: entryRuleMandatory returns [String current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final String entryRuleMandatory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMandatory = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1091:1: (iv_ruleMandatory= ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1092:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory2999);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory3010); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1099:1: ruleMandatory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleMandatory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:6: ( ( (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:1: ( (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:1: ( (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:2: (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:2: (kw= KEYWORD_56 | kw= KEYWORD_24 | kw= KEYWORD_15 )
            int alt31=3;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
                {
                alt31=1;
                }
                break;
            case KEYWORD_24:
                {
                alt31=2;
                }
                break;
            case KEYWORD_15:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1105:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleMandatory3049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1112:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMandatory3068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getManKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1119:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleMandatory3087); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1124:2: (kw= KEYWORD_11 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1125:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMandatory3102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleAutocreated"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1138:1: entryRuleAutocreated returns [String current=null] : iv_ruleAutocreated= ruleAutocreated EOF ;
    public final String entryRuleAutocreated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAutocreated = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1139:1: (iv_ruleAutocreated= ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1140:2: iv_ruleAutocreated= ruleAutocreated EOF
            {
             newCompositeNode(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated3144);
            iv_ruleAutocreated=ruleAutocreated();

            state._fsp--;

             current =iv_ruleAutocreated.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated3155); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutocreated"


    // $ANTLR start "ruleAutocreated"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1147:1: ruleAutocreated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleAutocreated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1151:6: ( ( (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:1: ( (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:1: ( (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:2: (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:2: (kw= KEYWORD_61 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            int alt33=3;
            switch ( input.LA(1) ) {
            case KEYWORD_61:
                {
                alt33=1;
                }
                break;
            case KEYWORD_23:
                {
                alt33=2;
                }
                break;
            case KEYWORD_14:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1153:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleAutocreated3194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1160:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleAutocreated3213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1167:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAutocreated3232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1172:2: (kw= KEYWORD_11 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_11) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1173:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleAutocreated3247); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutocreated"


    // $ANTLR start "entryRulePrimary"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1186:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1187:1: (iv_rulePrimary= rulePrimary EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1188:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3289);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3300); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1195:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_1 ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1199:6: ( (kw= KEYWORD_50 | kw= KEYWORD_1 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:1: (kw= KEYWORD_50 | kw= KEYWORD_1 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:1: (kw= KEYWORD_50 | kw= KEYWORD_1 )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_50) ) {
                alt35=1;
            }
            else if ( (LA35_0==KEYWORD_1) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1201:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rulePrimary3338); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1208:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimary3357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleDefaultValues"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1221:1: entryRuleDefaultValues returns [String current=null] : iv_ruleDefaultValues= ruleDefaultValues EOF ;
    public final String entryRuleDefaultValues() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultValues = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1222:1: (iv_ruleDefaultValues= ruleDefaultValues EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1223:2: iv_ruleDefaultValues= ruleDefaultValues EOF
            {
             newCompositeNode(grammarAccess.getDefaultValuesRule()); 
            pushFollow(FOLLOW_ruleDefaultValues_in_entryRuleDefaultValues3397);
            iv_ruleDefaultValues=ruleDefaultValues();

            state._fsp--;

             current =iv_ruleDefaultValues.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValues3408); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultValues"


    // $ANTLR start "ruleDefaultValues"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1230:1: ruleDefaultValues returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_9 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleDefaultValues() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrStringList_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1234:6: ( (kw= KEYWORD_9 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1235:1: (kw= KEYWORD_9 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1235:1: (kw= KEYWORD_9 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1236:2: kw= KEYWORD_9 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            {
            kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleDefaultValues3446); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getEqualsSignKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1241:1: (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_25||LA36_0==RULE_EXID||LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEYWORD_11) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1242:5: this_JcrStringList_1= ruleJcrStringList
                    {
                     
                            newCompositeNode(grammarAccess.getDefaultValuesAccess().getJcrStringListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrStringList_in_ruleDefaultValues3469);
                    this_JcrStringList_1=ruleJcrStringList();

                    state._fsp--;


                    		current.merge(this_JcrStringList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1254:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleDefaultValues3493); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDefaultValuesAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultValues"


    // $ANTLR start "entryRulePropertyType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1267:1: entryRulePropertyType returns [String current=null] : iv_rulePropertyType= rulePropertyType EOF ;
    public final String entryRulePropertyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyType = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1268:1: (iv_rulePropertyType= rulePropertyType EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1269:2: iv_rulePropertyType= rulePropertyType EOF
            {
             newCompositeNode(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType3534);
            iv_rulePropertyType=rulePropertyType();

            state._fsp--;

             current =iv_rulePropertyType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType3545); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1276:1: rulePropertyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 ) kw= KEYWORD_3 ) ;
    public final AntlrDatatypeRuleToken rulePropertyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1280:6: ( (kw= KEYWORD_2 (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 ) kw= KEYWORD_3 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1281:1: (kw= KEYWORD_2 (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 ) kw= KEYWORD_3 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1281:1: (kw= KEYWORD_2 (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 ) kw= KEYWORD_3 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1282:2: kw= KEYWORD_2 (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 ) kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePropertyType3583); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getLeftParenthesisKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1287:1: (kw= KEYWORD_44 | kw= KEYWORD_41 | kw= KEYWORD_34 | kw= KEYWORD_42 | kw= KEYWORD_45 | kw= KEYWORD_33 | kw= KEYWORD_35 | kw= KEYWORD_36 | kw= KEYWORD_54 | kw= KEYWORD_64 | kw= KEYWORD_47 | kw= KEYWORD_21 | kw= KEYWORD_55 | kw= KEYWORD_4 | kw= KEYWORD_11 )
            int alt37=15;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                alt37=1;
                }
                break;
            case KEYWORD_41:
                {
                alt37=2;
                }
                break;
            case KEYWORD_34:
                {
                alt37=3;
                }
                break;
            case KEYWORD_42:
                {
                alt37=4;
                }
                break;
            case KEYWORD_45:
                {
                alt37=5;
                }
                break;
            case KEYWORD_33:
                {
                alt37=6;
                }
                break;
            case KEYWORD_35:
                {
                alt37=7;
                }
                break;
            case KEYWORD_36:
                {
                alt37=8;
                }
                break;
            case KEYWORD_54:
                {
                alt37=9;
                }
                break;
            case KEYWORD_64:
                {
                alt37=10;
                }
                break;
            case KEYWORD_47:
                {
                alt37=11;
                }
                break;
            case KEYWORD_21:
                {
                alt37=12;
                }
                break;
            case KEYWORD_55:
                {
                alt37=13;
                }
                break;
            case KEYWORD_4:
                {
                alt37=14;
                }
                break;
            case KEYWORD_11:
                {
                alt37=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1288:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rulePropertyType3597); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getSTRINGKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1295:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rulePropertyType3616); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getBINARYKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1302:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rulePropertyType3635); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getLONGKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1309:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulePropertyType3654); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getDOUBLEKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1316:2: kw= KEYWORD_45
                    {
                    kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePropertyType3673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getBOOLEANKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1323:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rulePropertyType3692); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getDATEKeyword_1_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1330:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rulePropertyType3711); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getNAMEKeyword_1_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1337:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rulePropertyType3730); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getPATHKeyword_1_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1344:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rulePropertyType3749); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getREFERENCEKeyword_1_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1351:2: kw= KEYWORD_64
                    {
                    kw=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rulePropertyType3768); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getWEAKREFERENCEKeyword_1_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1358:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rulePropertyType3787); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getDECIMALKeyword_1_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1365:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rulePropertyType3806); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getURIKeyword_1_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1372:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rulePropertyType3825); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getUNDEFINEDKeyword_1_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1379:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePropertyType3844); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getAsteriskKeyword_1_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1386:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rulePropertyType3863); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getQuestionMarkKeyword_1_14()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePropertyType3877); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyTypeAccess().getRightParenthesisKeyword_2()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRulePropertyName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1405:1: entryRulePropertyName returns [String current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final String entryRulePropertyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyName = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1406:1: (iv_rulePropertyName= rulePropertyName EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1407:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName3917);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName3928); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1414:1: rulePropertyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_7 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) ) ;
    public final AntlrDatatypeRuleToken rulePropertyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1418:6: ( (kw= KEYWORD_7 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1419:1: (kw= KEYWORD_7 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1419:1: (kw= KEYWORD_7 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1420:2: kw= KEYWORD_7 (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 )
            {
            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePropertyName3966); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyNameAccess().getHyphenMinusKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1425:1: (this_JcrString_1= ruleJcrString | kw= KEYWORD_4 )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KEYWORD_25||LA38_0==RULE_EXID||LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else if ( (LA38_0==KEYWORD_4) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1426:5: this_JcrString_1= ruleJcrString
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyNameAccess().getJcrStringParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyName3989);
                    this_JcrString_1=ruleJcrString();

                    state._fsp--;


                    		current.merge(this_JcrString_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1438:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePropertyName4013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPropertyNameAccess().getAsteriskKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRuleNodeTypeAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1451:1: entryRuleNodeTypeAttribute returns [String current=null] : iv_ruleNodeTypeAttribute= ruleNodeTypeAttribute EOF ;
    public final String entryRuleNodeTypeAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNodeTypeAttribute = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1452:1: (iv_ruleNodeTypeAttribute= ruleNodeTypeAttribute EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1453:2: iv_ruleNodeTypeAttribute= ruleNodeTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleNodeTypeAttribute_in_entryRuleNodeTypeAttribute4054);
            iv_ruleNodeTypeAttribute=ruleNodeTypeAttribute();

            state._fsp--;

             current =iv_ruleNodeTypeAttribute.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeAttribute4065); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTypeAttribute"


    // $ANTLR start "ruleNodeTypeAttribute"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1460:1: ruleNodeTypeAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Orderable_0= ruleOrderable | this_Mixin_1= ruleMixin | this_Abstract_2= ruleAbstract | this_Query_3= ruleQuery | this_PrimaryItem_4= rulePrimaryItem ) ;
    public final AntlrDatatypeRuleToken ruleNodeTypeAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Orderable_0 = null;

        AntlrDatatypeRuleToken this_Mixin_1 = null;

        AntlrDatatypeRuleToken this_Abstract_2 = null;

        AntlrDatatypeRuleToken this_Query_3 = null;

        AntlrDatatypeRuleToken this_PrimaryItem_4 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1464:6: ( (this_Orderable_0= ruleOrderable | this_Mixin_1= ruleMixin | this_Abstract_2= ruleAbstract | this_Query_3= ruleQuery | this_PrimaryItem_4= rulePrimaryItem ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1465:1: (this_Orderable_0= ruleOrderable | this_Mixin_1= ruleMixin | this_Abstract_2= ruleAbstract | this_Query_3= ruleQuery | this_PrimaryItem_4= rulePrimaryItem )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1465:1: (this_Orderable_0= ruleOrderable | this_Mixin_1= ruleMixin | this_Abstract_2= ruleAbstract | this_Query_3= ruleQuery | this_PrimaryItem_4= rulePrimaryItem )
            int alt39=5;
            switch ( input.LA(1) ) {
            case KEYWORD_57:
            case KEYWORD_28:
            case KEYWORD_16:
                {
                alt39=1;
                }
                break;
            case KEYWORD_38:
            case KEYWORD_25:
            case KEYWORD_15:
                {
                alt39=2;
                }
                break;
            case KEYWORD_51:
            case KEYWORD_22:
            case KEYWORD_14:
                {
                alt39=3;
                }
                break;
            case KEYWORD_49:
            case KEYWORD_40:
            case KEYWORD_19:
            case KEYWORD_18:
                {
                alt39=4;
                }
                break;
            case KEYWORD_62:
            case KEYWORD_1:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1466:5: this_Orderable_0= ruleOrderable
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeAttributeAccess().getOrderableParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOrderable_in_ruleNodeTypeAttribute4112);
                    this_Orderable_0=ruleOrderable();

                    state._fsp--;


                    		current.merge(this_Orderable_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1478:5: this_Mixin_1= ruleMixin
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeAttributeAccess().getMixinParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMixin_in_ruleNodeTypeAttribute4145);
                    this_Mixin_1=ruleMixin();

                    state._fsp--;


                    		current.merge(this_Mixin_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1490:5: this_Abstract_2= ruleAbstract
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeAttributeAccess().getAbstractParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAbstract_in_ruleNodeTypeAttribute4178);
                    this_Abstract_2=ruleAbstract();

                    state._fsp--;


                    		current.merge(this_Abstract_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1502:5: this_Query_3= ruleQuery
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeAttributeAccess().getQueryParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleQuery_in_ruleNodeTypeAttribute4211);
                    this_Query_3=ruleQuery();

                    state._fsp--;


                    		current.merge(this_Query_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1514:5: this_PrimaryItem_4= rulePrimaryItem
                    {
                     
                            newCompositeNode(grammarAccess.getNodeTypeAttributeAccess().getPrimaryItemParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePrimaryItem_in_ruleNodeTypeAttribute4244);
                    this_PrimaryItem_4=rulePrimaryItem();

                    state._fsp--;


                    		current.merge(this_PrimaryItem_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTypeAttribute"


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1532:1: entryRulePrimaryItem returns [String current=null] : iv_rulePrimaryItem= rulePrimaryItem EOF ;
    public final String entryRulePrimaryItem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryItem = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1533:1: (iv_rulePrimaryItem= rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1534:2: iv_rulePrimaryItem= rulePrimaryItem EOF
            {
             newCompositeNode(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem4289);
            iv_rulePrimaryItem=rulePrimaryItem();

            state._fsp--;

             current =iv_rulePrimaryItem.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem4300); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryItem"


    // $ANTLR start "rulePrimaryItem"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1541:1: rulePrimaryItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_62 | kw= KEYWORD_1 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken rulePrimaryItem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1545:6: ( ( (kw= KEYWORD_62 | kw= KEYWORD_1 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:1: ( (kw= KEYWORD_62 | kw= KEYWORD_1 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:1: ( (kw= KEYWORD_62 | kw= KEYWORD_1 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:2: (kw= KEYWORD_62 | kw= KEYWORD_1 ) (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:2: (kw= KEYWORD_62 | kw= KEYWORD_1 )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEYWORD_62) ) {
                alt40=1;
            }
            else if ( (LA40_0==KEYWORD_1) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1547:2: kw= KEYWORD_62
                    {
                    kw=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rulePrimaryItem4339); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1554:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimaryItem4358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1559:2: (this_JcrString_2= ruleJcrString | kw= KEYWORD_11 )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEYWORD_25||LA41_0==RULE_EXID||LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else if ( (LA41_0==KEYWORD_11) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1560:5: this_JcrString_2= ruleJcrString
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrString_in_rulePrimaryItem4382);
                    this_JcrString_2=ruleJcrString();

                    state._fsp--;


                    		current.merge(this_JcrString_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1572:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rulePrimaryItem4406); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryItem"


    // $ANTLR start "entryRuleQuery"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1585:1: entryRuleQuery returns [String current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final String entryRuleQuery() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQuery = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1586:1: (iv_ruleQuery= ruleQuery EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1587:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery4447);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery4458); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1594:1: ruleQuery returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_49 | kw= KEYWORD_19 ) | (kw= KEYWORD_40 | kw= KEYWORD_18 ) ) ;
    public final AntlrDatatypeRuleToken ruleQuery() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1598:6: ( ( (kw= KEYWORD_49 | kw= KEYWORD_19 ) | (kw= KEYWORD_40 | kw= KEYWORD_18 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1599:1: ( (kw= KEYWORD_49 | kw= KEYWORD_19 ) | (kw= KEYWORD_40 | kw= KEYWORD_18 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1599:1: ( (kw= KEYWORD_49 | kw= KEYWORD_19 ) | (kw= KEYWORD_40 | kw= KEYWORD_18 ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KEYWORD_49||LA44_0==KEYWORD_19) ) {
                alt44=1;
            }
            else if ( (LA44_0==KEYWORD_40||LA44_0==KEYWORD_18) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1599:2: (kw= KEYWORD_49 | kw= KEYWORD_19 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1599:2: (kw= KEYWORD_49 | kw= KEYWORD_19 )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==KEYWORD_49) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==KEYWORD_19) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1600:2: kw= KEYWORD_49
                            {
                            kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleQuery4497); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getQueryAccess().getNoqueryKeyword_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1607:2: kw= KEYWORD_19
                            {
                            kw=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleQuery4516); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getQueryAccess().getNqKeyword_0_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1613:6: (kw= KEYWORD_40 | kw= KEYWORD_18 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1613:6: (kw= KEYWORD_40 | kw= KEYWORD_18 )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==KEYWORD_40) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==KEYWORD_18) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1614:2: kw= KEYWORD_40
                            {
                            kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleQuery4537); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getQueryAccess().getQueryKeyword_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1621:2: kw= KEYWORD_18
                            {
                            kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleQuery4556); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getQueryAccess().getQKeyword_1_1()); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1634:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1635:1: (iv_ruleAbstract= ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1636:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract4597);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract4608); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1643:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1647:6: ( ( (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1648:1: ( (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1648:1: ( (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1648:2: (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1648:2: (kw= KEYWORD_51 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            int alt45=3;
            switch ( input.LA(1) ) {
            case KEYWORD_51:
                {
                alt45=1;
                }
                break;
            case KEYWORD_22:
                {
                alt45=2;
                }
                break;
            case KEYWORD_14:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1649:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleAbstract4647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbstractKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1656:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleAbstract4666); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbsKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1663:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleAbstract4685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1668:2: (kw= KEYWORD_11 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_11) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1669:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleAbstract4700); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleMixin"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1682:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1683:1: (iv_ruleMixin= ruleMixin EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1684:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin4742);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin4753); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1691:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1695:6: ( ( (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1696:1: ( (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1696:1: ( (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1696:2: (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1696:2: (kw= KEYWORD_38 | kw= KEYWORD_25 | kw= KEYWORD_15 )
            int alt47=3;
            switch ( input.LA(1) ) {
            case KEYWORD_38:
                {
                alt47=1;
                }
                break;
            case KEYWORD_25:
                {
                alt47=2;
                }
                break;
            case KEYWORD_15:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1697:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleMixin4792); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixinKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1704:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleMixin4811); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1711:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleMixin4830); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1716:2: (kw= KEYWORD_11 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KEYWORD_11) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1717:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleMixin4845); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleOrderable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1730:1: entryRuleOrderable returns [String current=null] : iv_ruleOrderable= ruleOrderable EOF ;
    public final String entryRuleOrderable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1731:1: (iv_ruleOrderable= ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1732:2: iv_ruleOrderable= ruleOrderable EOF
            {
             newCompositeNode(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable4887);
            iv_ruleOrderable=ruleOrderable();

            state._fsp--;

             current =iv_ruleOrderable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable4898); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderable"


    // $ANTLR start "ruleOrderable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1739:1: ruleOrderable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 ) (kw= KEYWORD_11 )? ) ;
    public final AntlrDatatypeRuleToken ruleOrderable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1743:6: ( ( (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 ) (kw= KEYWORD_11 )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:1: ( (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 ) (kw= KEYWORD_11 )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:1: ( (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 ) (kw= KEYWORD_11 )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:2: (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 ) (kw= KEYWORD_11 )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:2: (kw= KEYWORD_57 | kw= KEYWORD_28 | kw= KEYWORD_16 )
            int alt49=3;
            switch ( input.LA(1) ) {
            case KEYWORD_57:
                {
                alt49=1;
                }
                break;
            case KEYWORD_28:
                {
                alt49=2;
                }
                break;
            case KEYWORD_16:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1745:2: kw= KEYWORD_57
                    {
                    kw=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOrderable4937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrderableKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1752:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleOrderable4956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrdKeyword_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1759:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleOrderable4975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOKeyword_0_2()); 
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1764:2: (kw= KEYWORD_11 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KEYWORD_11) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1765:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleOrderable4990); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getQuestionMarkKeyword_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderable"


    // $ANTLR start "entryRuleSuperTypes"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1778:1: entryRuleSuperTypes returns [String current=null] : iv_ruleSuperTypes= ruleSuperTypes EOF ;
    public final String entryRuleSuperTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSuperTypes = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1779:1: (iv_ruleSuperTypes= ruleSuperTypes EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1780:2: iv_ruleSuperTypes= ruleSuperTypes EOF
            {
             newCompositeNode(grammarAccess.getSuperTypesRule()); 
            pushFollow(FOLLOW_ruleSuperTypes_in_entryRuleSuperTypes5032);
            iv_ruleSuperTypes=ruleSuperTypes();

            state._fsp--;

             current =iv_ruleSuperTypes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperTypes5043); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperTypes"


    // $ANTLR start "ruleSuperTypes"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1787:1: ruleSuperTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_10 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) ;
    public final AntlrDatatypeRuleToken ruleSuperTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrStringList_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1791:6: ( (kw= KEYWORD_10 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1792:1: (kw= KEYWORD_10 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1792:1: (kw= KEYWORD_10 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1793:2: kw= KEYWORD_10 (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            {
            kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleSuperTypes5081); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSuperTypesAccess().getGreaterThanSignKeyword_0()); 
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1798:1: (this_JcrStringList_1= ruleJcrStringList | kw= KEYWORD_11 )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_25||LA51_0==RULE_EXID||LA51_0==RULE_STRING) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEYWORD_11) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1799:5: this_JcrStringList_1= ruleJcrStringList
                    {
                     
                            newCompositeNode(grammarAccess.getSuperTypesAccess().getJcrStringListParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleJcrStringList_in_ruleSuperTypes5104);
                    this_JcrStringList_1=ruleJcrStringList();

                    state._fsp--;


                    		current.merge(this_JcrStringList_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1811:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleSuperTypes5128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSuperTypesAccess().getQuestionMarkKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperTypes"


    // $ANTLR start "entryRuleNodeTypeName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1824:1: entryRuleNodeTypeName returns [EObject current=null] : iv_ruleNodeTypeName= ruleNodeTypeName EOF ;
    public final EObject entryRuleNodeTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeName = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1825:2: (iv_ruleNodeTypeName= ruleNodeTypeName EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1826:2: iv_ruleNodeTypeName= ruleNodeTypeName EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeNameRule()); 
            pushFollow(FOLLOW_ruleNodeTypeName_in_entryRuleNodeTypeName5168);
            iv_ruleNodeTypeName=ruleNodeTypeName();

            state._fsp--;

             current =iv_ruleNodeTypeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeName5178); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTypeName"


    // $ANTLR start "ruleNodeTypeName"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1833:1: ruleNodeTypeName returns [EObject current=null] : (otherlv_0= KEYWORD_12 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_13 ) ;
    public final EObject ruleNodeTypeName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1836:28: ( (otherlv_0= KEYWORD_12 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1837:1: (otherlv_0= KEYWORD_12 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1837:1: (otherlv_0= KEYWORD_12 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_13 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1838:2: otherlv_0= KEYWORD_12 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_13
            {
            otherlv_0=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNodeTypeName5216); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeTypeNameAccess().getLeftSquareBracketKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1842:1: ( (lv_name_1_0= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1843:1: (lv_name_1_0= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1843:1: (lv_name_1_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1844:3: lv_name_1_0= ruleJcrString
            {
             
            	        newCompositeNode(grammarAccess.getNodeTypeNameAccess().getNameJcrStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeName5236);
            lv_name_1_0=ruleJcrString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeTypeNameRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"JcrString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleNodeTypeName5249); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeTypeNameAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTypeName"


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1873:1: entryRuleNsMapping returns [EObject current=null] : iv_ruleNsMapping= ruleNsMapping EOF ;
    public final EObject entryRuleNsMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNsMapping = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1874:2: (iv_ruleNsMapping= ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1875:2: iv_ruleNsMapping= ruleNsMapping EOF
            {
             newCompositeNode(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping5283);
            iv_ruleNsMapping=ruleNsMapping();

            state._fsp--;

             current =iv_ruleNsMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping5293); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNsMapping"


    // $ANTLR start "ruleNsMapping"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1882:1: ruleNsMapping returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) ;
    public final EObject ruleNsMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1885:28: ( (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1886:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1886:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1887:2: otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNsMapping5331); 

                	newLeafNode(otherlv_0, grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1891:1: ( (lv_name_1_0= rulePrefix ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1892:1: (lv_name_1_0= rulePrefix )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1892:1: (lv_name_1_0= rulePrefix )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1893:3: lv_name_1_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleNsMapping5351);
            lv_name_1_0=rulePrefix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNsMappingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Prefix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNsMapping5364); 

                	newLeafNode(otherlv_2, grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1914:1: ( (lv_uri_3_0= ruleUri ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1915:1: (lv_uri_3_0= ruleUri )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1915:1: (lv_uri_3_0= ruleUri )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1916:3: lv_uri_3_0= ruleUri
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUri_in_ruleNsMapping5384);
            lv_uri_3_0=ruleUri();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNsMappingRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_3_0, 
                    		"Uri");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNsMapping5397); 

                	newLeafNode(otherlv_4, grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNsMapping"


    // $ANTLR start "entryRulePrefix"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1945:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1946:1: (iv_rulePrefix= rulePrefix EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1947:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix5432);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix5443); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1954:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_XiD_0= ruleXiD ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XiD_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1958:6: (this_XiD_0= ruleXiD )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1960:5: this_XiD_0= ruleXiD
            {
             
                    newCompositeNode(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix5489);
            this_XiD_0=ruleXiD();

            state._fsp--;


            		current.merge(this_XiD_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1978:1: entryRuleUri returns [String current=null] : iv_ruleUri= ruleUri EOF ;
    public final String entryRuleUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUri = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1979:1: (iv_ruleUri= ruleUri EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1980:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri5533);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri5544); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1987:1: ruleUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JcrString_0= ruleJcrString ;
    public final AntlrDatatypeRuleToken ruleUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_JcrString_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1991:6: (this_JcrString_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1993:5: this_JcrString_0= ruleJcrString
            {
             
                    newCompositeNode(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri5590);
            this_JcrString_0=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleJcrStringList"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2011:1: entryRuleJcrStringList returns [String current=null] : iv_ruleJcrStringList= ruleJcrStringList EOF ;
    public final String entryRuleJcrStringList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJcrStringList = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2012:1: (iv_ruleJcrStringList= ruleJcrStringList EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2013:2: iv_ruleJcrStringList= ruleJcrStringList EOF
            {
             newCompositeNode(grammarAccess.getJcrStringListRule()); 
            pushFollow(FOLLOW_ruleJcrStringList_in_entryRuleJcrStringList5634);
            iv_ruleJcrStringList=ruleJcrStringList();

            state._fsp--;

             current =iv_ruleJcrStringList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrStringList5645); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJcrStringList"


    // $ANTLR start "ruleJcrStringList"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2020:1: ruleJcrStringList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_JcrString_0= ruleJcrString (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )* ) ;
    public final AntlrDatatypeRuleToken ruleJcrStringList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_0 = null;

        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2024:6: ( (this_JcrString_0= ruleJcrString (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:1: (this_JcrString_0= ruleJcrString (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:1: (this_JcrString_0= ruleJcrString (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2026:5: this_JcrString_0= ruleJcrString (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )*
            {
             
                    newCompositeNode(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleJcrStringList5692);
            this_JcrString_0=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2036:1: (kw= KEYWORD_6 this_JcrString_2= ruleJcrString )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==KEYWORD_6) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2037:2: kw= KEYWORD_6 this_JcrString_2= ruleJcrString
            	    {
            	    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleJcrStringList5711); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getJcrStringListAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleJcrString_in_ruleJcrStringList5733);
            	    this_JcrString_2=ruleJcrString();

            	    state._fsp--;


            	    		current.merge(this_JcrString_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJcrStringList"


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2061:1: entryRuleJcrString returns [String current=null] : iv_ruleJcrString= ruleJcrString EOF ;
    public final String entryRuleJcrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJcrString = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2062:1: (iv_ruleJcrString= ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2063:2: iv_ruleJcrString= ruleJcrString EOF
            {
             newCompositeNode(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString5780);
            iv_ruleJcrString=ruleJcrString();

            state._fsp--;

             current =iv_ruleJcrString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString5791); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJcrString"


    // $ANTLR start "ruleJcrString"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2070:1: ruleJcrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) ;
    public final AntlrDatatypeRuleToken ruleJcrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_XiD_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2074:6: ( (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_STRING) ) {
                alt53=1;
            }
            else if ( (LA53_0==KEYWORD_25||LA53_0==RULE_EXID) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJcrString5831); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2084:5: this_XiD_1= ruleXiD
                    {
                     
                            newCompositeNode(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXiD_in_ruleJcrString5864);
                    this_XiD_1=ruleXiD();

                    state._fsp--;


                    		current.merge(this_XiD_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJcrString"


    // $ANTLR start "entryRuleXiD"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2102:1: entryRuleXiD returns [String current=null] : iv_ruleXiD= ruleXiD EOF ;
    public final String entryRuleXiD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXiD = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2103:1: (iv_ruleXiD= ruleXiD EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2104:2: iv_ruleXiD= ruleXiD EOF
            {
             newCompositeNode(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD5909);
            iv_ruleXiD=ruleXiD();

            state._fsp--;

             current =iv_ruleXiD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD5920); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXiD"


    // $ANTLR start "ruleXiD"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2111:1: ruleXiD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXID_0= RULE_EXID | kw= KEYWORD_25 ) ;
    public final AntlrDatatypeRuleToken ruleXiD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2115:6: ( (this_EXID_0= RULE_EXID | kw= KEYWORD_25 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2116:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_25 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2116:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_25 )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_EXID) ) {
                alt54=1;
            }
            else if ( (LA54_0==KEYWORD_25) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2116:6: this_EXID_0= RULE_EXID
                    {
                    this_EXID_0=(Token)match(input,RULE_EXID,FOLLOW_RULE_EXID_in_ruleXiD5960); 

                    		current.merge(this_EXID_0);
                        
                     
                        newLeafNode(this_EXID_0, grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2125:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleXiD5984); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getXiDAccess().getMixKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXiD"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_ruleModel123 = new BitSet(new long[]{0x2200000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDef_in_ruleModel150 = new BitSet(new long[]{0x2200000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDef_in_entryRuleNodeTypeDef186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDef196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeName_in_ruleNodeTypeDef243 = new BitSet(new long[]{0x89462480A040A082L,0x000000000000000BL});
    public static final BitSet FOLLOW_ruleSuperTypes_in_ruleNodeTypeDef259 = new BitSet(new long[]{0x81462480A040A082L,0x000000000000000BL});
    public static final BitSet FOLLOW_ruleNodeTypeAttribute_in_ruleNodeTypeDef281 = new BitSet(new long[]{0x81462480A040A082L,0x000000000000000BL});
    public static final BitSet FOLLOW_rulePropertyDef_in_ruleNodeTypeDef299 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_ruleChildNodeDef_in_ruleNodeTypeDef320 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_ruleChildNodeDef_in_entryRuleChildNodeDef357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildNodeDef368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeName_in_ruleChildNodeDef415 = new BitSet(new long[]{0x8429432114295142L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleRequiredTypes_in_ruleChildNodeDef443 = new BitSet(new long[]{0x8421432114295142L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleDefaultType_in_ruleChildNodeDef473 = new BitSet(new long[]{0x8021432114295142L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleNodeAttribute_in_ruleChildNodeDef503 = new BitSet(new long[]{0x8021432114295142L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleNodeAttribute_in_entryRuleNodeAttribute550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttribute561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_ruleNodeAttribute608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleNodeAttribute641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleNodeAttribute674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_ruleNodeAttribute707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_ruleNodeAttribute740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleSns835 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSns854 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleSns873 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSns888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultType_in_entryRuleDefaultType930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultType941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleDefaultType979 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleDefaultType1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleDefaultType1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredTypes_in_entryRuleRequiredTypes1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredTypes1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleRequiredTypes1116 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_ruleRequiredTypes1139 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleRequiredTypes1163 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleRequiredTypes1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeName_in_entryRuleNodeName1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeName1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNodeName1266 = new BitSet(new long[]{0x0020040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeName1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleNodeName1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDef_in_entryRulePropertyDef1354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDef1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_rulePropertyDef1412 = new BitSet(new long[]{0x862CDB2154AB5362L,0x0000000000000005L});
    public static final BitSet FOLLOW_rulePropertyType_in_rulePropertyDef1440 = new BitSet(new long[]{0x8624DB2154AB5362L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleDefaultValues_in_rulePropertyDef1470 = new BitSet(new long[]{0x8224DB2154AB5362L,0x0000000000000005L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_rulePropertyDef1500 = new BitSet(new long[]{0x8224DB2154AB5362L,0x0000000000000005L});
    public static final BitSet FOLLOW_ruleValueConstraints_in_rulePropertyDef1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueConstraints_in_entryRuleValueConstraints1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueConstraints1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleValueConstraints1626 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_ruleValueConstraints1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleValueConstraints1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute1714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttribute1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rulePropertyAttribute1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rulePropertyAttribute1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rulePropertyAttribute1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rulePropertyAttribute1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_rulePropertyAttribute1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rulePropertyAttribute1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rulePropertyAttribute1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rulePropertyAttribute2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePropertyAttribute2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleNoQueryOrder2131 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleNoQueryOrder2150 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNoQueryOrder2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleNoFullText2257 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleNoFullText2276 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNoFullText2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleQueryOps2383 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleQueryOps2402 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleQueryOps2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleQueryOps2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple2491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleMultiple2541 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleMultiple2560 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMultiple2579 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMultiple2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_entryRuleOpv2636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpv2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleOpv2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleOpv2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleOpv2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOpv2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleOpv2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleOpv2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleOpv2800 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOpv2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleProtected2904 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleProtected2923 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleProtected2942 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleProtected2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory2999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleMandatory3049 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMandatory3068 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleMandatory3087 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMandatory3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated3144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleAutocreated3194 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleAutocreated3213 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAutocreated3232 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleAutocreated3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rulePrimary3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimary3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValues_in_entryRuleDefaultValues3397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValues3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleDefaultValues3446 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_ruleDefaultValues3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleDefaultValues3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType3534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePropertyType3583 = new BitSet(new long[]{0x1020005E0B140C10L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rulePropertyType3597 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rulePropertyType3616 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rulePropertyType3635 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulePropertyType3654 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePropertyType3673 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rulePropertyType3692 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rulePropertyType3711 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rulePropertyType3730 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rulePropertyType3749 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rulePropertyType3768 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rulePropertyType3787 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rulePropertyType3806 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rulePropertyType3825 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePropertyType3844 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rulePropertyType3863 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePropertyType3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName3917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePropertyName3966 = new BitSet(new long[]{0x0020040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyName3989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePropertyName4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeAttribute_in_entryRuleNodeTypeAttribute4054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeAttribute4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_ruleNodeTypeAttribute4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleNodeTypeAttribute4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleNodeTypeAttribute4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_ruleNodeTypeAttribute4211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_ruleNodeTypeAttribute4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem4289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rulePrimaryItem4339 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimaryItem4358 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePrimaryItem4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rulePrimaryItem4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery4447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleQuery4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleQuery4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleQuery4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleQuery4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleAbstract4647 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleAbstract4666 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleAbstract4685 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleAbstract4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin4742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleMixin4792 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleMixin4811 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleMixin4830 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleMixin4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable4887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOrderable4937 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleOrderable4956 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleOrderable4975 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleOrderable4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperTypes_in_entryRuleSuperTypes5032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperTypes5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleSuperTypes5081 = new BitSet(new long[]{0x1000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_ruleSuperTypes5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleSuperTypes5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeName_in_entryRuleNodeTypeName5168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeName5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNodeTypeName5216 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeName5236 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleNodeTypeName5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping5283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNsMapping5331 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleNsMapping5351 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNsMapping5364 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleUri_in_ruleNsMapping5384 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNsMapping5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix5432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri5533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_entryRuleJcrStringList5634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrStringList5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleJcrStringList5692 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleJcrStringList5711 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleJcrStringList5733 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJcrString5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_ruleJcrString5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD5909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_ruleXiD5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleXiD5984 = new BitSet(new long[]{0x0000000000000002L});

}