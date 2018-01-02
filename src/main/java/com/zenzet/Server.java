package com.zenzet;

import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ristory on 16/5/29.
 */
public class Server {

	final static Logger logger = Logger.getLogger(Server.class);

	public static void main(String[] args) throws Exception {

		logger.heartbeat("wow7");
		logger.business("wow8");
		logger.business("asd","asdsad");
		logger.business("1","1","1");

	}
}