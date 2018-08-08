import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingletonEnumTest {
	public static void main(String[] args) {
		Runnable target = new Runnable() {
			@Override
			public void run() {
				SingletonEnum.INSTANCE.connect();
			}
		};

		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(500, 1000, 2, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(1000));
		for (int i = 0; i < 1000; i++) {
			threadPoolExecutor.execute(target);
		}
		threadPoolExecutor.shutdown();
	}
}
