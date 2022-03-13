package w2_books;

public class main {

		public static void main(String[] args) {
			try {
				initialize obj = new initialize();
				Thread thread = new Thread(obj);
				thread.start();

			} catch (Exception e) {
				System.out.println(e);
			}

		}
}
