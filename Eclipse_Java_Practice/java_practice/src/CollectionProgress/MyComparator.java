package CollectionProgress;

import java.util.Comparator;

public class MyComparator implements Comparator{
	public int compare(Object o1, Object o2)
	{
		int i1=(Integer)o1;
		int i2=(Integer)o2;
		if(i1==i2)
			return 0;
		else if(i1>i2)
			return -1;
		else
			return 1;
	}

}
