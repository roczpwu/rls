package com.logger.rlc.tcpclient;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * User: rocwu
 * Date: 2017/5/21
 * Time: 下午8:31
 * Desc:
 */
public class LoggerClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)
            throws Exception {
        // you can use the Object from Server here
        System.out.println("client receive msg:"+msg);
        //ctx.close();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
            throws Exception {

        cause.printStackTrace();
        ctx.close();
    }
}