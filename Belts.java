package walet;

public class Belts {
	public String name="ramesh";
	public String name1="suroj";
	public String name2="kamal";
	public float salary=6000.475f;
	public int time =4;
	public int days = 25;

	
		public float abc() {
			return salary*14;
		}
		
		public int hour() {
			return time * days;
		}

		public String employname() {
			return (name + "" + name1 + "" + name2);
		}
	}


