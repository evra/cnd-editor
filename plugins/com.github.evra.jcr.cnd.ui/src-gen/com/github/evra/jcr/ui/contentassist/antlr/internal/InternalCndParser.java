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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primaryitem'", "'!'", "'sns'", "'*'", "'multiple'", "'noqueryorder'", "'nqord'", "'nofulltext'", "'nof'", "'queryops'", "'qop'", "'mul'", "'protected'", "'pro'", "'p'", "'mandatory'", "'man'", "'m'", "'autocreated'", "'aut'", "'a'", "'primary'", "'query'", "'q'", "'noquery'", "'nq'", "'abstract'", "'abs'", "'mixin'", "'mix'", "'orderable'", "'ord'", "'o'", "'COPY'", "'VERSION'", "'INITIALIZE'", "'COMPUTE'", "'IGNORE'", "'ABORT'", "'UNDEFINED'", "'STRING'", "'BINARY'", "'LONG'", "'DOUBLE'", "'DATE'", "'BOOLEAN'", "'NAME'", "'PATH'", "'REFERENCE'", "'WEAKREFERENCE'", "'URI'", "'DECIMAL'", "'['", "']'", "'>'", "','", "'+'", "'('", "')'", "'='", "'-'", "'<'"
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
    public static final int RULE_EXID=5;
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
    public static final int RULE_STRING=4;
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


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:424:1: entryRuleQueryable : ruleQueryable EOF ;
    public final void entryRuleQueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:425:1: ( ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:426:1: ruleQueryable EOF
            {
             before(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable842);
            ruleQueryable();

            state._fsp--;

             after(grammarAccess.getQueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable849); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:433:1: ruleQueryable : ( ( rule__Queryable__Alternatives ) ) ;
    public final void ruleQueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:437:2: ( ( ( rule__Queryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__Queryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__Queryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:439:1: ( rule__Queryable__Alternatives )
            {
             before(grammarAccess.getQueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:1: ( rule__Queryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:2: rule__Queryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable875);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:452:1: entryRuleNotqueryable : ruleNotqueryable EOF ;
    public final void entryRuleNotqueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:453:1: ( ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:454:1: ruleNotqueryable EOF
            {
             before(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable902);
            ruleNotqueryable();

            state._fsp--;

             after(grammarAccess.getNotqueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable909); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:461:1: ruleNotqueryable : ( ( rule__Notqueryable__Alternatives ) ) ;
    public final void ruleNotqueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:465:2: ( ( ( rule__Notqueryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Notqueryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Notqueryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:467:1: ( rule__Notqueryable__Alternatives )
            {
             before(grammarAccess.getNotqueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:1: ( rule__Notqueryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:2: rule__Notqueryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable935);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:480:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:481:1: ( ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:482:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract962);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract969); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:489:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:493:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Abstract__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Abstract__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:495:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:1: ( rule__Abstract__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:2: rule__Abstract__Alternatives
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract995);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:508:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:509:1: ( ruleMixin EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:510:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1022);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1029); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:517:1: ruleMixin : ( ( rule__Mixin__Alternatives ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:521:2: ( ( ( rule__Mixin__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Mixin__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Mixin__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:523:1: ( rule__Mixin__Alternatives )
            {
             before(grammarAccess.getMixinAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:1: ( rule__Mixin__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:2: rule__Mixin__Alternatives
            {
            pushFollow(FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1055);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:536:1: entryRuleOrderable : ruleOrderable EOF ;
    public final void entryRuleOrderable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:537:1: ( ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:538:1: ruleOrderable EOF
            {
             before(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable1082);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getOrderableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable1089); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:545:1: ruleOrderable : ( ( rule__Orderable__Alternatives ) ) ;
    public final void ruleOrderable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:549:2: ( ( ( rule__Orderable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Orderable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Orderable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:551:1: ( rule__Orderable__Alternatives )
            {
             before(grammarAccess.getOrderableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:1: ( rule__Orderable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:2: rule__Orderable__Alternatives
            {
            pushFollow(FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1115);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:564:1: entryRuleNsMapping : ruleNsMapping EOF ;
    public final void entryRuleNsMapping() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:565:1: ( ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:566:1: ruleNsMapping EOF
            {
             before(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping1142);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getNsMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping1149); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:573:1: ruleNsMapping : ( ( rule__NsMapping__Group__0 ) ) ;
    public final void ruleNsMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:577:2: ( ( ( rule__NsMapping__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__NsMapping__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__NsMapping__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:579:1: ( rule__NsMapping__Group__0 )
            {
             before(grammarAccess.getNsMappingAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:1: ( rule__NsMapping__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:2: rule__NsMapping__Group__0
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1175);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:592:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:593:1: ( rulePrefix EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:594:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix1202);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix1209); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:601:1: rulePrefix : ( ruleXiD ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:605:2: ( ( ruleXiD ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ruleXiD )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ruleXiD )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:607:1: ruleXiD
            {
             before(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix1235);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:620:1: entryRuleUri : ruleUri EOF ;
    public final void entryRuleUri() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:621:1: ( ruleUri EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:622:1: ruleUri EOF
            {
             before(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri1261);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri1268); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:629:1: ruleUri : ( ruleJcrString ) ;
    public final void ruleUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:633:2: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:635:1: ruleJcrString
            {
             before(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri1294);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:648:1: entryRuleJcrString : ruleJcrString EOF ;
    public final void entryRuleJcrString() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:649:1: ( ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:650:1: ruleJcrString EOF
            {
             before(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString1320);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString1327); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:657:1: ruleJcrString : ( ( rule__JcrString__Alternatives ) ) ;
    public final void ruleJcrString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:661:2: ( ( ( rule__JcrString__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ( rule__JcrString__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ( rule__JcrString__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:663:1: ( rule__JcrString__Alternatives )
            {
             before(grammarAccess.getJcrStringAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:664:1: ( rule__JcrString__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:664:2: rule__JcrString__Alternatives
            {
            pushFollow(FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1353);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:676:1: entryRuleXiD : ruleXiD EOF ;
    public final void entryRuleXiD() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:677:1: ( ruleXiD EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:678:1: ruleXiD EOF
            {
             before(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD1380);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getXiDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD1387); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:685:1: ruleXiD : ( ( rule__XiD__Alternatives ) ) ;
    public final void ruleXiD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:689:2: ( ( ( rule__XiD__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__XiD__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__XiD__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:691:1: ( rule__XiD__Alternatives )
            {
             before(grammarAccess.getXiDAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:1: ( rule__XiD__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:2: rule__XiD__Alternatives
            {
            pushFollow(FOLLOW_rule__XiD__Alternatives_in_ruleXiD1413);
            rule__XiD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXiDAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:705:1: ruleOpv : ( ( rule__Opv__Alternatives ) ) ;
    public final void ruleOpv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:709:1: ( ( ( rule__Opv__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:710:1: ( ( rule__Opv__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:710:1: ( ( rule__Opv__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:711:1: ( rule__Opv__Alternatives )
            {
             before(grammarAccess.getOpvAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:712:1: ( rule__Opv__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:712:2: rule__Opv__Alternatives
            {
            pushFollow(FOLLOW_rule__Opv__Alternatives_in_ruleOpv1450);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:724:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:728:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:729:1: ( ( rule__PropertyType__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:729:1: ( ( rule__PropertyType__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:730:1: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:731:1: ( rule__PropertyType__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:731:2: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1486);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:742:1: rule__Model__Alternatives : ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:746:1: ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:747:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:747:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:748:1: ( rule__Model__NamespacesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:749:1: ( rule__Model__NamespacesAssignment_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:749:2: rule__Model__NamespacesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1521);
                    rule__Model__NamespacesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:753:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:753:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:754:1: ( rule__Model__NodeTypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getNodeTypesAssignment_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:755:1: ( rule__Model__NodeTypesAssignment_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:755:2: rule__Model__NodeTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1539);
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


    // $ANTLR start "rule__NodeTypeDefinition__Alternatives_4_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:764:1: rule__NodeTypeDefinition__Alternatives_4_5_0 : ( ( 'primaryitem' ) | ( '!' ) );
    public final void rule__NodeTypeDefinition__Alternatives_4_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:768:1: ( ( 'primaryitem' ) | ( '!' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:769:1: ( 'primaryitem' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:769:1: ( 'primaryitem' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:770:1: 'primaryitem'
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryitemKeyword_4_5_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__NodeTypeDefinition__Alternatives_4_5_01573); 
                     after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryitemKeyword_4_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:778:1: '!'
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getExclamationMarkKeyword_4_5_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__NodeTypeDefinition__Alternatives_4_5_01593); 
                     after(grammarAccess.getNodeTypeDefinitionAccess().getExclamationMarkKeyword_4_5_0_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Alternatives_4_5_0"


    // $ANTLR start "rule__NodeTypeDefinition__Alternatives_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:790:1: rule__NodeTypeDefinition__Alternatives_5 : ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) );
    public final void rule__NodeTypeDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:794:1: ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==72) ) {
                alt4=1;
            }
            else if ( (LA4_0==68) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:795:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:795:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:796:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:2: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51627);
                    rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:801:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:801:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:802:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:2: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51645);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:812:1: rule__NodeDefinition__Alternatives_1 : ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) );
    public final void rule__NodeDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:816:1: ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_EXID)||LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:817:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:817:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:818:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:2: rule__NodeDefinition__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11678);
                    rule__NodeDefinition__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:823:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:823:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:824:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:2: rule__NodeDefinition__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11696);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:834:1: rule__Sns__Alternatives : ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) );
    public final void rule__Sns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:838:1: ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:839:1: ( 'sns' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:839:1: ( 'sns' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:840:1: 'sns'
                    {
                     before(grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Sns__Alternatives1730); 
                     after(grammarAccess.getSnsAccess().getSnsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:847:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:847:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:848:1: '*'
                    {
                     before(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Sns__Alternatives1750); 
                     after(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:855:6: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:855:6: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:856:1: 'multiple'
                    {
                     before(grammarAccess.getSnsAccess().getMultipleKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__Sns__Alternatives1770); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:868:1: rule__PropertyDefinition__Alternatives_2 : ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__PropertyDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:872:1: ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_EXID)||LA7_0==41) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:873:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:873:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:874:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:2: rule__PropertyDefinition__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21804);
                    rule__PropertyDefinition__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:879:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:879:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:880:1: '*'
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1()); 
                    match(input,15,FOLLOW_15_in_rule__PropertyDefinition__Alternatives_21823); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:892:1: rule__NoQueryOrder__Alternatives : ( ( 'noqueryorder' ) | ( 'nqord' ) );
    public final void rule__NoQueryOrder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:896:1: ( ( 'noqueryorder' ) | ( 'nqord' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:897:1: ( 'noqueryorder' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:897:1: ( 'noqueryorder' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:898:1: 'noqueryorder'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__NoQueryOrder__Alternatives1858); 
                     after(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:905:6: ( 'nqord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:905:6: ( 'nqord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:906:1: 'nqord'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__NoQueryOrder__Alternatives1878); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:918:1: rule__NoFullText__Alternatives : ( ( 'nofulltext' ) | ( 'nof' ) );
    public final void rule__NoFullText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:922:1: ( ( 'nofulltext' ) | ( 'nof' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:923:1: ( 'nofulltext' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:923:1: ( 'nofulltext' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:924:1: 'nofulltext'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                    match(input,19,FOLLOW_19_in_rule__NoFullText__Alternatives1913); 
                     after(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:931:6: ( 'nof' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:931:6: ( 'nof' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:932:1: 'nof'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 
                    match(input,20,FOLLOW_20_in_rule__NoFullText__Alternatives1933); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:944:1: rule__QueryOps__Alternatives_0 : ( ( 'queryops' ) | ( 'qop' ) );
    public final void rule__QueryOps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:948:1: ( ( 'queryops' ) | ( 'qop' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:949:1: ( 'queryops' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:949:1: ( 'queryops' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:950:1: 'queryops'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                    match(input,21,FOLLOW_21_in_rule__QueryOps__Alternatives_01968); 
                     after(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:957:6: ( 'qop' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:957:6: ( 'qop' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:958:1: 'qop'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__QueryOps__Alternatives_01988); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:970:1: rule__Multiple__Alternatives : ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) );
    public final void rule__Multiple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:974:1: ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 15:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:975:1: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:975:1: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:976:1: 'multiple'
                    {
                     before(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__Multiple__Alternatives2023); 
                     after(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:983:6: ( 'mul' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:983:6: ( 'mul' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:984:1: 'mul'
                    {
                     before(grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__Multiple__Alternatives2043); 
                     after(grammarAccess.getMultipleAccess().getMulKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:991:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:991:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:992:1: '*'
                    {
                     before(grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Multiple__Alternatives2063); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1004:1: rule__Protected__Alternatives : ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) );
    public final void rule__Protected__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1008:1: ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1009:1: ( 'protected' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1009:1: ( 'protected' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1010:1: 'protected'
                    {
                     before(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__Protected__Alternatives2098); 
                     after(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1017:6: ( 'pro' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1017:6: ( 'pro' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1018:1: 'pro'
                    {
                     before(grammarAccess.getProtectedAccess().getProKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__Protected__Alternatives2118); 
                     after(grammarAccess.getProtectedAccess().getProKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1025:6: ( 'p' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1025:6: ( 'p' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1026:1: 'p'
                    {
                     before(grammarAccess.getProtectedAccess().getPKeyword_2()); 
                    match(input,26,FOLLOW_26_in_rule__Protected__Alternatives2138); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1038:1: rule__Mandatory__Alternatives : ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) );
    public final void rule__Mandatory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1042:1: ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 29:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1043:1: ( 'mandatory' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1043:1: ( 'mandatory' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1044:1: 'mandatory'
                    {
                     before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                    match(input,27,FOLLOW_27_in_rule__Mandatory__Alternatives2173); 
                     after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1051:6: ( 'man' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1051:6: ( 'man' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1052:1: 'man'
                    {
                     before(grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                    match(input,28,FOLLOW_28_in_rule__Mandatory__Alternatives2193); 
                     after(grammarAccess.getMandatoryAccess().getManKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1059:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1059:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1060:1: 'm'
                    {
                     before(grammarAccess.getMandatoryAccess().getMKeyword_2()); 
                    match(input,29,FOLLOW_29_in_rule__Mandatory__Alternatives2213); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1072:1: rule__Autocreated__Alternatives : ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) );
    public final void rule__Autocreated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1076:1: ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 31:
                {
                alt14=2;
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1077:1: ( 'autocreated' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1077:1: ( 'autocreated' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1078:1: 'autocreated'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                    match(input,30,FOLLOW_30_in_rule__Autocreated__Alternatives2248); 
                     after(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1085:6: ( 'aut' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1085:6: ( 'aut' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1086:1: 'aut'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                    match(input,31,FOLLOW_31_in_rule__Autocreated__Alternatives2268); 
                     after(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1093:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1093:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1094:1: 'a'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAKeyword_2()); 
                    match(input,32,FOLLOW_32_in_rule__Autocreated__Alternatives2288); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1106:1: rule__Primary__Alternatives : ( ( 'primary' ) | ( '!' ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1110:1: ( ( 'primary' ) | ( '!' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1111:1: ( 'primary' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1111:1: ( 'primary' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1112:1: 'primary'
                    {
                     before(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                    match(input,33,FOLLOW_33_in_rule__Primary__Alternatives2323); 
                     after(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1119:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1119:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1120:1: '!'
                    {
                     before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Primary__Alternatives2343); 
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


    // $ANTLR start "rule__Queryable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1132:1: rule__Queryable__Alternatives : ( ( 'query' ) | ( 'q' ) );
    public final void rule__Queryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1136:1: ( ( 'query' ) | ( 'q' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1137:1: ( 'query' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1137:1: ( 'query' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1138:1: 'query'
                    {
                     before(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                    match(input,34,FOLLOW_34_in_rule__Queryable__Alternatives2378); 
                     after(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1145:6: ( 'q' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1145:6: ( 'q' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1146:1: 'q'
                    {
                     before(grammarAccess.getQueryableAccess().getQKeyword_1()); 
                    match(input,35,FOLLOW_35_in_rule__Queryable__Alternatives2398); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1158:1: rule__Notqueryable__Alternatives : ( ( 'noquery' ) | ( 'nq' ) );
    public final void rule__Notqueryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1162:1: ( ( 'noquery' ) | ( 'nq' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1163:1: ( 'noquery' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1163:1: ( 'noquery' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1164:1: 'noquery'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                    match(input,36,FOLLOW_36_in_rule__Notqueryable__Alternatives2433); 
                     after(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1171:6: ( 'nq' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1171:6: ( 'nq' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1172:1: 'nq'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 
                    match(input,37,FOLLOW_37_in_rule__Notqueryable__Alternatives2453); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1184:1: rule__Abstract__Alternatives : ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1188:1: ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) )
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
            case 32:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1189:1: ( 'abstract' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1189:1: ( 'abstract' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1190:1: 'abstract'
                    {
                     before(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__Abstract__Alternatives2488); 
                     after(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1197:6: ( 'abs' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1197:6: ( 'abs' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1198:1: 'abs'
                    {
                     before(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__Abstract__Alternatives2508); 
                     after(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1205:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1205:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1206:1: 'a'
                    {
                     before(grammarAccess.getAbstractAccess().getAKeyword_2()); 
                    match(input,32,FOLLOW_32_in_rule__Abstract__Alternatives2528); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1218:1: rule__Mixin__Alternatives : ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) );
    public final void rule__Mixin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1222:1: ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) )
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
            case 29:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1223:1: ( 'mixin' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1223:1: ( 'mixin' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1224:1: 'mixin'
                    {
                     before(grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                    match(input,40,FOLLOW_40_in_rule__Mixin__Alternatives2563); 
                     after(grammarAccess.getMixinAccess().getMixinKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1231:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1231:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1232:1: 'mix'
                    {
                     before(grammarAccess.getMixinAccess().getMixKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__Mixin__Alternatives2583); 
                     after(grammarAccess.getMixinAccess().getMixKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1239:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1239:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1240:1: 'm'
                    {
                     before(grammarAccess.getMixinAccess().getMKeyword_2()); 
                    match(input,29,FOLLOW_29_in_rule__Mixin__Alternatives2603); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1252:1: rule__Orderable__Alternatives : ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) );
    public final void rule__Orderable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1256:1: ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1257:1: ( 'orderable' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1257:1: ( 'orderable' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1258:1: 'orderable'
                    {
                     before(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                    match(input,42,FOLLOW_42_in_rule__Orderable__Alternatives2638); 
                     after(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1265:6: ( 'ord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1265:6: ( 'ord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1266:1: 'ord'
                    {
                     before(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                    match(input,43,FOLLOW_43_in_rule__Orderable__Alternatives2658); 
                     after(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1273:6: ( 'o' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1273:6: ( 'o' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1274:1: 'o'
                    {
                     before(grammarAccess.getOrderableAccess().getOKeyword_2()); 
                    match(input,44,FOLLOW_44_in_rule__Orderable__Alternatives2678); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1286:1: rule__JcrString__Alternatives : ( ( RULE_STRING ) | ( ruleXiD ) );
    public final void rule__JcrString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1290:1: ( ( RULE_STRING ) | ( ruleXiD ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_EXID||LA21_0==41) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1291:1: ( RULE_STRING )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1291:1: ( RULE_STRING )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1292:1: RULE_STRING
                    {
                     before(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2712); 
                     after(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1297:6: ( ruleXiD )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1297:6: ( ruleXiD )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1298:1: ruleXiD
                    {
                     before(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2729);
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


    // $ANTLR start "rule__XiD__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1308:1: rule__XiD__Alternatives : ( ( RULE_EXID ) | ( 'mix' ) );
    public final void rule__XiD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1312:1: ( ( RULE_EXID ) | ( 'mix' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EXID) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1313:1: ( RULE_EXID )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1313:1: ( RULE_EXID )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1314:1: RULE_EXID
                    {
                     before(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                    match(input,RULE_EXID,FOLLOW_RULE_EXID_in_rule__XiD__Alternatives2761); 
                     after(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1320:1: 'mix'
                    {
                     before(grammarAccess.getXiDAccess().getMixKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__XiD__Alternatives2779); 
                     after(grammarAccess.getXiDAccess().getMixKeyword_1()); 

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
    // $ANTLR end "rule__XiD__Alternatives"


    // $ANTLR start "rule__Opv__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1332:1: rule__Opv__Alternatives : ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) );
    public final void rule__Opv__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1336:1: ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            case 50:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1337:1: ( ( 'COPY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1337:1: ( ( 'COPY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1338:1: ( 'COPY' )
                    {
                     before(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1339:1: ( 'COPY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1339:3: 'COPY'
                    {
                    match(input,45,FOLLOW_45_in_rule__Opv__Alternatives2814); 

                    }

                     after(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1344:6: ( ( 'VERSION' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1344:6: ( ( 'VERSION' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1345:1: ( 'VERSION' )
                    {
                     before(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1346:1: ( 'VERSION' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1346:3: 'VERSION'
                    {
                    match(input,46,FOLLOW_46_in_rule__Opv__Alternatives2835); 

                    }

                     after(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1351:6: ( ( 'INITIALIZE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1351:6: ( ( 'INITIALIZE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1352:1: ( 'INITIALIZE' )
                    {
                     before(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1353:1: ( 'INITIALIZE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1353:3: 'INITIALIZE'
                    {
                    match(input,47,FOLLOW_47_in_rule__Opv__Alternatives2856); 

                    }

                     after(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1358:6: ( ( 'COMPUTE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1358:6: ( ( 'COMPUTE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1359:1: ( 'COMPUTE' )
                    {
                     before(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1360:1: ( 'COMPUTE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1360:3: 'COMPUTE'
                    {
                    match(input,48,FOLLOW_48_in_rule__Opv__Alternatives2877); 

                    }

                     after(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1365:6: ( ( 'IGNORE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1365:6: ( ( 'IGNORE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1366:1: ( 'IGNORE' )
                    {
                     before(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1367:1: ( 'IGNORE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1367:3: 'IGNORE'
                    {
                    match(input,49,FOLLOW_49_in_rule__Opv__Alternatives2898); 

                    }

                     after(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1372:6: ( ( 'ABORT' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1372:6: ( ( 'ABORT' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1373:1: ( 'ABORT' )
                    {
                     before(grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1374:1: ( 'ABORT' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1374:3: 'ABORT'
                    {
                    match(input,50,FOLLOW_50_in_rule__Opv__Alternatives2919); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1384:1: rule__PropertyType__Alternatives : ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1388:1: ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) )
            int alt24=13;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt24=1;
                }
                break;
            case 52:
                {
                alt24=2;
                }
                break;
            case 53:
                {
                alt24=3;
                }
                break;
            case 54:
                {
                alt24=4;
                }
                break;
            case 55:
                {
                alt24=5;
                }
                break;
            case 56:
                {
                alt24=6;
                }
                break;
            case 57:
                {
                alt24=7;
                }
                break;
            case 58:
                {
                alt24=8;
                }
                break;
            case 59:
                {
                alt24=9;
                }
                break;
            case 60:
                {
                alt24=10;
                }
                break;
            case 61:
                {
                alt24=11;
                }
                break;
            case 62:
                {
                alt24=12;
                }
                break;
            case 63:
                {
                alt24=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1389:1: ( ( 'UNDEFINED' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1389:1: ( ( 'UNDEFINED' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1390:1: ( 'UNDEFINED' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1391:1: ( 'UNDEFINED' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1391:3: 'UNDEFINED'
                    {
                    match(input,51,FOLLOW_51_in_rule__PropertyType__Alternatives2955); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1396:6: ( ( 'STRING' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1396:6: ( ( 'STRING' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1397:1: ( 'STRING' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1398:1: ( 'STRING' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1398:3: 'STRING'
                    {
                    match(input,52,FOLLOW_52_in_rule__PropertyType__Alternatives2976); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1403:6: ( ( 'BINARY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1403:6: ( ( 'BINARY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1404:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1405:1: ( 'BINARY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1405:3: 'BINARY'
                    {
                    match(input,53,FOLLOW_53_in_rule__PropertyType__Alternatives2997); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1410:6: ( ( 'LONG' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1410:6: ( ( 'LONG' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1411:1: ( 'LONG' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1412:1: ( 'LONG' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1412:3: 'LONG'
                    {
                    match(input,54,FOLLOW_54_in_rule__PropertyType__Alternatives3018); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1417:6: ( ( 'DOUBLE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1417:6: ( ( 'DOUBLE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1418:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1419:1: ( 'DOUBLE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1419:3: 'DOUBLE'
                    {
                    match(input,55,FOLLOW_55_in_rule__PropertyType__Alternatives3039); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1424:6: ( ( 'DATE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1424:6: ( ( 'DATE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1425:1: ( 'DATE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1426:1: ( 'DATE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1426:3: 'DATE'
                    {
                    match(input,56,FOLLOW_56_in_rule__PropertyType__Alternatives3060); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:6: ( ( 'BOOLEAN' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1432:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1433:1: ( 'BOOLEAN' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1433:3: 'BOOLEAN'
                    {
                    match(input,57,FOLLOW_57_in_rule__PropertyType__Alternatives3081); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1438:6: ( ( 'NAME' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1438:6: ( ( 'NAME' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1439:1: ( 'NAME' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1440:1: ( 'NAME' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1440:3: 'NAME'
                    {
                    match(input,58,FOLLOW_58_in_rule__PropertyType__Alternatives3102); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1445:6: ( ( 'PATH' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1445:6: ( ( 'PATH' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1446:1: ( 'PATH' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1447:1: ( 'PATH' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1447:3: 'PATH'
                    {
                    match(input,59,FOLLOW_59_in_rule__PropertyType__Alternatives3123); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1452:6: ( ( 'REFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1452:6: ( ( 'REFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1453:1: ( 'REFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1454:1: ( 'REFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1454:3: 'REFERENCE'
                    {
                    match(input,60,FOLLOW_60_in_rule__PropertyType__Alternatives3144); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1459:6: ( ( 'WEAKREFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1459:6: ( ( 'WEAKREFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1460:1: ( 'WEAKREFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1461:1: ( 'WEAKREFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1461:3: 'WEAKREFERENCE'
                    {
                    match(input,61,FOLLOW_61_in_rule__PropertyType__Alternatives3165); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1466:6: ( ( 'URI' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1466:6: ( ( 'URI' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1467:1: ( 'URI' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1468:1: ( 'URI' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1468:3: 'URI'
                    {
                    match(input,62,FOLLOW_62_in_rule__PropertyType__Alternatives3186); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1473:6: ( ( 'DECIMAL' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1473:6: ( ( 'DECIMAL' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1474:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1475:1: ( 'DECIMAL' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1475:3: 'DECIMAL'
                    {
                    match(input,63,FOLLOW_63_in_rule__PropertyType__Alternatives3207); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1487:1: rule__NodeTypeDefinition__Group__0 : rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 ;
    public final void rule__NodeTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1491:1: ( rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1492:2: rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03240);
            rule__NodeTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03243);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1499:1: rule__NodeTypeDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1503:1: ( ( '[' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1504:1: ( '[' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1504:1: ( '[' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1505:1: '['
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3271); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1518:1: rule__NodeTypeDefinition__Group__1 : rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 ;
    public final void rule__NodeTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1522:1: ( rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1523:2: rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13302);
            rule__NodeTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13305);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1530:1: rule__NodeTypeDefinition__Group__1__Impl : ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1534:1: ( ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1535:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1535:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1536:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1537:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1537:2: rule__NodeTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3332);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1547:1: rule__NodeTypeDefinition__Group__2 : rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 ;
    public final void rule__NodeTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1551:1: ( rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1552:2: rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23362);
            rule__NodeTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23365);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1559:1: rule__NodeTypeDefinition__Group__2__Impl : ( ']' ) ;
    public final void rule__NodeTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:1: ( ( ']' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1564:1: ( ']' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1564:1: ( ']' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1565:1: ']'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2()); 
            match(input,65,FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3393); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1578:1: rule__NodeTypeDefinition__Group__3 : rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 ;
    public final void rule__NodeTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1582:1: ( rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1583:2: rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33424);
            rule__NodeTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33427);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1590:1: rule__NodeTypeDefinition__Group__3__Impl : ( ( rule__NodeTypeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1594:1: ( ( ( rule__NodeTypeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1595:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1595:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1596:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1597:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==66) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1597:2: rule__NodeTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3454);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1607:1: rule__NodeTypeDefinition__Group__4 : rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 ;
    public final void rule__NodeTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1611:1: ( rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1612:2: rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43485);
            rule__NodeTypeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43488);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1619:1: rule__NodeTypeDefinition__Group__4__Impl : ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1623:1: ( ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1624:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1624:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1625:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1626:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1626:2: rule__NodeTypeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3515);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1636:1: rule__NodeTypeDefinition__Group__5 : rule__NodeTypeDefinition__Group__5__Impl ;
    public final void rule__NodeTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1640:1: ( rule__NodeTypeDefinition__Group__5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1641:2: rule__NodeTypeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53545);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1647:1: rule__NodeTypeDefinition__Group__5__Impl : ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) ;
    public final void rule__NodeTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1651:1: ( ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1652:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1652:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1653:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1654:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==68||LA26_0==72) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1654:2: rule__NodeTypeDefinition__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3572);
            	    rule__NodeTypeDefinition__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1676:1: rule__NodeTypeDefinition__Group_3__0 : rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 ;
    public final void rule__NodeTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1680:1: ( rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1681:2: rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03615);
            rule__NodeTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03618);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1688:1: rule__NodeTypeDefinition__Group_3__0__Impl : ( '>' ) ;
    public final void rule__NodeTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1692:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1693:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1693:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1694:1: '>'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3646); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1707:1: rule__NodeTypeDefinition__Group_3__1 : rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 ;
    public final void rule__NodeTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1711:1: ( rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1712:2: rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13677);
            rule__NodeTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13680);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1719:1: rule__NodeTypeDefinition__Group_3__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1723:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1724:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1724:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1725:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1726:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1726:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3707);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1736:1: rule__NodeTypeDefinition__Group_3__2 : rule__NodeTypeDefinition__Group_3__2__Impl ;
    public final void rule__NodeTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1740:1: ( rule__NodeTypeDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1741:2: rule__NodeTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23737);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1747:1: rule__NodeTypeDefinition__Group_3__2__Impl : ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) ;
    public final void rule__NodeTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1751:1: ( ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1752:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1752:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1753:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1754:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==67) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1754:2: rule__NodeTypeDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3764);
            	    rule__NodeTypeDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1770:1: rule__NodeTypeDefinition__Group_3_2__0 : rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 ;
    public final void rule__NodeTypeDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1774:1: ( rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1775:2: rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03801);
            rule__NodeTypeDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03804);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1782:1: rule__NodeTypeDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1786:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1787:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1787:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1788:1: ','
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3832); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1801:1: rule__NodeTypeDefinition__Group_3_2__1 : rule__NodeTypeDefinition__Group_3_2__1__Impl ;
    public final void rule__NodeTypeDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1805:1: ( rule__NodeTypeDefinition__Group_3_2__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1806:2: rule__NodeTypeDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13863);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1812:1: rule__NodeTypeDefinition__Group_3_2__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1816:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1817:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1817:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1818:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1819:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1819:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3890);
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


    // $ANTLR start "rule__NodeTypeDefinition__Group_4_5__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1833:1: rule__NodeTypeDefinition__Group_4_5__0 : rule__NodeTypeDefinition__Group_4_5__0__Impl rule__NodeTypeDefinition__Group_4_5__1 ;
    public final void rule__NodeTypeDefinition__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1837:1: ( rule__NodeTypeDefinition__Group_4_5__0__Impl rule__NodeTypeDefinition__Group_4_5__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1838:2: rule__NodeTypeDefinition__Group_4_5__0__Impl rule__NodeTypeDefinition__Group_4_5__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_4_5__0__Impl_in_rule__NodeTypeDefinition__Group_4_5__03924);
            rule__NodeTypeDefinition__Group_4_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_4_5__1_in_rule__NodeTypeDefinition__Group_4_5__03927);
            rule__NodeTypeDefinition__Group_4_5__1();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_4_5__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group_4_5__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1845:1: rule__NodeTypeDefinition__Group_4_5__0__Impl : ( ( rule__NodeTypeDefinition__Alternatives_4_5_0 ) ) ;
    public final void rule__NodeTypeDefinition__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1849:1: ( ( ( rule__NodeTypeDefinition__Alternatives_4_5_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1850:1: ( ( rule__NodeTypeDefinition__Alternatives_4_5_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1850:1: ( ( rule__NodeTypeDefinition__Alternatives_4_5_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1851:1: ( rule__NodeTypeDefinition__Alternatives_4_5_0 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_4_5_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1852:1: ( rule__NodeTypeDefinition__Alternatives_4_5_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1852:2: rule__NodeTypeDefinition__Alternatives_4_5_0
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Alternatives_4_5_0_in_rule__NodeTypeDefinition__Group_4_5__0__Impl3954);
            rule__NodeTypeDefinition__Alternatives_4_5_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_4_5_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_4_5__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_4_5__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1862:1: rule__NodeTypeDefinition__Group_4_5__1 : rule__NodeTypeDefinition__Group_4_5__1__Impl ;
    public final void rule__NodeTypeDefinition__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1866:1: ( rule__NodeTypeDefinition__Group_4_5__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1867:2: rule__NodeTypeDefinition__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_4_5__1__Impl_in_rule__NodeTypeDefinition__Group_4_5__13984);
            rule__NodeTypeDefinition__Group_4_5__1__Impl();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_4_5__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group_4_5__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1873:1: rule__NodeTypeDefinition__Group_4_5__1__Impl : ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1877:1: ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1878:1: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1878:1: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1879:1: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1880:1: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1880:2: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1_in_rule__NodeTypeDefinition__Group_4_5__1__Impl4011);
            rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_4_5__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1894:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1898:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1899:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04045);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04048);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1906:1: rule__NodeDefinition__Group__0__Impl : ( '+' ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1910:1: ( ( '+' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1911:1: ( '+' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1911:1: ( '+' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1912:1: '+'
            {
             before(grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl4076); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1925:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1929:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1930:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14107);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14110);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1937:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__Alternatives_1 ) ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1941:1: ( ( ( rule__NodeDefinition__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1942:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1942:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1943:1: ( rule__NodeDefinition__Alternatives_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1944:1: ( rule__NodeDefinition__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1944:2: rule__NodeDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4137);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1954:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1958:1: ( rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1959:2: rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24167);
            rule__NodeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24170);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1966:1: rule__NodeDefinition__Group__2__Impl : ( ( rule__NodeDefinition__Group_2__0 )? ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1970:1: ( ( ( rule__NodeDefinition__Group_2__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1971:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1971:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1972:1: ( rule__NodeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1973:1: ( rule__NodeDefinition__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==69) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1973:2: rule__NodeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4197);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1983:1: rule__NodeDefinition__Group__3 : rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 ;
    public final void rule__NodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1987:1: ( rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1988:2: rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34228);
            rule__NodeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34231);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1995:1: rule__NodeDefinition__Group__3__Impl : ( ( rule__NodeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1999:1: ( ( ( rule__NodeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2000:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2000:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2001:1: ( rule__NodeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2002:1: ( rule__NodeDefinition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==71) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2002:2: rule__NodeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4258);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2012:1: rule__NodeDefinition__Group__4 : rule__NodeDefinition__Group__4__Impl ;
    public final void rule__NodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2016:1: ( rule__NodeDefinition__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2017:2: rule__NodeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44289);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2023:1: rule__NodeDefinition__Group__4__Impl : ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2027:1: ( ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2028:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2028:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2029:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2030:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2030:2: rule__NodeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4316);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2050:1: rule__NodeDefinition__Group_2__0 : rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 ;
    public final void rule__NodeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2054:1: ( rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2055:2: rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04356);
            rule__NodeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04359);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2062:1: rule__NodeDefinition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__NodeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2066:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2067:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2067:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2068:1: '('
            {
             before(grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,69,FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4387); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2081:1: rule__NodeDefinition__Group_2__1 : rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 ;
    public final void rule__NodeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2085:1: ( rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2086:2: rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14418);
            rule__NodeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14421);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2093:1: rule__NodeDefinition__Group_2__1__Impl : ( ( rule__NodeDefinition__Group_2_1__0 ) ) ;
    public final void rule__NodeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2097:1: ( ( ( rule__NodeDefinition__Group_2_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2098:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2098:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2099:1: ( rule__NodeDefinition__Group_2_1__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2100:1: ( rule__NodeDefinition__Group_2_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2100:2: rule__NodeDefinition__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4448);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2110:1: rule__NodeDefinition__Group_2__2 : rule__NodeDefinition__Group_2__2__Impl ;
    public final void rule__NodeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2114:1: ( rule__NodeDefinition__Group_2__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2115:2: rule__NodeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24478);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2121:1: rule__NodeDefinition__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NodeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2125:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2126:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2126:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2127:1: ')'
            {
             before(grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,70,FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4506); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2146:1: rule__NodeDefinition__Group_2_1__0 : rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 ;
    public final void rule__NodeDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2150:1: ( rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2151:2: rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04543);
            rule__NodeDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04546);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2158:1: rule__NodeDefinition__Group_2_1__0__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) ;
    public final void rule__NodeDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2162:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2163:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2163:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2164:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2165:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2165:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4573);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2175:1: rule__NodeDefinition__Group_2_1__1 : rule__NodeDefinition__Group_2_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2179:1: ( rule__NodeDefinition__Group_2_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2180:2: rule__NodeDefinition__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14603);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2186:1: rule__NodeDefinition__Group_2_1__1__Impl : ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) ;
    public final void rule__NodeDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2190:1: ( ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2191:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2191:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2192:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2193:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==67) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2193:2: rule__NodeDefinition__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4630);
            	    rule__NodeDefinition__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2207:1: rule__NodeDefinition__Group_2_1_1__0 : rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 ;
    public final void rule__NodeDefinition__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2211:1: ( rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2212:2: rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04665);
            rule__NodeDefinition__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04668);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2219:1: rule__NodeDefinition__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__NodeDefinition__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2223:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2224:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2224:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2225:1: ','
            {
             before(grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4696); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2238:1: rule__NodeDefinition__Group_2_1_1__1 : rule__NodeDefinition__Group_2_1_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2242:1: ( rule__NodeDefinition__Group_2_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2243:2: rule__NodeDefinition__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14727);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2249:1: rule__NodeDefinition__Group_2_1_1__1__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) ;
    public final void rule__NodeDefinition__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2253:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2254:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2254:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2255:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2256:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2256:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4754);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2270:1: rule__NodeDefinition__Group_3__0 : rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 ;
    public final void rule__NodeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2274:1: ( rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2275:2: rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04788);
            rule__NodeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04791);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2282:1: rule__NodeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NodeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2286:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2287:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2287:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2288:1: '='
            {
             before(grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,71,FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4819); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2301:1: rule__NodeDefinition__Group_3__1 : rule__NodeDefinition__Group_3__1__Impl ;
    public final void rule__NodeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2305:1: ( rule__NodeDefinition__Group_3__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2306:2: rule__NodeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14850);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2312:1: rule__NodeDefinition__Group_3__1__Impl : ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) ;
    public final void rule__NodeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2316:1: ( ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2317:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2317:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2318:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2319:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2319:2: rule__NodeDefinition__DefaultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4877);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2333:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2337:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2338:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04911);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04914);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2345:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2349:1: ( ( () ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2350:1: ( () )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2350:1: ( () )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2351:1: ()
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2352:1: ()
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2354:1: 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2364:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2368:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2369:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14972);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14975);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2376:1: rule__PropertyDefinition__Group__1__Impl : ( '-' ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2380:1: ( ( '-' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2381:1: ( '-' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2381:1: ( '-' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2382:1: '-'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl5003); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2395:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2399:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2400:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25034);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25037);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2407:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__Alternatives_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2411:1: ( ( ( rule__PropertyDefinition__Alternatives_2 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2412:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2412:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2413:1: ( rule__PropertyDefinition__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2414:1: ( rule__PropertyDefinition__Alternatives_2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2414:2: rule__PropertyDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl5064);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2424:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2428:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2429:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35094);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35097);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2436:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__Group_3__0 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2440:1: ( ( ( rule__PropertyDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2441:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2441:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2442:1: ( rule__PropertyDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2443:1: ( rule__PropertyDefinition__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2443:2: rule__PropertyDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5124);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2453:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2457:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2458:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45155);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45158);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2465:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2469:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2470:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2470:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2471:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2472:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2472:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5185);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2482:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2486:1: ( rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2487:2: rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55216);
            rule__PropertyDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55219);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2494:1: rule__PropertyDefinition__Group__5__Impl : ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2498:1: ( ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2499:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2499:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2500:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2501:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2501:2: rule__PropertyDefinition__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5246);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2511:1: rule__PropertyDefinition__Group__6 : rule__PropertyDefinition__Group__6__Impl ;
    public final void rule__PropertyDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2515:1: ( rule__PropertyDefinition__Group__6__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2516:2: rule__PropertyDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65276);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2522:1: rule__PropertyDefinition__Group__6__Impl : ( ( rule__PropertyDefinition__Group_6__0 )? ) ;
    public final void rule__PropertyDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2526:1: ( ( ( rule__PropertyDefinition__Group_6__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2527:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2527:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2528:1: ( rule__PropertyDefinition__Group_6__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2529:1: ( rule__PropertyDefinition__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==73) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt33=1;
                        }
                        break;
                    case RULE_EXID:
                        {
                        int LA33_4 = input.LA(3);

                        if ( (LA33_4==EOF||LA33_4==64||(LA33_4>=67 && LA33_4<=68)||(LA33_4>=72 && LA33_4<=73)) ) {
                            alt33=1;
                        }
                        }
                        break;
                    case 41:
                        {
                        int LA33_5 = input.LA(3);

                        if ( (LA33_5==EOF||LA33_5==64||(LA33_5>=67 && LA33_5<=68)||(LA33_5>=72 && LA33_5<=73)) ) {
                            alt33=1;
                        }
                        }
                        break;
                }

            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2529:2: rule__PropertyDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5303);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2553:1: rule__PropertyDefinition__Group_3__0 : rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 ;
    public final void rule__PropertyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2557:1: ( rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2558:2: rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05348);
            rule__PropertyDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05351);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2565:1: rule__PropertyDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PropertyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2569:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2570:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2570:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2571:1: '('
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,69,FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5379); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2584:1: rule__PropertyDefinition__Group_3__1 : rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 ;
    public final void rule__PropertyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2588:1: ( rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2589:2: rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15410);
            rule__PropertyDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15413);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2596:1: rule__PropertyDefinition__Group_3__1__Impl : ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) ;
    public final void rule__PropertyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2600:1: ( ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2601:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2601:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2602:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2603:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2603:2: rule__PropertyDefinition__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5440);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2613:1: rule__PropertyDefinition__Group_3__2 : rule__PropertyDefinition__Group_3__2__Impl ;
    public final void rule__PropertyDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2617:1: ( rule__PropertyDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2618:2: rule__PropertyDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25470);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2624:1: rule__PropertyDefinition__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PropertyDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2628:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2629:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2629:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2630:1: ')'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,70,FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5498); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2649:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2653:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2654:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05535);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05538);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2661:1: rule__PropertyDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2665:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2666:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2666:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2667:1: '='
            {
             before(grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,71,FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5566); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2680:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2684:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2685:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15597);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2691:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__Group_4_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2695:1: ( ( ( rule__PropertyDefinition__Group_4_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2696:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2696:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2697:1: ( rule__PropertyDefinition__Group_4_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2698:1: ( rule__PropertyDefinition__Group_4_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2698:2: rule__PropertyDefinition__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5624);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2712:1: rule__PropertyDefinition__Group_4_1__0 : rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2716:1: ( rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2717:2: rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05658);
            rule__PropertyDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05661);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2724:1: rule__PropertyDefinition__Group_4_1__0__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2728:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2729:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2729:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2730:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2731:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2731:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5688);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2741:1: rule__PropertyDefinition__Group_4_1__1 : rule__PropertyDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2745:1: ( rule__PropertyDefinition__Group_4_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2746:2: rule__PropertyDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15718);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2752:1: rule__PropertyDefinition__Group_4_1__1__Impl : ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2756:1: ( ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2757:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2757:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2758:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2759:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==67) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2759:2: rule__PropertyDefinition__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5745);
            	    rule__PropertyDefinition__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2773:1: rule__PropertyDefinition__Group_4_1_1__0 : rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2777:1: ( rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2778:2: rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05780);
            rule__PropertyDefinition__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05783);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2785:1: rule__PropertyDefinition__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2789:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2790:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2790:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2791:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5811); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2804:1: rule__PropertyDefinition__Group_4_1_1__1 : rule__PropertyDefinition__Group_4_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2808:1: ( rule__PropertyDefinition__Group_4_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2809:2: rule__PropertyDefinition__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15842);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2815:1: rule__PropertyDefinition__Group_4_1_1__1__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2819:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2820:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2820:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2821:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2822:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2822:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5869);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2836:1: rule__PropertyDefinition__Group_6__0 : rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 ;
    public final void rule__PropertyDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2840:1: ( rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2841:2: rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05903);
            rule__PropertyDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05906);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2848:1: rule__PropertyDefinition__Group_6__0__Impl : ( '<' ) ;
    public final void rule__PropertyDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2852:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2853:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2853:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2854:1: '<'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0()); 
            match(input,73,FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5934); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2867:1: rule__PropertyDefinition__Group_6__1 : rule__PropertyDefinition__Group_6__1__Impl ;
    public final void rule__PropertyDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2871:1: ( rule__PropertyDefinition__Group_6__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2872:2: rule__PropertyDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15965);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2878:1: rule__PropertyDefinition__Group_6__1__Impl : ( ( rule__PropertyDefinition__Group_6_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2882:1: ( ( ( rule__PropertyDefinition__Group_6_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2884:1: ( rule__PropertyDefinition__Group_6_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2885:1: ( rule__PropertyDefinition__Group_6_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2885:2: rule__PropertyDefinition__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5992);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2899:1: rule__PropertyDefinition__Group_6_1__0 : rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2903:1: ( rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2904:2: rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__06026);
            rule__PropertyDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__06029);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2911:1: rule__PropertyDefinition__Group_6_1__0__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2915:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2916:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2916:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2917:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2918:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2918:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl6056);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2928:1: rule__PropertyDefinition__Group_6_1__1 : rule__PropertyDefinition__Group_6_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2932:1: ( rule__PropertyDefinition__Group_6_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2933:2: rule__PropertyDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__16086);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2939:1: rule__PropertyDefinition__Group_6_1__1__Impl : ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2943:1: ( ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2944:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2944:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2945:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2946:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==67) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2946:2: rule__PropertyDefinition__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl6113);
            	    rule__PropertyDefinition__Group_6_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2960:1: rule__PropertyDefinition__Group_6_1_1__0 : rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2964:1: ( rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2965:2: rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06148);
            rule__PropertyDefinition__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06151);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2972:1: rule__PropertyDefinition__Group_6_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2976:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2977:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2977:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2978:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6179); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2991:1: rule__PropertyDefinition__Group_6_1_1__1 : rule__PropertyDefinition__Group_6_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2995:1: ( rule__PropertyDefinition__Group_6_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2996:2: rule__PropertyDefinition__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16210);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3002:1: rule__PropertyDefinition__Group_6_1_1__1__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3006:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3007:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3007:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3008:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3009:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3009:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6237);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3023:1: rule__QueryOps__Group__0 : rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 ;
    public final void rule__QueryOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3027:1: ( rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3028:2: rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06271);
            rule__QueryOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06274);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3035:1: rule__QueryOps__Group__0__Impl : ( ( rule__QueryOps__Alternatives_0 ) ) ;
    public final void rule__QueryOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3039:1: ( ( ( rule__QueryOps__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3040:1: ( ( rule__QueryOps__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3040:1: ( ( rule__QueryOps__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3041:1: ( rule__QueryOps__Alternatives_0 )
            {
             before(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3042:1: ( rule__QueryOps__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3042:2: rule__QueryOps__Alternatives_0
            {
            pushFollow(FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6301);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3052:1: rule__QueryOps__Group__1 : rule__QueryOps__Group__1__Impl ;
    public final void rule__QueryOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3056:1: ( rule__QueryOps__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3057:2: rule__QueryOps__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16331);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3063:1: rule__QueryOps__Group__1__Impl : ( ruleJcrString ) ;
    public final void rule__QueryOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3067:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3068:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3068:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3069:1: ruleJcrString
            {
             before(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6358);
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


    // $ANTLR start "rule__NsMapping__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3084:1: rule__NsMapping__Group__0 : rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 ;
    public final void rule__NsMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3088:1: ( rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3089:2: rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06391);
            rule__NsMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06394);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3096:1: rule__NsMapping__Group__0__Impl : ( '<' ) ;
    public final void rule__NsMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3100:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3101:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3101:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3102:1: '<'
            {
             before(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__NsMapping__Group__0__Impl6422); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3115:1: rule__NsMapping__Group__1 : rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 ;
    public final void rule__NsMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3119:1: ( rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3120:2: rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16453);
            rule__NsMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16456);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3127:1: rule__NsMapping__Group__1__Impl : ( ( rule__NsMapping__NameAssignment_1 ) ) ;
    public final void rule__NsMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3131:1: ( ( ( rule__NsMapping__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3132:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3132:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3133:1: ( rule__NsMapping__NameAssignment_1 )
            {
             before(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3134:1: ( rule__NsMapping__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3134:2: rule__NsMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6483);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3144:1: rule__NsMapping__Group__2 : rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 ;
    public final void rule__NsMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3148:1: ( rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3149:2: rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26513);
            rule__NsMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26516);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3156:1: rule__NsMapping__Group__2__Impl : ( '=' ) ;
    public final void rule__NsMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3160:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3161:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3161:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3162:1: '='
            {
             before(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 
            match(input,71,FOLLOW_71_in_rule__NsMapping__Group__2__Impl6544); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3175:1: rule__NsMapping__Group__3 : rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 ;
    public final void rule__NsMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3179:1: ( rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3180:2: rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36575);
            rule__NsMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36578);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3187:1: rule__NsMapping__Group__3__Impl : ( ( rule__NsMapping__UriAssignment_3 ) ) ;
    public final void rule__NsMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3191:1: ( ( ( rule__NsMapping__UriAssignment_3 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3192:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3192:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3193:1: ( rule__NsMapping__UriAssignment_3 )
            {
             before(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3194:1: ( rule__NsMapping__UriAssignment_3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3194:2: rule__NsMapping__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6605);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3204:1: rule__NsMapping__Group__4 : rule__NsMapping__Group__4__Impl ;
    public final void rule__NsMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3208:1: ( rule__NsMapping__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3209:2: rule__NsMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46635);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3215:1: rule__NsMapping__Group__4__Impl : ( '>' ) ;
    public final void rule__NsMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3219:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3220:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3220:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3221:1: '>'
            {
             before(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 
            match(input,66,FOLLOW_66_in_rule__NsMapping__Group__4__Impl6663); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3245:1: rule__NodeTypeDefinition__UnorderedGroup_4 : ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3250:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3251:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3251:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 >=42 && LA36_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt36=1;
            }
            else if ( (LA36_0==29|| LA36_0 >=40 && LA36_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt36=1;
            }
            else if ( (LA36_0==32|| LA36_0 >=38 && LA36_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 >=34 && LA36_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 >=36 && LA36_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt36=1;
            }
            else if ( LA36_0 >=12 && LA36_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3251:2: rule__NodeTypeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46705);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3261:1: rule__NodeTypeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) ) ) ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3266:1: ( ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3267:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3267:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) ) )
            int alt37=6;
            int LA37_0 = input.LA(1);

            if ( LA37_0 >=42 && LA37_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt37=1;
            }
            else if ( (LA37_0==29|| LA37_0 >=40 && LA37_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt37=2;
            }
            else if ( (LA37_0==32|| LA37_0 >=38 && LA37_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt37=3;
            }
            else if ( LA37_0 >=34 && LA37_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt37=4;
            }
            else if ( LA37_0 >=36 && LA37_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt37=5;
            }
            else if ( LA37_0 >=12 && LA37_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt37=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3269:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3269:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3270:5: {...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3270:115: ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3271:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3277:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3279:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3280:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3280:8: rule__NodeTypeDefinition__OrderableAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6792);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3286:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3286:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3287:5: {...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3287:115: ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3288:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3294:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3296:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getMixinAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3297:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3297:8: rule__NodeTypeDefinition__MixinAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6883);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3303:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3303:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3304:5: {...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3304:115: ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3305:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3311:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3313:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3314:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3314:8: rule__NodeTypeDefinition__AbstractAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6974);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3320:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3320:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3321:5: {...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3321:115: ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3322:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3328:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3330:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3331:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3331:8: rule__NodeTypeDefinition__QueryableAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7065);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3337:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3337:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3338:5: {...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3338:115: ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3339:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3345:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3347:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3348:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3348:8: rule__NodeTypeDefinition__NotqueryableAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7156);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3354:4: ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3354:4: ({...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3355:5: {...}? => ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3355:115: ( ( ( rule__NodeTypeDefinition__Group_4_5__0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3356:6: ( ( rule__NodeTypeDefinition__Group_4_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3362:6: ( ( rule__NodeTypeDefinition__Group_4_5__0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3364:7: ( rule__NodeTypeDefinition__Group_4_5__0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_4_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3365:7: ( rule__NodeTypeDefinition__Group_4_5__0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3365:8: rule__NodeTypeDefinition__Group_4_5__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_4_5__0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7247);
                    rule__NodeTypeDefinition__Group_4_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getGroup_4_5()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3380:1: rule__NodeTypeDefinition__UnorderedGroup_4__0 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3384:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3385:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07306);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3386:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 >=42 && LA38_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt38=1;
            }
            else if ( (LA38_0==29|| LA38_0 >=40 && LA38_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt38=1;
            }
            else if ( (LA38_0==32|| LA38_0 >=38 && LA38_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 >=34 && LA38_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 >=36 && LA38_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 >=12 && LA38_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3386:2: rule__NodeTypeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07309);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3393:1: rule__NodeTypeDefinition__UnorderedGroup_4__1 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3397:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3398:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17334);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3399:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >=42 && LA39_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt39=1;
            }
            else if ( (LA39_0==29|| LA39_0 >=40 && LA39_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt39=1;
            }
            else if ( (LA39_0==32|| LA39_0 >=38 && LA39_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 >=34 && LA39_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 >=36 && LA39_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 >=12 && LA39_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3399:2: rule__NodeTypeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17337);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3406:1: rule__NodeTypeDefinition__UnorderedGroup_4__2 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3410:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3411:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27362);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3412:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 >=42 && LA40_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt40=1;
            }
            else if ( (LA40_0==29|| LA40_0 >=40 && LA40_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt40=1;
            }
            else if ( (LA40_0==32|| LA40_0 >=38 && LA40_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 >=34 && LA40_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 >=36 && LA40_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt40=1;
            }
            else if ( LA40_0 >=12 && LA40_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3412:2: rule__NodeTypeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27365);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3419:1: rule__NodeTypeDefinition__UnorderedGroup_4__3 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3423:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3424:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37390);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3425:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 >=42 && LA41_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt41=1;
            }
            else if ( (LA41_0==29|| LA41_0 >=40 && LA41_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt41=1;
            }
            else if ( (LA41_0==32|| LA41_0 >=38 && LA41_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 >=34 && LA41_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 >=36 && LA41_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt41=1;
            }
            else if ( LA41_0 >=12 && LA41_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3425:2: rule__NodeTypeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37393);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3432:1: rule__NodeTypeDefinition__UnorderedGroup_4__4 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3436:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3437:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47418);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3438:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 >=42 && LA42_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( (LA42_0==29|| LA42_0 >=40 && LA42_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt42=1;
            }
            else if ( (LA42_0==32|| LA42_0 >=38 && LA42_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 >=34 && LA42_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 >=36 && LA42_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt42=1;
            }
            else if ( LA42_0 >=12 && LA42_0<=13 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3438:2: rule__NodeTypeDefinition__UnorderedGroup_4__5
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47421);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3445:1: rule__NodeTypeDefinition__UnorderedGroup_4__5 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3449:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3450:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57446);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3469:1: rule__NodeDefinition__UnorderedGroup_4 : ( rule__NodeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3474:1: ( ( rule__NodeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3475:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3475:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 >=30 && LA43_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >=27 && LA43_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 >=24 && LA43_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 >=45 && LA43_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 >=14 && LA43_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3475:2: rule__NodeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47482);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3485:1: rule__NodeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) ;
    public final void rule__NodeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3490:1: ( ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3491:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3491:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            int alt44=5;
            int LA44_0 = input.LA(1);

            if ( LA44_0 >=30 && LA44_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 >=27 && LA44_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt44=2;
            }
            else if ( LA44_0 >=24 && LA44_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt44=3;
            }
            else if ( LA44_0 >=45 && LA44_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt44=4;
            }
            else if ( LA44_0 >=14 && LA44_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt44=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3493:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3493:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3494:5: {...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3494:111: ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3495:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3501:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3503:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3504:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3504:8: rule__NodeDefinition__AutocreatedAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7569);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3510:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3510:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3511:5: {...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3511:111: ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3512:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3518:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3520:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getManadatoryAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3521:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3521:8: rule__NodeDefinition__ManadatoryAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7660);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3527:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3527:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3528:5: {...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3528:111: ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3529:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3535:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3537:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getProtectedAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3538:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3538:8: rule__NodeDefinition__ProtectedAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7751);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3544:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3544:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3545:5: {...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3545:111: ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3546:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3552:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3554:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3555:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3555:8: rule__NodeDefinition__OnParentVersionAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7842);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3561:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3561:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3562:5: {...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3562:111: ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3563:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3569:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3571:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3572:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3572:8: rule__NodeDefinition__SameNameSiblingsAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7933);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3587:1: rule__NodeDefinition__UnorderedGroup_4__0 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3591:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3592:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__07992);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3593:2: ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 >=30 && LA45_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 >=27 && LA45_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 >=24 && LA45_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 >=45 && LA45_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 >=14 && LA45_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3593:2: rule__NodeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__07995);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3600:1: rule__NodeDefinition__UnorderedGroup_4__1 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3604:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3605:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18020);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3606:2: ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 >=30 && LA46_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 >=27 && LA46_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 >=24 && LA46_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 >=45 && LA46_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 >=14 && LA46_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3606:2: rule__NodeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18023);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3613:1: rule__NodeDefinition__UnorderedGroup_4__2 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3617:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3618:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28048);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3619:2: ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 >=30 && LA47_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 >=27 && LA47_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 >=24 && LA47_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 >=45 && LA47_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 >=14 && LA47_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3619:2: rule__NodeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28051);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3626:1: rule__NodeDefinition__UnorderedGroup_4__3 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3630:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3631:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38076);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3632:2: ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 >=30 && LA48_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 >=27 && LA48_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 >=24 && LA48_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt48=1;
            }
            else if ( LA48_0 >=45 && LA48_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt48=1;
            }
            else if ( LA48_0 >=14 && LA48_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3632:2: rule__NodeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38079);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3639:1: rule__NodeDefinition__UnorderedGroup_4__4 : rule__NodeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3643:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3644:2: rule__NodeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48104);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3661:1: rule__PropertyDefinition__UnorderedGroup_5 : ( rule__PropertyDefinition__UnorderedGroup_5__0 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3666:1: ( ( rule__PropertyDefinition__UnorderedGroup_5__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3667:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3667:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3667:2: rule__PropertyDefinition__UnorderedGroup_5__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58138);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3677:1: rule__PropertyDefinition__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3682:1: ( ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3683:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3683:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            int alt50=9;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3685:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3685:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3686:5: {...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3686:115: ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3687:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3693:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3695:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3696:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3696:8: rule__PropertyDefinition__AutocreatedAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8225);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3702:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3702:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3703:5: {...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3703:115: ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3704:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3710:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3712:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMandatoryAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3713:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3713:8: rule__PropertyDefinition__MandatoryAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8316);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3719:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3719:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3720:5: {...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3720:115: ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3721:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3727:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3729:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getProtectedAssignment_5_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3730:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3730:8: rule__PropertyDefinition__ProtectedAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8407);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3736:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3736:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3737:5: {...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3737:115: ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3738:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3744:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3746:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionAssignment_5_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3747:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3747:8: rule__PropertyDefinition__OnParentVersionAssignment_5_3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8498);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3753:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3753:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3754:5: {...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3754:115: ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3755:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3761:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3763:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMultipleAssignment_5_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3764:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3764:8: rule__PropertyDefinition__MultipleAssignment_5_4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8589);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3770:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3770:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3771:5: {...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3771:115: ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3772:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3778:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3780:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsAssignment_5_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3781:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3781:8: rule__PropertyDefinition__QueryOpsAssignment_5_5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8680);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3787:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3787:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3788:5: {...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3788:115: ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3789:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3795:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3797:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextAssignment_5_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:8: rule__PropertyDefinition__NoFullTextAssignment_5_6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8771);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3804:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3804:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3805:5: {...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3805:115: ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3806:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3812:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3814:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderAssignment_5_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3815:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3815:8: rule__PropertyDefinition__NoQueryOrderAssignment_5_7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8862);
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3821:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3821:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3822:5: {...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3822:115: ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3823:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3829:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3831:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getPrimaryAssignment_5_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3832:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3832:8: rule__PropertyDefinition__PrimaryAssignment_5_8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8953);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3847:1: rule__PropertyDefinition__UnorderedGroup_5__0 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3851:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3852:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09012);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3853:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3853:2: rule__PropertyDefinition__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09015);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3860:1: rule__PropertyDefinition__UnorderedGroup_5__1 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3864:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3865:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19040);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3866:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3866:2: rule__PropertyDefinition__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19043);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3873:1: rule__PropertyDefinition__UnorderedGroup_5__2 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3877:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3878:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29068);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3879:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3879:2: rule__PropertyDefinition__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29071);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3886:1: rule__PropertyDefinition__UnorderedGroup_5__3 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3890:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3891:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39096);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3892:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3892:2: rule__PropertyDefinition__UnorderedGroup_5__4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39099);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3899:1: rule__PropertyDefinition__UnorderedGroup_5__4 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3903:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3904:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49124);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3905:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3905:2: rule__PropertyDefinition__UnorderedGroup_5__5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49127);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3912:1: rule__PropertyDefinition__UnorderedGroup_5__5 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3916:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3917:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59152);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3918:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3918:2: rule__PropertyDefinition__UnorderedGroup_5__6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59155);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3925:1: rule__PropertyDefinition__UnorderedGroup_5__6 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3929:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3930:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69180);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3931:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3931:2: rule__PropertyDefinition__UnorderedGroup_5__7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69183);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3938:1: rule__PropertyDefinition__UnorderedGroup_5__7 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3942:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3943:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79208);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3944:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3944:2: rule__PropertyDefinition__UnorderedGroup_5__8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79211);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3951:1: rule__PropertyDefinition__UnorderedGroup_5__8 : rule__PropertyDefinition__UnorderedGroup_5__Impl ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3955:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3956:2: rule__PropertyDefinition__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89236);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3981:1: rule__Model__NamespacesAssignment_0 : ( ruleNsMapping ) ;
    public final void rule__Model__NamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3985:1: ( ( ruleNsMapping ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3986:1: ( ruleNsMapping )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3986:1: ( ruleNsMapping )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3987:1: ruleNsMapping
            {
             before(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09282);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3996:1: rule__Model__NodeTypesAssignment_1 : ( ruleNodeTypeDefinition ) ;
    public final void rule__Model__NodeTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4000:1: ( ( ruleNodeTypeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4001:1: ( ruleNodeTypeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4001:1: ( ruleNodeTypeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4002:1: ruleNodeTypeDefinition
            {
             before(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19313);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4011:1: rule__NodeTypeDefinition__NameAssignment_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4015:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4016:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4016:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4017:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19344);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4026:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4030:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4031:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4031:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4032:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4033:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4034:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19379);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4045:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4049:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4050:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4050:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4051:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionCrossReference_3_2_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4052:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4053:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesNodeTypeDefinitionJcrStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19418);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4064:1: rule__NodeTypeDefinition__OrderableAssignment_4_0 : ( ruleOrderable ) ;
    public final void rule__NodeTypeDefinition__OrderableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4068:1: ( ( ruleOrderable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4069:1: ( ruleOrderable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4069:1: ( ruleOrderable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4070:1: ruleOrderable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09453);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4079:1: rule__NodeTypeDefinition__MixinAssignment_4_1 : ( ruleMixin ) ;
    public final void rule__NodeTypeDefinition__MixinAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4083:1: ( ( ruleMixin ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4084:1: ( ruleMixin )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4084:1: ( ruleMixin )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4085:1: ruleMixin
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19484);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4094:1: rule__NodeTypeDefinition__AbstractAssignment_4_2 : ( ruleAbstract ) ;
    public final void rule__NodeTypeDefinition__AbstractAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4098:1: ( ( ruleAbstract ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4099:1: ( ruleAbstract )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4099:1: ( ruleAbstract )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4100:1: ruleAbstract
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29515);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4109:1: rule__NodeTypeDefinition__QueryableAssignment_4_3 : ( ruleQueryable ) ;
    public final void rule__NodeTypeDefinition__QueryableAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4113:1: ( ( ruleQueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4114:1: ( ruleQueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4114:1: ( ruleQueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4115:1: ruleQueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39546);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4124:1: rule__NodeTypeDefinition__NotqueryableAssignment_4_4 : ( ruleNotqueryable ) ;
    public final void rule__NodeTypeDefinition__NotqueryableAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4128:1: ( ( ruleNotqueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4129:1: ( ruleNotqueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4129:1: ( ruleNotqueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4130:1: ruleNotqueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49577);
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


    // $ANTLR start "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4139:1: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4143:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4144:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4144:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4145:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemJcrStringParserRuleCall_4_5_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_19608);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemJcrStringParserRuleCall_4_5_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4154:1: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 : ( rulePropertyDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4158:1: ( ( rulePropertyDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4159:1: ( rulePropertyDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4159:1: ( rulePropertyDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4160:1: rulePropertyDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09639);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4169:1: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 : ( ruleNodeDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4173:1: ( ( ruleNodeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4174:1: ( ruleNodeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4174:1: ( ruleNodeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4175:1: ruleNodeDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19670);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4184:1: rule__NodeDefinition__NameAssignment_1_0 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4188:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4189:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4189:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4190:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09701);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4199:1: rule__NodeDefinition__NameAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__NodeDefinition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4203:1: ( ( ( '*' ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4204:1: ( ( '*' ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4204:1: ( ( '*' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4205:1: ( '*' )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4206:1: ( '*' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4207:1: '*'
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__NodeDefinition__NameAssignment_1_19737); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4222:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_0 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4226:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4227:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4227:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4228:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_0_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4229:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4230:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_0_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09780);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4241:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4245:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4246:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4246:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4247:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionCrossReference_2_1_1_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4248:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4249:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesNodeTypeDefinitionJcrStringParserRuleCall_2_1_1_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19819);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4260:1: rule__NodeDefinition__DefaultTypeAssignment_3_1 : ( ( ruleJcrString ) ) ;
    public final void rule__NodeDefinition__DefaultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4264:1: ( ( ( ruleJcrString ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4265:1: ( ( ruleJcrString ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4265:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4266:1: ( ruleJcrString )
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionCrossReference_3_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4267:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4268:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeNodeTypeDefinitionJcrStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19858);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4279:1: rule__NodeDefinition__AutocreatedAssignment_4_0 : ( ruleAutocreated ) ;
    public final void rule__NodeDefinition__AutocreatedAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4283:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4284:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4284:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4285:1: ruleAutocreated
            {
             before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09893);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4294:1: rule__NodeDefinition__ManadatoryAssignment_4_1 : ( ruleMandatory ) ;
    public final void rule__NodeDefinition__ManadatoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4298:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4299:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4299:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4300:1: ruleMandatory
            {
             before(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19924);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4309:1: rule__NodeDefinition__ProtectedAssignment_4_2 : ( ruleProtected ) ;
    public final void rule__NodeDefinition__ProtectedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4313:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4314:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4314:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4315:1: ruleProtected
            {
             before(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29955);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4324:1: rule__NodeDefinition__OnParentVersionAssignment_4_3 : ( ruleOpv ) ;
    public final void rule__NodeDefinition__OnParentVersionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4328:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4329:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4329:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4330:1: ruleOpv
            {
             before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_39986);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4339:1: rule__NodeDefinition__SameNameSiblingsAssignment_4_4 : ( ruleSns ) ;
    public final void rule__NodeDefinition__SameNameSiblingsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4343:1: ( ( ruleSns ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4344:1: ( ruleSns )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4344:1: ( ruleSns )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4345:1: ruleSns
            {
             before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410017);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4354:1: rule__PropertyDefinition__NameAssignment_2_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4358:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4359:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4359:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4360:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010048);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4369:1: rule__PropertyDefinition__TypeAssignment_3_1 : ( rulePropertyType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4373:1: ( ( rulePropertyType ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4374:1: ( rulePropertyType )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4374:1: ( rulePropertyType )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4375:1: rulePropertyType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110079);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4384:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4388:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4389:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4389:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4390:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010110);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4399:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4403:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4404:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4404:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4405:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110141);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4414:1: rule__PropertyDefinition__AutocreatedAssignment_5_0 : ( ruleAutocreated ) ;
    public final void rule__PropertyDefinition__AutocreatedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4418:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4419:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4419:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4420:1: ruleAutocreated
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010172);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4429:1: rule__PropertyDefinition__MandatoryAssignment_5_1 : ( ruleMandatory ) ;
    public final void rule__PropertyDefinition__MandatoryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4433:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4434:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4434:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4435:1: ruleMandatory
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110203);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4444:1: rule__PropertyDefinition__ProtectedAssignment_5_2 : ( ruleProtected ) ;
    public final void rule__PropertyDefinition__ProtectedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4448:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4449:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4449:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4450:1: ruleProtected
            {
             before(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210234);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4459:1: rule__PropertyDefinition__OnParentVersionAssignment_5_3 : ( ruleOpv ) ;
    public final void rule__PropertyDefinition__OnParentVersionAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4463:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4464:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4464:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4465:1: ruleOpv
            {
             before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310265);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4474:1: rule__PropertyDefinition__MultipleAssignment_5_4 : ( ruleMultiple ) ;
    public final void rule__PropertyDefinition__MultipleAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4478:1: ( ( ruleMultiple ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4479:1: ( ruleMultiple )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4479:1: ( ruleMultiple )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4480:1: ruleMultiple
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410296);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4489:1: rule__PropertyDefinition__QueryOpsAssignment_5_5 : ( ruleQueryOps ) ;
    public final void rule__PropertyDefinition__QueryOpsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4493:1: ( ( ruleQueryOps ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4494:1: ( ruleQueryOps )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4494:1: ( ruleQueryOps )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4495:1: ruleQueryOps
            {
             before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510327);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4504:1: rule__PropertyDefinition__NoFullTextAssignment_5_6 : ( ruleNoFullText ) ;
    public final void rule__PropertyDefinition__NoFullTextAssignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4508:1: ( ( ruleNoFullText ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4509:1: ( ruleNoFullText )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4509:1: ( ruleNoFullText )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4510:1: ruleNoFullText
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            pushFollow(FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610358);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4519:1: rule__PropertyDefinition__NoQueryOrderAssignment_5_7 : ( ruleNoQueryOrder ) ;
    public final void rule__PropertyDefinition__NoQueryOrderAssignment_5_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4523:1: ( ( ruleNoQueryOrder ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4524:1: ( ruleNoQueryOrder )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4524:1: ( ruleNoQueryOrder )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4525:1: ruleNoQueryOrder
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710389);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4534:1: rule__PropertyDefinition__PrimaryAssignment_5_8 : ( rulePrimary ) ;
    public final void rule__PropertyDefinition__PrimaryAssignment_5_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4538:1: ( ( rulePrimary ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4539:1: ( rulePrimary )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4539:1: ( rulePrimary )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4540:1: rulePrimary
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810420);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4549:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4553:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4554:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4554:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4555:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010451);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4564:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4568:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4569:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4569:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4570:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110482);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4579:1: rule__NsMapping__NameAssignment_1 : ( rulePrefix ) ;
    public final void rule__NsMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4583:1: ( ( rulePrefix ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4584:1: ( rulePrefix )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4584:1: ( rulePrefix )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4585:1: rulePrefix
            {
             before(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110513);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4594:1: rule__NsMapping__UriAssignment_3 : ( ruleUri ) ;
    public final void rule__NsMapping__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4598:1: ( ( ruleUri ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4599:1: ( ruleUri )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4599:1: ( ruleUri )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4600:1: ruleUri
            {
             before(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310544);
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


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA49_eotS =
        "\13\uffff";
    static final String DFA49_eofS =
        "\1\12\12\uffff";
    static final String DFA49_minS =
        "\1\15\12\uffff";
    static final String DFA49_maxS =
        "\1\111\12\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA49_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3667:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?";
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
                        if ( LA49_0 >=30 && LA49_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA49_0 >=27 && LA49_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA49_0 >=24 && LA49_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA49_0 >=45 && LA49_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA49_0 >=15 && LA49_0<=16 ||LA49_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA49_0 >=21 && LA49_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA49_0 >=19 && LA49_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA49_0 >=17 && LA49_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA49_0==13||LA49_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA49_0==EOF||LA49_0==64||LA49_0==68||(LA49_0>=72 && LA49_0<=73)) ) {s = 10;}

                         
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
        "\12\uffff";
    static final String DFA50_eofS =
        "\12\uffff";
    static final String DFA50_minS =
        "\1\15\11\uffff";
    static final String DFA50_maxS =
        "\1\62\11\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA50_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4",
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
            return "3683:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )";
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
                        if ( LA50_0 >=30 && LA50_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA50_0 >=27 && LA50_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA50_0 >=24 && LA50_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA50_0 >=45 && LA50_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA50_0 >=15 && LA50_0<=16 ||LA50_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA50_0 >=21 && LA50_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA50_0 >=19 && LA50_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA50_0 >=17 && LA50_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA50_0==13||LA50_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                         
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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3853:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?";
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
                        if ( LA51_0 >=30 && LA51_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA51_0 >=27 && LA51_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA51_0 >=24 && LA51_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA51_0 >=45 && LA51_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA51_0 >=15 && LA51_0<=16 ||LA51_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA51_0 >=21 && LA51_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA51_0 >=19 && LA51_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA51_0 >=17 && LA51_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA51_0==13||LA51_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3866:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?";
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
                        if ( LA52_0 >=30 && LA52_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA52_0 >=27 && LA52_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA52_0 >=24 && LA52_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA52_0 >=45 && LA52_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA52_0 >=15 && LA52_0<=16 ||LA52_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA52_0 >=21 && LA52_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA52_0 >=19 && LA52_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA52_0 >=17 && LA52_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA52_0==13||LA52_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3879:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?";
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
                        if ( LA53_0 >=30 && LA53_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA53_0 >=27 && LA53_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA53_0 >=24 && LA53_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA53_0 >=45 && LA53_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA53_0 >=15 && LA53_0<=16 ||LA53_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA53_0 >=21 && LA53_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA53_0 >=19 && LA53_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA53_0 >=17 && LA53_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA53_0==13||LA53_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3892:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?";
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
                        if ( LA54_0 >=30 && LA54_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA54_0 >=27 && LA54_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA54_0 >=24 && LA54_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA54_0 >=45 && LA54_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA54_0 >=15 && LA54_0<=16 ||LA54_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA54_0 >=21 && LA54_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA54_0 >=19 && LA54_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA54_0 >=17 && LA54_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA54_0==13||LA54_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3905:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?";
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
                        if ( LA55_0 >=30 && LA55_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA55_0 >=27 && LA55_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA55_0 >=24 && LA55_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA55_0 >=45 && LA55_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA55_0 >=15 && LA55_0<=16 ||LA55_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA55_0 >=21 && LA55_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA55_0 >=19 && LA55_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA55_0 >=17 && LA55_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA55_0==13||LA55_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3918:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?";
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
                        if ( LA56_0 >=30 && LA56_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA56_0 >=27 && LA56_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA56_0 >=24 && LA56_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA56_0 >=45 && LA56_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA56_0 >=15 && LA56_0<=16 ||LA56_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA56_0 >=21 && LA56_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA56_0 >=19 && LA56_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA56_0 >=17 && LA56_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA56_0==13||LA56_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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
            return "3931:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?";
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
                        if ( LA57_0 >=30 && LA57_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA57_0 >=27 && LA57_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA57_0 >=24 && LA57_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA57_0 >=45 && LA57_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA57_0 >=15 && LA57_0<=16 ||LA57_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA57_0 >=21 && LA57_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA57_0 >=19 && LA57_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA57_0 >=17 && LA57_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA57_0==13||LA57_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

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
    static final String DFA58_eotS =
        "\13\uffff";
    static final String DFA58_eofS =
        "\1\12\12\uffff";
    static final String DFA58_minS =
        "\1\15\12\uffff";
    static final String DFA58_maxS =
        "\1\111\12\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA58_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\11\1\uffff\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\1\11\13\uffff"+
            "\6\4\15\uffff\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3944:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA58_0 >=30 && LA58_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA58_0 >=27 && LA58_0<=29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA58_0 >=24 && LA58_0<=26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA58_0 >=45 && LA58_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA58_0 >=15 && LA58_0<=16 ||LA58_0==23 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA58_0 >=21 && LA58_0<=22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA58_0 >=19 && LA58_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA58_0 >=17 && LA58_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( (LA58_0==13||LA58_0==33) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA58_0==EOF||LA58_0==64||LA58_0==68||(LA58_0>=72 && LA58_0<=73)) ) {s = 10;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
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
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XiD__Alternatives_in_ruleXiD1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Alternatives_in_ruleOpv1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeTypeDefinition__Alternatives_4_5_01573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeTypeDefinition__Alternatives_4_5_01593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sns__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sns__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Sns__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropertyDefinition__Alternatives_21823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NoQueryOrder__Alternatives1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NoQueryOrder__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NoFullText__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NoFullText__Alternatives1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QueryOps__Alternatives_01968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QueryOps__Alternatives_01988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Multiple__Alternatives2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Multiple__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Multiple__Alternatives2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Protected__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Protected__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Protected__Alternatives2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mandatory__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Mandatory__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mandatory__Alternatives2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Autocreated__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Autocreated__Alternatives2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Autocreated__Alternatives2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Primary__Alternatives2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Primary__Alternatives2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Queryable__Alternatives2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Queryable__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Notqueryable__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Notqueryable__Alternatives2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Abstract__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Abstract__Alternatives2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Abstract__Alternatives2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Mixin__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Mixin__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Mixin__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Orderable__Alternatives2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Orderable__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Orderable__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_rule__XiD__Alternatives2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XiD__Alternatives2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Opv__Alternatives2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Opv__Alternatives2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Opv__Alternatives2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Opv__Alternatives2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Opv__Alternatives2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Opv__Alternatives2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PropertyType__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PropertyType__Alternatives2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PropertyType__Alternatives2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__PropertyType__Alternatives3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PropertyType__Alternatives3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PropertyType__Alternatives3060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PropertyType__Alternatives3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PropertyType__Alternatives3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PropertyType__Alternatives3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PropertyType__Alternatives3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PropertyType__Alternatives3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PropertyType__Alternatives3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__PropertyType__Alternatives3207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03240 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23362 = new BitSet(new long[]{0x00001FFD20003000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33424 = new BitSet(new long[]{0x00001FFD20003000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03615 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03801 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_4_5__0__Impl_in_rule__NodeTypeDefinition__Group_4_5__03924 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_4_5__1_in_rule__NodeTypeDefinition__Group_4_5__03927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Alternatives_4_5_0_in_rule__NodeTypeDefinition__Group_4_5__0__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_4_5__1__Impl_in_rule__NodeTypeDefinition__Group_4_5__13984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_1_in_rule__NodeTypeDefinition__Group_4_5__1__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__04045 = new BitSet(new long[]{0x0000020000008030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__04048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14107 = new BitSet(new long[]{0x0007E001FF01C000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24167 = new BitSet(new long[]{0x0007E001FF01C000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34228 = new BitSet(new long[]{0x0007E001FF01C000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04356 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04665 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04788 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14972 = new BitSet(new long[]{0x0000020000008030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__25034 = new BitSet(new long[]{0x0007E003FFFFA000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__25037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35094 = new BitSet(new long[]{0x0007E003FFFFA000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45155 = new BitSet(new long[]{0x0007E003FFFFA000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05348 = new BitSet(new long[]{0xFFF8000000000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05535 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05780 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05903 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__06026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__06029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl6056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl6113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06148 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06271 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06391 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__NsMapping__Group__0__Impl6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26513 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NsMapping__Group__2__Impl6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NsMapping__Group__4__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_4_5__0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07306 = new BitSet(new long[]{0x00001FFD20003002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17334 = new BitSet(new long[]{0x00001FFD20003002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27362 = new BitSet(new long[]{0x00001FFD20003002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37390 = new BitSet(new long[]{0x00001FFD20003002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47418 = new BitSet(new long[]{0x00001FFD20003002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__07992 = new BitSet(new long[]{0x0007E001FF01C002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__07995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18020 = new BitSet(new long[]{0x0007E001FF01C002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28048 = new BitSet(new long[]{0x0007E001FF01C002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38076 = new BitSet(new long[]{0x0007E001FF01C002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09012 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19040 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29068 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39096 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49124 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59152 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69180 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79208 = new BitSet(new long[]{0x0007E003FFFFA002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_19608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeDefinition__NameAssignment_1_19737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_39986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310544 = new BitSet(new long[]{0x0000000000000002L});

}