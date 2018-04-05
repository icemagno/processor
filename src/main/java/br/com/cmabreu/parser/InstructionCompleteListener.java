package br.com.cmabreu.parser;

// https://github.com/icemagno/sagitarii/blob/master/src/main/java/br/cefetrj/sagitarii/parser/SagitariiParserListener.java

public class InstructionCompleteListener extends InstructionBaseListener {

	public void showList() {
		
	}
	

	@Override
	public void enterInstSentence(InstructionParser.InstSentenceContext ctx) {
		System.out.println(" >> " + ctx.instruction().getText() );
		
		for ( InstructionParser.ParameterContext parameter : ctx.parameter() ) {
			System.out.println("    Param " + parameter.getText() );
		}
		
	}
	
	@Override
	public void enterInstruction(InstructionParser.InstructionContext ctx) {
		//System.out.println(" >> " + ctx.getText() );
	}

	
	@Override
	public void enterParameter(InstructionParser.ParameterContext ctx) {
		//System.out.println(" >> " + ctx.getText() );
	}
	
}
