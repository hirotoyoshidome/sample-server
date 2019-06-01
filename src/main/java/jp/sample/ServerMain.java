package jp.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server実装
 *
 */
public class ServerMain {
	public static void main(String[] args) throws Exception {
		System.out.println("起動");
		// ポートを指定
		ServerSocket server = new ServerSocket(80);
		// ソケットを開く
		Socket socket = server.accept();
		// 情報を出力する
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		in.lines().forEach(System.out::println);
		// クローズする
		server.close();
		System.out.println("終了");

	}
}
