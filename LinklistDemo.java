import java.util.*;
public class LinklistDemo{
		public static void main(String[] args){
			Mylink m = new Mylink();
			m.myAdd("java 01");
			m.myAdd("java 02");
			m.myAdd("java 03");
			m.myAdd("java 04");
			
			while(!m.isempty()){
			System.out.println(m.myGet02());
			}
			if(m.isempty()){
				m.myAdd("java 01");
				m.myAdd("java 02");
				m.myAdd("java 03");
				m.myAdd("java 04");
			}
			while(!m.isempty()){
			System.out.println(m.myGet01());
			}
		}
}

class Mylink{
	private LinkedList link;
	Mylink(){
		link = new LinkedList();
	}
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object myGet02(){
		return link.removeFirst();
	}
	public Object myGet01(){
		return link.removeLast();
	}
	public boolean isempty(){
		return link.isEmpty();
	}
}
