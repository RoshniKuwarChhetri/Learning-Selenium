package practice;

interface Driver {
    void start();
    void run();
}

public class Chrome implements Driver {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}



class Helper{
	public Driver get() {
		return new Chrome();
		
	}
}