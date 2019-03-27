
   class NameFactory {
	//returns an instance of LastFirst or FirstFirst
	//depending on whether a comma is found
	public Namer getNamer(String entry) {
		int i = entry.indexOf(","); //comma determines order
		
		String[] list = entry.split("\\s");
		if(list.length == 3) {System.out.println("title called");
			return new TitleName(entry); //return 
			
		}
		else {
		if (i>0) {System.out.println("last called");
			return new LastFirst(entry); //return one class
		}
		else {System.out.println("first called");
			return new FirstFirst(entry); //or the other
		}
		}
	}
     }
