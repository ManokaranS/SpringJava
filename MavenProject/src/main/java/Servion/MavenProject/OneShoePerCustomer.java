package Servion.MavenProject;

public class OneShoePerCustomer extends Throwable{
	private String msg;
	public OneShoePerCustomer(String msg){
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "Exception is..:"+msg;
	}
}
