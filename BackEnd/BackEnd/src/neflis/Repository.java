package neflis;

import java.util.HashSet;

public class Repository {
	
	private HashSet<Content> content = new HashSet<Content>();
	private HashSet<User> users = new HashSet<User>();
	
	public Repository(HashSet<Content> aContent, HashSet<User> setUsers){
		content = aContent;
		users = setUsers;
	}

	public HashSet<Content> getContent() {
		return content;
	}

	public void setContent(HashSet<Content> content) {
		this.content = content;
	}

	public HashSet<User> getUsers() {
		return users;
	}

	public void setUsers(HashSet<User> users) {
		this.users = users;
	}
	
	public HashSet<User> usersFanOf(Actor actor){
		HashSet<User> usersFan = new HashSet<User>();
		
		for(User anUser : users){
			if(anUser.isFanOf(actor)){
				usersFan.add(anUser);
			}
		}
		
		return usersFan;
	}

}
