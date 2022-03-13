package w2_books;

public class initialize implements Runnable {
		static MagicofBooks magic = new MagicofBooks();

		@Override
		public void run() {
			try {
				System.out.println("Please enter your username:");

				variables.inputuser = variables.sc.nextLine();
				boolean a = magic.checkUser();
				//if username is present
				if (a) {
					System.out.println("Welcome " + variables.outputuser + "!");
					magic.opt();
					magic.torun();

				} else {
					System.out.println("Sorry! You are not an authorized user");
				}

			}
			//if username space is empty
			catch (Exception e) {
				System.out.println("You didn't entered the username");
				System.exit(1);
			}

		}
}
