public class TestMemberQ{
public static void main(String args[]) {
    	Member<Integer> m=new Member(234512);
   		System.out.println("Member ID="+m.readID());
   		boolean result=m.checkID(234234);
   		if (result==true){System.out.println("ID OK");}
   		else             {System.out.println("ID Not OK");}	
   		m.setID(234234);
   		result=m.checkID(234234);
   		if (result==true){System.out.println("ID OK");}
   		else             {System.out.println("ID Not OK");}	
   		
   		
   		Member<String> m2=new Member("234512");
   		System.out.println("Member ID="+m.readID());
   		boolean result2=m2.checkID("234234");
   		if (result2==true){System.out.println("ID OK");}
   		else             {System.out.println("ID Not OK");}	
   		m2.setID("234234");
   		result=m2.checkID("234234");
   		if (result==true){System.out.println("ID OK");}
   		else             {System.out.println("ID Not OK");}	
    }
}