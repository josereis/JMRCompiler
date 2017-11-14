package utils;

public class Utils {
	public static final int VOID = 0, INT = 1, FLOAT = 2, STRING = 3, BOOL = 4;
	public static final int VARIABLE = 1, CONSTANT = 2, FUNCTION = 3, PARAMETER = 4;
	
	private static String [] reservedWords = {"Class", "Main", "Int", "Float", "Str", "Bool", "Void", "final", "if", "else", "for", "break", "return", "print", "read" };
	
	public static boolean isReservedWord(String id) {
		for(String word: reservedWords) {
			if(word.equals(id))
				return true;
		}

		return false;
	}
}
