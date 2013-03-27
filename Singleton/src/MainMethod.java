
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//输出对象地址，地址相同表示是同一个对象
				System.out.println(Singleton.getInstance());
			}
			
			
		}).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//输出对象地址，地址相同表示是同一个对象
				System.out.println(Singleton.getInstance());
			}
			
			
		}).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//输出对象地址，地址相同表示是同一个对象
				System.out.println(Singleton.getInstance());
			}
			
			
		}).start();
		
	}

}
