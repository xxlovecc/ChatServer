package xx.love.cc;

import xx.love.cc.common.ServerType;


public final class ChatServer extends BaseServer{

	private static ChatServer chatServer;
	
	public static ChatServer getInstance(){
		if(chatServer == null){
			chatServer = new ChatServer(ServerType.CHAT_SERVER);
		}
		return chatServer;
	}
	
	private ChatServer(){
		
	}
	
	private ChatServer(short serverType){
		this.serverType = serverType;
	}
	
	/**
	 * 初始化
	 */
	public boolean init(){
		return true;
	}
	
	/**
	 * ChatServer启动
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseServer server = ChatServer.getInstance();
		server.start();
	}

}
