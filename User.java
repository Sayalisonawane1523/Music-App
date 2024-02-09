package music_app;


	import java.util.Arrays;

	public class User {

		   String username;
		   Song[] playlist ;
		   
		public User()
	     	{
			
			}
		User(String username ,int capacity)
		{
			this.username = username ;
			
			playlist = new Song[capacity];
			System.out.println("Playlist created ! ");
			
		}
		public void addSong(String name)
		{
			if(checkEmptyPlaylist(playlist))
			{
				playlist[0] = new Song(name) ;
				
				System.out.println(name+" song added ");
				
			}
			
			
			else if(getLastIndex() != -1)
			{
				int i ;
				for ( i = 0; i <getLastIndex() ; i++)
				{
					if(playlist[i].getName().equalsIgnoreCase(name))
					{
						break;
					}
					
				}
				if(i == getLastIndex())
				{
					playlist[getLastIndex()] =  new Song(name) ;
					System.out.println(name+" song added ");
				}
				else
				{
					System.out.println("Song already in the playlist ! ");
				}
			}
			else if(getLastIndex() == -1)
			{
				if(checkRepeatIndex(name) == -10)
				{
					Song[] updated = new Song[playlist.length] ;
					
					for (int i = 1 ; i < updated.length; i++)
					{
						updated[i-1] = playlist[i];
						
					}
					updated[updated.length-1] = new Song(name);
					System.out.println(name+" song is added ! ");
					playlist = updated ;
					
				}
				else if(checkRepeatIndex(name) != -10)
				{
					Song[] updated = new Song[playlist.length] ;
					
					for (int i = 0, j=0 ; i < updated.length; i++) 
					{
						if(i != checkRepeatIndex(name))
						{
							updated[j] = playlist[i];
							j++;
						}
						
					}
					updated[updated.length-1] = new Song(name);
					System.out.println(name+" song is added ! ");
					playlist = updated;
				}
			}	
			}
		public void displayPlayList()
		{
			System.out.println(Arrays.toString(playlist));
		}
		public int getLastIndex()
		{
			for (int j = 0; j < playlist.length; j++)
			{
				if (playlist[j] == null)
				{
					return j;
				}
				
			}
			return -1;
		}
		public int checkRepeatIndex(String name)
		{
			for (int i = 0; i < playlist.length; i++) 
			{
				if(playlist[i].getName().equalsIgnoreCase(name))
				{
					return i;
				}
				
			}
			return -10;
		}
		public boolean checkEmptyPlaylist(Song[] song)
		{
			for (int i = 0; i < song.length; i++)
			{
				if(song[i] != null)
				{
					return false;
				}
				
			}
			return true;
		}
		public boolean checkPlaylistIsFull(Song[] song)
		{
			boolean full = true;
			for (int i = 0; i < song.length; i++) 
			{
				if(song[i] == null)
				{
					full = false;
					
				}
				
			}
			return full;
			
			
		}
	} 
	 

