package music_app;

public class Song {
	
		private String name;
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public Song()
		{
			
		}
		Song(String name)
		{
			this.name=name;
		}
		public String toString()
		{
			return name;
		}

	}

