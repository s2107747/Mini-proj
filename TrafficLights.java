
public class TrafficLights {

	public static void consoleOutput(String lightColour){
		System.out.println(" ___");
		System.out.print("|[");
		if(lightColour.equals("R")){System.out.print(lightColour);} 
		else{ System.out.print(" ");}
		System.out.println("]|");
		System.out.print("|[");
		if(lightColour.equals("Y")){System.out.print(lightColour);} 
		else{ System.out.print(" ");}
		System.out.println("]|");
		System.out.print("|[");
		if(lightColour.equals("G")){System.out.print(lightColour);} 
		else{ System.out.print(" ");}
		System.out.println("]|");
		System.out.println(" ___");
		System.out.println("  ||");
		System.out.println("  ||");
		
	}
	public static void main(String[] args) {
		String s="R";
		while(!(s.equals("Q")))
		{
			System.out.println("****Traffic Lights******");
			System.out.println("by Daniel White");
			System.out.println("Enter selection and press return to activate traffic light");
			System.out.println("R) for red light");
			System.out.println("G) for Green light");
			System.out.println("Y) for Yellow light");
			System.out.println("Q) to quit");
			s=System.console().readLine();
			
			switch(s)
			{
				case "G": System.out.println("green light");
				break;
				case "Y": System.out.println("Yellow light");
				break;
				case "R": System.out.println("Red light");
				break;
				case "Q": System.out.println("Quiting now");
				break;
				default: System.out.println("invalid input");
				break;
			}
			consoleOutput(s);
		}
	}

}
