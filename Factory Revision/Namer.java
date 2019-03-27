
	   abstract class Namer {
			protected String last;   //store last name here
			protected String first;  //store first name here
			public String getFirst() {
					return first; //return first name
			}
			public String getLast() {
					return last; //return last name
			}
			abstract String readFullName();
         }
	   
	   
	   //---------------------------------------------
	   
	   class FirstFirst extends Namer { //split first last
			public FirstFirst(String s) {
				int i = s.indexOf(" "); //find sep space
				if (i > 0) {
					       //left is first name
					first = s.substring(0, i).trim();
					//right is last name
					last =s.substring(i+1).trim();
					}
				else {
					first = ""; // put all in last name
					last = s; // if no space
					}
				}
			
			
			public String  readFullName(){
				return  first + " "+last;
			}
	}
	   
	   //--------------------------------------------------
	   
		 class LastFirst extends Namer {    //split last, first
				public LastFirst(String s) {
				int i = s.indexOf(",");           //find comma
				if (i > 0) {
					//left is last name
					last = s.substring(0, i).trim();
					//right is first name
					first = s.substring(i + 1).trim();
					}
				else {
					last = s; // put all in last name
					first = ""; // if no comma
					}
				}
				
				
				
				public String  readFullName(){
					return  first + " "+last;
				}
		  }
   
		 //--------------------------------------------------
		   
		 class TitleName extends Namer {    //split last, first
				public TitleName(String s) {
					String[] list = s.split("\\s");           //find comma
				if (list.length == 3) {
					//left is last name
					last = list[2];
					//right is first name
					first = list[1];
					}
				else {
					last = s; // put all in last name
					first = ""; // if no comma
					}
				}
				
				
				
				public String  readFullName(){
					return  first + " "+last;
				}
		  }

