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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:129:1: ruleNodeTypeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* ) ;
    public final EObject ruleNodeTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_orderable_8_0 = null;

        AntlrDatatypeRuleToken lv_mixin_9_0 = null;

        AntlrDatatypeRuleToken lv_abstract_10_0 = null;

        AntlrDatatypeRuleToken lv_queryable_11_0 = null;

        AntlrDatatypeRuleToken lv_notqueryable_12_0 = null;

        AntlrDatatypeRuleToken lv_primaryItem_13_0 = null;

        EObject lv_declaredPropertyDefinitions_14_0 = null;

        EObject lv_declaredChildNodeDefinitions_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:132:28: ( (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:134:2: otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )*
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

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:201:6: ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:203:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:203:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:204:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:207:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:208:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:208:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )*
            loop4:
            do {
                int alt4=7;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_55||LA4_0==KEYWORD_26||LA4_0==KEYWORD_15) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( (LA4_0==KEYWORD_36||LA4_0==KEYWORD_23||LA4_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }
                else if ( (LA4_0==KEYWORD_49||LA4_0==KEYWORD_20||LA4_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt4=3;
                }
                else if ( (LA4_0==KEYWORD_38||LA4_0==KEYWORD_17) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt4=4;
                }
                else if ( (LA4_0==KEYWORD_47||LA4_0==KEYWORD_18) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt4=5;
                }
                else if ( (LA4_0==KEYWORD_60||LA4_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                    alt4=6;
                }


                switch (alt4) {
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:360:4: ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:360:4: ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:361:5: {...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:361:115: ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:362:6: ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:6: ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:7: {...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:365:16: ( (lv_primaryItem_13_0= rulePrimaryItem ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:366:1: (lv_primaryItem_13_0= rulePrimaryItem )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:366:1: (lv_primaryItem_13_0= rulePrimaryItem )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:367:3: lv_primaryItem_13_0= rulePrimaryItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryItem_in_ruleNodeTypeDefinition783);
            	    lv_primaryItem_13_0=rulePrimaryItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"primaryItem",
            	            		lv_primaryItem_13_0, 
            	            		"PrimaryItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:397:2: ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==KEYWORD_7) ) {
                    alt5=1;
                }
                else if ( (LA5_0==KEYWORD_5) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:397:3: ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:397:3: ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:398:1: (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:398:1: (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:399:3: lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition845);
            	    lv_declaredPropertyDefinitions_14_0=rulePropertyDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredPropertyDefinitions",
            	            		lv_declaredPropertyDefinitions_14_0, 
            	            		"PropertyDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:416:6: ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:416:6: ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:417:1: (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:417:1: (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:418:3: lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition872);
            	    lv_declaredChildNodeDefinitions_15_0=ruleNodeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredChildNodeDefinitions",
            	            		lv_declaredChildNodeDefinitions_15_0, 
            	            		"NodeDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:442:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:443:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:444:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition909);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition919); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:451:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) ;
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
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:454:28: ( (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:455:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:455:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:456:2: otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNodeDefinition957); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:460:1: ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_EXID||LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_4) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:460:2: ( (lv_name_1_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:460:2: ( (lv_name_1_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:461:1: (lv_name_1_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:461:1: (lv_name_1_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:462:3: lv_name_1_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition978);
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:479:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:479:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:480:1: (lv_name_2_0= KEYWORD_4 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:480:1: (lv_name_2_0= KEYWORD_4 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:481:3: lv_name_2_0= KEYWORD_4
                    {
                    lv_name_2_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleNodeDefinition1003); 

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

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:495:3: (otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:496:2: otherlv_3= KEYWORD_2 ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3
                    {
                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNodeDefinition1029); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:500:1: ( ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:500:2: ( ( ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:500:2: ( ( ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:501:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:501:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:502:3: ruleJcrString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1052);
                    ruleJcrString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:515:2: (otherlv_5= KEYWORD_6 ( ( ruleJcrString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==KEYWORD_6) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:516:2: otherlv_5= KEYWORD_6 ( ( ruleJcrString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNodeDefinition1066); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:520:1: ( ( ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:521:1: ( ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:521:1: ( ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:522:3: ruleJcrString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1088);
                    	    ruleJcrString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }

                    otherlv_7=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNodeDefinition1104); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:540:3: (otherlv_8= KEYWORD_9 ( ( ruleJcrString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_9) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:541:2: otherlv_8= KEYWORD_9 ( ( ruleJcrString ) )
                    {
                    otherlv_8=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNodeDefinition1119); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:545:1: ( ( ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:546:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:546:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:547:3: ruleJcrString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1141);
                    ruleJcrString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:560:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:562:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:562:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:563:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:566:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:567:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:567:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_59||LA10_0==KEYWORD_21||LA10_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt10=1;
                }
                else if ( (LA10_0==KEYWORD_54||LA10_0==KEYWORD_22||LA10_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt10=2;
                }
                else if ( (LA10_0==KEYWORD_56||LA10_0==KEYWORD_27||LA10_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt10=3;
                }
                else if ( (LA10_0==KEYWORD_57||LA10_0==KEYWORD_44||LA10_0==KEYWORD_46||LA10_0==KEYWORD_41||LA10_0==KEYWORD_35||LA10_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt10=4;
                }
                else if ( (LA10_0==KEYWORD_50||LA10_0==KEYWORD_29||LA10_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:569:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:569:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:570:5: {...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:570:111: ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:571:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:574:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:574:7: {...}? => ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:574:16: ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:575:1: (lv_autocreated_11_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:575:1: (lv_autocreated_11_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:576:3: lv_autocreated_11_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_ruleNodeDefinition1209);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:599:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:599:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:600:5: {...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:600:111: ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:601:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:604:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:604:7: {...}? => ( (lv_manadatory_12_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:604:16: ( (lv_manadatory_12_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:605:1: (lv_manadatory_12_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:605:1: (lv_manadatory_12_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:606:3: lv_manadatory_12_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_ruleNodeDefinition1284);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:629:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:629:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:630:5: {...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:630:111: ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:631:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:634:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:634:7: {...}? => ( (lv_protected_13_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:634:16: ( (lv_protected_13_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:635:1: (lv_protected_13_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:635:1: (lv_protected_13_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:636:3: lv_protected_13_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_ruleNodeDefinition1359);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:659:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:659:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:660:5: {...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:660:111: ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:661:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:664:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:664:7: {...}? => ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:664:16: ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:665:1: (lv_onParentVersion_14_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:665:1: (lv_onParentVersion_14_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:666:3: lv_onParentVersion_14_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_ruleNodeDefinition1434);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:689:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:689:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:690:5: {...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:690:111: ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:691:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:694:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:694:7: {...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:694:16: ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:695:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:695:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:696:3: lv_sameNameSiblings_15_0= ruleSns
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSns_in_ruleNodeDefinition1509);
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
            	    break loop10;
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:734:1: entryRuleSns returns [String current=null] : iv_ruleSns= ruleSns EOF ;
    public final String entryRuleSns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSns = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:735:1: (iv_ruleSns= ruleSns EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:736:2: iv_ruleSns= ruleSns EOF
            {
             newCompositeNode(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns1585);
            iv_ruleSns=ruleSns();

            state._fsp--;

             current =iv_ruleSns.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns1596); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:743:1: ruleSns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) ;
    public final AntlrDatatypeRuleToken ruleSns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:747:6: ( (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:748:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:748:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            int alt11=3;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt11=1;
                }
                break;
            case KEYWORD_4:
                {
                alt11=2;
                }
                break;
            case KEYWORD_50:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:749:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSns1634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:756:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSns1653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:763:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleSns1672); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:776:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:777:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:778:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1711);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1721); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:785:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) ;
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
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:788:28: ( ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:789:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:789:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:789:2: () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:789:2: ()
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:790:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePropertyDefinition1768); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:1: ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_EXID||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==KEYWORD_4) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:2: ( (lv_name_2_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:2: ( (lv_name_2_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:801:1: (lv_name_2_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:801:1: (lv_name_2_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:802:3: lv_name_2_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1789);
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:820:2: otherlv_3= KEYWORD_4
                    {
                    otherlv_3=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePropertyDefinition1808); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:824:2: (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_2) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:825:2: otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3
                    {
                    otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePropertyDefinition1822); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:829:1: ( (lv_type_5_0= rulePropertyType ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:830:1: (lv_type_5_0= rulePropertyType )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:830:1: (lv_type_5_0= rulePropertyType )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:831:3: lv_type_5_0= rulePropertyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyType_in_rulePropertyDefinition1842);
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

                    otherlv_6=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePropertyDefinition1855); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:852:3: (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_9) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:853:2: otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    {
                    otherlv_7=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePropertyDefinition1870); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:857:1: ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:857:2: ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:857:2: ( (lv_defaultValues_8_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:858:1: (lv_defaultValues_8_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:858:1: (lv_defaultValues_8_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:859:3: lv_defaultValues_8_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1891);
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

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:875:2: (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==KEYWORD_6) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:876:2: otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition1905); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:880:1: ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:881:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:881:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:882:3: lv_defaultValues_10_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1925);
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
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:898:7: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:900:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:900:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:901:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:904:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:905:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:905:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:907:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:907:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:908:5: {...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:908:115: ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:909:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:912:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:912:7: {...}? => ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:912:16: ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:913:1: (lv_autocreated_12_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:913:1: (lv_autocreated_12_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:914:3: lv_autocreated_12_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_rulePropertyDefinition1996);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:937:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:937:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:938:5: {...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:938:115: ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:939:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:942:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:942:7: {...}? => ( (lv_mandatory_13_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:942:16: ( (lv_mandatory_13_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:943:1: (lv_mandatory_13_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:943:1: (lv_mandatory_13_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:944:3: lv_mandatory_13_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_rulePropertyDefinition2071);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:967:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:967:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:968:5: {...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:968:115: ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:969:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:972:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:972:7: {...}? => ( (lv_protected_14_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:972:16: ( (lv_protected_14_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:973:1: (lv_protected_14_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:973:1: (lv_protected_14_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:974:3: lv_protected_14_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_rulePropertyDefinition2146);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:997:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:997:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:998:5: {...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:998:115: ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:999:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1002:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1002:7: {...}? => ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1002:16: ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1003:1: (lv_onParentVersion_15_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1003:1: (lv_onParentVersion_15_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1004:3: lv_onParentVersion_15_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_rulePropertyDefinition2221);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1027:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1027:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1028:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1028:115: ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1029:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1032:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1032:7: {...}? => ( (lv_multiple_16_0= ruleMultiple ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1032:16: ( (lv_multiple_16_0= ruleMultiple ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1033:1: (lv_multiple_16_0= ruleMultiple )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1033:1: (lv_multiple_16_0= ruleMultiple )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1034:3: lv_multiple_16_0= ruleMultiple
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiple_in_rulePropertyDefinition2296);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1057:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1057:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1058:5: {...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1058:115: ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1059:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1062:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1062:7: {...}? => ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1062:16: ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1063:1: (lv_queryOps_17_0= ruleQueryOps )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1063:1: (lv_queryOps_17_0= ruleQueryOps )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1064:3: lv_queryOps_17_0= ruleQueryOps
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryOps_in_rulePropertyDefinition2371);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1087:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1087:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1088:5: {...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1088:115: ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1089:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1092:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1092:7: {...}? => ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1092:16: ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1093:1: (lv_noFullText_18_0= ruleNoFullText )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1093:1: (lv_noFullText_18_0= ruleNoFullText )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1094:3: lv_noFullText_18_0= ruleNoFullText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoFullText_in_rulePropertyDefinition2446);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1117:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1117:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1118:5: {...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1118:115: ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1119:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1122:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1122:7: {...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1122:16: ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1123:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1123:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1124:3: lv_noQueryOrder_19_0= ruleNoQueryOrder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2521);
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
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1147:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1147:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1148:5: {...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1148:115: ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1149:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:7: {...}? => ( (lv_primary_20_0= rulePrimary ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1152:16: ( (lv_primary_20_0= rulePrimary ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1153:1: (lv_primary_20_0= rulePrimary )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1153:1: (lv_primary_20_0= rulePrimary )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1154:3: lv_primary_20_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_rulePropertyDefinition2596);
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
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1184:2: (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_8) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_STRING) ) {
                    alt18=1;
                }
                else if ( (LA18_1==RULE_EXID) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==EOF||(LA18_4>=KEYWORD_5 && LA18_4<=KEYWORD_8)||LA18_4==KEYWORD_11) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1185:2: otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    {
                    otherlv_21=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePropertyDefinition2650); 

                        	newLeafNode(otherlv_21, grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1189:1: ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1189:2: ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1189:2: ( (lv_valueConstraints_22_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1190:1: (lv_valueConstraints_22_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1190:1: (lv_valueConstraints_22_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1191:3: lv_valueConstraints_22_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2671);
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

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1207:2: (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==KEYWORD_6) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1208:2: otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition2685); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1212:1: ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1213:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1213:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1214:3: lv_valueConstraints_24_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2705);
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
                    	    break loop17;
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1238:1: entryRuleNoQueryOrder returns [String current=null] : iv_ruleNoQueryOrder= ruleNoQueryOrder EOF ;
    public final String entryRuleNoQueryOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQueryOrder = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1239:1: (iv_ruleNoQueryOrder= ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1240:2: iv_ruleNoQueryOrder= ruleNoQueryOrder EOF
            {
             newCompositeNode(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2746);
            iv_ruleNoQueryOrder=ruleNoQueryOrder();

            state._fsp--;

             current =iv_ruleNoQueryOrder.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder2757); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1247:1: ruleNoQueryOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_61 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNoQueryOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1251:6: ( (kw= KEYWORD_61 | kw= KEYWORD_37 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1252:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1252:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_61) ) {
                alt19=1;
            }
            else if ( (LA19_0==KEYWORD_37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1253:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2795); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1260:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2814); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1273:1: entryRuleNoFullText returns [String current=null] : iv_ruleNoFullText= ruleNoFullText EOF ;
    public final String entryRuleNoFullText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoFullText = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1274:1: (iv_ruleNoFullText= ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1275:2: iv_ruleNoFullText= ruleNoFullText EOF
            {
             newCompositeNode(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText2854);
            iv_ruleNoFullText=ruleNoFullText();

            state._fsp--;

             current =iv_ruleNoFullText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText2865); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1282:1: ruleNoFullText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_58 | kw= KEYWORD_25 ) ;
    public final AntlrDatatypeRuleToken ruleNoFullText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1286:6: ( (kw= KEYWORD_58 | kw= KEYWORD_25 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1287:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1287:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_58) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1288:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleNoFullText2903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1295:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleNoFullText2922); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1308:1: entryRuleQueryOps returns [String current=null] : iv_ruleQueryOps= ruleQueryOps EOF ;
    public final String entryRuleQueryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOps = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1309:1: (iv_ruleQueryOps= ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1310:2: iv_ruleQueryOps= ruleQueryOps EOF
            {
             newCompositeNode(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps2962);
            iv_ruleQueryOps=ruleQueryOps();

            state._fsp--;

             current =iv_ruleQueryOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps2973); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1317:1: ruleQueryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) ;
    public final AntlrDatatypeRuleToken ruleQueryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1321:6: ( ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1322:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1322:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1322:2: (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1322:2: (kw= KEYWORD_51 | kw= KEYWORD_28 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_51) ) {
                alt21=1;
            }
            else if ( (LA21_0==KEYWORD_28) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1323:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQueryOps3012); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1330:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleQueryOps3031); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleQueryOps3054);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1354:1: entryRuleMultiple returns [String current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final String entryRuleMultiple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiple = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1355:1: (iv_ruleMultiple= ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1356:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple3099);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple3110); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1363:1: ruleMultiple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) ;
    public final AntlrDatatypeRuleToken ruleMultiple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1367:6: ( (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1368:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1368:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            int alt22=3;
            switch ( input.LA(1) ) {
            case KEYWORD_50:
                {
                alt22=1;
                }
                break;
            case KEYWORD_24:
                {
                alt22=2;
                }
                break;
            case KEYWORD_4:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1369:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleMultiple3148); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1376:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMultiple3167); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1383:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMultiple3186); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1396:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1397:1: (iv_ruleProtected= ruleProtected EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1398:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected3226);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected3237); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1405:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1409:6: ( (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1410:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1410:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            int alt23=3;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
                {
                alt23=1;
                }
                break;
            case KEYWORD_27:
                {
                alt23=2;
                }
                break;
            case KEYWORD_16:
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1411:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleProtected3275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1418:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleProtected3294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1425:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleProtected3313); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1438:1: entryRuleMandatory returns [String current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final String entryRuleMandatory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMandatory = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1439:1: (iv_ruleMandatory= ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1440:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory3353);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory3364); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1447:1: ruleMandatory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMandatory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1451:6: ( (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1452:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1452:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            int alt24=3;
            switch ( input.LA(1) ) {
            case KEYWORD_54:
                {
                alt24=1;
                }
                break;
            case KEYWORD_22:
                {
                alt24=2;
                }
                break;
            case KEYWORD_14:
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1453:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleMandatory3402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1460:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMandatory3421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1467:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMandatory3440); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1480:1: entryRuleAutocreated returns [String current=null] : iv_ruleAutocreated= ruleAutocreated EOF ;
    public final String entryRuleAutocreated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAutocreated = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1481:1: (iv_ruleAutocreated= ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1482:2: iv_ruleAutocreated= ruleAutocreated EOF
            {
             newCompositeNode(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated3480);
            iv_ruleAutocreated=ruleAutocreated();

            state._fsp--;

             current =iv_ruleAutocreated.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated3491); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1489:1: ruleAutocreated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAutocreated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1493:6: ( (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1494:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1494:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
                {
                alt25=1;
                }
                break;
            case KEYWORD_21:
                {
                alt25=2;
                }
                break;
            case KEYWORD_13:
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1495:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleAutocreated3529); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1502:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAutocreated3548); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1509:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAutocreated3567); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1522:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1523:1: (iv_rulePrimary= rulePrimary EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1524:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3607);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3618); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1531:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_48 | kw= KEYWORD_1 ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1535:6: ( (kw= KEYWORD_48 | kw= KEYWORD_1 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1536:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1536:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_48) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_1) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1537:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulePrimary3656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1544:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimary3675); 

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


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1557:1: entryRulePrimaryItem returns [String current=null] : iv_rulePrimaryItem= rulePrimaryItem EOF ;
    public final String entryRulePrimaryItem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryItem = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1558:1: (iv_rulePrimaryItem= rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1559:2: iv_rulePrimaryItem= rulePrimaryItem EOF
            {
             newCompositeNode(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem3715);
            iv_rulePrimaryItem=rulePrimaryItem();

            state._fsp--;

             current =iv_rulePrimaryItem.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem3726); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1566:1: rulePrimaryItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString ) ;
    public final AntlrDatatypeRuleToken rulePrimaryItem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1570:6: ( ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1571:1: ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1571:1: ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1571:2: (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1571:2: (kw= KEYWORD_60 | kw= KEYWORD_1 )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_60) ) {
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1572:2: kw= KEYWORD_60
                    {
                    kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rulePrimaryItem3765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1579:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimaryItem3784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_rulePrimaryItem3807);
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
    // $ANTLR end "rulePrimaryItem"


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1603:1: entryRuleQueryable returns [String current=null] : iv_ruleQueryable= ruleQueryable EOF ;
    public final String entryRuleQueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1604:1: (iv_ruleQueryable= ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1605:2: iv_ruleQueryable= ruleQueryable EOF
            {
             newCompositeNode(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable3852);
            iv_ruleQueryable=ruleQueryable();

            state._fsp--;

             current =iv_ruleQueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable3863); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1612:1: ruleQueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_38 | kw= KEYWORD_17 ) ;
    public final AntlrDatatypeRuleToken ruleQueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1616:6: ( (kw= KEYWORD_38 | kw= KEYWORD_17 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1617:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1617:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1618:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleQueryable3901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1625:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleQueryable3920); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1638:1: entryRuleNotqueryable returns [String current=null] : iv_ruleNotqueryable= ruleNotqueryable EOF ;
    public final String entryRuleNotqueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotqueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1639:1: (iv_ruleNotqueryable= ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1640:2: iv_ruleNotqueryable= ruleNotqueryable EOF
            {
             newCompositeNode(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3960);
            iv_ruleNotqueryable=ruleNotqueryable();

            state._fsp--;

             current =iv_ruleNotqueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable3971); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1647:1: ruleNotqueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_47 | kw= KEYWORD_18 ) ;
    public final AntlrDatatypeRuleToken ruleNotqueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1651:6: ( (kw= KEYWORD_47 | kw= KEYWORD_18 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1652:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1652:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1653:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleNotqueryable4009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1660:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNotqueryable4028); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1673:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1674:1: (iv_ruleAbstract= ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1675:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract4068);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract4079); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1682:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1686:6: ( (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1687:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1687:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1688:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleAbstract4117); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1695:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAbstract4136); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1702:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAbstract4155); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1715:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1716:1: (iv_ruleMixin= ruleMixin EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1717:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin4195);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin4206); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1724:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1728:6: ( (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1729:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1729:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1730:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleMixin4244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1737:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleMixin4263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMixin4282); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1757:1: entryRuleOrderable returns [String current=null] : iv_ruleOrderable= ruleOrderable EOF ;
    public final String entryRuleOrderable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1758:1: (iv_ruleOrderable= ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1759:2: iv_ruleOrderable= ruleOrderable EOF
            {
             newCompositeNode(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable4322);
            iv_ruleOrderable=ruleOrderable();

            state._fsp--;

             current =iv_ruleOrderable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable4333); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1766:1: ruleOrderable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) ;
    public final AntlrDatatypeRuleToken ruleOrderable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1770:6: ( (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1771:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1771:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
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
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1772:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleOrderable4371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1779:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderable4390); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1786:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOrderable4409); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1799:1: entryRuleNsMapping returns [EObject current=null] : iv_ruleNsMapping= ruleNsMapping EOF ;
    public final EObject entryRuleNsMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNsMapping = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1800:2: (iv_ruleNsMapping= ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1801:2: iv_ruleNsMapping= ruleNsMapping EOF
            {
             newCompositeNode(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping4448);
            iv_ruleNsMapping=ruleNsMapping();

            state._fsp--;

             current =iv_ruleNsMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping4458); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1808:1: ruleNsMapping returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) ;
    public final EObject ruleNsMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1811:28: ( (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1812:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1812:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1813:2: otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNsMapping4496); 

                	newLeafNode(otherlv_0, grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1817:1: ( (lv_name_1_0= rulePrefix ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1818:1: (lv_name_1_0= rulePrefix )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1818:1: (lv_name_1_0= rulePrefix )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1819:3: lv_name_1_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleNsMapping4516);
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

            otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNsMapping4529); 

                	newLeafNode(otherlv_2, grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1840:1: ( (lv_uri_3_0= ruleUri ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1841:1: (lv_uri_3_0= ruleUri )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1841:1: (lv_uri_3_0= ruleUri )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1842:3: lv_uri_3_0= ruleUri
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUri_in_ruleNsMapping4549);
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

            otherlv_4=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNsMapping4562); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1871:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1872:1: (iv_rulePrefix= rulePrefix EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1873:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix4597);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix4608); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1880:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_XiD_0= ruleXiD ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XiD_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1884:6: (this_XiD_0= ruleXiD )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1886:5: this_XiD_0= ruleXiD
            {
             
                    newCompositeNode(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix4654);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1904:1: entryRuleUri returns [String current=null] : iv_ruleUri= ruleUri EOF ;
    public final String entryRuleUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUri = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1905:1: (iv_ruleUri= ruleUri EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1906:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri4698);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri4709); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1913:1: ruleUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JcrString_0= ruleJcrString ;
    public final AntlrDatatypeRuleToken ruleUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_JcrString_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1917:6: (this_JcrString_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1919:5: this_JcrString_0= ruleJcrString
            {
             
                    newCompositeNode(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri4755);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1937:1: entryRuleJcrString returns [String current=null] : iv_ruleJcrString= ruleJcrString EOF ;
    public final String entryRuleJcrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJcrString = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1938:1: (iv_ruleJcrString= ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1939:2: iv_ruleJcrString= ruleJcrString EOF
            {
             newCompositeNode(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString4799);
            iv_ruleJcrString=ruleJcrString();

            state._fsp--;

             current =iv_ruleJcrString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString4810); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1946:1: ruleJcrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) ;
    public final AntlrDatatypeRuleToken ruleJcrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_XiD_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1950:6: ( (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1951:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1951:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_EXID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1951:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJcrString4850); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1960:5: this_XiD_1= ruleXiD
                    {
                     
                            newCompositeNode(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXiD_in_ruleJcrString4883);
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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1978:1: entryRuleXiD returns [String current=null] : iv_ruleXiD= ruleXiD EOF ;
    public final String entryRuleXiD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXiD = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1979:1: (iv_ruleXiD= ruleXiD EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1980:2: iv_ruleXiD= ruleXiD EOF
            {
             newCompositeNode(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD4928);
            iv_ruleXiD=ruleXiD();

            state._fsp--;

             current =iv_ruleXiD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD4939); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1987:1: ruleXiD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EXID_0= RULE_EXID ;
    public final AntlrDatatypeRuleToken ruleXiD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1991:6: (this_EXID_0= RULE_EXID )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1992:5: this_EXID_0= RULE_EXID
            {
            this_EXID_0=(Token)match(input,RULE_EXID,FOLLOW_RULE_EXID_in_ruleXiD4978); 

            		current.merge(this_EXID_0);
                
             
                newLeafNode(this_EXID_0, grammarAccess.getXiDAccess().getEXIDTerminalRuleCall()); 
                

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2007:1: ruleOpv returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) ;
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
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2009:28: ( ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2010:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2010:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
                {
                alt34=1;
                }
                break;
            case KEYWORD_46:
                {
                alt34=2;
                }
                break;
            case KEYWORD_57:
                {
                alt34=3;
                }
                break;
            case KEYWORD_44:
                {
                alt34=4;
                }
                break;
            case KEYWORD_41:
                {
                alt34=5;
                }
                break;
            case KEYWORD_35:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2010:2: (enumLiteral_0= KEYWORD_30 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2010:2: (enumLiteral_0= KEYWORD_30 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2010:7: enumLiteral_0= KEYWORD_30
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleOpv5039); 

                            current = grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2016:6: (enumLiteral_1= KEYWORD_46 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2016:6: (enumLiteral_1= KEYWORD_46 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2016:11: enumLiteral_1= KEYWORD_46
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOpv5061); 

                            current = grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2022:6: (enumLiteral_2= KEYWORD_57 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2022:6: (enumLiteral_2= KEYWORD_57 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2022:11: enumLiteral_2= KEYWORD_57
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOpv5083); 

                            current = grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2028:6: (enumLiteral_3= KEYWORD_44 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2028:6: (enumLiteral_3= KEYWORD_44 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2028:11: enumLiteral_3= KEYWORD_44
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOpv5105); 

                            current = grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2034:6: (enumLiteral_4= KEYWORD_41 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2034:6: (enumLiteral_4= KEYWORD_41 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2034:11: enumLiteral_4= KEYWORD_41
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOpv5127); 

                            current = grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2040:6: (enumLiteral_5= KEYWORD_35 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2040:6: (enumLiteral_5= KEYWORD_35 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2040:11: enumLiteral_5= KEYWORD_35
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOpv5149); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2050:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) ;
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
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2052:28: ( ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2053:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2053:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            int alt35=13;
            switch ( input.LA(1) ) {
            case KEYWORD_53:
                {
                alt35=1;
                }
                break;
            case KEYWORD_42:
                {
                alt35=2;
                }
                break;
            case KEYWORD_39:
                {
                alt35=3;
                }
                break;
            case KEYWORD_32:
                {
                alt35=4;
                }
                break;
            case KEYWORD_40:
                {
                alt35=5;
                }
                break;
            case KEYWORD_31:
                {
                alt35=6;
                }
                break;
            case KEYWORD_43:
                {
                alt35=7;
                }
                break;
            case KEYWORD_33:
                {
                alt35=8;
                }
                break;
            case KEYWORD_34:
                {
                alt35=9;
                }
                break;
            case KEYWORD_52:
                {
                alt35=10;
                }
                break;
            case KEYWORD_62:
                {
                alt35=11;
                }
                break;
            case KEYWORD_19:
                {
                alt35=12;
                }
                break;
            case KEYWORD_45:
                {
                alt35=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2053:2: (enumLiteral_0= KEYWORD_53 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2053:2: (enumLiteral_0= KEYWORD_53 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2053:7: enumLiteral_0= KEYWORD_53
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulePropertyType5199); 

                            current = grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2059:6: (enumLiteral_1= KEYWORD_42 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2059:6: (enumLiteral_1= KEYWORD_42 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2059:11: enumLiteral_1= KEYWORD_42
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulePropertyType5221); 

                            current = grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2065:6: (enumLiteral_2= KEYWORD_39 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2065:6: (enumLiteral_2= KEYWORD_39 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2065:11: enumLiteral_2= KEYWORD_39
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rulePropertyType5243); 

                            current = grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2071:6: (enumLiteral_3= KEYWORD_32 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2071:6: (enumLiteral_3= KEYWORD_32 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2071:11: enumLiteral_3= KEYWORD_32
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rulePropertyType5265); 

                            current = grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2077:6: (enumLiteral_4= KEYWORD_40 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2077:6: (enumLiteral_4= KEYWORD_40 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2077:11: enumLiteral_4= KEYWORD_40
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulePropertyType5287); 

                            current = grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2083:6: (enumLiteral_5= KEYWORD_31 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2083:6: (enumLiteral_5= KEYWORD_31 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2083:11: enumLiteral_5= KEYWORD_31
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rulePropertyType5309); 

                            current = grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2089:6: (enumLiteral_6= KEYWORD_43 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2089:6: (enumLiteral_6= KEYWORD_43 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2089:11: enumLiteral_6= KEYWORD_43
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rulePropertyType5331); 

                            current = grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2095:6: (enumLiteral_7= KEYWORD_33 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2095:6: (enumLiteral_7= KEYWORD_33 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2095:11: enumLiteral_7= KEYWORD_33
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rulePropertyType5353); 

                            current = grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2101:6: (enumLiteral_8= KEYWORD_34 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2101:6: (enumLiteral_8= KEYWORD_34 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2101:11: enumLiteral_8= KEYWORD_34
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rulePropertyType5375); 

                            current = grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2107:6: (enumLiteral_9= KEYWORD_52 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2107:6: (enumLiteral_9= KEYWORD_52 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2107:11: enumLiteral_9= KEYWORD_52
                    {
                    enumLiteral_9=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePropertyType5397); 

                            current = grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2113:6: (enumLiteral_10= KEYWORD_62 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2113:6: (enumLiteral_10= KEYWORD_62 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2113:11: enumLiteral_10= KEYWORD_62
                    {
                    enumLiteral_10=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rulePropertyType5419); 

                            current = grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2119:6: (enumLiteral_11= KEYWORD_19 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2119:6: (enumLiteral_11= KEYWORD_19 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2119:11: enumLiteral_11= KEYWORD_19
                    {
                    enumLiteral_11=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rulePropertyType5441); 

                            current = grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2125:6: (enumLiteral_12= KEYWORD_45 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2125:6: (enumLiteral_12= KEYWORD_45 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2125:11: enumLiteral_12= KEYWORD_45
                    {
                    enumLiteral_12=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePropertyType5463); 

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\1\1\12\uffff";
    static final String DFA16_minS =
        "\1\5\12\uffff";
    static final String DFA16_maxS =
        "\1\100\12\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA16_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA16_transitionS = {
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 905:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==EOF||LA16_0==KEYWORD_5||(LA16_0>=KEYWORD_7 && LA16_0<=KEYWORD_8)||LA16_0==KEYWORD_11) ) {s = 1;}

                        else if ( (LA16_0==KEYWORD_59||LA16_0==KEYWORD_21||LA16_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( (LA16_0==KEYWORD_54||LA16_0==KEYWORD_22||LA16_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( (LA16_0==KEYWORD_56||LA16_0==KEYWORD_27||LA16_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( (LA16_0==KEYWORD_57||LA16_0==KEYWORD_44||LA16_0==KEYWORD_46||LA16_0==KEYWORD_41||LA16_0==KEYWORD_35||LA16_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( (LA16_0==KEYWORD_50||LA16_0==KEYWORD_24||LA16_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( (LA16_0==KEYWORD_51||LA16_0==KEYWORD_28) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( (LA16_0==KEYWORD_58||LA16_0==KEYWORD_25) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( (LA16_0==KEYWORD_61||LA16_0==KEYWORD_37) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA16_0==KEYWORD_48||LA16_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
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
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNodeTypeDefinition234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition254 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNodeTypeDefinition267 = new BitSet(new long[]{0xE4A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNodeTypeDefinition280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition302 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeTypeDefinition316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition338 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_ruleNodeTypeDefinition408 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleNodeTypeDefinition483 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleNodeTypeDefinition558 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_ruleNodeTypeDefinition633 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_ruleNodeTypeDefinition708 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_ruleNodeTypeDefinition783 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition845 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition872 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNodeDefinition957 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition978 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleNodeDefinition1003 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNodeDefinition1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1052 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeDefinition1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1088 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNodeDefinition1104 = new BitSet(new long[]{0x6210A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNodeDefinition1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1141 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_ruleNodeDefinition1209 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleNodeDefinition1284 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleNodeDefinition1359 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_ruleNodeDefinition1434 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_ruleNodeDefinition1509 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSns1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSns1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleSns1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePropertyDefinition1768 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1789 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePropertyDefinition1808 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePropertyDefinition1822 = new BitSet(new long[]{0x0000003E0B140C10L});
    public static final BitSet FOLLOW_rulePropertyType_in_rulePropertyDefinition1842 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePropertyDefinition1855 = new BitSet(new long[]{0x63126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePropertyDefinition1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1891 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1925 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rulePropertyDefinition1996 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_rulePropertyDefinition2071 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_rulePropertyDefinition2146 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_rulePropertyDefinition2221 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiple_in_rulePropertyDefinition2296 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rulePropertyDefinition2371 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rulePropertyDefinition2446 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2521 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePropertyDefinition2596 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulePropertyDefinition2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2671 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2705 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText2854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleNoFullText2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleNoFullText2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQueryOps3012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleQueryOps3031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleQueryOps3054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple3099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleMultiple3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMultiple3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMultiple3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected3226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleProtected3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleProtected3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleProtected3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory3353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleMandatory3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMandatory3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMandatory3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated3480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleAutocreated3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAutocreated3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAutocreated3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulePrimary3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimary3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem3715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rulePrimaryItem3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimaryItem3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePrimaryItem3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable3852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleQueryable3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleQueryable3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleNotqueryable4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNotqueryable4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleAbstract4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAbstract4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAbstract4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin4195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleMixin4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleMixin4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMixin4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable4322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleOrderable4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderable4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOrderable4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping4448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNsMapping4496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleNsMapping4516 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNsMapping4529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleUri_in_ruleNsMapping4549 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNsMapping4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri4698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString4799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJcrString4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_ruleJcrString4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_ruleXiD4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleOpv5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOpv5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOpv5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOpv5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOpv5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOpv5149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulePropertyType5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulePropertyType5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rulePropertyType5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rulePropertyType5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulePropertyType5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rulePropertyType5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rulePropertyType5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rulePropertyType5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rulePropertyType5375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePropertyType5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rulePropertyType5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rulePropertyType5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePropertyType5463 = new BitSet(new long[]{0x0000000000000002L});

}
