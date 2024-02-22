package Framework;
import java.util.ArrayList;
public class ArrayListDemo1 {
	public static void main(String[]args) {
		ArrayList uiList=new ArrayList();
		uiList.add("html");
		uiList.add("css");
		uiList.add("react");
		System.out.println("UI List :"+uiList);
		System.out.println("UI List size :"+uiList.size());
		ArrayList logicList=new ArrayList();
		logicList.add("java");
		logicList.add("python");
		logicList.add("golang");
		System.out.println("Logic List :"+logicList);
		System.out.println("Logic List Size :"+logicList.size());
		ArrayList fullStackList=new ArrayList();
		fullStackList.addAll(uiList);
		fullStackList.addAll(logicList);
		System.out.println("full Stack List :"+fullStackList);
		System.out.println("full Stack List size :"+fullStackList.size());
		
		
	}

}
