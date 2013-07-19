package com.github.evra.jcr.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.github.evra.jcr.services.CndGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCndParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXID", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sns'", "'*'", "'multiple'", "'noqueryorder'", "'nqord'", "'nofulltext'", "'nof'", "'queryops'", "'qop'", "'mul'", "'protected'", "'pro'", "'p'", "'mandatory'", "'man'", "'m'", "'autocreated'", "'aut'", "'a'", "'primary'", "'!'", "'primaryitem'", "'query'", "'q'", "'noquery'", "'nq'", "'abstract'", "'abs'", "'mixin'", "'mix'", "'orderable'", "'ord'", "'o'", "'COPY'", "'VERSION'", "'INITIALIZE'", "'COMPUTE'", "'IGNORE'", "'ABORT'", "'UNDEFINED'", "'STRING'", "'BINARY'", "'LONG'", "'DOUBLE'", "'DATE'", "'BOOLEAN'", "'NAME'", "'PATH'", "'REFERENCE'", "'WEAKREFERENCE'", "'URI'", "'DECIMAL'", "'['", "']'", "'>'", "','", "'+'", "'('", "')'", "'='", "'-'", "'<'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_EXID=4;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalCndParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCndParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCndParser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g"; }


     
     	private CndGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CndGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:61:1: ( ruleModel EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==64||LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:88:1: entryRuleNodeTypeDefinition : ruleNodeTypeDefinition EOF ;
    public final void entryRuleNodeTypeDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:89:1: ( ruleNodeTypeDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:90:1: ruleNodeTypeDefinition EOF
            {
             before(grammarAccess.getNodeTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition122);
            ruleNodeTypeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDefinition129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeTypeDefinition"


    // $ANTLR start "ruleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:97:1: ruleNodeTypeDefinition : ( ( rule__NodeTypeDefinition__Group__0 ) ) ;
    public final void ruleNodeTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:101:2: ( ( ( rule__NodeTypeDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:103:1: ( rule__NodeTypeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:1: ( rule__NodeTypeDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:2: rule__NodeTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__0_in_ruleNodeTypeDefinition155);
            rule__NodeTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeDefinition"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:116:1: entryRuleNodeDefinition : ruleNodeDefinition EOF ;
    public final void entryRuleNodeDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:117:1: ( ruleNodeDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:118:1: ruleNodeDefinition EOF
            {
             before(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition182);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:125:1: ruleNodeDefinition : ( ( rule__NodeDefinition__Group__0 ) ) ;
    public final void ruleNodeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:129:2: ( ( ( rule__NodeDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__NodeDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__NodeDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:131:1: ( rule__NodeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:1: ( rule__NodeDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:2: rule__NodeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition215);
            rule__NodeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:144:1: entryRuleSns : ruleSns EOF ;
    public final void entryRuleSns() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:145:1: ( ruleSns EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:146:1: ruleSns EOF
            {
             before(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns242);
            ruleSns();

            state._fsp--;

             after(grammarAccess.getSnsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSns"


    // $ANTLR start "ruleSns"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:153:1: ruleSns : ( ( rule__Sns__Alternatives ) ) ;
    public final void ruleSns() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:157:2: ( ( ( rule__Sns__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__Sns__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__Sns__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:159:1: ( rule__Sns__Alternatives )
            {
             before(grammarAccess.getSnsAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:1: ( rule__Sns__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:2: rule__Sns__Alternatives
            {
            pushFollow(FOLLOW_rule__Sns__Alternatives_in_ruleSns275);
            rule__Sns__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSnsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSns"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:172:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:173:1: ( rulePropertyDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:174:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition302);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:181:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:185:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:187:1: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:1: ( rule__PropertyDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition335);
            rule__PropertyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:200:1: entryRuleNoQueryOrder : ruleNoQueryOrder EOF ;
    public final void entryRuleNoQueryOrder() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:201:1: ( ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:202:1: ruleNoQueryOrder EOF
            {
             before(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder362);
            ruleNoQueryOrder();

            state._fsp--;

             after(grammarAccess.getNoQueryOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoQueryOrder"


    // $ANTLR start "ruleNoQueryOrder"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:209:1: ruleNoQueryOrder : ( ( rule__NoQueryOrder__Alternatives ) ) ;
    public final void ruleNoQueryOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:213:2: ( ( ( rule__NoQueryOrder__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__NoQueryOrder__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__NoQueryOrder__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:215:1: ( rule__NoQueryOrder__Alternatives )
            {
             before(grammarAccess.getNoQueryOrderAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:1: ( rule__NoQueryOrder__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:2: rule__NoQueryOrder__Alternatives
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Alternatives_in_ruleNoQueryOrder395);
            rule__NoQueryOrder__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoQueryOrderAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoQueryOrder"


    // $ANTLR start "entryRuleNoFullText"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:228:1: entryRuleNoFullText : ruleNoFullText EOF ;
    public final void entryRuleNoFullText() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:229:1: ( ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:230:1: ruleNoFullText EOF
            {
             before(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText422);
            ruleNoFullText();

            state._fsp--;

             after(grammarAccess.getNoFullTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoFullText"


    // $ANTLR start "ruleNoFullText"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:237:1: ruleNoFullText : ( ( rule__NoFullText__Alternatives ) ) ;
    public final void ruleNoFullText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:241:2: ( ( ( rule__NoFullText__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__NoFullText__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__NoFullText__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:243:1: ( rule__NoFullText__Alternatives )
            {
             before(grammarAccess.getNoFullTextAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:1: ( rule__NoFullText__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:2: rule__NoFullText__Alternatives
            {
            pushFollow(FOLLOW_rule__NoFullText__Alternatives_in_ruleNoFullText455);
            rule__NoFullText__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoFullTextAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoFullText"


    // $ANTLR start "entryRuleQueryOps"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:256:1: entryRuleQueryOps : ruleQueryOps EOF ;
    public final void entryRuleQueryOps() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:257:1: ( ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:258:1: ruleQueryOps EOF
            {
             before(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps482);
            ruleQueryOps();

            state._fsp--;

             after(grammarAccess.getQueryOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryOps"


    // $ANTLR start "ruleQueryOps"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:265:1: ruleQueryOps : ( ( rule__QueryOps__Group__0 ) ) ;
    public final void ruleQueryOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:269:2: ( ( ( rule__QueryOps__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__QueryOps__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__QueryOps__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:271:1: ( rule__QueryOps__Group__0 )
            {
             before(grammarAccess.getQueryOpsAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:1: ( rule__QueryOps__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:2: rule__QueryOps__Group__0
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps515);
            rule__QueryOps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryOpsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryOps"


    // $ANTLR start "entryRuleMultiple"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:284:1: entryRuleMultiple : ruleMultiple EOF ;
    public final void entryRuleMultiple() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:285:1: ( ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:286:1: ruleMultiple EOF
            {
             before(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple542);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:293:1: ruleMultiple : ( ( rule__Multiple__Alternatives ) ) ;
    public final void ruleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:297:2: ( ( ( rule__Multiple__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__Multiple__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__Multiple__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:299:1: ( rule__Multiple__Alternatives )
            {
             before(grammarAccess.getMultipleAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:1: ( rule__Multiple__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:2: rule__Multiple__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiple__Alternatives_in_ruleMultiple575);
            rule__Multiple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:312:1: entryRuleProtected : ruleProtected EOF ;
    public final void entryRuleProtected() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:313:1: ( ruleProtected EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:314:1: ruleProtected EOF
            {
             before(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected602);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getProtectedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:321:1: ruleProtected : ( ( rule__Protected__Alternatives ) ) ;
    public final void ruleProtected() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:325:2: ( ( ( rule__Protected__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__Protected__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__Protected__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:327:1: ( rule__Protected__Alternatives )
            {
             before(grammarAccess.getProtectedAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:1: ( rule__Protected__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:2: rule__Protected__Alternatives
            {
            pushFollow(FOLLOW_rule__Protected__Alternatives_in_ruleProtected635);
            rule__Protected__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtectedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleMandatory"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:340:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:341:1: ( ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:342:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory662);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:349:1: ruleMandatory : ( ( rule__Mandatory__Alternatives ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:353:2: ( ( ( rule__Mandatory__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__Mandatory__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__Mandatory__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:355:1: ( rule__Mandatory__Alternatives )
            {
             before(grammarAccess.getMandatoryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:1: ( rule__Mandatory__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:2: rule__Mandatory__Alternatives
            {
            pushFollow(FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory695);
            rule__Mandatory__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleAutocreated"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:368:1: entryRuleAutocreated : ruleAutocreated EOF ;
    public final void entryRuleAutocreated() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:369:1: ( ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:370:1: ruleAutocreated EOF
            {
             before(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated722);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getAutocreatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutocreated"


    // $ANTLR start "ruleAutocreated"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:377:1: ruleAutocreated : ( ( rule__Autocreated__Alternatives ) ) ;
    public final void ruleAutocreated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:381:2: ( ( ( rule__Autocreated__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__Autocreated__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__Autocreated__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:383:1: ( rule__Autocreated__Alternatives )
            {
             before(grammarAccess.getAutocreatedAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:1: ( rule__Autocreated__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:2: rule__Autocreated__Alternatives
            {
            pushFollow(FOLLOW_rule__Autocreated__Alternatives_in_ruleAutocreated755);
            rule__Autocreated__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAutocreatedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutocreated"


    // $ANTLR start "entryRulePrimary"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:396:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:397:1: ( rulePrimary EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:398:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary782);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:405:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:409:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__Primary__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:411:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:1: ( rule__Primary__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary815);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:424:1: entryRulePrimaryItem : rulePrimaryItem EOF ;
    public final void entryRulePrimaryItem() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:425:1: ( rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:426:1: rulePrimaryItem EOF
            {
             before(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem842);
            rulePrimaryItem();

            state._fsp--;

             after(grammarAccess.getPrimaryItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryItem"


    // $ANTLR start "rulePrimaryItem"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:433:1: rulePrimaryItem : ( ( rule__PrimaryItem__Group__0 ) ) ;
    public final void rulePrimaryItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:437:2: ( ( ( rule__PrimaryItem__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__PrimaryItem__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__PrimaryItem__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:439:1: ( rule__PrimaryItem__Group__0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:1: ( rule__PrimaryItem__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:2: rule__PrimaryItem__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem875);
            rule__PrimaryItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryItem"


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:452:1: entryRuleQueryable : ruleQueryable EOF ;
    public final void entryRuleQueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:453:1: ( ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:454:1: ruleQueryable EOF
            {
             before(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable902);
            ruleQueryable();

            state._fsp--;

             after(grammarAccess.getQueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryable"


    // $ANTLR start "ruleQueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:461:1: ruleQueryable : ( ( rule__Queryable__Alternatives ) ) ;
    public final void ruleQueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:465:2: ( ( ( rule__Queryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Queryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Queryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:467:1: ( rule__Queryable__Alternatives )
            {
             before(grammarAccess.getQueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:1: ( rule__Queryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:2: rule__Queryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable935);
            rule__Queryable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryable"


    // $ANTLR start "entryRuleNotqueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:480:1: entryRuleNotqueryable : ruleNotqueryable EOF ;
    public final void entryRuleNotqueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:481:1: ( ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:482:1: ruleNotqueryable EOF
            {
             before(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable962);
            ruleNotqueryable();

            state._fsp--;

             after(grammarAccess.getNotqueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotqueryable"


    // $ANTLR start "ruleNotqueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:489:1: ruleNotqueryable : ( ( rule__Notqueryable__Alternatives ) ) ;
    public final void ruleNotqueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:493:2: ( ( ( rule__Notqueryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Notqueryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Notqueryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:495:1: ( rule__Notqueryable__Alternatives )
            {
             before(grammarAccess.getNotqueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:1: ( rule__Notqueryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:2: rule__Notqueryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable995);
            rule__Notqueryable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotqueryableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotqueryable"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:508:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:509:1: ( ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:510:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1022);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:517:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:521:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Abstract__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Abstract__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:523:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:1: ( rule__Abstract__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:2: rule__Abstract__Alternatives
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract1055);
            rule__Abstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleMixin"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:536:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:537:1: ( ruleMixin EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:538:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1082);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:545:1: ruleMixin : ( ( rule__Mixin__Alternatives ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:549:2: ( ( ( rule__Mixin__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mixin__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mixin__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:551:1: ( rule__Mixin__Alternatives )
            {
             before(grammarAccess.getMixinAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:1: ( rule__Mixin__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:2: rule__Mixin__Alternatives
            {
            pushFollow(FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1115);
            rule__Mixin__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleOrderable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:564:1: entryRuleOrderable : ruleOrderable EOF ;
    public final void entryRuleOrderable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:565:1: ( ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:566:1: ruleOrderable EOF
            {
             before(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable1142);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getOrderableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderable"


    // $ANTLR start "ruleOrderable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:573:1: ruleOrderable : ( ( rule__Orderable__Alternatives ) ) ;
    public final void ruleOrderable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:577:2: ( ( ( rule__Orderable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Orderable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Orderable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:579:1: ( rule__Orderable__Alternatives )
            {
             before(grammarAccess.getOrderableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:1: ( rule__Orderable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:2: rule__Orderable__Alternatives
            {
            pushFollow(FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1175);
            rule__Orderable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderableAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderable"


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:592:1: entryRuleNsMapping : ruleNsMapping EOF ;
    public final void entryRuleNsMapping() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:593:1: ( ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:594:1: ruleNsMapping EOF
            {
             before(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping1202);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getNsMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNsMapping"


    // $ANTLR start "ruleNsMapping"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:601:1: ruleNsMapping : ( ( rule__NsMapping__Group__0 ) ) ;
    public final void ruleNsMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:605:2: ( ( ( rule__NsMapping__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__NsMapping__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__NsMapping__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:607:1: ( rule__NsMapping__Group__0 )
            {
             before(grammarAccess.getNsMappingAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:1: ( rule__NsMapping__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:2: rule__NsMapping__Group__0
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1235);
            rule__NsMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNsMapping"


    // $ANTLR start "entryRulePrefix"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:620:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:621:1: ( rulePrefix EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:622:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix1262);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:629:1: rulePrefix : ( ruleXiD ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:633:2: ( ( ruleXiD ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleXiD )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleXiD )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:635:1: ruleXiD
            {
             before(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix1295);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:648:1: entryRuleUri : ruleUri EOF ;
    public final void entryRuleUri() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:649:1: ( ruleUri EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:650:1: ruleUri EOF
            {
             before(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri1321);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:657:1: ruleUri : ( ruleJcrString ) ;
    public final void ruleUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:661:2: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:663:1: ruleJcrString
            {
             before(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri1354);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:676:1: entryRuleJcrString : ruleJcrString EOF ;
    public final void entryRuleJcrString() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:677:1: ( ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:678:1: ruleJcrString EOF
            {
             before(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString1380);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJcrString"


    // $ANTLR start "ruleJcrString"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:685:1: ruleJcrString : ( ( rule__JcrString__Alternatives ) ) ;
    public final void ruleJcrString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:689:2: ( ( ( rule__JcrString__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__JcrString__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__JcrString__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:691:1: ( rule__JcrString__Alternatives )
            {
             before(grammarAccess.getJcrStringAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:1: ( rule__JcrString__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:2: rule__JcrString__Alternatives
            {
            pushFollow(FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1413);
            rule__JcrString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJcrStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJcrString"


    // $ANTLR start "entryRuleXiD"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:704:1: entryRuleXiD : ruleXiD EOF ;
    public final void entryRuleXiD() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:705:1: ( ruleXiD EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:706:1: ruleXiD EOF
            {
             before(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD1440);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getXiDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXiD"


    // $ANTLR start "ruleXiD"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:713:1: ruleXiD : ( RULE_EXID ) ;
    public final void ruleXiD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:717:2: ( ( RULE_EXID ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( RULE_EXID )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( RULE_EXID )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:719:1: RULE_EXID
            {
             before(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall()); 
            match(input,RULE_EXID,FOLLOW_RULE_EXID_in_ruleXiD1473); 
             after(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXiD"


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:733:1: ruleOpv : ( ( rule__Opv__Alternatives ) ) ;
    public final void ruleOpv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:737:1: ( ( ( rule__Opv__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:738:1: ( ( rule__Opv__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:738:1: ( ( rule__Opv__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:739:1: ( rule__Opv__Alternatives )
            {
             before(grammarAccess.getOpvAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:740:1: ( rule__Opv__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:740:2: rule__Opv__Alternatives
            {
            pushFollow(FOLLOW_rule__Opv__Alternatives_in_ruleOpv1509);
            rule__Opv__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpvAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpv"


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:752:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:756:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:757:1: ( ( rule__PropertyType__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:757:1: ( ( rule__PropertyType__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:758:1: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:759:1: ( rule__PropertyType__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:759:2: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1545);
            rule__PropertyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "rule__Model__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:770:1: rule__Model__Alternatives : ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:774:1: ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==73) ) {
                alt2=1;
            }
            else if ( (LA2_0==64) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:775:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:775:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:776:1: ( rule__Model__NamespacesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:1: ( rule__Model__NamespacesAssignment_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:2: rule__Model__NamespacesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1580);
                    rule__Model__NamespacesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:781:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:781:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:782:1: ( rule__Model__NodeTypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getNodeTypesAssignment_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:783:1: ( rule__Model__NodeTypesAssignment_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:783:2: rule__Model__NodeTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1598);
                    rule__Model__NodeTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodeTypesAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__NodeTypeDefinition__Alternatives_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:792:1: rule__NodeTypeDefinition__Alternatives_5 : ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) );
    public final void rule__NodeTypeDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:796:1: ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==72) ) {
                alt3=1;
            }
            else if ( (LA3_0==68) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:798:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:799:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:799:2: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51631);
                    rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:804:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:805:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:805:2: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51649);
                    rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Alternatives_5"


    // $ANTLR start "rule__NodeDefinition__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:814:1: rule__NodeDefinition__Alternatives_1 : ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) );
    public final void rule__NodeDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:818:1: ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_EXID && LA4_0<=RULE_STRING)) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:820:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:821:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:821:2: rule__NodeDefinition__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11682);
                    rule__NodeDefinition__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:826:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:827:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:827:2: rule__NodeDefinition__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11700);
                    rule__NodeDefinition__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Alternatives_1"


    // $ANTLR start "rule__Sns__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:836:1: rule__Sns__Alternatives : ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) );
    public final void rule__Sns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:840:1: ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:841:1: ( 'sns' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:841:1: ( 'sns' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:842:1: 'sns'
                    {
                     before(grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Sns__Alternatives1734); 
                     after(grammarAccess.getSnsAccess().getSnsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:849:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:849:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:850:1: '*'
                    {
                     before(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Sns__Alternatives1754); 
                     after(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:857:6: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:857:6: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:858:1: 'multiple'
                    {
                     before(grammarAccess.getSnsAccess().getMultipleKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Sns__Alternatives1774); 
                     after(grammarAccess.getSnsAccess().getMultipleKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Alternatives"


    // $ANTLR start "rule__PropertyDefinition__Alternatives_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:870:1: rule__PropertyDefinition__Alternatives_2 : ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__PropertyDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:874:1: ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_EXID && LA6_0<=RULE_STRING)) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:876:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:877:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:877:2: rule__PropertyDefinition__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21808);
                    rule__PropertyDefinition__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:881:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:881:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:882:1: '*'
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1()); 
                    match(input,13,FOLLOW_13_in_rule__PropertyDefinition__Alternatives_21827); 
                     after(grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Alternatives_2"


    // $ANTLR start "rule__NoQueryOrder__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:894:1: rule__NoQueryOrder__Alternatives : ( ( 'noqueryorder' ) | ( 'nqord' ) );
    public final void rule__NoQueryOrder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:898:1: ( ( 'noqueryorder' ) | ( 'nqord' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:899:1: ( 'noqueryorder' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:899:1: ( 'noqueryorder' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:900:1: 'noqueryorder'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__NoQueryOrder__Alternatives1862); 
                     after(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:907:6: ( 'nqord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:907:6: ( 'nqord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:908:1: 'nqord'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__NoQueryOrder__Alternatives1882); 
                     after(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Alternatives"


    // $ANTLR start "rule__NoFullText__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:920:1: rule__NoFullText__Alternatives : ( ( 'nofulltext' ) | ( 'nof' ) );
    public final void rule__NoFullText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:924:1: ( ( 'nofulltext' ) | ( 'nof' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:925:1: ( 'nofulltext' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:925:1: ( 'nofulltext' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:926:1: 'nofulltext'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__NoFullText__Alternatives1917); 
                     after(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:933:6: ( 'nof' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:933:6: ( 'nof' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:934:1: 'nof'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__NoFullText__Alternatives1937); 
                     after(grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Alternatives"


    // $ANTLR start "rule__QueryOps__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:946:1: rule__QueryOps__Alternatives_0 : ( ( 'queryops' ) | ( 'qop' ) );
    public final void rule__QueryOps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:950:1: ( ( 'queryops' ) | ( 'qop' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:951:1: ( 'queryops' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:951:1: ( 'queryops' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:952:1: 'queryops'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__QueryOps__Alternatives_01972); 
                     after(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:959:6: ( 'qop' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:959:6: ( 'qop' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:960:1: 'qop'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__QueryOps__Alternatives_01992); 
                     after(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Alternatives_0"


    // $ANTLR start "rule__Multiple__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:972:1: rule__Multiple__Alternatives : ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) );
    public final void rule__Multiple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:976:1: ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:977:1: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:977:1: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:978:1: 'multiple'
                    {
                     before(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Multiple__Alternatives2027); 
                     after(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:985:6: ( 'mul' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:985:6: ( 'mul' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:986:1: 'mul'
                    {
                     before(grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__Multiple__Alternatives2047); 
                     after(grammarAccess.getMultipleAccess().getMulKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:993:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:993:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:994:1: '*'
                    {
                     before(grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Multiple__Alternatives2067); 
                     after(grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Alternatives"


    // $ANTLR start "rule__Protected__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1006:1: rule__Protected__Alternatives : ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) );
    public final void rule__Protected__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1010:1: ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1011:1: ( 'protected' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1011:1: ( 'protected' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1012:1: 'protected'
                    {
                     before(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__Protected__Alternatives2102); 
                     after(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1019:6: ( 'pro' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1019:6: ( 'pro' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1020:1: 'pro'
                    {
                     before(grammarAccess.getProtectedAccess().getProKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__Protected__Alternatives2122); 
                     after(grammarAccess.getProtectedAccess().getProKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1027:6: ( 'p' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1027:6: ( 'p' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1028:1: 'p'
                    {
                     before(grammarAccess.getProtectedAccess().getPKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__Protected__Alternatives2142); 
                     after(grammarAccess.getProtectedAccess().getPKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Alternatives"


    // $ANTLR start "rule__Mandatory__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1040:1: rule__Mandatory__Alternatives : ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) );
    public final void rule__Mandatory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1044:1: ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1045:1: ( 'mandatory' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1045:1: ( 'mandatory' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1046:1: 'mandatory'
                    {
                     before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                    match(input,25,FOLLOW_25_in_rule__Mandatory__Alternatives2177); 
                     after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1053:6: ( 'man' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1053:6: ( 'man' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1054:1: 'man'
                    {
                     before(grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                    match(input,26,FOLLOW_26_in_rule__Mandatory__Alternatives2197); 
                     after(grammarAccess.getMandatoryAccess().getManKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1061:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1061:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1062:1: 'm'
                    {
                     before(grammarAccess.getMandatoryAccess().getMKeyword_2()); 
                    match(input,27,FOLLOW_27_in_rule__Mandatory__Alternatives2217); 
                     after(grammarAccess.getMandatoryAccess().getMKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Alternatives"


    // $ANTLR start "rule__Autocreated__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1074:1: rule__Autocreated__Alternatives : ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) );
    public final void rule__Autocreated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1078:1: ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1079:1: ( 'autocreated' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1079:1: ( 'autocreated' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1080:1: 'autocreated'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Autocreated__Alternatives2252); 
                     after(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1087:6: ( 'aut' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1087:6: ( 'aut' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1088:1: 'aut'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Autocreated__Alternatives2272); 
                     after(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1095:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1095:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1096:1: 'a'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Autocreated__Alternatives2292); 
                     after(grammarAccess.getAutocreatedAccess().getAKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1108:1: rule__Primary__Alternatives : ( ( 'primary' ) | ( '!' ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1112:1: ( ( 'primary' ) | ( '!' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1113:1: ( 'primary' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1113:1: ( 'primary' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1114:1: 'primary'
                    {
                     before(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                    match(input,31,FOLLOW_31_in_rule__Primary__Alternatives2327); 
                     after(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1121:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1121:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1122:1: '!'
                    {
                     before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                    match(input,32,FOLLOW_32_in_rule__Primary__Alternatives2347); 
                     after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__PrimaryItem__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1134:1: rule__PrimaryItem__Alternatives_0 : ( ( 'primaryitem' ) | ( '!' ) );
    public final void rule__PrimaryItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1138:1: ( ( 'primaryitem' ) | ( '!' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1139:1: ( 'primaryitem' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1139:1: ( 'primaryitem' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1140:1: 'primaryitem'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                    match(input,33,FOLLOW_33_in_rule__PrimaryItem__Alternatives_02382); 
                     after(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1147:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1147:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1148:1: '!'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                    match(input,32,FOLLOW_32_in_rule__PrimaryItem__Alternatives_02402); 
                     after(grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Alternatives_0"


    // $ANTLR start "rule__Queryable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1160:1: rule__Queryable__Alternatives : ( ( 'query' ) | ( 'q' ) );
    public final void rule__Queryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1164:1: ( ( 'query' ) | ( 'q' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1165:1: ( 'query' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1165:1: ( 'query' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1166:1: 'query'
                    {
                     before(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                    match(input,34,FOLLOW_34_in_rule__Queryable__Alternatives2437); 
                     after(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1173:6: ( 'q' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1173:6: ( 'q' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1174:1: 'q'
                    {
                     before(grammarAccess.getQueryableAccess().getQKeyword_1()); 
                    match(input,35,FOLLOW_35_in_rule__Queryable__Alternatives2457); 
                     after(grammarAccess.getQueryableAccess().getQKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Queryable__Alternatives"


    // $ANTLR start "rule__Notqueryable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1186:1: rule__Notqueryable__Alternatives : ( ( 'noquery' ) | ( 'nq' ) );
    public final void rule__Notqueryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1190:1: ( ( 'noquery' ) | ( 'nq' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1191:1: ( 'noquery' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1191:1: ( 'noquery' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1192:1: 'noquery'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                    match(input,36,FOLLOW_36_in_rule__Notqueryable__Alternatives2492); 
                     after(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1199:6: ( 'nq' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1199:6: ( 'nq' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1200:1: 'nq'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 
                    match(input,37,FOLLOW_37_in_rule__Notqueryable__Alternatives2512); 
                     after(grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notqueryable__Alternatives"


    // $ANTLR start "rule__Abstract__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1212:1: rule__Abstract__Alternatives : ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1216:1: ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1217:1: ( 'abstract' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1217:1: ( 'abstract' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1218:1: 'abstract'
                    {
                     before(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__Abstract__Alternatives2547); 
                     after(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( 'abs' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( 'abs' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1226:1: 'abs'
                    {
                     before(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__Abstract__Alternatives2567); 
                     after(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1233:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1233:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1234:1: 'a'
                    {
                     before(grammarAccess.getAbstractAccess().getAKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Abstract__Alternatives2587); 
                     after(grammarAccess.getAbstractAccess().getAKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Alternatives"


    // $ANTLR start "rule__Mixin__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1246:1: rule__Mixin__Alternatives : ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) );
    public final void rule__Mixin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1250:1: ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 27:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1251:1: ( 'mixin' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1251:1: ( 'mixin' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1252:1: 'mixin'
                    {
                     before(grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                    match(input,40,FOLLOW_40_in_rule__Mixin__Alternatives2622); 
                     after(grammarAccess.getMixinAccess().getMixinKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1259:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1259:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1260:1: 'mix'
                    {
                     before(grammarAccess.getMixinAccess().getMixKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__Mixin__Alternatives2642); 
                     after(grammarAccess.getMixinAccess().getMixKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1268:1: 'm'
                    {
                     before(grammarAccess.getMixinAccess().getMKeyword_2()); 
                    match(input,27,FOLLOW_27_in_rule__Mixin__Alternatives2662); 
                     after(grammarAccess.getMixinAccess().getMKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Alternatives"


    // $ANTLR start "rule__Orderable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1280:1: rule__Orderable__Alternatives : ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) );
    public final void rule__Orderable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1284:1: ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1285:1: ( 'orderable' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1285:1: ( 'orderable' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1286:1: 'orderable'
                    {
                     before(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                    match(input,42,FOLLOW_42_in_rule__Orderable__Alternatives2697); 
                     after(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1293:6: ( 'ord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1293:6: ( 'ord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1294:1: 'ord'
                    {
                     before(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                    match(input,43,FOLLOW_43_in_rule__Orderable__Alternatives2717); 
                     after(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1301:6: ( 'o' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1301:6: ( 'o' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1302:1: 'o'
                    {
                     before(grammarAccess.getOrderableAccess().getOKeyword_2()); 
                    match(input,44,FOLLOW_44_in_rule__Orderable__Alternatives2737); 
                     after(grammarAccess.getOrderableAccess().getOKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Alternatives"


    // $ANTLR start "rule__JcrString__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1314:1: rule__JcrString__Alternatives : ( ( RULE_STRING ) | ( ruleXiD ) );
    public final void rule__JcrString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1318:1: ( ( RULE_STRING ) | ( ruleXiD ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_EXID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:1: ( RULE_STRING )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:1: ( RULE_STRING )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1320:1: RULE_STRING
                    {
                     before(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2771); 
                     after(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1325:6: ( ruleXiD )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1325:6: ( ruleXiD )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1326:1: ruleXiD
                    {
                     before(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2788);
                    ruleXiD();

                    state._fsp--;

                     after(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrString__Alternatives"


    // $ANTLR start "rule__Opv__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1336:1: rule__Opv__Alternatives : ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) );
    public final void rule__Opv__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1340:1: ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt22=1;
                }
                break;
            case 46:
                {
                alt22=2;
                }
                break;
            case 47:
                {
                alt22=3;
                }
                break;
            case 48:
                {
                alt22=4;
                }
                break;
            case 49:
                {
                alt22=5;
                }
                break;
            case 50:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1341:1: ( ( 'COPY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1341:1: ( ( 'COPY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1342:1: ( 'COPY' )
                    {
                     before(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1343:1: ( 'COPY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1343:3: 'COPY'
                    {
                    match(input,45,FOLLOW_45_in_rule__Opv__Alternatives2821); 

                    }

                     after(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1348:6: ( ( 'VERSION' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1348:6: ( ( 'VERSION' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1349:1: ( 'VERSION' )
                    {
                     before(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1350:1: ( 'VERSION' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1350:3: 'VERSION'
                    {
                    match(input,46,FOLLOW_46_in_rule__Opv__Alternatives2842); 

                    }

                     after(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1355:6: ( ( 'INITIALIZE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1355:6: ( ( 'INITIALIZE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1356:1: ( 'INITIALIZE' )
                    {
                     before(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1357:1: ( 'INITIALIZE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1357:3: 'INITIALIZE'
                    {
                    match(input,47,FOLLOW_47_in_rule__Opv__Alternatives2863); 

                    }

                     after(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1362:6: ( ( 'COMPUTE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1362:6: ( ( 'COMPUTE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1363:1: ( 'COMPUTE' )
                    {
                     before(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1364:1: ( 'COMPUTE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1364:3: 'COMPUTE'
                    {
                    match(input,48,FOLLOW_48_in_rule__Opv__Alternatives2884); 

                    }

                     after(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1369:6: ( ( 'IGNORE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1369:6: ( ( 'IGNORE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1370:1: ( 'IGNORE' )
                    {
                     before(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1371:1: ( 'IGNORE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1371:3: 'IGNORE'
                    {
                    match(input,49,FOLLOW_49_in_rule__Opv__Alternatives2905); 

                    }

                     after(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1376:6: ( ( 'ABORT' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1376:6: ( ( 'ABORT' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1377:1: ( 'ABORT' )
                    {
                     before(grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1378:1: ( 'ABORT' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1378:3: 'ABORT'
                    {
                    match(input,50,FOLLOW_50_in_rule__Opv__Alternatives2926); 

                    }

                     after(grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Alternatives"


    // $ANTLR start "rule__PropertyType__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1388:1: rule__PropertyType__Alternatives : ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1392:1: ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) )
            int alt23=13;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt23=1;
                }
                break;
            case 52:
                {
                alt23=2;
                }
                break;
            case 53:
                {
                alt23=3;
                }
                break;
            case 54:
                {
                alt23=4;
                }
                break;
            case 55:
                {
                alt23=5;
                }
                break;
            case 56:
                {
                alt23=6;
                }
                break;
            case 57:
                {
                alt23=7;
                }
                break;
            case 58:
                {
                alt23=8;
                }
                break;
            case 59:
                {
                alt23=9;
                }
                break;
            case 60:
                {
                alt23=10;
                }
                break;
            case 61:
                {
                alt23=11;
                }
                break;
            case 62:
                {
                alt23=12;
                }
                break;
            case 63:
                {
                alt23=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1393:1: ( ( 'UNDEFINED' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1393:1: ( ( 'UNDEFINED' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1394:1: ( 'UNDEFINED' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1395:1: ( 'UNDEFINED' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1395:3: 'UNDEFINED'
                    {
                    match(input,51,FOLLOW_51_in_rule__PropertyType__Alternatives2962); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1400:6: ( ( 'STRING' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1400:6: ( ( 'STRING' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1401:1: ( 'STRING' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1402:1: ( 'STRING' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1402:3: 'STRING'
                    {
                    match(input,52,FOLLOW_52_in_rule__PropertyType__Alternatives2983); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1407:6: ( ( 'BINARY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1407:6: ( ( 'BINARY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1408:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1409:1: ( 'BINARY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1409:3: 'BINARY'
                    {
                    match(input,53,FOLLOW_53_in_rule__PropertyType__Alternatives3004); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1414:6: ( ( 'LONG' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1414:6: ( ( 'LONG' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1415:1: ( 'LONG' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1416:1: ( 'LONG' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1416:3: 'LONG'
                    {
                    match(input,54,FOLLOW_54_in_rule__PropertyType__Alternatives3025); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1421:6: ( ( 'DOUBLE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1421:6: ( ( 'DOUBLE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1422:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1423:1: ( 'DOUBLE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1423:3: 'DOUBLE'
                    {
                    match(input,55,FOLLOW_55_in_rule__PropertyType__Alternatives3046); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1428:6: ( ( 'DATE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1428:6: ( ( 'DATE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1429:1: ( 'DATE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1430:1: ( 'DATE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1430:3: 'DATE'
                    {
                    match(input,56,FOLLOW_56_in_rule__PropertyType__Alternatives3067); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1435:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1435:6: ( ( 'BOOLEAN' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1436:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1437:1: ( 'BOOLEAN' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1437:3: 'BOOLEAN'
                    {
                    match(input,57,FOLLOW_57_in_rule__PropertyType__Alternatives3088); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1442:6: ( ( 'NAME' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1442:6: ( ( 'NAME' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1443:1: ( 'NAME' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1444:1: ( 'NAME' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1444:3: 'NAME'
                    {
                    match(input,58,FOLLOW_58_in_rule__PropertyType__Alternatives3109); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1449:6: ( ( 'PATH' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1449:6: ( ( 'PATH' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1450:1: ( 'PATH' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1451:1: ( 'PATH' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1451:3: 'PATH'
                    {
                    match(input,59,FOLLOW_59_in_rule__PropertyType__Alternatives3130); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1456:6: ( ( 'REFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1456:6: ( ( 'REFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1457:1: ( 'REFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1458:1: ( 'REFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1458:3: 'REFERENCE'
                    {
                    match(input,60,FOLLOW_60_in_rule__PropertyType__Alternatives3151); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1463:6: ( ( 'WEAKREFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1463:6: ( ( 'WEAKREFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1464:1: ( 'WEAKREFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1465:1: ( 'WEAKREFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1465:3: 'WEAKREFERENCE'
                    {
                    match(input,61,FOLLOW_61_in_rule__PropertyType__Alternatives3172); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1470:6: ( ( 'URI' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1470:6: ( ( 'URI' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1471:1: ( 'URI' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1472:1: ( 'URI' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1472:3: 'URI'
                    {
                    match(input,62,FOLLOW_62_in_rule__PropertyType__Alternatives3193); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1477:6: ( ( 'DECIMAL' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1477:6: ( ( 'DECIMAL' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1478:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1479:1: ( 'DECIMAL' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1479:3: 'DECIMAL'
                    {
                    match(input,63,FOLLOW_63_in_rule__PropertyType__Alternatives3214); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__NodeTypeDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1491:1: rule__NodeTypeDefinition__Group__0 : rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 ;
    public final void rule__NodeTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1495:1: ( rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1496:2: rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03247);
            rule__NodeTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03250);
            rule__NodeTypeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1503:1: rule__NodeTypeDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1507:1: ( ( '[' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1508:1: ( '[' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1508:1: ( '[' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1509:1: '['
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3278); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1522:1: rule__NodeTypeDefinition__Group__1 : rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 ;
    public final void rule__NodeTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1526:1: ( rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1527:2: rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13309);
            rule__NodeTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13312);
            rule__NodeTypeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1534:1: rule__NodeTypeDefinition__Group__1__Impl : ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1538:1: ( ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1539:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1539:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1540:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1541:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1541:2: rule__NodeTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3339);
            rule__NodeTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1551:1: rule__NodeTypeDefinition__Group__2 : rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 ;
    public final void rule__NodeTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1555:1: ( rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1556:2: rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23369);
            rule__NodeTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23372);
            rule__NodeTypeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__2"


    // $ANTLR start "rule__NodeTypeDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:1: rule__NodeTypeDefinition__Group__2__Impl : ( ']' ) ;
    public final void rule__NodeTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1567:1: ( ( ']' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1568:1: ( ']' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1568:1: ( ']' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1569:1: ']'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2()); 
            match(input,65,FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3400); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1582:1: rule__NodeTypeDefinition__Group__3 : rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 ;
    public final void rule__NodeTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1586:1: ( rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1587:2: rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33431);
            rule__NodeTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33434);
            rule__NodeTypeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__3"


    // $ANTLR start "rule__NodeTypeDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1594:1: rule__NodeTypeDefinition__Group__3__Impl : ( ( rule__NodeTypeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1598:1: ( ( ( rule__NodeTypeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1599:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1599:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1600:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1601:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==66) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1601:2: rule__NodeTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3461);
                    rule__NodeTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1611:1: rule__NodeTypeDefinition__Group__4 : rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 ;
    public final void rule__NodeTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1615:1: ( rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1616:2: rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43492);
            rule__NodeTypeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43495);
            rule__NodeTypeDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__4"


    // $ANTLR start "rule__NodeTypeDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1623:1: rule__NodeTypeDefinition__Group__4__Impl : ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1627:1: ( ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1628:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1628:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1629:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1630:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1630:2: rule__NodeTypeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3522);
            rule__NodeTypeDefinition__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1640:1: rule__NodeTypeDefinition__Group__5 : rule__NodeTypeDefinition__Group__5__Impl ;
    public final void rule__NodeTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1644:1: ( rule__NodeTypeDefinition__Group__5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1645:2: rule__NodeTypeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53552);
            rule__NodeTypeDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__5"


    // $ANTLR start "rule__NodeTypeDefinition__Group__5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1651:1: rule__NodeTypeDefinition__Group__5__Impl : ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) ;
    public final void rule__NodeTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1655:1: ( ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1656:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1656:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1657:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1658:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==68||LA25_0==72) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1658:2: rule__NodeTypeDefinition__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3579);
            	    rule__NodeTypeDefinition__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group__5__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1680:1: rule__NodeTypeDefinition__Group_3__0 : rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 ;
    public final void rule__NodeTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1684:1: ( rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1685:2: rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03622);
            rule__NodeTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03625);
            rule__NodeTypeDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1692:1: rule__NodeTypeDefinition__Group_3__0__Impl : ( '>' ) ;
    public final void rule__NodeTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1696:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1697:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1697:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1698:1: '>'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3653); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1711:1: rule__NodeTypeDefinition__Group_3__1 : rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 ;
    public final void rule__NodeTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1715:1: ( rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1716:2: rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13684);
            rule__NodeTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13687);
            rule__NodeTypeDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1723:1: rule__NodeTypeDefinition__Group_3__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1727:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1728:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1728:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1729:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1730:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1730:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3714);
            rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1740:1: rule__NodeTypeDefinition__Group_3__2 : rule__NodeTypeDefinition__Group_3__2__Impl ;
    public final void rule__NodeTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1744:1: ( rule__NodeTypeDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1745:2: rule__NodeTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23744);
            rule__NodeTypeDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__2"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1751:1: rule__NodeTypeDefinition__Group_3__2__Impl : ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) ;
    public final void rule__NodeTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1755:1: ( ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1756:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1756:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1757:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1758:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==67) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1758:2: rule__NodeTypeDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3771);
            	    rule__NodeTypeDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1774:1: rule__NodeTypeDefinition__Group_3_2__0 : rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 ;
    public final void rule__NodeTypeDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1778:1: ( rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1779:2: rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03808);
            rule__NodeTypeDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03811);
            rule__NodeTypeDefinition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1786:1: rule__NodeTypeDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1790:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1791:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1791:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1792:1: ','
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3839); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1805:1: rule__NodeTypeDefinition__Group_3_2__1 : rule__NodeTypeDefinition__Group_3_2__1__Impl ;
    public final void rule__NodeTypeDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1809:1: ( rule__NodeTypeDefinition__Group_3_2__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1810:2: rule__NodeTypeDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13870);
            rule__NodeTypeDefinition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1816:1: rule__NodeTypeDefinition__Group_3_2__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1820:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1821:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1821:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1822:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1823:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1823:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3897);
            rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1837:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1841:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1842:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__03931);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__03934);
            rule__NodeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0"


    // $ANTLR start "rule__NodeDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1849:1: rule__NodeDefinition__Group__0__Impl : ( '+' ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1853:1: ( ( '+' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1854:1: ( '+' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1854:1: ( '+' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1855:1: '+'
            {
             before(grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl3962); 
             after(grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1868:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1872:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1873:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__13993);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__13996);
            rule__NodeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1"


    // $ANTLR start "rule__NodeDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1880:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__Alternatives_1 ) ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1884:1: ( ( ( rule__NodeDefinition__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1885:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1885:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1886:1: ( rule__NodeDefinition__Alternatives_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1887:1: ( rule__NodeDefinition__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1887:2: rule__NodeDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4023);
            rule__NodeDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1897:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1901:1: ( rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1902:2: rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24053);
            rule__NodeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24056);
            rule__NodeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2"


    // $ANTLR start "rule__NodeDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1909:1: rule__NodeDefinition__Group__2__Impl : ( ( rule__NodeDefinition__Group_2__0 )? ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1913:1: ( ( ( rule__NodeDefinition__Group_2__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1914:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1914:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1915:1: ( rule__NodeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1916:1: ( rule__NodeDefinition__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==69) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1916:2: rule__NodeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4083);
                    rule__NodeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1926:1: rule__NodeDefinition__Group__3 : rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 ;
    public final void rule__NodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1930:1: ( rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1931:2: rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34114);
            rule__NodeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34117);
            rule__NodeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__3"


    // $ANTLR start "rule__NodeDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1938:1: rule__NodeDefinition__Group__3__Impl : ( ( rule__NodeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1942:1: ( ( ( rule__NodeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1943:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1943:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1944:1: ( rule__NodeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1945:1: ( rule__NodeDefinition__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==71) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1945:2: rule__NodeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4144);
                    rule__NodeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__3__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1955:1: rule__NodeDefinition__Group__4 : rule__NodeDefinition__Group__4__Impl ;
    public final void rule__NodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1959:1: ( rule__NodeDefinition__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1960:2: rule__NodeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44175);
            rule__NodeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__4"


    // $ANTLR start "rule__NodeDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1966:1: rule__NodeDefinition__Group__4__Impl : ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1970:1: ( ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1971:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1971:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1972:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1973:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1973:2: rule__NodeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4202);
            rule__NodeDefinition__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group__4__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1993:1: rule__NodeDefinition__Group_2__0 : rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 ;
    public final void rule__NodeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1997:1: ( rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1998:2: rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04242);
            rule__NodeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04245);
            rule__NodeDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__0"


    // $ANTLR start "rule__NodeDefinition__Group_2__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2005:1: rule__NodeDefinition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__NodeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2009:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2010:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2010:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2011:1: '('
            {
             before(grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,69,FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4273); 
             after(grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2024:1: rule__NodeDefinition__Group_2__1 : rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 ;
    public final void rule__NodeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2028:1: ( rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2029:2: rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14304);
            rule__NodeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14307);
            rule__NodeDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__1"


    // $ANTLR start "rule__NodeDefinition__Group_2__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2036:1: rule__NodeDefinition__Group_2__1__Impl : ( ( rule__NodeDefinition__Group_2_1__0 ) ) ;
    public final void rule__NodeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2040:1: ( ( ( rule__NodeDefinition__Group_2_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2041:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2041:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2042:1: ( rule__NodeDefinition__Group_2_1__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2043:1: ( rule__NodeDefinition__Group_2_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2043:2: rule__NodeDefinition__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4334);
            rule__NodeDefinition__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2053:1: rule__NodeDefinition__Group_2__2 : rule__NodeDefinition__Group_2__2__Impl ;
    public final void rule__NodeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2057:1: ( rule__NodeDefinition__Group_2__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2058:2: rule__NodeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24364);
            rule__NodeDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__2"


    // $ANTLR start "rule__NodeDefinition__Group_2__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2064:1: rule__NodeDefinition__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NodeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2068:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2069:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2069:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2070:1: ')'
            {
             before(grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,70,FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4392); 
             after(grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2089:1: rule__NodeDefinition__Group_2_1__0 : rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 ;
    public final void rule__NodeDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2093:1: ( rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2094:2: rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04429);
            rule__NodeDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04432);
            rule__NodeDefinition__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1__0"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2101:1: rule__NodeDefinition__Group_2_1__0__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) ;
    public final void rule__NodeDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2105:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2106:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2106:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2107:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2108:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2108:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4459);
            rule__NodeDefinition__RequiredTypesAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2118:1: rule__NodeDefinition__Group_2_1__1 : rule__NodeDefinition__Group_2_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2122:1: ( rule__NodeDefinition__Group_2_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2123:2: rule__NodeDefinition__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14489);
            rule__NodeDefinition__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1__1"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2129:1: rule__NodeDefinition__Group_2_1__1__Impl : ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) ;
    public final void rule__NodeDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2133:1: ( ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2134:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2134:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2135:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2136:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==67) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2136:2: rule__NodeDefinition__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4516);
            	    rule__NodeDefinition__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2150:1: rule__NodeDefinition__Group_2_1_1__0 : rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 ;
    public final void rule__NodeDefinition__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2154:1: ( rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2155:2: rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04551);
            rule__NodeDefinition__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04554);
            rule__NodeDefinition__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__0"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2162:1: rule__NodeDefinition__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__NodeDefinition__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2166:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2167:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2167:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2168:1: ','
            {
             before(grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4582); 
             after(grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2181:1: rule__NodeDefinition__Group_2_1_1__1 : rule__NodeDefinition__Group_2_1_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2185:1: ( rule__NodeDefinition__Group_2_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2186:2: rule__NodeDefinition__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14613);
            rule__NodeDefinition__Group_2_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__1"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2192:1: rule__NodeDefinition__Group_2_1_1__1__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) ;
    public final void rule__NodeDefinition__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2196:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2197:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2197:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2198:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2199:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2199:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4640);
            rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2213:1: rule__NodeDefinition__Group_3__0 : rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 ;
    public final void rule__NodeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2217:1: ( rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2218:2: rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04674);
            rule__NodeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04677);
            rule__NodeDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_3__0"


    // $ANTLR start "rule__NodeDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2225:1: rule__NodeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NodeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2229:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2230:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2230:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2231:1: '='
            {
             before(grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,71,FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4705); 
             after(grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2244:1: rule__NodeDefinition__Group_3__1 : rule__NodeDefinition__Group_3__1__Impl ;
    public final void rule__NodeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2248:1: ( rule__NodeDefinition__Group_3__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2249:2: rule__NodeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14736);
            rule__NodeDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_3__1"


    // $ANTLR start "rule__NodeDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2255:1: rule__NodeDefinition__Group_3__1__Impl : ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) ;
    public final void rule__NodeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2259:1: ( ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2260:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2260:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2261:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2262:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2262:2: rule__NodeDefinition__DefaultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4763);
            rule__NodeDefinition__DefaultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getDefaultTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2276:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2280:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2281:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04797);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04800);
            rule__PropertyDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2288:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2292:1: ( ( () ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2293:1: ( () )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2293:1: ( () )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2294:1: ()
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2295:1: ()
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2297:1: 
            {
            }

             after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2307:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2311:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2312:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14858);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14861);
            rule__PropertyDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2319:1: rule__PropertyDefinition__Group__1__Impl : ( '-' ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2323:1: ( ( '-' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2324:1: ( '-' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2324:1: ( '-' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2325:1: '-'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl4889); 
             after(grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2338:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2342:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2343:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24920);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24923);
            rule__PropertyDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2350:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__Alternatives_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2354:1: ( ( ( rule__PropertyDefinition__Alternatives_2 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2355:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2355:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2356:1: ( rule__PropertyDefinition__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2357:1: ( rule__PropertyDefinition__Alternatives_2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2357:2: rule__PropertyDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl4950);
            rule__PropertyDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2367:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2371:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2372:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34980);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34983);
            rule__PropertyDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2379:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__Group_3__0 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2383:1: ( ( ( rule__PropertyDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2384:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2384:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2385:1: ( rule__PropertyDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2386:1: ( rule__PropertyDefinition__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==69) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2386:2: rule__PropertyDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5010);
                    rule__PropertyDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2396:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2400:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2401:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45041);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45044);
            rule__PropertyDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2408:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2412:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2413:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2413:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2414:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2415:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==71) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2415:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5071);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2425:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2429:1: ( rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2430:2: rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55102);
            rule__PropertyDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55105);
            rule__PropertyDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2437:1: rule__PropertyDefinition__Group__5__Impl : ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2441:1: ( ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2442:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2442:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2443:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2444:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2444:2: rule__PropertyDefinition__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5132);
            rule__PropertyDefinition__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2454:1: rule__PropertyDefinition__Group__6 : rule__PropertyDefinition__Group__6__Impl ;
    public final void rule__PropertyDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2458:1: ( rule__PropertyDefinition__Group__6__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2459:2: rule__PropertyDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65162);
            rule__PropertyDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__6"


    // $ANTLR start "rule__PropertyDefinition__Group__6__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2465:1: rule__PropertyDefinition__Group__6__Impl : ( ( rule__PropertyDefinition__Group_6__0 )? ) ;
    public final void rule__PropertyDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2469:1: ( ( ( rule__PropertyDefinition__Group_6__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2470:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2470:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2471:1: ( rule__PropertyDefinition__Group_6__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2472:1: ( rule__PropertyDefinition__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==73) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_EXID) ) {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==EOF||LA32_3==64||(LA32_3>=67 && LA32_3<=68)||(LA32_3>=72 && LA32_3<=73)) ) {
                        alt32=1;
                    }
                }
                else if ( (LA32_1==RULE_STRING) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2472:2: rule__PropertyDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5189);
                    rule__PropertyDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__6__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2496:1: rule__PropertyDefinition__Group_3__0 : rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 ;
    public final void rule__PropertyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2500:1: ( rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2501:2: rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05234);
            rule__PropertyDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05237);
            rule__PropertyDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__0"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2508:1: rule__PropertyDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PropertyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2512:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2513:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2513:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2514:1: '('
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,69,FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5265); 
             after(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2527:1: rule__PropertyDefinition__Group_3__1 : rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 ;
    public final void rule__PropertyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2531:1: ( rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2532:2: rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15296);
            rule__PropertyDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15299);
            rule__PropertyDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__1"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2539:1: rule__PropertyDefinition__Group_3__1__Impl : ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) ;
    public final void rule__PropertyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2543:1: ( ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2544:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2544:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2545:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2546:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2546:2: rule__PropertyDefinition__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5326);
            rule__PropertyDefinition__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2556:1: rule__PropertyDefinition__Group_3__2 : rule__PropertyDefinition__Group_3__2__Impl ;
    public final void rule__PropertyDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2560:1: ( rule__PropertyDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2561:2: rule__PropertyDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25356);
            rule__PropertyDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__2"


    // $ANTLR start "rule__PropertyDefinition__Group_3__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2567:1: rule__PropertyDefinition__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PropertyDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2571:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2572:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2572:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2573:1: ')'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,70,FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5384); 
             after(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2592:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2596:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2597:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05421);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05424);
            rule__PropertyDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2604:1: rule__PropertyDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2608:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2609:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2609:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2610:1: '='
            {
             before(grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,71,FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5452); 
             after(grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2623:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2627:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2628:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15483);
            rule__PropertyDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2634:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__Group_4_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2638:1: ( ( ( rule__PropertyDefinition__Group_4_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2639:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2639:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2640:1: ( rule__PropertyDefinition__Group_4_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2641:1: ( rule__PropertyDefinition__Group_4_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2641:2: rule__PropertyDefinition__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5510);
            rule__PropertyDefinition__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2655:1: rule__PropertyDefinition__Group_4_1__0 : rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2659:1: ( rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2660:2: rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05544);
            rule__PropertyDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05547);
            rule__PropertyDefinition__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2667:1: rule__PropertyDefinition__Group_4_1__0__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2671:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2672:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2672:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2673:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2674:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2674:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5574);
            rule__PropertyDefinition__DefaultValuesAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2684:1: rule__PropertyDefinition__Group_4_1__1 : rule__PropertyDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2688:1: ( rule__PropertyDefinition__Group_4_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2689:2: rule__PropertyDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15604);
            rule__PropertyDefinition__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2695:1: rule__PropertyDefinition__Group_4_1__1__Impl : ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2699:1: ( ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2700:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2700:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2701:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2702:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==67) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2702:2: rule__PropertyDefinition__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5631);
            	    rule__PropertyDefinition__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2716:1: rule__PropertyDefinition__Group_4_1_1__0 : rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2720:1: ( rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2721:2: rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05666);
            rule__PropertyDefinition__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05669);
            rule__PropertyDefinition__Group_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2728:1: rule__PropertyDefinition__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2732:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2733:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2733:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2734:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5697); 
             after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2747:1: rule__PropertyDefinition__Group_4_1_1__1 : rule__PropertyDefinition__Group_4_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2751:1: ( rule__PropertyDefinition__Group_4_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2752:2: rule__PropertyDefinition__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15728);
            rule__PropertyDefinition__Group_4_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2758:1: rule__PropertyDefinition__Group_4_1_1__1__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2762:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2763:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2763:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2764:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2765:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2765:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5755);
            rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2779:1: rule__PropertyDefinition__Group_6__0 : rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 ;
    public final void rule__PropertyDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2783:1: ( rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2784:2: rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05789);
            rule__PropertyDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05792);
            rule__PropertyDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2791:1: rule__PropertyDefinition__Group_6__0__Impl : ( '<' ) ;
    public final void rule__PropertyDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2795:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2796:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2796:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2797:1: '<'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0()); 
            match(input,73,FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5820); 
             after(grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2810:1: rule__PropertyDefinition__Group_6__1 : rule__PropertyDefinition__Group_6__1__Impl ;
    public final void rule__PropertyDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2814:1: ( rule__PropertyDefinition__Group_6__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2815:2: rule__PropertyDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15851);
            rule__PropertyDefinition__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2821:1: rule__PropertyDefinition__Group_6__1__Impl : ( ( rule__PropertyDefinition__Group_6_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2825:1: ( ( ( rule__PropertyDefinition__Group_6_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2826:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2826:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2827:1: ( rule__PropertyDefinition__Group_6_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2828:1: ( rule__PropertyDefinition__Group_6_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2828:2: rule__PropertyDefinition__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5878);
            rule__PropertyDefinition__Group_6_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2842:1: rule__PropertyDefinition__Group_6_1__0 : rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2846:1: ( rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2847:2: rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__05912);
            rule__PropertyDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__05915);
            rule__PropertyDefinition__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2854:1: rule__PropertyDefinition__Group_6_1__0__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2858:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2859:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2859:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2860:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2861:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2861:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl5942);
            rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2871:1: rule__PropertyDefinition__Group_6_1__1 : rule__PropertyDefinition__Group_6_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2875:1: ( rule__PropertyDefinition__Group_6_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2876:2: rule__PropertyDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__15972);
            rule__PropertyDefinition__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2882:1: rule__PropertyDefinition__Group_6_1__1__Impl : ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2886:1: ( ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2887:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2887:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2888:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2889:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==67) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2889:2: rule__PropertyDefinition__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl5999);
            	    rule__PropertyDefinition__Group_6_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2903:1: rule__PropertyDefinition__Group_6_1_1__0 : rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2907:1: ( rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2908:2: rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06034);
            rule__PropertyDefinition__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06037);
            rule__PropertyDefinition__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2915:1: rule__PropertyDefinition__Group_6_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2919:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2920:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2920:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2921:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6065); 
             after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2934:1: rule__PropertyDefinition__Group_6_1_1__1 : rule__PropertyDefinition__Group_6_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2938:1: ( rule__PropertyDefinition__Group_6_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2939:2: rule__PropertyDefinition__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16096);
            rule__PropertyDefinition__Group_6_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2945:1: rule__PropertyDefinition__Group_6_1_1__1__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2949:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2950:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2950:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2951:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2952:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2952:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6123);
            rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__QueryOps__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2966:1: rule__QueryOps__Group__0 : rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 ;
    public final void rule__QueryOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2970:1: ( rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2971:2: rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06157);
            rule__QueryOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06160);
            rule__QueryOps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__0"


    // $ANTLR start "rule__QueryOps__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2978:1: rule__QueryOps__Group__0__Impl : ( ( rule__QueryOps__Alternatives_0 ) ) ;
    public final void rule__QueryOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2982:1: ( ( ( rule__QueryOps__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2983:1: ( ( rule__QueryOps__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2983:1: ( ( rule__QueryOps__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2984:1: ( rule__QueryOps__Alternatives_0 )
            {
             before(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2985:1: ( rule__QueryOps__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2985:2: rule__QueryOps__Alternatives_0
            {
            pushFollow(FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6187);
            rule__QueryOps__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__0__Impl"


    // $ANTLR start "rule__QueryOps__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2995:1: rule__QueryOps__Group__1 : rule__QueryOps__Group__1__Impl ;
    public final void rule__QueryOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2999:1: ( rule__QueryOps__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3000:2: rule__QueryOps__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16217);
            rule__QueryOps__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__1"


    // $ANTLR start "rule__QueryOps__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3006:1: rule__QueryOps__Group__1__Impl : ( ruleJcrString ) ;
    public final void rule__QueryOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3010:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3011:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3011:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3012:1: ruleJcrString
            {
             before(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6244);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__1__Impl"


    // $ANTLR start "rule__PrimaryItem__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3027:1: rule__PrimaryItem__Group__0 : rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 ;
    public final void rule__PrimaryItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3031:1: ( rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3032:2: rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__06277);
            rule__PrimaryItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__06280);
            rule__PrimaryItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__0"


    // $ANTLR start "rule__PrimaryItem__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3039:1: rule__PrimaryItem__Group__0__Impl : ( ( rule__PrimaryItem__Alternatives_0 ) ) ;
    public final void rule__PrimaryItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3043:1: ( ( ( rule__PrimaryItem__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3044:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3044:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3045:1: ( rule__PrimaryItem__Alternatives_0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3046:1: ( rule__PrimaryItem__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3046:2: rule__PrimaryItem__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl6307);
            rule__PrimaryItem__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryItemAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__0__Impl"


    // $ANTLR start "rule__PrimaryItem__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3056:1: rule__PrimaryItem__Group__1 : rule__PrimaryItem__Group__1__Impl ;
    public final void rule__PrimaryItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3060:1: ( rule__PrimaryItem__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3061:2: rule__PrimaryItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__16337);
            rule__PrimaryItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__1"


    // $ANTLR start "rule__PrimaryItem__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3067:1: rule__PrimaryItem__Group__1__Impl : ( ruleJcrString ) ;
    public final void rule__PrimaryItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3071:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3072:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3072:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3073:1: ruleJcrString
            {
             before(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PrimaryItem__Group__1__Impl6364);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__1__Impl"


    // $ANTLR start "rule__NsMapping__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3088:1: rule__NsMapping__Group__0 : rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 ;
    public final void rule__NsMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3092:1: ( rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3093:2: rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06397);
            rule__NsMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06400);
            rule__NsMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__0"


    // $ANTLR start "rule__NsMapping__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3100:1: rule__NsMapping__Group__0__Impl : ( '<' ) ;
    public final void rule__NsMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3104:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3105:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3105:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3106:1: '<'
            {
             before(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__NsMapping__Group__0__Impl6428); 
             after(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__0__Impl"


    // $ANTLR start "rule__NsMapping__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3119:1: rule__NsMapping__Group__1 : rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 ;
    public final void rule__NsMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3123:1: ( rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3124:2: rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16459);
            rule__NsMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16462);
            rule__NsMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__1"


    // $ANTLR start "rule__NsMapping__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3131:1: rule__NsMapping__Group__1__Impl : ( ( rule__NsMapping__NameAssignment_1 ) ) ;
    public final void rule__NsMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3135:1: ( ( ( rule__NsMapping__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3136:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3136:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3137:1: ( rule__NsMapping__NameAssignment_1 )
            {
             before(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3138:1: ( rule__NsMapping__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3138:2: rule__NsMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6489);
            rule__NsMapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__1__Impl"


    // $ANTLR start "rule__NsMapping__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3148:1: rule__NsMapping__Group__2 : rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 ;
    public final void rule__NsMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3152:1: ( rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3153:2: rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26519);
            rule__NsMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26522);
            rule__NsMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__2"


    // $ANTLR start "rule__NsMapping__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3160:1: rule__NsMapping__Group__2__Impl : ( '=' ) ;
    public final void rule__NsMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3164:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3165:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3165:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3166:1: '='
            {
             before(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 
            match(input,71,FOLLOW_71_in_rule__NsMapping__Group__2__Impl6550); 
             after(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__2__Impl"


    // $ANTLR start "rule__NsMapping__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3179:1: rule__NsMapping__Group__3 : rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 ;
    public final void rule__NsMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3183:1: ( rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3184:2: rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36581);
            rule__NsMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36584);
            rule__NsMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__3"


    // $ANTLR start "rule__NsMapping__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3191:1: rule__NsMapping__Group__3__Impl : ( ( rule__NsMapping__UriAssignment_3 ) ) ;
    public final void rule__NsMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3195:1: ( ( ( rule__NsMapping__UriAssignment_3 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3196:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3196:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3197:1: ( rule__NsMapping__UriAssignment_3 )
            {
             before(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3198:1: ( rule__NsMapping__UriAssignment_3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3198:2: rule__NsMapping__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6611);
            rule__NsMapping__UriAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__3__Impl"


    // $ANTLR start "rule__NsMapping__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3208:1: rule__NsMapping__Group__4 : rule__NsMapping__Group__4__Impl ;
    public final void rule__NsMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3212:1: ( rule__NsMapping__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3213:2: rule__NsMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46641);
            rule__NsMapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__4"


    // $ANTLR start "rule__NsMapping__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3219:1: rule__NsMapping__Group__4__Impl : ( '>' ) ;
    public final void rule__NsMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3223:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3224:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3224:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3225:1: '>'
            {
             before(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 
            match(input,66,FOLLOW_66_in_rule__NsMapping__Group__4__Impl6669); 
             after(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__4__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3249:1: rule__NodeTypeDefinition__UnorderedGroup_4 : ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3254:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3255:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3255:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 >=42 && LA35_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt35=1;
            }
            else if ( (LA35_0==27|| LA35_0 >=40 && LA35_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt35=1;
            }
            else if ( (LA35_0==30|| LA35_0 >=38 && LA35_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 >=34 && LA35_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt35=1;
            }
            else if ( LA35_0 >=36 && LA35_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt35=1;
            }
            else if ( LA35_0 >=32 && LA35_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3255:2: rule__NodeTypeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46711);
                    rule__NodeTypeDefinition__UnorderedGroup_4__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3265:1: rule__NodeTypeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) ) ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3270:1: ( ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3271:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3271:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) )
            int alt36=6;
            int LA36_0 = input.LA(1);

            if ( LA36_0 >=42 && LA36_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt36=1;
            }
            else if ( (LA36_0==27|| LA36_0 >=40 && LA36_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt36=2;
            }
            else if ( (LA36_0==30|| LA36_0 >=38 && LA36_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt36=3;
            }
            else if ( LA36_0 >=34 && LA36_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt36=4;
            }
            else if ( LA36_0 >=36 && LA36_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt36=5;
            }
            else if ( LA36_0 >=32 && LA36_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt36=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3273:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3273:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3274:5: {...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3274:115: ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3275:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3281:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3283:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3284:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3284:8: rule__NodeTypeDefinition__OrderableAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6798);
                    rule__NodeTypeDefinition__OrderableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getOrderableAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3290:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3290:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3291:5: {...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3291:115: ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3292:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3298:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3300:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getMixinAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3301:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3301:8: rule__NodeTypeDefinition__MixinAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6889);
                    rule__NodeTypeDefinition__MixinAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getMixinAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3307:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3307:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3308:5: {...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3308:115: ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3309:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3315:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3317:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3318:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3318:8: rule__NodeTypeDefinition__AbstractAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6980);
                    rule__NodeTypeDefinition__AbstractAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAssignment_4_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3324:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3324:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3325:5: {...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3325:115: ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3326:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3332:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3334:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3335:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3335:8: rule__NodeTypeDefinition__QueryableAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7071);
                    rule__NodeTypeDefinition__QueryableAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getQueryableAssignment_4_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3341:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3341:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3342:5: {...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3342:115: ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3343:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3349:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3351:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3352:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3352:8: rule__NodeTypeDefinition__NotqueryableAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7162);
                    rule__NodeTypeDefinition__NotqueryableAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableAssignment_4_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3358:4: ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3358:4: ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3359:5: {...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3359:115: ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3360:6: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3366:6: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3368:7: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3369:7: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3369:8: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7253);
                    rule__NodeTypeDefinition__PrimaryItemAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3384:1: rule__NodeTypeDefinition__UnorderedGroup_4__0 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3388:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3389:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07312);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3390:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 >=42 && LA37_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt37=1;
            }
            else if ( (LA37_0==27|| LA37_0 >=40 && LA37_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt37=1;
            }
            else if ( (LA37_0==30|| LA37_0 >=38 && LA37_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt37=1;
            }
            else if ( LA37_0 >=34 && LA37_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt37=1;
            }
            else if ( LA37_0 >=36 && LA37_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt37=1;
            }
            else if ( LA37_0 >=32 && LA37_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3390:2: rule__NodeTypeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07315);
                    rule__NodeTypeDefinition__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3397:1: rule__NodeTypeDefinition__UnorderedGroup_4__1 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3401:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3402:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17340);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3403:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 >=42 && LA38_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt38=1;
            }
            else if ( (LA38_0==27|| LA38_0 >=40 && LA38_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt38=1;
            }
            else if ( (LA38_0==30|| LA38_0 >=38 && LA38_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 >=34 && LA38_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 >=36 && LA38_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 >=32 && LA38_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3403:2: rule__NodeTypeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17343);
                    rule__NodeTypeDefinition__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3410:1: rule__NodeTypeDefinition__UnorderedGroup_4__2 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3414:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3415:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27368);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3416:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >=42 && LA39_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt39=1;
            }
            else if ( (LA39_0==27|| LA39_0 >=40 && LA39_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt39=1;
            }
            else if ( (LA39_0==30|| LA39_0 >=38 && LA39_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 >=34 && LA39_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 >=36 && LA39_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 >=32 && LA39_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3416:2: rule__NodeTypeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27371);
                    rule__NodeTypeDefinition__UnorderedGroup_4__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3423:1: rule__NodeTypeDefinition__UnorderedGroup_4__3 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3427:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3428:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37396);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3429:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 >=42 && LA40_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt40=1;
            }
            else if ( (LA40_0==27|| LA40_0 >=40 && LA40_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt40=1;
            }
            else if ( (LA40_0==30|| LA40_0 >=38 && LA40_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 >=34 && LA40_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 >=36 && LA40_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt40=1;
            }
            else if ( LA40_0 >=32 && LA40_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3429:2: rule__NodeTypeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37399);
                    rule__NodeTypeDefinition__UnorderedGroup_4__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3436:1: rule__NodeTypeDefinition__UnorderedGroup_4__4 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3440:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3441:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47424);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3442:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 >=42 && LA41_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt41=1;
            }
            else if ( (LA41_0==27|| LA41_0 >=40 && LA41_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt41=1;
            }
            else if ( (LA41_0==30|| LA41_0 >=38 && LA41_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 >=34 && LA41_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 >=36 && LA41_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt41=1;
            }
            else if ( LA41_0 >=32 && LA41_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3442:2: rule__NodeTypeDefinition__UnorderedGroup_4__5
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47427);
                    rule__NodeTypeDefinition__UnorderedGroup_4__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__4"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3449:1: rule__NodeTypeDefinition__UnorderedGroup_4__5 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3453:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3454:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57452);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__5"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3473:1: rule__NodeDefinition__UnorderedGroup_4 : ( rule__NodeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3478:1: ( ( rule__NodeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3479:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3479:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 >=28 && LA42_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 >=25 && LA42_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 >=22 && LA42_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 >=45 && LA42_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 >=12 && LA42_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3479:2: rule__NodeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47488);
                    rule__NodeDefinition__UnorderedGroup_4__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3489:1: rule__NodeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) ;
    public final void rule__NodeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3494:1: ( ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3495:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3495:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            int alt43=5;
            int LA43_0 = input.LA(1);

            if ( LA43_0 >=28 && LA43_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >=25 && LA43_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt43=2;
            }
            else if ( LA43_0 >=22 && LA43_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt43=3;
            }
            else if ( LA43_0 >=45 && LA43_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt43=4;
            }
            else if ( LA43_0 >=12 && LA43_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt43=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3497:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3497:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3498:5: {...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3498:111: ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3499:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3505:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3507:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3508:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3508:8: rule__NodeDefinition__AutocreatedAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7575);
                    rule__NodeDefinition__AutocreatedAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getAutocreatedAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3514:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3514:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3515:5: {...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3515:111: ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3516:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3522:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3524:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getManadatoryAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3525:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3525:8: rule__NodeDefinition__ManadatoryAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7666);
                    rule__NodeDefinition__ManadatoryAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getManadatoryAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3531:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3531:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3532:5: {...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3532:111: ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3533:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3539:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3541:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getProtectedAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3542:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3542:8: rule__NodeDefinition__ProtectedAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7757);
                    rule__NodeDefinition__ProtectedAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getProtectedAssignment_4_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3548:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3548:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3549:5: {...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3549:111: ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3550:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3556:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3558:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3559:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3559:8: rule__NodeDefinition__OnParentVersionAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7848);
                    rule__NodeDefinition__OnParentVersionAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getOnParentVersionAssignment_4_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3565:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3565:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3566:5: {...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3566:111: ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3567:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3573:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3575:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3576:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3576:8: rule__NodeDefinition__SameNameSiblingsAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7939);
                    rule__NodeDefinition__SameNameSiblingsAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsAssignment_4_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3591:1: rule__NodeDefinition__UnorderedGroup_4__0 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3595:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3596:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__07998);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3597:2: ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 >=28 && LA44_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 >=25 && LA44_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 >=22 && LA44_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt44=1;
            }
            else if ( LA44_0 >=45 && LA44_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt44=1;
            }
            else if ( LA44_0 >=12 && LA44_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3597:2: rule__NodeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__08001);
                    rule__NodeDefinition__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3604:1: rule__NodeDefinition__UnorderedGroup_4__1 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3608:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3609:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18026);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3610:2: ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 >=28 && LA45_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 >=25 && LA45_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 >=22 && LA45_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 >=45 && LA45_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 >=12 && LA45_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3610:2: rule__NodeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18029);
                    rule__NodeDefinition__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3617:1: rule__NodeDefinition__UnorderedGroup_4__2 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3621:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3622:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28054);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3623:2: ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 >=28 && LA46_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 >=25 && LA46_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 >=22 && LA46_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 >=45 && LA46_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 >=12 && LA46_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3623:2: rule__NodeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28057);
                    rule__NodeDefinition__UnorderedGroup_4__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3630:1: rule__NodeDefinition__UnorderedGroup_4__3 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3634:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3635:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38082);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3636:2: ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 >=28 && LA47_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 >=25 && LA47_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 >=22 && LA47_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 >=45 && LA47_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 >=12 && LA47_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3636:2: rule__NodeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38085);
                    rule__NodeDefinition__UnorderedGroup_4__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3643:1: rule__NodeDefinition__UnorderedGroup_4__4 : rule__NodeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3647:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3648:2: rule__NodeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48110);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__4"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3665:1: rule__PropertyDefinition__UnorderedGroup_5 : ( rule__PropertyDefinition__UnorderedGroup_5__0 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3670:1: ( ( rule__PropertyDefinition__UnorderedGroup_5__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3671:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3671:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3671:2: rule__PropertyDefinition__UnorderedGroup_5__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58144);
                    rule__PropertyDefinition__UnorderedGroup_5__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3681:1: rule__PropertyDefinition__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3686:1: ( ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3687:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3687:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            int alt49=9;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3689:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3689:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3690:5: {...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3690:115: ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3691:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3697:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3699:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3700:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3700:8: rule__PropertyDefinition__AutocreatedAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8231);
                    rule__PropertyDefinition__AutocreatedAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAssignment_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3706:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3706:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3707:5: {...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3707:115: ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3708:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3714:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3716:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMandatoryAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3717:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3717:8: rule__PropertyDefinition__MandatoryAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8322);
                    rule__PropertyDefinition__MandatoryAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getMandatoryAssignment_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3723:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3723:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3724:5: {...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3724:115: ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3725:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3731:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3733:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getProtectedAssignment_5_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3734:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3734:8: rule__PropertyDefinition__ProtectedAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8413);
                    rule__PropertyDefinition__ProtectedAssignment_5_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getProtectedAssignment_5_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3740:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3740:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3741:5: {...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3741:115: ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3742:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3748:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3750:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionAssignment_5_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3751:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3751:8: rule__PropertyDefinition__OnParentVersionAssignment_5_3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8504);
                    rule__PropertyDefinition__OnParentVersionAssignment_5_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionAssignment_5_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3757:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3757:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3758:5: {...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3758:115: ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3759:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3765:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3767:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMultipleAssignment_5_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3768:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3768:8: rule__PropertyDefinition__MultipleAssignment_5_4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8595);
                    rule__PropertyDefinition__MultipleAssignment_5_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getMultipleAssignment_5_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3774:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3774:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3775:5: {...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3775:115: ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3776:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3782:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3784:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsAssignment_5_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3785:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3785:8: rule__PropertyDefinition__QueryOpsAssignment_5_5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8686);
                    rule__PropertyDefinition__QueryOpsAssignment_5_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getQueryOpsAssignment_5_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3791:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3791:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3792:5: {...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3792:115: ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3793:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3799:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3801:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextAssignment_5_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3802:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3802:8: rule__PropertyDefinition__NoFullTextAssignment_5_6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8777);
                    rule__PropertyDefinition__NoFullTextAssignment_5_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNoFullTextAssignment_5_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3808:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3808:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3809:5: {...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3809:115: ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3810:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3816:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3818:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderAssignment_5_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3819:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3819:8: rule__PropertyDefinition__NoQueryOrderAssignment_5_7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8868);
                    rule__PropertyDefinition__NoQueryOrderAssignment_5_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderAssignment_5_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3825:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3825:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3826:5: {...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3826:115: ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3827:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3833:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3835:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getPrimaryAssignment_5_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3836:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3836:8: rule__PropertyDefinition__PrimaryAssignment_5_8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8959);
                    rule__PropertyDefinition__PrimaryAssignment_5_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getPrimaryAssignment_5_8()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3851:1: rule__PropertyDefinition__UnorderedGroup_5__0 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3855:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3856:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09018);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3857:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3857:2: rule__PropertyDefinition__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09021);
                    rule__PropertyDefinition__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__0"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3864:1: rule__PropertyDefinition__UnorderedGroup_5__1 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3868:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3869:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19046);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3870:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3870:2: rule__PropertyDefinition__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19049);
                    rule__PropertyDefinition__UnorderedGroup_5__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__1"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3877:1: rule__PropertyDefinition__UnorderedGroup_5__2 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3881:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3882:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29074);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3883:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3883:2: rule__PropertyDefinition__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29077);
                    rule__PropertyDefinition__UnorderedGroup_5__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__2"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3890:1: rule__PropertyDefinition__UnorderedGroup_5__3 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3894:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3895:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39102);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3896:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3896:2: rule__PropertyDefinition__UnorderedGroup_5__4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39105);
                    rule__PropertyDefinition__UnorderedGroup_5__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__3"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3903:1: rule__PropertyDefinition__UnorderedGroup_5__4 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3907:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3908:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49130);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3909:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3909:2: rule__PropertyDefinition__UnorderedGroup_5__5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49133);
                    rule__PropertyDefinition__UnorderedGroup_5__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__4"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3916:1: rule__PropertyDefinition__UnorderedGroup_5__5 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3920:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3921:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59158);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3922:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3922:2: rule__PropertyDefinition__UnorderedGroup_5__6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59161);
                    rule__PropertyDefinition__UnorderedGroup_5__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__5"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3929:1: rule__PropertyDefinition__UnorderedGroup_5__6 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3933:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3934:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69186);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3935:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3935:2: rule__PropertyDefinition__UnorderedGroup_5__7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69189);
                    rule__PropertyDefinition__UnorderedGroup_5__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__6"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__7"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3942:1: rule__PropertyDefinition__UnorderedGroup_5__7 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3946:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3947:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79214);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3948:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3948:2: rule__PropertyDefinition__UnorderedGroup_5__8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79217);
                    rule__PropertyDefinition__UnorderedGroup_5__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__7"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__8"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3955:1: rule__PropertyDefinition__UnorderedGroup_5__8 : rule__PropertyDefinition__UnorderedGroup_5__Impl ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3959:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3960:2: rule__PropertyDefinition__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89242);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__8"


    // $ANTLR start "rule__Model__NamespacesAssignment_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3985:1: rule__Model__NamespacesAssignment_0 : ( ruleNsMapping ) ;
    public final void rule__Model__NamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3989:1: ( ( ruleNsMapping ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3990:1: ( ruleNsMapping )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3990:1: ( ruleNsMapping )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3991:1: ruleNsMapping
            {
             before(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09288);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NamespacesAssignment_0"


    // $ANTLR start "rule__Model__NodeTypesAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4000:1: rule__Model__NodeTypesAssignment_1 : ( ruleNodeTypeDefinition ) ;
    public final void rule__Model__NodeTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4004:1: ( ( ruleNodeTypeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4005:1: ( ruleNodeTypeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4005:1: ( ruleNodeTypeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4006:1: ruleNodeTypeDefinition
            {
             before(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19319);
            ruleNodeTypeDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NodeTypesAssignment_1"


    // $ANTLR start "rule__NodeTypeDefinition__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4015:1: rule__NodeTypeDefinition__NameAssignment_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4019:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4020:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4020:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4021:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19350);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4030:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4034:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4035:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4035:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4036:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4037:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4038:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19385);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4049:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4053:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4054:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4054:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4055:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_2_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4056:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4057:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19424);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1"


    // $ANTLR start "rule__NodeTypeDefinition__OrderableAssignment_4_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4068:1: rule__NodeTypeDefinition__OrderableAssignment_4_0 : ( ruleOrderable ) ;
    public final void rule__NodeTypeDefinition__OrderableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4072:1: ( ( ruleOrderable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4073:1: ( ruleOrderable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4073:1: ( ruleOrderable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4074:1: ruleOrderable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09459);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__OrderableAssignment_4_0"


    // $ANTLR start "rule__NodeTypeDefinition__MixinAssignment_4_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4083:1: rule__NodeTypeDefinition__MixinAssignment_4_1 : ( ruleMixin ) ;
    public final void rule__NodeTypeDefinition__MixinAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4087:1: ( ( ruleMixin ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4088:1: ( ruleMixin )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4088:1: ( ruleMixin )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4089:1: ruleMixin
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19490);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__MixinAssignment_4_1"


    // $ANTLR start "rule__NodeTypeDefinition__AbstractAssignment_4_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4098:1: rule__NodeTypeDefinition__AbstractAssignment_4_2 : ( ruleAbstract ) ;
    public final void rule__NodeTypeDefinition__AbstractAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4102:1: ( ( ruleAbstract ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4103:1: ( ruleAbstract )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4103:1: ( ruleAbstract )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4104:1: ruleAbstract
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29521);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__AbstractAssignment_4_2"


    // $ANTLR start "rule__NodeTypeDefinition__QueryableAssignment_4_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4113:1: rule__NodeTypeDefinition__QueryableAssignment_4_3 : ( ruleQueryable ) ;
    public final void rule__NodeTypeDefinition__QueryableAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4117:1: ( ( ruleQueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4118:1: ( ruleQueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4118:1: ( ruleQueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4119:1: ruleQueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39552);
            ruleQueryable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__QueryableAssignment_4_3"


    // $ANTLR start "rule__NodeTypeDefinition__NotqueryableAssignment_4_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4128:1: rule__NodeTypeDefinition__NotqueryableAssignment_4_4 : ( ruleNotqueryable ) ;
    public final void rule__NodeTypeDefinition__NotqueryableAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4132:1: ( ( ruleNotqueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4133:1: ( ruleNotqueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4133:1: ( ruleNotqueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4134:1: ruleNotqueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49583);
            ruleNotqueryable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__NotqueryableAssignment_4_4"


    // $ANTLR start "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4143:1: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 : ( rulePrimaryItem ) ;
    public final void rule__NodeTypeDefinition__PrimaryItemAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4147:1: ( ( rulePrimaryItem ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4148:1: ( rulePrimaryItem )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4148:1: ( rulePrimaryItem )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4149:1: rulePrimaryItem
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_59614);
            rulePrimaryItem();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4158:1: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 : ( rulePropertyDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4162:1: ( ( rulePropertyDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4163:1: ( rulePropertyDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4163:1: ( rulePropertyDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4164:1: rulePropertyDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09645);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4173:1: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 : ( ruleNodeDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4177:1: ( ( ruleNodeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4178:1: ( ruleNodeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4178:1: ( ruleNodeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4179:1: ruleNodeDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19676);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4188:1: rule__NodeDefinition__NameAssignment_1_0 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4192:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4193:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4193:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4194:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09707);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__NameAssignment_1_0"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4203:1: rule__NodeDefinition__NameAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__NodeDefinition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4207:1: ( ( ( '*' ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4208:1: ( ( '*' ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4208:1: ( ( '*' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4209:1: ( '*' )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4210:1: ( '*' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4211:1: '*'
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            match(input,13,FOLLOW_13_in_rule__NodeDefinition__NameAssignment_1_19743); 
             after(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__NameAssignment_1_1"


    // $ANTLR start "rule__NodeDefinition__RequiredTypesAssignment_2_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4226:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_0 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4230:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4231:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4231:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4232:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_0_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4233:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4234:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_0_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09786);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__RequiredTypesAssignment_2_1_0"


    // $ANTLR start "rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4245:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4249:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4250:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4250:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4251:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_1_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4252:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4253:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_1_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19825);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_1_1_0_1()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1"


    // $ANTLR start "rule__NodeDefinition__DefaultTypeAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4264:1: rule__NodeDefinition__DefaultTypeAssignment_3_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__DefaultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4268:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4269:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4269:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4270:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionCrossReference_3_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4271:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4272:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19864);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__DefaultTypeAssignment_3_1"


    // $ANTLR start "rule__NodeDefinition__AutocreatedAssignment_4_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4283:1: rule__NodeDefinition__AutocreatedAssignment_4_0 : ( ruleAutocreated ) ;
    public final void rule__NodeDefinition__AutocreatedAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4287:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4288:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4288:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4289:1: ruleAutocreated
            {
             before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09899);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__AutocreatedAssignment_4_0"


    // $ANTLR start "rule__NodeDefinition__ManadatoryAssignment_4_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4298:1: rule__NodeDefinition__ManadatoryAssignment_4_1 : ( ruleMandatory ) ;
    public final void rule__NodeDefinition__ManadatoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4302:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4303:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4303:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4304:1: ruleMandatory
            {
             before(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19930);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__ManadatoryAssignment_4_1"


    // $ANTLR start "rule__NodeDefinition__ProtectedAssignment_4_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4313:1: rule__NodeDefinition__ProtectedAssignment_4_2 : ( ruleProtected ) ;
    public final void rule__NodeDefinition__ProtectedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4317:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4318:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4318:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4319:1: ruleProtected
            {
             before(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29961);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__ProtectedAssignment_4_2"


    // $ANTLR start "rule__NodeDefinition__OnParentVersionAssignment_4_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4328:1: rule__NodeDefinition__OnParentVersionAssignment_4_3 : ( ruleOpv ) ;
    public final void rule__NodeDefinition__OnParentVersionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4332:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4333:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4333:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4334:1: ruleOpv
            {
             before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_39992);
            ruleOpv();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__OnParentVersionAssignment_4_3"


    // $ANTLR start "rule__NodeDefinition__SameNameSiblingsAssignment_4_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4343:1: rule__NodeDefinition__SameNameSiblingsAssignment_4_4 : ( ruleSns ) ;
    public final void rule__NodeDefinition__SameNameSiblingsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4347:1: ( ( ruleSns ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4348:1: ( ruleSns )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4348:1: ( ruleSns )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4349:1: ruleSns
            {
             before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410023);
            ruleSns();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__SameNameSiblingsAssignment_4_4"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4358:1: rule__PropertyDefinition__NameAssignment_2_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4362:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4363:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4363:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4364:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010054);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2_0"


    // $ANTLR start "rule__PropertyDefinition__TypeAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4373:1: rule__PropertyDefinition__TypeAssignment_3_1 : ( rulePropertyType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4377:1: ( ( rulePropertyType ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4378:1: ( rulePropertyType )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4378:1: ( rulePropertyType )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4379:1: rulePropertyType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110085);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__TypeAssignment_3_1"


    // $ANTLR start "rule__PropertyDefinition__DefaultValuesAssignment_4_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4388:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4392:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4393:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4393:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4394:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010116);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DefaultValuesAssignment_4_1_0"


    // $ANTLR start "rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4403:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4407:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4408:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4408:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4409:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110147);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1"


    // $ANTLR start "rule__PropertyDefinition__AutocreatedAssignment_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4418:1: rule__PropertyDefinition__AutocreatedAssignment_5_0 : ( ruleAutocreated ) ;
    public final void rule__PropertyDefinition__AutocreatedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4422:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4423:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4423:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4424:1: ruleAutocreated
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010178);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__AutocreatedAssignment_5_0"


    // $ANTLR start "rule__PropertyDefinition__MandatoryAssignment_5_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4433:1: rule__PropertyDefinition__MandatoryAssignment_5_1 : ( ruleMandatory ) ;
    public final void rule__PropertyDefinition__MandatoryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4437:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4438:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4438:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4439:1: ruleMandatory
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110209);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__MandatoryAssignment_5_1"


    // $ANTLR start "rule__PropertyDefinition__ProtectedAssignment_5_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4448:1: rule__PropertyDefinition__ProtectedAssignment_5_2 : ( ruleProtected ) ;
    public final void rule__PropertyDefinition__ProtectedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4452:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4453:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4453:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4454:1: ruleProtected
            {
             before(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210240);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__ProtectedAssignment_5_2"


    // $ANTLR start "rule__PropertyDefinition__OnParentVersionAssignment_5_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4463:1: rule__PropertyDefinition__OnParentVersionAssignment_5_3 : ( ruleOpv ) ;
    public final void rule__PropertyDefinition__OnParentVersionAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4467:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4468:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4468:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4469:1: ruleOpv
            {
             before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310271);
            ruleOpv();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__OnParentVersionAssignment_5_3"


    // $ANTLR start "rule__PropertyDefinition__MultipleAssignment_5_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4478:1: rule__PropertyDefinition__MultipleAssignment_5_4 : ( ruleMultiple ) ;
    public final void rule__PropertyDefinition__MultipleAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4482:1: ( ( ruleMultiple ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4483:1: ( ruleMultiple )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4483:1: ( ruleMultiple )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4484:1: ruleMultiple
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410302);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__MultipleAssignment_5_4"


    // $ANTLR start "rule__PropertyDefinition__QueryOpsAssignment_5_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4493:1: rule__PropertyDefinition__QueryOpsAssignment_5_5 : ( ruleQueryOps ) ;
    public final void rule__PropertyDefinition__QueryOpsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4497:1: ( ( ruleQueryOps ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4498:1: ( ruleQueryOps )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4498:1: ( ruleQueryOps )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4499:1: ruleQueryOps
            {
             before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510333);
            ruleQueryOps();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__QueryOpsAssignment_5_5"


    // $ANTLR start "rule__PropertyDefinition__NoFullTextAssignment_5_6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4508:1: rule__PropertyDefinition__NoFullTextAssignment_5_6 : ( ruleNoFullText ) ;
    public final void rule__PropertyDefinition__NoFullTextAssignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4512:1: ( ( ruleNoFullText ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4513:1: ( ruleNoFullText )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4513:1: ( ruleNoFullText )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4514:1: ruleNoFullText
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            pushFollow(FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610364);
            ruleNoFullText();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NoFullTextAssignment_5_6"


    // $ANTLR start "rule__PropertyDefinition__NoQueryOrderAssignment_5_7"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4523:1: rule__PropertyDefinition__NoQueryOrderAssignment_5_7 : ( ruleNoQueryOrder ) ;
    public final void rule__PropertyDefinition__NoQueryOrderAssignment_5_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4527:1: ( ( ruleNoQueryOrder ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4528:1: ( ruleNoQueryOrder )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4528:1: ( ruleNoQueryOrder )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4529:1: ruleNoQueryOrder
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710395);
            ruleNoQueryOrder();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NoQueryOrderAssignment_5_7"


    // $ANTLR start "rule__PropertyDefinition__PrimaryAssignment_5_8"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4538:1: rule__PropertyDefinition__PrimaryAssignment_5_8 : ( rulePrimary ) ;
    public final void rule__PropertyDefinition__PrimaryAssignment_5_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4542:1: ( ( rulePrimary ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4543:1: ( rulePrimary )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4543:1: ( rulePrimary )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4544:1: rulePrimary
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810426);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__PrimaryAssignment_5_8"


    // $ANTLR start "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4553:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4557:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4558:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4558:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4559:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010457);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0"


    // $ANTLR start "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4568:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4572:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4573:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4573:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4574:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110488);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1"


    // $ANTLR start "rule__NsMapping__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4583:1: rule__NsMapping__NameAssignment_1 : ( rulePrefix ) ;
    public final void rule__NsMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4587:1: ( ( rulePrefix ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4588:1: ( rulePrefix )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4588:1: ( rulePrefix )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4589:1: rulePrefix
            {
             before(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110519);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__NameAssignment_1"


    // $ANTLR start "rule__NsMapping__UriAssignment_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4598:1: rule__NsMapping__UriAssignment_3 : ( ruleUri ) ;
    public final void rule__NsMapping__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4602:1: ( ( ruleUri ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4603:1: ( ruleUri )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4603:1: ( ruleUri )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4604:1: ruleUri
            {
             before(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310550);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__UriAssignment_3"

    // Delegated rules


    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA48_eotS =
        "\13\uffff";
    static final String DFA48_eofS =
        "\1\12\12\uffff";
    static final String DFA48_minS =
        "\1\15\12\uffff";
    static final String DFA48_maxS =
        "\1\111\12\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA48_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA48_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3671:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_0 = input.LA(1);

                         
                        int index48_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA48_0 >=28 && LA48_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA48_0 >=25 && LA48_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA48_0 >=22 && LA48_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA48_0 >=45 && LA48_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA48_0 >=13 && LA48_0<=14 ||LA48_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA48_0 >=19 && LA48_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA48_0 >=17 && LA48_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA48_0 >=15 && LA48_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA48_0 >=31 && LA48_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA48_0==EOF||LA48_0==64||LA48_0==68||(LA48_0>=72 && LA48_0<=73)) ) {s = 10;}

                         
                        input.seek(index48_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA49_eotS =
        "\12\uffff";
    static final String DFA49_eofS =
        "\12\uffff";
    static final String DFA49_minS =
        "\1\15\11\uffff";
    static final String DFA49_maxS =
        "\1\62\11\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA49_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4",
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3687:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA49_0 >=28 && LA49_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA49_0 >=25 && LA49_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA49_0 >=22 && LA49_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA49_0 >=45 && LA49_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA49_0 >=13 && LA49_0<=14 ||LA49_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA49_0 >=19 && LA49_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA49_0 >=17 && LA49_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA49_0 >=15 && LA49_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA49_0 >=31 && LA49_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\13\uffff";
    static final String DFA50_eofS =
        "\1\12\12\uffff";
    static final String DFA50_minS =
        "\1\15\12\uffff";
    static final String DFA50_maxS =
        "\1\111\12\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA50_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "3857:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA50_0 >=28 && LA50_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA50_0 >=25 && LA50_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA50_0 >=22 && LA50_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA50_0 >=45 && LA50_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA50_0 >=13 && LA50_0<=14 ||LA50_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA50_0 >=19 && LA50_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA50_0 >=17 && LA50_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA50_0 >=15 && LA50_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA50_0 >=31 && LA50_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA50_0==EOF||LA50_0==64||LA50_0==68||(LA50_0>=72 && LA50_0<=73)) ) {s = 10;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\13\uffff";
    static final String DFA51_eofS =
        "\1\12\12\uffff";
    static final String DFA51_minS =
        "\1\15\12\uffff";
    static final String DFA51_maxS =
        "\1\111\12\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA51_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3870:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA51_0 >=28 && LA51_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA51_0 >=25 && LA51_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA51_0 >=22 && LA51_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA51_0 >=45 && LA51_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA51_0 >=13 && LA51_0<=14 ||LA51_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA51_0 >=19 && LA51_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA51_0 >=17 && LA51_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA51_0 >=15 && LA51_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA51_0 >=31 && LA51_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA51_0==EOF||LA51_0==64||LA51_0==68||(LA51_0>=72 && LA51_0<=73)) ) {s = 10;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\1\12\12\uffff";
    static final String DFA52_minS =
        "\1\15\12\uffff";
    static final String DFA52_maxS =
        "\1\111\12\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA52_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3883:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA52_0 >=28 && LA52_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA52_0 >=25 && LA52_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA52_0 >=22 && LA52_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA52_0 >=45 && LA52_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA52_0 >=13 && LA52_0<=14 ||LA52_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA52_0 >=19 && LA52_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA52_0 >=17 && LA52_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA52_0 >=15 && LA52_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA52_0 >=31 && LA52_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA52_0==EOF||LA52_0==64||LA52_0==68||(LA52_0>=72 && LA52_0<=73)) ) {s = 10;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\13\uffff";
    static final String DFA53_eofS =
        "\1\12\12\uffff";
    static final String DFA53_minS =
        "\1\15\12\uffff";
    static final String DFA53_maxS =
        "\1\111\12\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA53_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3896:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA53_0 >=28 && LA53_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA53_0 >=25 && LA53_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA53_0 >=22 && LA53_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA53_0 >=45 && LA53_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA53_0 >=13 && LA53_0<=14 ||LA53_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA53_0 >=19 && LA53_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA53_0 >=17 && LA53_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA53_0 >=15 && LA53_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA53_0 >=31 && LA53_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA53_0==EOF||LA53_0==64||LA53_0==68||(LA53_0>=72 && LA53_0<=73)) ) {s = 10;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\13\uffff";
    static final String DFA54_eofS =
        "\1\12\12\uffff";
    static final String DFA54_minS =
        "\1\15\12\uffff";
    static final String DFA54_maxS =
        "\1\111\12\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA54_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA54_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3909:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_0 >=28 && LA54_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA54_0 >=25 && LA54_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA54_0 >=22 && LA54_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA54_0 >=45 && LA54_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA54_0 >=13 && LA54_0<=14 ||LA54_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA54_0 >=19 && LA54_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA54_0 >=17 && LA54_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA54_0 >=15 && LA54_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA54_0 >=31 && LA54_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA54_0==EOF||LA54_0==64||LA54_0==68||(LA54_0>=72 && LA54_0<=73)) ) {s = 10;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\13\uffff";
    static final String DFA55_eofS =
        "\1\12\12\uffff";
    static final String DFA55_minS =
        "\1\15\12\uffff";
    static final String DFA55_maxS =
        "\1\111\12\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA55_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA55_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3922:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA55_0 >=28 && LA55_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA55_0 >=25 && LA55_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA55_0 >=22 && LA55_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA55_0 >=45 && LA55_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA55_0 >=13 && LA55_0<=14 ||LA55_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA55_0 >=19 && LA55_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA55_0 >=17 && LA55_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA55_0 >=15 && LA55_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA55_0 >=31 && LA55_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA55_0==EOF||LA55_0==64||LA55_0==68||(LA55_0>=72 && LA55_0<=73)) ) {s = 10;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\13\uffff";
    static final String DFA56_eofS =
        "\1\12\12\uffff";
    static final String DFA56_minS =
        "\1\15\12\uffff";
    static final String DFA56_maxS =
        "\1\111\12\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA56_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3935:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA56_0 >=28 && LA56_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA56_0 >=25 && LA56_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA56_0 >=22 && LA56_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA56_0 >=45 && LA56_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA56_0 >=13 && LA56_0<=14 ||LA56_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA56_0 >=19 && LA56_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA56_0 >=17 && LA56_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA56_0 >=15 && LA56_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA56_0 >=31 && LA56_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA56_0==EOF||LA56_0==64||LA56_0==68||(LA56_0>=72 && LA56_0<=73)) ) {s = 10;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\13\uffff";
    static final String DFA57_eofS =
        "\1\12\12\uffff";
    static final String DFA57_minS =
        "\1\15\12\uffff";
    static final String DFA57_maxS =
        "\1\111\12\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA57_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3948:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA57_0 >=28 && LA57_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA57_0 >=25 && LA57_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA57_0 >=22 && LA57_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA57_0 >=45 && LA57_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA57_0 >=13 && LA57_0<=14 ||LA57_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA57_0 >=19 && LA57_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA57_0 >=17 && LA57_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA57_0 >=15 && LA57_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA57_0 >=31 && LA57_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA57_0==EOF||LA57_0==64||LA57_0==68||(LA57_0>=72 && LA57_0<=73)) ) {s = 10;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__0_in_ruleNodeTypeDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sns__Alternatives_in_ruleSns275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Alternatives_in_ruleNoQueryOrder395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Alternatives_in_ruleNoFullText455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Alternatives_in_ruleMultiple575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Alternatives_in_ruleProtected635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Alternatives_in_ruleAutocreated755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_ruleXiD1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Alternatives_in_ruleOpv1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sns__Alternatives1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sns__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sns__Alternatives1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyDefinition__Alternatives_21827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NoQueryOrder__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NoQueryOrder__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NoFullText__Alternatives1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NoFullText__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QueryOps__Alternatives_01972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QueryOps__Alternatives_01992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiple__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiple__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiple__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Protected__Alternatives2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Protected__Alternatives2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Protected__Alternatives2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mandatory__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mandatory__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mandatory__Alternatives2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Autocreated__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Autocreated__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Autocreated__Alternatives2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Primary__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PrimaryItem__Alternatives_02382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PrimaryItem__Alternatives_02402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Queryable__Alternatives2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Queryable__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Notqueryable__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Notqueryable__Alternatives2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Abstract__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Abstract__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Abstract__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Mixin__Alternatives2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Mixin__Alternatives2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mixin__Alternatives2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Orderable__Alternatives2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Orderable__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Orderable__Alternatives2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Opv__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Opv__Alternatives2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Opv__Alternatives2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Opv__Alternatives2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Opv__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Opv__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PropertyType__Alternatives2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PropertyType__Alternatives2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PropertyType__Alternatives3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__PropertyType__Alternatives3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PropertyType__Alternatives3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PropertyType__Alternatives3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PropertyType__Alternatives3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PropertyType__Alternatives3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PropertyType__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PropertyType__Alternatives3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PropertyType__Alternatives3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PropertyType__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__PropertyType__Alternatives3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03247 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23369 = new BitSet(new long[]{0x00001FFF48000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33431 = new BitSet(new long[]{0x00001FFF48000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03622 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03808 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__03931 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__03934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__13993 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__13996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24053 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34114 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04242 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04551 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04674 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14858 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24920 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34980 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45041 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05234 = new BitSet(new long[]{0xFFF8000000000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05666 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05789 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__05912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__05915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__15972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl5999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06034 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06157 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__06277 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__06280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__16337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PrimaryItem__Group__1__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06397 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__NsMapping__Group__0__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26519 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NsMapping__Group__2__Impl6550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NsMapping__Group__4__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07312 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17340 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27368 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37396 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47424 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__07998 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__08001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18026 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28054 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38082 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09018 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19046 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29074 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39102 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49130 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59158 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69186 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79214 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_59614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeDefinition__NameAssignment_1_19743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_39992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310550 = new BitSet(new long[]{0x0000000000000002L});

}
