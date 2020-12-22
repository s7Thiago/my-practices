public class ConcatenaString2 {																									
	
	public ConcatenaString2() {
		String str1 = "Fragment1", str2 = "content of str2";
		StringBuilder strBuilder = new StringBuilder();
		
		strBuilder.append(str1).append(" " + str2).append(" Final");
		
		System.out.println("Result content: " + strBuilder);
	}
}
