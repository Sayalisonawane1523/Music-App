package music_app;



	public class PlaylistDriver 
	{
		public static void main(String[] args) 
		{
			User user1 = new User("Raju",4);
			
			user1.addSong("kasariya");
			user1.addSong("jai ho");
			user1.addSong("jalwa");
			user1.addSong("vande mataram");
			
			user1.displayPlayList();
			
			user1.addSong("kasariya"); 
			user1.displayPlayList();
		}

	}

