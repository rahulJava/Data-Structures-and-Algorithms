import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
/*from w  w w.j a v a  2 s  .  c o m*/
public class test1 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<String>();
    Collection <String> col = new Vector<String>();
    
    names.add("rahul");
    names.add("shyam");
    names.add("Ganesh");
    names.add(1, "ratra");
    int [] a = new int[10];
    
    
    System.out.println(names);
    
    Vector v = new Vector();
    v.add(1);
    v.addElement(2);
    System.out.println("vector:"+v.size());
    Enumeration e1 = v.elements();
    while(e1.hasMoreElements())
    {
    	//Integer I = (Integer) e1.nextElement();
    	System.out.println(":::"+e1.nextElement());
    }
 
    NavigableSet<String> s1 = new TreeSet<String>();
    s1.add("A");
    s1.add("B");
    s1.add("F");
    s1.add("D");
    s1.add("T");
    s1.add("1");
    s1.add("3");
   
    System.out.println("printing set:"+s1);
    
    
    System.out.printf("Size = %d, Elements = %s%n", names.size(), names);
    names.add("1");
    names.add("2");
    names.add("3");
    
    List l = Collections.synchronizedList(names);
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
    names.remove("CSS");
    System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
  //  names.clear();
   System.out.printf("Size   = %d, Elements   = %s%n",
        names.size(), names);
    Iterator<String> it = names.iterator();
    
    Object[] o = names.toArray();
    for(Object o1 :o )
    {
    	System.out.println(o1);
    }
    while(it.hasNext())
    {
    	System.out.println(":"+it.next());
    }
  }}
  