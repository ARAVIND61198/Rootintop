import java.util.Scanner;
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS");
		int n= in.nextInt();
		if(n>1) {
			
		nodeOfElements nodes[] = new nodeOfElements[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("ENTER THE DETAILS "+(i+1)+"th ELEMENTS Char and valus:");
			nodes[i] = new nodeOfElements(in.next().charAt(0) ,in.nextFloat());
		}
		correctingValues cv = new correctingValues();
		nodes = cv.probablity(nodes, n);//calling correction packages
		in.close();
		
		for(int i=0;i<n-1;i++) {//sorting
			int p=i;
			for(int j=i;j<n;j++)
			{
				if(nodes[i].getValue()<nodes[j].getValue())
				{
					p=j;
				}
				if(p!=i)
				{
					nodeOfElements temp=nodes[i];
					nodes[i] = nodes[j];
					nodes[j] = temp;
				}
			}
		}
		while(n!=1)
		{
			nodeOfElements temp = new nodeOfElements();
			temp.ceateParentNode(nodes[n-2],nodes[n-1] );
			nodes[n-2] = temp;
			n = n-1;
			for(int i=0;i<n-1;i++) {
				int p=i;
				for(int j=i;j<n;j++)
				{
					if(nodes[p].getValue()<nodes[j].getValue())
					{
						p=j;
					}
					if(p!=i)
					{
						temp=nodes[i];
						nodes[i] = nodes[j];
						nodes[j] = temp;
					}
				}
			}
			
		}
		nodes[0].startCoding();
		nodes[0].printElements();
		}
		else { 
			System.out.println("you have given either negative number or  0 or 1 if then take its caode as either zero or one");
			in.close();
		}}
}
