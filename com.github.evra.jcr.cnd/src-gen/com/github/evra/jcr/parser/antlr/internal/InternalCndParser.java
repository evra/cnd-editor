package com.github.evra.jcr.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_62", "KEYWORD_61", "KEYWORD_59", "KEYWORD_60", "KEYWORD_57", "KEYWORD_58", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_18", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=67;
    public static final int RULE_ANY_OTHER=73;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_17=65;
    public static final int KEYWORD_53=11;
    public static final int KEYWORD_18=48;
    public static final int KEYWORD_52=10;
    public static final int KEYWORD_15=63;
    public static final int KEYWORD_51=17;
    public static final int KEYWORD_16=64;
    public static final int KEYWORD_50=16;
    public static final int KEYWORD_13=61;
    public static final int KEYWORD_14=62;
    public static final int KEYWORD_11=59;
    public static final int EOF=-1;
    public static final int KEYWORD_12=60;
    public static final int KEYWORD_10=58;
    public static final int KEYWORD_59=6;
    public static final int KEYWORD_58=9;
    public static final int KEYWORD_57=8;
    public static final int KEYWORD_6=54;
    public static final int KEYWORD_7=55;
    public static final int KEYWORD_8=56;
    public static final int KEYWORD_9=57;
    public static final int KEYWORD_28=46;
    public static final int RULE_EXID=66;
    public static final int KEYWORD_29=47;
    public static final int RULE_INT=68;
    public static final int KEYWORD_61=5;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_60=7;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_26=44;
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_62=4;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_30=32;
    public static final int KEYWORD_1=49;
    public static final int KEYWORD_34=36;
    public static final int KEYWORD_5=53;
    public static final int KEYWORD_33=35;
    public static final int KEYWORD_4=52;
    public static final int KEYWORD_32=34;
    public static final int KEYWORD_3=51;
    public static final int KEYWORD_31=33;
    public static final int KEYWORD_2=50;
    public static final int KEYWORD_38=31;
    public static final int KEYWORD_37=30;
    public static final int RULE_SL_COMMENT=71;
    public static final int KEYWORD_36=29;
    public static final int KEYWORD_35=28;
    public static final int RULE_ML_COMMENT=70;
    public static final int KEYWORD_39=24;
    public static final int RULE_STRING=69;
    public static final int KEYWORD_41=26;
    public static final int KEYWORD_40=25;
    public static final int KEYWORD_43=18;
    public static final int KEYWORD_42=27;
    public static final int KEYWORD_45=20;
    public static final int KEYWORD_44=19;
    public static final int KEYWORD_47=22;
    public static final int RULE_WS=72;
    public static final int KEYWORD_46=21;
    public static final int KEYWORD_49=15;
    public static final int KEYWORD_48=23;

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:62:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:63:2: (iv_ruleModel= ruleModel EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:64:2: iv_ruleModel= ruleModel EOF
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaces_0_0 = null;

        EObject lv_nodeTypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:28: ( ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_8) ) {
                    alt1=1;
                }
                else if ( (LA1_0==KEYWORD_11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:2: ( (lv_namespaces_0_0= ruleNsMapping ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:2: ( (lv_namespaces_0_0= ruleNsMapping ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:76:1: (lv_namespaces_0_0= ruleNsMapping )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:76:1: (lv_namespaces_0_0= ruleNsMapping )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:77:3: lv_namespaces_0_0= ruleNsMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNsMapping_in_ruleModel123);
            	    lv_namespaces_0_0=ruleNsMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaces",
            	            		lv_namespaces_0_0, 
            	            		"NsMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:6: ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:6: ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:95:1: (lv_nodeTypes_1_0= ruleNodeTypeDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:95:1: (lv_nodeTypes_1_0= ruleNodeTypeDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:96:3: lv_nodeTypes_1_0= ruleNodeTypeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeTypeDefinition_in_ruleModel150);
            	    lv_nodeTypes_1_0=ruleNodeTypeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodeTypes",
            	            		lv_nodeTypes_1_0, 
            	            		"NodeTypeDefinition");
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


    // $ANTLR start "entryRuleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:120:1: entryRuleNodeTypeDefinition returns [EObject current=null] : iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF ;
    public final EObject entryRuleNodeTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:121:2: (iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:122:2: iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition186);
            iv_ruleNodeTypeDefinition=ruleNodeTypeDefinition();

            state._fsp--;

             current =iv_ruleNodeTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDefinition196); 

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
    // $ANTLR end "entryRuleNodeTypeDefinition"


    // $ANTLR start "ruleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:129:1: ruleNodeTypeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )* ) ;
    public final EObject ruleNodeTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_orderable_8_0 = null;

        AntlrDatatypeRuleToken lv_mixin_9_0 = null;

        AntlrDatatypeRuleToken lv_abstract_10_0 = null;

        AntlrDatatypeRuleToken lv_queryable_11_0 = null;

        AntlrDatatypeRuleToken lv_notqueryable_12_0 = null;

        AntlrDatatypeRuleToken lv_primaryItem_15_0 = null;

        EObject lv_declaredPropertyDefinitions_16_0 = null;

        EObject lv_declaredChildNodeDefinitions_17_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:132:28: ( (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:134:2: otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNodeTypeDefinition234); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:138:1: ( (lv_name_1_0= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:139:1: (lv_name_1_0= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:139:1: (lv_name_1_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:140:3: lv_name_1_0= ruleJcrString
            {
             
            	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition254);
            lv_name_1_0=ruleJcrString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"JcrString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNodeTypeDefinition267); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:161:1: (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:162:2: otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    {
                    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNodeTypeDefinition280); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:166:1: ( ( ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:167:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:167:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:168:3: ruleJcrString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeTypeDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition302);
                    ruleJcrString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:181:2: (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==KEYWORD_6) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:182:2: otherlv_5= KEYWORD_6 ( ( ruleJcrString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNodeTypeDefinition316); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:186:1: ( ( ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:187:1: ( ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:187:1: ( ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:188:3: ruleJcrString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeTypeDefinitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition338);
                    	    ruleJcrString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:201:6: ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:203:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:203:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:204:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:207:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:208:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:208:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) ) )*
            loop5:
            do {
                int alt5=7;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==KEYWORD_55||LA5_0==KEYWORD_26||LA5_0==KEYWORD_15) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt5=1;
                }
                else if ( (LA5_0==KEYWORD_36||LA5_0==KEYWORD_23||LA5_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt5=2;
                }
                else if ( (LA5_0==KEYWORD_49||LA5_0==KEYWORD_20||LA5_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt5=3;
                }
                else if ( (LA5_0==KEYWORD_38||LA5_0==KEYWORD_17) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt5=4;
                }
                else if ( (LA5_0==KEYWORD_47||LA5_0==KEYWORD_18) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt5=5;
                }
                else if ( (LA5_0==KEYWORD_60||LA5_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                    alt5=6;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:210:4: ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:210:4: ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:211:5: {...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:211:115: ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:212:6: ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:215:6: ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:215:7: {...}? => ( (lv_orderable_8_0= ruleOrderable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:215:16: ( (lv_orderable_8_0= ruleOrderable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:216:1: (lv_orderable_8_0= ruleOrderable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:216:1: (lv_orderable_8_0= ruleOrderable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:217:3: lv_orderable_8_0= ruleOrderable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrderable_in_ruleNodeTypeDefinition408);
            	    lv_orderable_8_0=ruleOrderable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"orderable",
            	            		true, 
            	            		"Orderable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:240:4: ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:240:4: ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:241:5: {...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:241:115: ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:242:6: ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:245:6: ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:245:7: {...}? => ( (lv_mixin_9_0= ruleMixin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:245:16: ( (lv_mixin_9_0= ruleMixin ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:246:1: (lv_mixin_9_0= ruleMixin )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:246:1: (lv_mixin_9_0= ruleMixin )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:247:3: lv_mixin_9_0= ruleMixin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMixin_in_ruleNodeTypeDefinition483);
            	    lv_mixin_9_0=ruleMixin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mixin",
            	            		true, 
            	            		"Mixin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:270:4: ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:270:4: ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:271:5: {...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:271:115: ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:272:6: ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:275:6: ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:275:7: {...}? => ( (lv_abstract_10_0= ruleAbstract ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:275:16: ( (lv_abstract_10_0= ruleAbstract ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:276:1: (lv_abstract_10_0= ruleAbstract )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:276:1: (lv_abstract_10_0= ruleAbstract )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:277:3: lv_abstract_10_0= ruleAbstract
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstract_in_ruleNodeTypeDefinition558);
            	    lv_abstract_10_0=ruleAbstract();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"abstract",
            	            		true, 
            	            		"Abstract");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:300:4: ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:300:4: ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:301:5: {...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:301:115: ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:302:6: ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:305:6: ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:305:7: {...}? => ( (lv_queryable_11_0= ruleQueryable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:305:16: ( (lv_queryable_11_0= ruleQueryable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:306:1: (lv_queryable_11_0= ruleQueryable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:306:1: (lv_queryable_11_0= ruleQueryable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:307:3: lv_queryable_11_0= ruleQueryable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryable_in_ruleNodeTypeDefinition633);
            	    lv_queryable_11_0=ruleQueryable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"queryable",
            	            		true, 
            	            		"Queryable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:330:4: ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:330:4: ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:331:5: {...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:331:115: ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:332:6: ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:335:6: ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:335:7: {...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:335:16: ( (lv_notqueryable_12_0= ruleNotqueryable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:336:1: (lv_notqueryable_12_0= ruleNotqueryable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:336:1: (lv_notqueryable_12_0= ruleNotqueryable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:337:3: lv_notqueryable_12_0= ruleNotqueryable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotqueryable_in_ruleNodeTypeDefinition708);
            	    lv_notqueryable_12_0=ruleNotqueryable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"notqueryable",
            	            		true, 
            	            		"Notqueryable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:360:4: ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:360:4: ({...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:361:5: {...}? => ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:361:115: ( ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:362:6: ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:6: ({...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:7: {...}? => ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:16: ( (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:17: (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 ) ( (lv_primaryItem_15_0= ruleJcrString ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:17: (otherlv_13= KEYWORD_60 | otherlv_14= KEYWORD_1 )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==KEYWORD_60) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==KEYWORD_1) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:366:2: otherlv_13= KEYWORD_60
            	            {
            	            otherlv_13=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleNodeTypeDefinition777); 

            	                	newLeafNode(otherlv_13, grammarAccess.getNodeTypeDefinitionAccess().getPrimaryitemKeyword_4_5_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:372:2: otherlv_14= KEYWORD_1
            	            {
            	            otherlv_14=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNodeTypeDefinition795); 

            	                	newLeafNode(otherlv_14, grammarAccess.getNodeTypeDefinitionAccess().getExclamationMarkKeyword_4_5_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:376:2: ( (lv_primaryItem_15_0= ruleJcrString ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:377:1: (lv_primaryItem_15_0= ruleJcrString )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:377:1: (lv_primaryItem_15_0= ruleJcrString )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:378:3: lv_primaryItem_15_0= ruleJcrString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemJcrStringParserRuleCall_4_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition816);
            	    lv_primaryItem_15_0=ruleJcrString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"primaryItem",
            	            		lv_primaryItem_15_0, 
            	            		"JcrString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:408:2: ( ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_7) ) {
                    alt6=1;
                }
                else if ( (LA6_0==KEYWORD_5) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:408:3: ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:408:3: ( (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:409:1: (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:409:1: (lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:410:3: lv_declaredPropertyDefinitions_16_0= rulePropertyDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition879);
            	    lv_declaredPropertyDefinitions_16_0=rulePropertyDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredPropertyDefinitions",
            	            		lv_declaredPropertyDefinitions_16_0, 
            	            		"PropertyDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:427:6: ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:427:6: ( (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:428:1: (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:428:1: (lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:429:3: lv_declaredChildNodeDefinitions_17_0= ruleNodeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition906);
            	    lv_declaredChildNodeDefinitions_17_0=ruleNodeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredChildNodeDefinitions",
            	            		lv_declaredChildNodeDefinitions_17_0, 
            	            		"NodeDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleNodeTypeDefinition"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:453:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:454:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:455:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition943);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition953); 

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:462:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_autocreated_11_0 = null;

        AntlrDatatypeRuleToken lv_manadatory_12_0 = null;

        AntlrDatatypeRuleToken lv_protected_13_0 = null;

        Enumerator lv_onParentVersion_14_0 = null;

        AntlrDatatypeRuleToken lv_sameNameSiblings_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:465:28: ( (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:467:2: otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNodeDefinition991); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:471:1: ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_23||LA7_0==RULE_EXID||LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_4) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:471:2: ( (lv_name_1_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:471:2: ( (lv_name_1_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:472:1: (lv_name_1_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:472:1: (lv_name_1_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:473:3: lv_name_1_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1012);
                    lv_name_1_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:490:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:490:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:491:1: (lv_name_2_0= KEYWORD_4 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:491:1: (lv_name_2_0= KEYWORD_4 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:492:3: lv_name_2_0= KEYWORD_4
                    {
                    lv_name_2_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleNodeDefinition1037); 

                            newLeafNode(lv_name_2_0, grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "*");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:506:3: (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_2) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:507:2: otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3
                    {
                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNodeDefinition1063); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:511:1: ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:511:2: ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:511:2: ( ( ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:512:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:512:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:513:3: ruleJcrString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1086);
                    ruleJcrString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:526:2: (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==KEYWORD_6) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:527:2: otherlv_5= KEYWORD_6 ( ( ruleJcrString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNodeDefinition1100); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:531:1: ( ( ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:532:1: ( ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:532:1: ( ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:533:3: ruleJcrString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1122);
                    	    ruleJcrString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }

                    otherlv_7=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNodeDefinition1138); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:551:3: (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_9) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:552:2: otherlv_8= KEYWORD_9 ( ( ruleJcrString ) )
                    {
                    otherlv_8=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNodeDefinition1153); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:556:1: ( ( ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:557:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:557:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:558:3: ruleJcrString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1175);
                    ruleJcrString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:571:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:573:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:573:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:574:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:577:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:578:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:578:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_59||LA11_0==KEYWORD_21||LA11_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt11=1;
                }
                else if ( (LA11_0==KEYWORD_54||LA11_0==KEYWORD_22||LA11_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt11=2;
                }
                else if ( (LA11_0==KEYWORD_56||LA11_0==KEYWORD_27||LA11_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt11=3;
                }
                else if ( (LA11_0==KEYWORD_57||LA11_0==KEYWORD_44||LA11_0==KEYWORD_46||LA11_0==KEYWORD_41||LA11_0==KEYWORD_35||LA11_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt11=4;
                }
                else if ( (LA11_0==KEYWORD_50||LA11_0==KEYWORD_29||LA11_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:580:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:580:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:581:5: {...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:581:111: ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:582:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:585:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:585:7: {...}? => ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:585:16: ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:586:1: (lv_autocreated_11_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:586:1: (lv_autocreated_11_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:587:3: lv_autocreated_11_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_ruleNodeDefinition1243);
            	    lv_autocreated_11_0=ruleAutocreated();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"autocreated",
            	            		true, 
            	            		"Autocreated");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:610:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:610:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:611:5: {...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:611:111: ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:612:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:615:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:615:7: {...}? => ( (lv_manadatory_12_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:615:16: ( (lv_manadatory_12_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:616:1: (lv_manadatory_12_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:616:1: (lv_manadatory_12_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:617:3: lv_manadatory_12_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_ruleNodeDefinition1318);
            	    lv_manadatory_12_0=ruleMandatory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"manadatory",
            	            		true, 
            	            		"Mandatory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:640:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:640:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:641:5: {...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:641:111: ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:642:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:645:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:645:7: {...}? => ( (lv_protected_13_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:645:16: ( (lv_protected_13_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:646:1: (lv_protected_13_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:646:1: (lv_protected_13_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:647:3: lv_protected_13_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_ruleNodeDefinition1393);
            	    lv_protected_13_0=ruleProtected();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protected",
            	            		true, 
            	            		"Protected");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:670:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:670:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:671:5: {...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:671:111: ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:672:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:675:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:675:7: {...}? => ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:675:16: ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:676:1: (lv_onParentVersion_14_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:676:1: (lv_onParentVersion_14_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:677:3: lv_onParentVersion_14_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_ruleNodeDefinition1468);
            	    lv_onParentVersion_14_0=ruleOpv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"onParentVersion",
            	            		lv_onParentVersion_14_0, 
            	            		"Opv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:700:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:700:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:701:5: {...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:701:111: ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:702:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:7: {...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:16: ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:706:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:706:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:707:3: lv_sameNameSiblings_15_0= ruleSns
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSns_in_ruleNodeDefinition1543);
            	    lv_sameNameSiblings_15_0=ruleSns();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"sameNameSiblings",
            	            		true, 
            	            		"Sns");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	

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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:745:1: entryRuleSns returns [String current=null] : iv_ruleSns= ruleSns EOF ;
    public final String entryRuleSns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSns = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:746:1: (iv_ruleSns= ruleSns EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:747:2: iv_ruleSns= ruleSns EOF
            {
             newCompositeNode(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns1619);
            iv_ruleSns=ruleSns();

            state._fsp--;

             current =iv_ruleSns.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns1630); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:754:1: ruleSns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) ;
    public final AntlrDatatypeRuleToken ruleSns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:758:6: ( (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:759:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:759:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            int alt12=3;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt12=1;
                }
                break;
            case KEYWORD_4:
                {
                alt12=2;
                }
                break;
            case KEYWORD_50:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:760:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSns1668); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:767:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSns1687); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:774:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleSns1706); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getMultipleKeyword_2()); 
                        

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
    // $ANTLR end "ruleSns"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:787:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:788:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:789:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1745);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1755); 

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:796:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValues_8_0 = null;

        AntlrDatatypeRuleToken lv_defaultValues_10_0 = null;

        AntlrDatatypeRuleToken lv_autocreated_12_0 = null;

        AntlrDatatypeRuleToken lv_mandatory_13_0 = null;

        AntlrDatatypeRuleToken lv_protected_14_0 = null;

        Enumerator lv_onParentVersion_15_0 = null;

        AntlrDatatypeRuleToken lv_multiple_16_0 = null;

        AntlrDatatypeRuleToken lv_queryOps_17_0 = null;

        AntlrDatatypeRuleToken lv_noFullText_18_0 = null;

        AntlrDatatypeRuleToken lv_noQueryOrder_19_0 = null;

        AntlrDatatypeRuleToken lv_primary_20_0 = null;

        AntlrDatatypeRuleToken lv_valueConstraints_22_0 = null;

        AntlrDatatypeRuleToken lv_valueConstraints_24_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:799:28: ( ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:2: () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:2: ()
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:801:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePropertyDefinition1802); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:811:1: ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_23||LA13_0==RULE_EXID||LA13_0==RULE_STRING) ) {
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:811:2: ( (lv_name_2_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:811:2: ( (lv_name_2_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:812:1: (lv_name_2_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:812:1: (lv_name_2_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:813:3: lv_name_2_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1823);
                    lv_name_2_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:831:2: otherlv_3= KEYWORD_4
                    {
                    otherlv_3=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePropertyDefinition1842); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:835:2: (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_2) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:836:2: otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3
                    {
                    otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePropertyDefinition1856); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:840:1: ( (lv_type_5_0= rulePropertyType ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:841:1: (lv_type_5_0= rulePropertyType )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:841:1: (lv_type_5_0= rulePropertyType )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:842:3: lv_type_5_0= rulePropertyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyType_in_rulePropertyDefinition1876);
                    lv_type_5_0=rulePropertyType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"PropertyType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePropertyDefinition1889); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:863:3: (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_9) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:864:2: otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    {
                    otherlv_7=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePropertyDefinition1904); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:868:1: ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:868:2: ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:868:2: ( (lv_defaultValues_8_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:869:1: (lv_defaultValues_8_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:869:1: (lv_defaultValues_8_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:870:3: lv_defaultValues_8_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1925);
                    lv_defaultValues_8_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"defaultValues",
                            		lv_defaultValues_8_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:886:2: (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==KEYWORD_6) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:887:2: otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition1939); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:891:1: ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:892:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:892:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:893:3: lv_defaultValues_10_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1959);
                    	    lv_defaultValues_10_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"defaultValues",
                    	            		lv_defaultValues_10_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:909:7: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:911:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:911:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:912:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:915:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:916:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:916:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            loop17:
            do {
                int alt17=10;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:918:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:918:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:919:5: {...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:919:115: ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:920:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:923:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:923:7: {...}? => ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:923:16: ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:924:1: (lv_autocreated_12_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:924:1: (lv_autocreated_12_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:925:3: lv_autocreated_12_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_rulePropertyDefinition2030);
            	    lv_autocreated_12_0=ruleAutocreated();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"autocreated",
            	            		true, 
            	            		"Autocreated");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:948:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:948:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:949:5: {...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:949:115: ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:950:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:7: {...}? => ( (lv_mandatory_13_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:16: ( (lv_mandatory_13_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:954:1: (lv_mandatory_13_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:954:1: (lv_mandatory_13_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:955:3: lv_mandatory_13_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_rulePropertyDefinition2105);
            	    lv_mandatory_13_0=ruleMandatory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mandatory",
            	            		true, 
            	            		"Mandatory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:978:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:978:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:979:5: {...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:979:115: ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:980:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:983:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:983:7: {...}? => ( (lv_protected_14_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:983:16: ( (lv_protected_14_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:984:1: (lv_protected_14_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:984:1: (lv_protected_14_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:985:3: lv_protected_14_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_rulePropertyDefinition2180);
            	    lv_protected_14_0=ruleProtected();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protected",
            	            		true, 
            	            		"Protected");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1008:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1008:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1009:5: {...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1009:115: ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1010:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1013:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1013:7: {...}? => ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1013:16: ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1014:1: (lv_onParentVersion_15_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1014:1: (lv_onParentVersion_15_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1015:3: lv_onParentVersion_15_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_rulePropertyDefinition2255);
            	    lv_onParentVersion_15_0=ruleOpv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"onParentVersion",
            	            		lv_onParentVersion_15_0, 
            	            		"Opv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1038:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1038:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1039:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1039:115: ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1040:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:7: {...}? => ( (lv_multiple_16_0= ruleMultiple ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:16: ( (lv_multiple_16_0= ruleMultiple ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1044:1: (lv_multiple_16_0= ruleMultiple )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1044:1: (lv_multiple_16_0= ruleMultiple )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1045:3: lv_multiple_16_0= ruleMultiple
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiple_in_rulePropertyDefinition2330);
            	    lv_multiple_16_0=ruleMultiple();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"multiple",
            	            		true, 
            	            		"Multiple");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1068:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1068:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1069:5: {...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1069:115: ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1070:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1073:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1073:7: {...}? => ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1073:16: ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1074:1: (lv_queryOps_17_0= ruleQueryOps )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1074:1: (lv_queryOps_17_0= ruleQueryOps )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1075:3: lv_queryOps_17_0= ruleQueryOps
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryOps_in_rulePropertyDefinition2405);
            	    lv_queryOps_17_0=ruleQueryOps();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"queryOps",
            	            		lv_queryOps_17_0, 
            	            		"QueryOps");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1098:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1098:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1099:5: {...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1099:115: ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1100:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:7: {...}? => ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:16: ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:1: (lv_noFullText_18_0= ruleNoFullText )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:1: (lv_noFullText_18_0= ruleNoFullText )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1105:3: lv_noFullText_18_0= ruleNoFullText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoFullText_in_rulePropertyDefinition2480);
            	    lv_noFullText_18_0=ruleNoFullText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noFullText",
            	            		true, 
            	            		"NoFullText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1128:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1128:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1129:5: {...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1129:115: ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1130:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1133:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1133:7: {...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1133:16: ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1134:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1134:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1135:3: lv_noQueryOrder_19_0= ruleNoQueryOrder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2555);
            	    lv_noQueryOrder_19_0=ruleNoQueryOrder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noQueryOrder",
            	            		true, 
            	            		"NoQueryOrder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1158:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1158:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1159:5: {...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1159:115: ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1160:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1163:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1163:7: {...}? => ( (lv_primary_20_0= rulePrimary ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1163:16: ( (lv_primary_20_0= rulePrimary ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1164:1: (lv_primary_20_0= rulePrimary )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1164:1: (lv_primary_20_0= rulePrimary )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1165:3: lv_primary_20_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_rulePropertyDefinition2630);
            	    lv_primary_20_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"primary",
            	            		true, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1195:2: (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_8) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt19=1;
                        }
                        break;
                    case RULE_EXID:
                        {
                        int LA19_4 = input.LA(3);

                        if ( (LA19_4==EOF||(LA19_4>=KEYWORD_5 && LA19_4<=KEYWORD_8)||LA19_4==KEYWORD_11) ) {
                            alt19=1;
                        }
                        }
                        break;
                    case KEYWORD_23:
                        {
                        int LA19_5 = input.LA(3);

                        if ( (LA19_5==EOF||(LA19_5>=KEYWORD_5 && LA19_5<=KEYWORD_8)||LA19_5==KEYWORD_11) ) {
                            alt19=1;
                        }
                        }
                        break;
                }

            }
            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1196:2: otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    {
                    otherlv_21=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePropertyDefinition2684); 

                        	newLeafNode(otherlv_21, grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:1: ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:2: ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:2: ( (lv_valueConstraints_22_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1201:1: (lv_valueConstraints_22_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1201:1: (lv_valueConstraints_22_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1202:3: lv_valueConstraints_22_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2705);
                    lv_valueConstraints_22_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"valueConstraints",
                            		lv_valueConstraints_22_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1218:2: (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==KEYWORD_6) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1219:2: otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition2719); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1223:1: ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1224:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1224:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1225:3: lv_valueConstraints_24_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2739);
                    	    lv_valueConstraints_24_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valueConstraints",
                    	            		lv_valueConstraints_24_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1249:1: entryRuleNoQueryOrder returns [String current=null] : iv_ruleNoQueryOrder= ruleNoQueryOrder EOF ;
    public final String entryRuleNoQueryOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQueryOrder = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1250:1: (iv_ruleNoQueryOrder= ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1251:2: iv_ruleNoQueryOrder= ruleNoQueryOrder EOF
            {
             newCompositeNode(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2780);
            iv_ruleNoQueryOrder=ruleNoQueryOrder();

            state._fsp--;

             current =iv_ruleNoQueryOrder.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder2791); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1258:1: ruleNoQueryOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_61 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNoQueryOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1262:6: ( (kw= KEYWORD_61 | kw= KEYWORD_37 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1263:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1263:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_61) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1264:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2829); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1271:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2848); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 
                        

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
    // $ANTLR end "ruleNoQueryOrder"


    // $ANTLR start "entryRuleNoFullText"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1284:1: entryRuleNoFullText returns [String current=null] : iv_ruleNoFullText= ruleNoFullText EOF ;
    public final String entryRuleNoFullText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoFullText = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1285:1: (iv_ruleNoFullText= ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1286:2: iv_ruleNoFullText= ruleNoFullText EOF
            {
             newCompositeNode(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText2888);
            iv_ruleNoFullText=ruleNoFullText();

            state._fsp--;

             current =iv_ruleNoFullText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText2899); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1293:1: ruleNoFullText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_58 | kw= KEYWORD_25 ) ;
    public final AntlrDatatypeRuleToken ruleNoFullText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1297:6: ( (kw= KEYWORD_58 | kw= KEYWORD_25 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1298:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1298:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_58) ) {
                alt21=1;
            }
            else if ( (LA21_0==KEYWORD_25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1299:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleNoFullText2937); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1306:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleNoFullText2956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 
                        

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
    // $ANTLR end "ruleNoFullText"


    // $ANTLR start "entryRuleQueryOps"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1319:1: entryRuleQueryOps returns [String current=null] : iv_ruleQueryOps= ruleQueryOps EOF ;
    public final String entryRuleQueryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOps = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1320:1: (iv_ruleQueryOps= ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1321:2: iv_ruleQueryOps= ruleQueryOps EOF
            {
             newCompositeNode(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps2996);
            iv_ruleQueryOps=ruleQueryOps();

            state._fsp--;

             current =iv_ruleQueryOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps3007); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1328:1: ruleQueryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) ;
    public final AntlrDatatypeRuleToken ruleQueryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1332:6: ( ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1333:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1333:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1333:2: (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1333:2: (kw= KEYWORD_51 | kw= KEYWORD_28 )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KEYWORD_51) ) {
                alt22=1;
            }
            else if ( (LA22_0==KEYWORD_28) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1334:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQueryOps3046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1341:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleQueryOps3065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleQueryOps3088);
            this_JcrString_2=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1365:1: entryRuleMultiple returns [String current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final String entryRuleMultiple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiple = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1366:1: (iv_ruleMultiple= ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1367:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple3133);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple3144); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1374:1: ruleMultiple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) ;
    public final AntlrDatatypeRuleToken ruleMultiple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1378:6: ( (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1379:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1379:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            int alt23=3;
            switch ( input.LA(1) ) {
            case KEYWORD_50:
                {
                alt23=1;
                }
                break;
            case KEYWORD_24:
                {
                alt23=2;
                }
                break;
            case KEYWORD_4:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1380:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleMultiple3182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1387:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMultiple3201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1394:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMultiple3220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 
                        

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
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1407:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1408:1: (iv_ruleProtected= ruleProtected EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1409:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected3260);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected3271); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1416:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1420:6: ( (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1421:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1421:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            int alt24=3;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
                {
                alt24=1;
                }
                break;
            case KEYWORD_27:
                {
                alt24=2;
                }
                break;
            case KEYWORD_16:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1422:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleProtected3309); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1429:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleProtected3328); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1436:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleProtected3347); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getPKeyword_2()); 
                        

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
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleMandatory"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1449:1: entryRuleMandatory returns [String current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final String entryRuleMandatory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMandatory = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1450:1: (iv_ruleMandatory= ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1451:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory3387);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory3398); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1458:1: ruleMandatory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMandatory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1462:6: ( (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1463:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1463:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case KEYWORD_54:
                {
                alt25=1;
                }
                break;
            case KEYWORD_22:
                {
                alt25=2;
                }
                break;
            case KEYWORD_14:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1464:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleMandatory3436); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1471:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMandatory3455); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1478:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMandatory3474); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMKeyword_2()); 
                        

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleAutocreated"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1491:1: entryRuleAutocreated returns [String current=null] : iv_ruleAutocreated= ruleAutocreated EOF ;
    public final String entryRuleAutocreated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAutocreated = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1492:1: (iv_ruleAutocreated= ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1493:2: iv_ruleAutocreated= ruleAutocreated EOF
            {
             newCompositeNode(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated3514);
            iv_ruleAutocreated=ruleAutocreated();

            state._fsp--;

             current =iv_ruleAutocreated.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated3525); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1500:1: ruleAutocreated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAutocreated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1504:6: ( (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1505:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1505:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            int alt26=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
                {
                alt26=1;
                }
                break;
            case KEYWORD_21:
                {
                alt26=2;
                }
                break;
            case KEYWORD_13:
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1506:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleAutocreated3563); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1513:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAutocreated3582); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1520:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAutocreated3601); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAKeyword_2()); 
                        

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
    // $ANTLR end "ruleAutocreated"


    // $ANTLR start "entryRulePrimary"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1533:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1534:1: (iv_rulePrimary= rulePrimary EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1535:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3641);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3652); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1542:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_48 | kw= KEYWORD_1 ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:6: ( (kw= KEYWORD_48 | kw= KEYWORD_1 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1547:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1547:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_48) ) {
                alt27=1;
            }
            else if ( (LA27_0==KEYWORD_1) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1548:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulePrimary3690); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1555:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimary3709); 

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


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1568:1: entryRuleQueryable returns [String current=null] : iv_ruleQueryable= ruleQueryable EOF ;
    public final String entryRuleQueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1569:1: (iv_ruleQueryable= ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1570:2: iv_ruleQueryable= ruleQueryable EOF
            {
             newCompositeNode(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable3749);
            iv_ruleQueryable=ruleQueryable();

            state._fsp--;

             current =iv_ruleQueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable3760); 

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
    // $ANTLR end "entryRuleQueryable"


    // $ANTLR start "ruleQueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1577:1: ruleQueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_38 | kw= KEYWORD_17 ) ;
    public final AntlrDatatypeRuleToken ruleQueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1581:6: ( (kw= KEYWORD_38 | kw= KEYWORD_17 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1582:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1582:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_38) ) {
                alt28=1;
            }
            else if ( (LA28_0==KEYWORD_17) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1583:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleQueryable3798); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1590:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleQueryable3817); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryableAccess().getQKeyword_1()); 
                        

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
    // $ANTLR end "ruleQueryable"


    // $ANTLR start "entryRuleNotqueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1603:1: entryRuleNotqueryable returns [String current=null] : iv_ruleNotqueryable= ruleNotqueryable EOF ;
    public final String entryRuleNotqueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotqueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1604:1: (iv_ruleNotqueryable= ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1605:2: iv_ruleNotqueryable= ruleNotqueryable EOF
            {
             newCompositeNode(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3857);
            iv_ruleNotqueryable=ruleNotqueryable();

            state._fsp--;

             current =iv_ruleNotqueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable3868); 

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
    // $ANTLR end "entryRuleNotqueryable"


    // $ANTLR start "ruleNotqueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1612:1: ruleNotqueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_47 | kw= KEYWORD_18 ) ;
    public final AntlrDatatypeRuleToken ruleNotqueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1616:6: ( (kw= KEYWORD_47 | kw= KEYWORD_18 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1617:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1617:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_47) ) {
                alt29=1;
            }
            else if ( (LA29_0==KEYWORD_18) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1618:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleNotqueryable3906); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1625:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNotqueryable3925); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 
                        

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
    // $ANTLR end "ruleNotqueryable"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1638:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1639:1: (iv_ruleAbstract= ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1640:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract3965);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract3976); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1647:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1651:6: ( (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1652:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1652:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
            int alt30=3;
            switch ( input.LA(1) ) {
            case KEYWORD_49:
                {
                alt30=1;
                }
                break;
            case KEYWORD_20:
                {
                alt30=2;
                }
                break;
            case KEYWORD_13:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1653:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleAbstract4014); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1660:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAbstract4033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1667:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAbstract4052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAKeyword_2()); 
                        

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleMixin"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1680:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1681:1: (iv_ruleMixin= ruleMixin EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1682:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin4092);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin4103); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1689:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1693:6: ( (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1694:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1694:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            int alt31=3;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt31=1;
                }
                break;
            case KEYWORD_23:
                {
                alt31=2;
                }
                break;
            case KEYWORD_14:
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1695:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleMixin4141); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1702:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleMixin4160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1709:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMixin4179); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMKeyword_2()); 
                        

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
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleOrderable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1722:1: entryRuleOrderable returns [String current=null] : iv_ruleOrderable= ruleOrderable EOF ;
    public final String entryRuleOrderable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1723:1: (iv_ruleOrderable= ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1724:2: iv_ruleOrderable= ruleOrderable EOF
            {
             newCompositeNode(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable4219);
            iv_ruleOrderable=ruleOrderable();

            state._fsp--;

             current =iv_ruleOrderable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable4230); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1731:1: ruleOrderable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) ;
    public final AntlrDatatypeRuleToken ruleOrderable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1735:6: ( (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1736:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1736:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
            int alt32=3;
            switch ( input.LA(1) ) {
            case KEYWORD_55:
                {
                alt32=1;
                }
                break;
            case KEYWORD_26:
                {
                alt32=2;
                }
                break;
            case KEYWORD_15:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1737:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleOrderable4268); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderable4287); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1751:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOrderable4306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOKeyword_2()); 
                        

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
    // $ANTLR end "ruleOrderable"


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1764:1: entryRuleNsMapping returns [EObject current=null] : iv_ruleNsMapping= ruleNsMapping EOF ;
    public final EObject entryRuleNsMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNsMapping = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1765:2: (iv_ruleNsMapping= ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1766:2: iv_ruleNsMapping= ruleNsMapping EOF
            {
             newCompositeNode(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping4345);
            iv_ruleNsMapping=ruleNsMapping();

            state._fsp--;

             current =iv_ruleNsMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping4355); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1773:1: ruleNsMapping returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) ;
    public final EObject ruleNsMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1776:28: ( (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1777:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1777:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1778:2: otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNsMapping4393); 

                	newLeafNode(otherlv_0, grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1782:1: ( (lv_name_1_0= rulePrefix ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1783:1: (lv_name_1_0= rulePrefix )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1783:1: (lv_name_1_0= rulePrefix )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1784:3: lv_name_1_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleNsMapping4413);
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

            otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNsMapping4426); 

                	newLeafNode(otherlv_2, grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1805:1: ( (lv_uri_3_0= ruleUri ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1806:1: (lv_uri_3_0= ruleUri )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1806:1: (lv_uri_3_0= ruleUri )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1807:3: lv_uri_3_0= ruleUri
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUri_in_ruleNsMapping4446);
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

            otherlv_4=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNsMapping4459); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1836:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1837:1: (iv_rulePrefix= rulePrefix EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1838:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix4494);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix4505); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1845:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_XiD_0= ruleXiD ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XiD_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1849:6: (this_XiD_0= ruleXiD )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1851:5: this_XiD_0= ruleXiD
            {
             
                    newCompositeNode(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix4551);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1869:1: entryRuleUri returns [String current=null] : iv_ruleUri= ruleUri EOF ;
    public final String entryRuleUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUri = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1870:1: (iv_ruleUri= ruleUri EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1871:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri4595);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri4606); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1878:1: ruleUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JcrString_0= ruleJcrString ;
    public final AntlrDatatypeRuleToken ruleUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_JcrString_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1882:6: (this_JcrString_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1884:5: this_JcrString_0= ruleJcrString
            {
             
                    newCompositeNode(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri4652);
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


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1902:1: entryRuleJcrString returns [String current=null] : iv_ruleJcrString= ruleJcrString EOF ;
    public final String entryRuleJcrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJcrString = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1903:1: (iv_ruleJcrString= ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1904:2: iv_ruleJcrString= ruleJcrString EOF
            {
             newCompositeNode(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString4696);
            iv_ruleJcrString=ruleJcrString();

            state._fsp--;

             current =iv_ruleJcrString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString4707); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1911:1: ruleJcrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) ;
    public final AntlrDatatypeRuleToken ruleJcrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_XiD_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1915:6: ( (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1916:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1916:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==KEYWORD_23||LA33_0==RULE_EXID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1916:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJcrString4747); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1925:5: this_XiD_1= ruleXiD
                    {
                     
                            newCompositeNode(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXiD_in_ruleJcrString4780);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1943:1: entryRuleXiD returns [String current=null] : iv_ruleXiD= ruleXiD EOF ;
    public final String entryRuleXiD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXiD = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1944:1: (iv_ruleXiD= ruleXiD EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1945:2: iv_ruleXiD= ruleXiD EOF
            {
             newCompositeNode(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD4825);
            iv_ruleXiD=ruleXiD();

            state._fsp--;

             current =iv_ruleXiD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD4836); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1952:1: ruleXiD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXID_0= RULE_EXID | kw= KEYWORD_23 ) ;
    public final AntlrDatatypeRuleToken ruleXiD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1956:6: ( (this_EXID_0= RULE_EXID | kw= KEYWORD_23 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1957:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_23 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1957:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_23 )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_EXID) ) {
                alt34=1;
            }
            else if ( (LA34_0==KEYWORD_23) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1957:6: this_EXID_0= RULE_EXID
                    {
                    this_EXID_0=(Token)match(input,RULE_EXID,FOLLOW_RULE_EXID_in_ruleXiD4876); 

                    		current.merge(this_EXID_0);
                        
                     
                        newLeafNode(this_EXID_0, grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1966:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleXiD4900); 

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


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1979:1: ruleOpv returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) ;
    public final Enumerator ruleOpv() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1981:28: ( ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1982:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1982:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
                {
                alt35=1;
                }
                break;
            case KEYWORD_46:
                {
                alt35=2;
                }
                break;
            case KEYWORD_57:
                {
                alt35=3;
                }
                break;
            case KEYWORD_44:
                {
                alt35=4;
                }
                break;
            case KEYWORD_41:
                {
                alt35=5;
                }
                break;
            case KEYWORD_35:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1982:2: (enumLiteral_0= KEYWORD_30 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1982:2: (enumLiteral_0= KEYWORD_30 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1982:7: enumLiteral_0= KEYWORD_30
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleOpv4957); 

                            current = grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1988:6: (enumLiteral_1= KEYWORD_46 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1988:6: (enumLiteral_1= KEYWORD_46 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1988:11: enumLiteral_1= KEYWORD_46
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOpv4979); 

                            current = grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1994:6: (enumLiteral_2= KEYWORD_57 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1994:6: (enumLiteral_2= KEYWORD_57 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1994:11: enumLiteral_2= KEYWORD_57
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOpv5001); 

                            current = grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2000:6: (enumLiteral_3= KEYWORD_44 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2000:6: (enumLiteral_3= KEYWORD_44 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2000:11: enumLiteral_3= KEYWORD_44
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOpv5023); 

                            current = grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2006:6: (enumLiteral_4= KEYWORD_41 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2006:6: (enumLiteral_4= KEYWORD_41 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2006:11: enumLiteral_4= KEYWORD_41
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOpv5045); 

                            current = grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2012:6: (enumLiteral_5= KEYWORD_35 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2012:6: (enumLiteral_5= KEYWORD_35 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2012:11: enumLiteral_5= KEYWORD_35
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOpv5067); 

                            current = grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 
                        

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


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2022:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;

         enterRule(); 
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2024:28: ( ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            int alt36=13;
            switch ( input.LA(1) ) {
            case KEYWORD_53:
                {
                alt36=1;
                }
                break;
            case KEYWORD_42:
                {
                alt36=2;
                }
                break;
            case KEYWORD_39:
                {
                alt36=3;
                }
                break;
            case KEYWORD_32:
                {
                alt36=4;
                }
                break;
            case KEYWORD_40:
                {
                alt36=5;
                }
                break;
            case KEYWORD_31:
                {
                alt36=6;
                }
                break;
            case KEYWORD_43:
                {
                alt36=7;
                }
                break;
            case KEYWORD_33:
                {
                alt36=8;
                }
                break;
            case KEYWORD_34:
                {
                alt36=9;
                }
                break;
            case KEYWORD_52:
                {
                alt36=10;
                }
                break;
            case KEYWORD_62:
                {
                alt36=11;
                }
                break;
            case KEYWORD_19:
                {
                alt36=12;
                }
                break;
            case KEYWORD_45:
                {
                alt36=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:2: (enumLiteral_0= KEYWORD_53 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:2: (enumLiteral_0= KEYWORD_53 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2025:7: enumLiteral_0= KEYWORD_53
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulePropertyType5117); 

                            current = grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2031:6: (enumLiteral_1= KEYWORD_42 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2031:6: (enumLiteral_1= KEYWORD_42 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2031:11: enumLiteral_1= KEYWORD_42
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulePropertyType5139); 

                            current = grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2037:6: (enumLiteral_2= KEYWORD_39 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2037:6: (enumLiteral_2= KEYWORD_39 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2037:11: enumLiteral_2= KEYWORD_39
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rulePropertyType5161); 

                            current = grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2043:6: (enumLiteral_3= KEYWORD_32 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2043:6: (enumLiteral_3= KEYWORD_32 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2043:11: enumLiteral_3= KEYWORD_32
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rulePropertyType5183); 

                            current = grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2049:6: (enumLiteral_4= KEYWORD_40 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2049:6: (enumLiteral_4= KEYWORD_40 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2049:11: enumLiteral_4= KEYWORD_40
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulePropertyType5205); 

                            current = grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2055:6: (enumLiteral_5= KEYWORD_31 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2055:6: (enumLiteral_5= KEYWORD_31 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2055:11: enumLiteral_5= KEYWORD_31
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rulePropertyType5227); 

                            current = grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2061:6: (enumLiteral_6= KEYWORD_43 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2061:6: (enumLiteral_6= KEYWORD_43 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2061:11: enumLiteral_6= KEYWORD_43
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rulePropertyType5249); 

                            current = grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2067:6: (enumLiteral_7= KEYWORD_33 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2067:6: (enumLiteral_7= KEYWORD_33 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2067:11: enumLiteral_7= KEYWORD_33
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rulePropertyType5271); 

                            current = grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2073:6: (enumLiteral_8= KEYWORD_34 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2073:6: (enumLiteral_8= KEYWORD_34 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2073:11: enumLiteral_8= KEYWORD_34
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rulePropertyType5293); 

                            current = grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2079:6: (enumLiteral_9= KEYWORD_52 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2079:6: (enumLiteral_9= KEYWORD_52 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2079:11: enumLiteral_9= KEYWORD_52
                    {
                    enumLiteral_9=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePropertyType5315); 

                            current = grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2085:6: (enumLiteral_10= KEYWORD_62 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2085:6: (enumLiteral_10= KEYWORD_62 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2085:11: enumLiteral_10= KEYWORD_62
                    {
                    enumLiteral_10=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rulePropertyType5337); 

                            current = grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2091:6: (enumLiteral_11= KEYWORD_19 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2091:6: (enumLiteral_11= KEYWORD_19 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2091:11: enumLiteral_11= KEYWORD_19
                    {
                    enumLiteral_11=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rulePropertyType5359); 

                            current = grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2097:6: (enumLiteral_12= KEYWORD_45 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2097:6: (enumLiteral_12= KEYWORD_45 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2097:11: enumLiteral_12= KEYWORD_45
                    {
                    enumLiteral_12=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePropertyType5381); 

                            current = grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 
                        

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
    // $ANTLR end "rulePropertyType"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\13\uffff";
    static final String DFA17_eofS =
        "\1\1\12\uffff";
    static final String DFA17_minS =
        "\1\5\12\uffff";
    static final String DFA17_maxS =
        "\1\100\12\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA17_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\11\1\2\1\uffff\1\5\1\10\2\uffff\1\3\1\uffff\1\4\1\uffff"+
            "\1\6\1\7\1\uffff\1\5\1\uffff\1\5\1\uffff\1\12\2\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\11\1\uffff\1\5\6\uffff\1\2\1\3\1\uffff"+
            "\1\6\1\10\1\uffff\1\4\1\7\2\uffff\1\12\2\uffff\1\6\1\1\1\uffff"+
            "\2\1\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 916:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA17_0==EOF||LA17_0==KEYWORD_5||(LA17_0>=KEYWORD_7 && LA17_0<=KEYWORD_8)||LA17_0==KEYWORD_11) ) {s = 1;}

                        else if ( (LA17_0==KEYWORD_59||LA17_0==KEYWORD_21||LA17_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( (LA17_0==KEYWORD_54||LA17_0==KEYWORD_22||LA17_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( (LA17_0==KEYWORD_56||LA17_0==KEYWORD_27||LA17_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( (LA17_0==KEYWORD_57||LA17_0==KEYWORD_44||LA17_0==KEYWORD_46||LA17_0==KEYWORD_41||LA17_0==KEYWORD_35||LA17_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( (LA17_0==KEYWORD_50||LA17_0==KEYWORD_24||LA17_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( (LA17_0==KEYWORD_51||LA17_0==KEYWORD_28) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( (LA17_0==KEYWORD_58||LA17_0==KEYWORD_25) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( (LA17_0==KEYWORD_61||LA17_0==KEYWORD_37) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA17_0==KEYWORD_48||LA17_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_ruleModel123 = new BitSet(new long[]{0x0900000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_ruleModel150 = new BitSet(new long[]{0x0900000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDefinition196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNodeTypeDefinition234 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition254 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNodeTypeDefinition267 = new BitSet(new long[]{0xE4A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNodeTypeDefinition280 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition302 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeTypeDefinition316 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition338 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_ruleNodeTypeDefinition408 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleNodeTypeDefinition483 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleNodeTypeDefinition558 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_ruleNodeTypeDefinition633 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_ruleNodeTypeDefinition708 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleNodeTypeDefinition777 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNodeTypeDefinition795 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition816 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition879 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition906 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNodeDefinition991 = new BitSet(new long[]{0x0010020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1012 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleNodeDefinition1037 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNodeDefinition1063 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1086 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeDefinition1100 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1122 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNodeDefinition1138 = new BitSet(new long[]{0x6210A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNodeDefinition1153 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1175 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_ruleNodeDefinition1243 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleNodeDefinition1318 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleNodeDefinition1393 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_ruleNodeDefinition1468 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_ruleNodeDefinition1543 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSns1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSns1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleSns1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePropertyDefinition1802 = new BitSet(new long[]{0x0010020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1823 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePropertyDefinition1842 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePropertyDefinition1856 = new BitSet(new long[]{0x0000003E0B140C10L});
    public static final BitSet FOLLOW_rulePropertyType_in_rulePropertyDefinition1876 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePropertyDefinition1889 = new BitSet(new long[]{0x63126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePropertyDefinition1904 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1925 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition1939 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1959 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rulePropertyDefinition2030 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_rulePropertyDefinition2105 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_rulePropertyDefinition2180 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_rulePropertyDefinition2255 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiple_in_rulePropertyDefinition2330 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rulePropertyDefinition2405 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rulePropertyDefinition2480 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2555 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePropertyDefinition2630 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulePropertyDefinition2684 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2705 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition2719 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2739 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText2888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleNoFullText2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleNoFullText2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps2996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQueryOps3046 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleQueryOps3065 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleQueryOps3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple3133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleMultiple3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMultiple3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMultiple3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected3260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleProtected3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleProtected3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleProtected3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory3387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleMandatory3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMandatory3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMandatory3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleAutocreated3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAutocreated3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAutocreated3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulePrimary3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimary3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable3749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleQueryable3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleQueryable3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleNotqueryable3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNotqueryable3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract3965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleAbstract4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAbstract4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAbstract4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin4092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleMixin4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleMixin4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMixin4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable4219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable4230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleOrderable4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderable4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOrderable4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping4345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNsMapping4393 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleNsMapping4413 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNsMapping4426 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleUri_in_ruleNsMapping4446 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNsMapping4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix4494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri4595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString4696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJcrString4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_ruleJcrString4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD4825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_ruleXiD4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleXiD4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleOpv4957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOpv4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOpv5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOpv5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOpv5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOpv5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulePropertyType5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulePropertyType5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rulePropertyType5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rulePropertyType5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulePropertyType5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rulePropertyType5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rulePropertyType5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rulePropertyType5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rulePropertyType5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePropertyType5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rulePropertyType5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rulePropertyType5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePropertyType5381 = new BitSet(new long[]{0x0000000000000002L});

}
