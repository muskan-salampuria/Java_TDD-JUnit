package project.TDD;

public class First2Chars {

	public String check(String string) {
		int stringlength=string.length();
		if(stringlength>=2)
		{
			char firstchar = string.charAt(0);
			char secondchar = string.charAt(1);
			if(firstchar=='A' && secondchar=='A')
			{
				return(string.substring(2, string.length()));
			}
			else if(firstchar=='A' && secondchar!='A')
			{
				return(string.substring(1, string.length()));
			}
			else if(firstchar!='A' && secondchar=='A')
			{
				return(firstchar+string.substring(2, string.length()));
			}
			else
			{
				return(string);
			}
		}
		else if(stringlength==1 && string!="A")
		{
			return(string);
		}
			return("");
	}
}
