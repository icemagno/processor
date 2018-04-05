grammar Instruction;

instSentence : 
	instruction (parameter)*
;
	
	
instruction : TEXT;
parameter : INTEGER;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
TEXT : ('A'..'Z')+ ;
INTEGER  : '0'..'9'+;	
	
	