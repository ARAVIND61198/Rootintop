public class nodeOfElements {

	private char n;
	private String code;
	private float value;
	nodeOfElements left,right;
	public nodeOfElements(char n,float v) {
		this.n = n;
		this.value = v;
		this.code = new String();
		left = null;
		right = null;
	}
	public void changeValue(float v)
	{
		this.value = v;
	}
	public nodeOfElements()
	{
		this.code = new String(" ");
	}
	public void ceateParentNode(nodeOfElements a,nodeOfElements b) {
		this.n = '$';
			this.left = a;
			this.right = b;
		this.value = a.getValue()+b.getValue();
		
	}
	public float getValue() {
		return value;
	}
	public String getCode()
	{
		return code;
	}
	public void printElements() {
		if(n=='$') {
			left.printElements();
			right.printElements();
		}
		else {
			System.out.println("The CODE FOR "+n+"is "+code);
		}
	}
	public void startCoding() {
		left.coding("",'0');
		right.coding("",'1');
		
	}
	public void coding(String pc,char c) {
		code = pc+c;
		if(left!=null) {
			left.coding(code, '0');
			right.coding(code,'1');
		}
	}
}
