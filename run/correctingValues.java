public class correctingValues {
	public nodeOfElements[] probablity(nodeOfElements a[],int n)
	{
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a[i].getValue();
		}
		if(sum!=1) {
		float v;
		for(int i=0;i<n;i++)
		{
			v=(float)(a[i].getValue()/(float)sum);
			a[i].changeValue(v);
		}}
		
		return a;
	}

}
